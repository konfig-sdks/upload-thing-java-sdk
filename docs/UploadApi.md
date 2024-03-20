# UploadApi

All URIs are relative to *https://uploadthing.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**requestPresignedUrls**](UploadApi.md#requestPresignedUrls) | **POST** /prepareUpload |  |


<a name="requestPresignedUrls"></a>
# **requestPresignedUrls**
> List&lt;Object&gt; requestPresignedUrls(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).uploadRequestPresignedUrlsRequest(uploadRequestPresignedUrlsRequest).execute();



Request presigned URLs for file uploads through based on your file router. NOTE: This spec complies with SDK versions ^6.4. Response may vary for older versions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://uploadthing.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    UploadThing client = new UploadThing(configuration);
    URI callbackUrl = new URI();
    String callbackSlug = "callbackSlug_example";
    List<UploadRequestPresignedUrlsRequestFilesInner> files = Arrays.asList();
    Object routeConfig = null;
    String xUploadthingVersion = "6.4.0";
    Object metadata = null;
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      List<Object> result = client
              .upload
              .requestPresignedUrls(callbackUrl, callbackSlug, files, routeConfig, xUploadthingVersion)
              .metadata(metadata)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadApi#requestPresignedUrls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Object>> response = client
              .upload
              .requestPresignedUrls(callbackUrl, callbackSlug, files, routeConfig, xUploadthingVersion)
              .metadata(metadata)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadApi#requestPresignedUrls");
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
| **uploadRequestPresignedUrlsRequest** | [**UploadRequestPresignedUrlsRequest**](UploadRequestPresignedUrlsRequest.md)|  | [optional] |

### Return type

**List&lt;Object&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved presigned URLs. |  -  |

