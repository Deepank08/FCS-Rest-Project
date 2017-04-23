# FCS-Rest-Project

A Restful webservice developed with **Java(JAX-RS)** using **Jersey** framework based on **REST** architechture to enable data flow between apps of different platforms.
On the server side Jersey framework provides a servlet implementation which scans predefined classes to identify RESTful resources.

## Details

-The Jersey implementation provides a library to implement Restful webservices in a Java servlet container.
-The Jersey implementation also provides a client library to communicate with a RESTful webservice which can be used to create REST clients to consume this webservice.
-This servlet analyzes the incoming HTTP request and selects the correct class and method to respond to this request. This selection is based on annotations in the class and methods.
-It supports the creation of XML and JSON via the Java Architecture for XML Binding (JAXB).
-The complete path to a resource is based on the base URL and the @PATh annotation in your class.

## Configure 
-Download the Jersey distribution as zip file from: https://jersey.java.net/download.html
-The zip contains the Jersey implementation JAR and its core dependencies. It does not provide dependencies for third party JARs beyond those for JSON support and JavaDoc.
-Copy all JARs from your Jersey download into the **WEB-INF/lib** folder.
-Import the project in Eclipse and ensure that the web.xml deployment descriptor is created.

## Deployment 
-Any web container can be used, for example Tomcat or the Google App Engine.
-You need to register Jersey as the servlet dispatcher for REST requests. Open the file web.xml and modify it accordingly.
-The parameter jersey.config.server.provider.packages defines in which package Jersey will look for the web service classes.
-This property must point to your resources classes. The URL pattern defines the part of the base URL your application will be placed.
-Run the web application in Eclipse and validate that you can access your service.

## Contributor
**Deepank Srivastava** | deepank@outlook.com


