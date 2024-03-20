# ServerCallbackApi

All URIs are relative to *https://uploadthing.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getData**](ServerCallbackApi.md#getData) | **GET** /serverCallback |  |
| [**setData**](ServerCallbackApi.md#setData) | **POST** /serverCallback |  |


<a name="getData"></a>
# **getData**
> ServerCallbackGetDataResponse getData(authorization).execute();



Poll for server callback data. This is used to retrieve the data returned from &#x60;onUploadComplete&#x60; callback.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServerCallbackApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://uploadthing.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    UploadThing client = new UploadThing(configuration);
    String authorization = "authorization_example";
    try {
      ServerCallbackGetDataResponse result = client
              .serverCallback
              .getData(authorization)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getCallbackData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerCallbackApi#getData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServerCallbackGetDataResponse> response = client
              .serverCallback
              .getData(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerCallbackApi#getData");
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
| **authorization** | **String**|  | |

### Return type

[**ServerCallbackGetDataResponse**](ServerCallbackGetDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Poll successful |  -  |

<a name="setData"></a>
# **setData**
> ServerCallbackSetDataResponse setData(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).serverCallbackSetDataRequest(serverCallbackSetDataRequest).execute();



Set server callback data. This is used to set the data returned from &#x60;onUploadComplete&#x60; callback.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ServerCallbackApi;
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
    Object callbackData = null;
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      ServerCallbackSetDataResponse result = client
              .serverCallback
              .setData(fileKey, xUploadthingVersion)
              .callbackData(callbackData)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerCallbackApi#setData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ServerCallbackSetDataResponse> response = client
              .serverCallback
              .setData(fileKey, xUploadthingVersion)
              .callbackData(callbackData)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerCallbackApi#setData");
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
| **serverCallbackSetDataRequest** | [**ServerCallbackSetDataRequest**](ServerCallbackSetDataRequest.md)|  | [optional] |

### Return type

[**ServerCallbackSetDataResponse**](ServerCallbackSetDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully set callback data. |  -  |

