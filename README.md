# PlatformJavaClient (BETA)
*PlatformJavaClient* makes it easy to start using [DocuWare Platform API](http://help.docuware.com/sdk/platform). 

As of today 12.08.16 the JavaClient applies to DocuWare Version 6.10 and is in Beta Phase, therefore bugs may occur and there is no documentation. The Java Client is supposed to reflect the same Client implementation as the .Net Client as far as possible, thus most of the samples in the .Net Client's documentation also apply too the Java Client. 

Please help improving the Client with your feedback, additionally, everyone is very welcome to provide missing code examples.

### Source code
Clone the sources: `git clone https://github.com/DocuWare/PlatformJavaClient.git`

### Building
You need at least a *Java 8* installation of any edition.
To get started:
* Clone the source code (see above).
* Copy the project to your IDE and build your own classes and packages*

### Supported DocuWare versions
This implementation uses the *DocuWare Platform .NET API* of ***DocuWare 6.8***.  
Most of the examples will also run with *DocuWare 6.5* or higher.

### Known Issues: 
* Error messages may be too short or wrong

### Major missing Features
* Windows Authentication is currently not supported
* Some classes/methods from the .NetClient are still missing

## How to Engage, Contribute and Provide Feedback
Before you contribute, please read through the contributing and developer guides to get an idea of what kinds of pull requests we will or won't accept.
* [Contributing Guide](https://github.com/DocuWare/Platform.NETClient/wiki/Contributing-Guide)
* [Building and Executing](https://github.com/DocuWare/Platform.NETClient/wiki/Building-and-Executing)

You are also encouraged to start a discussion by filing an issue or creating a [gist](https://help.github.com/articles/about-gists/).

## License
*DocuWare Platform .NET Client* proudly uses the [MIT License](LICENSE).
*Licenses for Third-Party-Files can be found in the affiliated JAR-Files