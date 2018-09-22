/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import org.apache.commons.codec.CharEncoding;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
public class TarHeader {

    static GregorianCalendar epoch = new GregorianCalendar(1970, 1, 1, 0, 0, 0);
    public String name;
    public long size;
    public GregorianCalendar lastModifiedTime;
    public TarEntryType EntryType;

    GregorianCalendar getEpoch() {
        return epoch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public GregorianCalendar getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(GregorianCalendar last) {
        lastModifiedTime = last;
    }

    public TarEntryType getEntryType() {
        return EntryType;
    }

    public void setEntryType(TarEntryType type) {
        EntryType = type;
    }

    public void Write(OutputStream output) {
        byte[] buffer = new byte[512];
        String interName = this.name;
        WriteStringBytes(interName, buffer, 0, 100);
        WriteOctalBytes(511, buffer, 100, 8);
        WriteOctalBytes(0, buffer, 108, 8);
        WriteOctalBytes(0, buffer, 116, 8);
        WriteOctalBytes(size, buffer, 124, 12);
        long time = System.currentTimeMillis() / 1000;
        WriteOctalBytes(time, buffer, 136, 12);

        buffer[156] = EntryType != null ? EntryType.toByte() : 0;
        if (size >= 0x1FFFFFFFFL) {
            byte[] bytes = ByteBuffer.allocate(8).putLong(HostToNetworkOrder(size)).array();
            byte[] bytes12 = new byte[12];
            System.arraycopy(bytes, 0, bytes12, 12 - bytes.length, bytes.length);
            bytes12[0] |= 0x80;
            System.arraycopy(bytes12, 0, buffer, 124, bytes12.length);
        }
        int crc = RecalculateChecksum(buffer);
        WriteOctalBytes(crc, buffer, 148, 8);
        try {
            output.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            Logger.getLogger(TarHeader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void WriteStringBytes(String name, byte[] buffer, int offset, int length) {
        int i;

        for (i = 0; i < length - 1 && i < name.length(); ++i) {
            buffer[offset + i] = (byte) name.charAt(i);
        }

        for (; i < length; ++i) {
            buffer[offset + i] = 0;
        }
    }

    private static void WriteOctalBytes(long value, byte[] buffer, int offset, int length) {

        String val = Long.toOctalString(value);
        int shift = length - val.length() - 1;
        for (int i = 0; i < shift; i++) {
            buffer[offset + i] = (byte) ' ';
        }
        for (int i = 0; i < val.length(); i++) {
            buffer[offset + i + shift] = (byte) val.charAt(i);
        }
        buffer[offset + length] = 0;
    }

    private static long HostToNetworkOrder(long host) {
        return (int) ((long) HostToNetworkOrder((int) host)
                & (-1L) << 32
                | ((long) HostToNetworkOrder(((int) (host >> 32))) & Long.MAX_VALUE));
    }

    private static int HostToNetworkOrder(int host) {
        return ((HostToNetworkOrder((short) host) & -1) << 16 | (HostToNetworkOrder((short) (host >> 16)) & -1));
    }

    private static short HostToNetworkOrder(short host) {
        return (short) ((host & 255) << 8 | ((int) host >> 8 & 255));
    }

    private static long NetworkToHostOrder(long network) {
        return HostToNetworkOrder(network);
    }

    private static int NetworkToHostOrder(int network) {
        return HostToNetworkOrder(network);
    }

    private static short NetworkToHostOrder(short network) {
        return HostToNetworkOrder(network);
    }

    static int RecalculateChecksum(byte[] buf) {
        // Set default value for checksum. That is 8 spaces.
        byte[] bytes = "        ".getBytes(Charset.forName(CharEncoding.UTF_8));
        System.arraycopy(bytes, 0, buf, 148, bytes.length);

        // Calculate checksum
        int headerChecksum = 0;
        for (byte b : buf) {
            headerChecksum += b;
        }
        return headerChecksum;
    }

}
