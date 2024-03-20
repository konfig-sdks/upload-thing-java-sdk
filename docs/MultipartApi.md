# MultipartApi

All URIs are relative to *https://uploadthing.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeUpload**](MultipartApi.md#completeUpload) | **POST** /completeMultipart |  |


<a name="completeUpload"></a>
# **completeUpload**
> MultipartCompleteUploadResponse completeUpload(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).multipartCompleteUploadRequest(multipartCompleteUploadRequest).execute();



Complete a multipart upload. This will finalize the upload and make the file available for download.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MultipartApi;
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
    String uploadId = "uploadId_example";
    List<MultipartCompleteUploadRequestEtagsInner> etags = Arrays.asList();
    String xUploadthingVersion = "6.4.0";
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      MultipartCompleteUploadResponse result = client
              .multipart
              .completeUpload(fileKey, uploadId, etags, xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling MultipartApi#completeUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MultipartCompleteUploadResponse> response = client
              .multipart
              .completeUpload(fileKey, uploadId, etags, xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MultipartApi#completeUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xUploadthingVersion** | **String**|  | |
| **xUploadthingFePackage** | **String**|  | [optional] |
| **xUploadthingBeAdapter** | **String**|  | [optional] |
| **multipartCompleteUploadRequest** | [**MultipartCompleteUploadRequest**](MultipartCompleteUploadRequest.md)|  | [optional] |

### Return type

[**MultipartCompleteUploadResponse**](MultipartCompleteUploadResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully completed the multipart upload. |  -  |

