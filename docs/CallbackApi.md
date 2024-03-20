# CallbackApi

All URIs are relative to *https://uploadthing.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**markUploadFailed**](CallbackApi.md#markUploadFailed) | **POST** /failureCallback |  |


<a name="markUploadFailed"></a>
# **markUploadFailed**
> CallbackMarkUploadFailedResponse markUploadFailed(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).callbackMarkUploadFailedRequest(callbackMarkUploadFailedRequest).execute();



Mark an upload as failed, or abort a multipart upload. This will free up resources and revert the storage quota.

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xUploadthingVersion** | **String**|  | |
| **xUploadthingFePackage** | **String**|  | [optional] |
| **xUploadthingBeAdapter** | **String**|  | [optional] |
| **callbackMarkUploadFailedRequest** | [**CallbackMarkUploadFailedRequest**](CallbackMarkUploadFailedRequest.md)|  | [optional] |

### Return type

[**CallbackMarkUploadFailedResponse**](CallbackMarkUploadFailedResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully aborted or marked upload as failed. |  -  |

