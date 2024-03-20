<div align="left">

[![Visit Uploadthing](./header.png)](https://uploadthing.com)

# [Uploadthing](https://uploadthing.com)

UploadThing is the easiest way to add file uploads to your full stack TypeScript application. Many services have tried to build a "better S3", but in our opinion, none found the right compromise of ownership, flexibility and safety.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=UploadThing&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>upload-thing-java-sdk</artifactId>
  <version>6.4.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:upload-thing-java-sdk:6.4.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/upload-thing-java-sdk-6.4.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallbackApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://uploadthing.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    UploadThing client = new UploadThing(configuration);
    String fileKey = "fileKey_example";
    String xUploadthingVersion = "6.4.0";
    String uploadId = "uploadId_example"; // The uploadId, only applicable for multipart uploads.
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      CallbackMarkUploadFailedResponse result = client
              .callback
              .markUploadFailed(fileKey, xUploadthingVersion)
              .uploadId(uploadId)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallbackApi#markUploadFailed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallbackMarkUploadFailedResponse> response = client
              .callback
              .markUploadFailed(fileKey, xUploadthingVersion)
              .uploadId(uploadId)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallbackApi#markUploadFailed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://uploadthing.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CallbackApi* | [**markUploadFailed**](docs/CallbackApi.md#markUploadFailed) | **POST** /failureCallback | 
*FileApi* | [**getFileUrls**](docs/FileApi.md#getFileUrls) | **POST** /getFileUrl | 
*FileApi* | [**listFiles**](docs/FileApi.md#listFiles) | **POST** /listFiles | 
*FileApi* | [**markForDeletion**](docs/FileApi.md#markForDeletion) | **POST** /deleteFile | 
*FileApi* | [**renameFiles**](docs/FileApi.md#renameFiles) | **POST** /renameFiles | 
*FileApi* | [**requestPresignedUrl**](docs/FileApi.md#requestPresignedUrl) | **POST** /requestFileAccess | 
*FileApi* | [**requestPresignedUrls**](docs/FileApi.md#requestPresignedUrls) | **POST** /uploadFiles | 
*FileApi* | [**updateFileName**](docs/FileApi.md#updateFileName) | **POST** /renameFile | 
*MultipartApi* | [**completeUpload**](docs/MultipartApi.md#completeUpload) | **POST** /completeMultipart | 
*ServerCallbackApi* | [**getData**](docs/ServerCallbackApi.md#getData) | **GET** /serverCallback | 
*ServerCallbackApi* | [**setData**](docs/ServerCallbackApi.md#setData) | **POST** /serverCallback | 
*UploadApi* | [**requestPresignedUrls**](docs/UploadApi.md#requestPresignedUrls) | **POST** /prepareUpload | 
*UsageInfoApi* | [**getUsageInfo**](docs/UsageInfoApi.md#getUsageInfo) | **POST** /getUsageInfo | 


## Documentation for Models

 - [CallbackMarkUploadFailedRequest](docs/CallbackMarkUploadFailedRequest.md)
 - [CallbackMarkUploadFailedResponse](docs/CallbackMarkUploadFailedResponse.md)
 - [FileGetFileUrlsRequest](docs/FileGetFileUrlsRequest.md)
 - [FileGetFileUrlsResponse](docs/FileGetFileUrlsResponse.md)
 - [FileGetFileUrlsResponseDataInner](docs/FileGetFileUrlsResponseDataInner.md)
 - [FileListFilesRequest](docs/FileListFilesRequest.md)
 - [FileListFilesResponse](docs/FileListFilesResponse.md)
 - [FileListFilesResponseFilesInner](docs/FileListFilesResponseFilesInner.md)
 - [FileMarkForDeletionRequest](docs/FileMarkForDeletionRequest.md)
 - [FileMarkForDeletionResponse](docs/FileMarkForDeletionResponse.md)
 - [FileRenameFilesRequest](docs/FileRenameFilesRequest.md)
 - [FileRenameFilesRequestUpdatesInner](docs/FileRenameFilesRequestUpdatesInner.md)
 - [FileRenameFilesResponse](docs/FileRenameFilesResponse.md)
 - [FileRequestPresignedUrlRequest](docs/FileRequestPresignedUrlRequest.md)
 - [FileRequestPresignedUrlResponse](docs/FileRequestPresignedUrlResponse.md)
 - [FileRequestPresignedUrlsRequest](docs/FileRequestPresignedUrlsRequest.md)
 - [FileRequestPresignedUrlsRequestFilesInner](docs/FileRequestPresignedUrlsRequestFilesInner.md)
 - [FileRequestPresignedUrlsResponse](docs/FileRequestPresignedUrlsResponse.md)
 - [FileUpdateFileNameRequest](docs/FileUpdateFileNameRequest.md)
 - [FileUpdateFileNameResponse](docs/FileUpdateFileNameResponse.md)
 - [MultipartCompleteUploadRequest](docs/MultipartCompleteUploadRequest.md)
 - [MultipartCompleteUploadRequestEtagsInner](docs/MultipartCompleteUploadRequestEtagsInner.md)
 - [MultipartCompleteUploadResponse](docs/MultipartCompleteUploadResponse.md)
 - [MultipartUploadURLs](docs/MultipartUploadURLs.md)
 - [PMUURLs](docs/PMUURLs.md)
 - [PMUURLs1](docs/PMUURLs1.md)
 - [PresignedPostURLs](docs/PresignedPostURLs.md)
 - [ServerCallbackGetDataResponse](docs/ServerCallbackGetDataResponse.md)
 - [ServerCallbackSetDataRequest](docs/ServerCallbackSetDataRequest.md)
 - [ServerCallbackSetDataResponse](docs/ServerCallbackSetDataResponse.md)
 - [UploadRequestPresignedUrlsRequest](docs/UploadRequestPresignedUrlsRequest.md)
 - [UploadRequestPresignedUrlsRequestFilesInner](docs/UploadRequestPresignedUrlsRequestFilesInner.md)
 - [UsageInfoGetUsageInfoResponse](docs/UsageInfoGetUsageInfoResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
