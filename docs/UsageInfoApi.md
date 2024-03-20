# UsageInfoApi

All URIs are relative to *https://uploadthing.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUsageInfo**](UsageInfoApi.md#getUsageInfo) | **POST** /getUsageInfo |  |


<a name="getUsageInfo"></a>
# **getUsageInfo**
> UsageInfoGetUsageInfoResponse getUsageInfo(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).execute();



Retrieve usage info for the app associated with the provided API key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageInfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://uploadthing.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    UploadThing client = new UploadThing(configuration);
    String xUploadthingVersion = "6.4.0";
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      UsageInfoGetUsageInfoResponse result = client
              .usageInfo
              .getUsageInfo(xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getTotalBytes());
      System.out.println(result.getAppTotalBytes());
      System.out.println(result.getFilesUploaded());
      System.out.println(result.getLimitBytes());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageInfoApi#getUsageInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsageInfoGetUsageInfoResponse> response = client
              .usageInfo
              .getUsageInfo(xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageInfoApi#getUsageInfo");
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

### Return type

[**UsageInfoGetUsageInfoResponse**](UsageInfoGetUsageInfoResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved usage info. |  -  |

