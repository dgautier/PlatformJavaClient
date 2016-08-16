/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
public class CancellationToken {
    
    Future fut;
    
    CancellationToken(Future fut) {
        this.fut = fut;
    }
    
    public CancellationToken(){};
    
    public void setFuture(Future fut) {
        this.fut = fut;
    }
    
    public void cancel() {
        fut.cancel(true);
        try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(CancellationToken.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}