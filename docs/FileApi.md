# FileApi

All URIs are relative to *https://uploadthing.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFileUrls**](FileApi.md#getFileUrls) | **POST** /getFileUrl |  |
| [**listFiles**](FileApi.md#listFiles) | **POST** /listFiles |  |
| [**markForDeletion**](FileApi.md#markForDeletion) | **POST** /deleteFile |  |
| [**renameFiles**](FileApi.md#renameFiles) | **POST** /renameFiles |  |
| [**requestPresignedUrl**](FileApi.md#requestPresignedUrl) | **POST** /requestFileAccess |  |
| [**requestPresignedUrls**](FileApi.md#requestPresignedUrls) | **POST** /uploadFiles |  |
| [**updateFileName**](FileApi.md#updateFileName) | **POST** /renameFile |  |


<a name="getFileUrls"></a>
# **getFileUrls**
> FileGetFileUrlsResponse getFileUrls(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).fileGetFileUrlsRequest(fileGetFileUrlsRequest).execute();



Get a list of URLs for given file keys. This API is deprecated, use &#x60;https://utfs.io/f/FILE_KEY&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
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
    List<String> files = Arrays.asList();
    List<String> fileKeys = Arrays.asList();
    List<String> customIds = Arrays.asList();
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      FileGetFileUrlsResponse result = client
              .file
              .getFileUrls(xUploadthingVersion)
              .files(files)
              .fileKeys(fileKeys)
              .customIds(customIds)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getFileUrls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileGetFileUrlsResponse> response = client
              .file
              .getFileUrls(xUploadthingVersion)
              .files(files)
              .fileKeys(fileKeys)
              .customIds(customIds)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getFileUrls");
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
| **fileGetFileUrlsRequest** | [**FileGetFileUrlsRequest**](FileGetFileUrlsRequest.md)|  | [optional] |

### Return type

[**FileGetFileUrlsResponse**](FileGetFileUrlsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved file URLs. |  -  |

<a name="listFiles"></a>
# **listFiles**
> FileListFilesResponse listFiles(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).fileListFilesRequest(fileListFilesRequest).execute();



List files for the current app. Response is paginated.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://uploadthing.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    UploadThing client = new UploadThing(configuration);
    Double limit = 500D; // The maximum number of files to retrieve.
    Double offset = 0D; // The number of files to skip.
    String xUploadthingVersion = "6.4.0";
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      FileListFilesResponse result = client
              .file
              .listFiles(limit, offset, xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMore());
      System.out.println(result.getFiles());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#listFiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileListFilesResponse> response = client
              .file
              .listFiles(limit, offset, xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#listFiles");
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
| **fileListFilesRequest** | [**FileListFilesRequest**](FileListFilesRequest.md)|  | [optional] |

### Return type

[**FileListFilesResponse**](FileListFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved files. |  -  |

<a name="markForDeletion"></a>
# **markForDeletion**
> FileMarkForDeletionResponse markForDeletion(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).fileMarkForDeletionRequest(fileMarkForDeletionRequest).execute();



Mark files for deletion. The files will be deleted at the storage provider shortly after.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
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
    List<String> files = Arrays.asList();
    List<String> fileKeys = Arrays.asList();
    List<String> customIds = Arrays.asList();
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      FileMarkForDeletionResponse result = client
              .file
              .markForDeletion(xUploadthingVersion)
              .files(files)
              .fileKeys(fileKeys)
              .customIds(customIds)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#markForDeletion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileMarkForDeletionResponse> response = client
              .file
              .markForDeletion(xUploadthingVersion)
              .files(files)
              .fileKeys(fileKeys)
              .customIds(customIds)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#markForDeletion");
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
| **fileMarkForDeletionRequest** | [**FileMarkForDeletionRequest**](FileMarkForDeletionRequest.md)|  | [optional] |

### Return type

[**FileMarkForDeletionResponse**](FileMarkForDeletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully marked file for deletion. |  -  |

<a name="renameFiles"></a>
# **renameFiles**
> FileRenameFilesResponse renameFiles(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).fileRenameFilesRequest(fileRenameFilesRequest).execute();



Rename files.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://uploadthing.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    UploadThing client = new UploadThing(configuration);
    List<FileRenameFilesRequestUpdatesInner> updates = Arrays.asList();
    String xUploadthingVersion = "6.4.0";
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      FileRenameFilesResponse result = client
              .file
              .renameFiles(updates, xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#renameFiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileRenameFilesResponse> response = client
              .file
              .renameFiles(updates, xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#renameFiles");
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
| **fileRenameFilesRequest** | [**FileRenameFilesRequest**](FileRenameFilesRequest.md)|  | [optional] |

### Return type

[**FileRenameFilesResponse**](FileRenameFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully renamed files. |  -  |

<a name="requestPresignedUrl"></a>
# **requestPresignedUrl**
> FileRequestPresignedUrlResponse requestPresignedUrl(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).fileRequestPresignedUrlRequest(fileRequestPresignedUrlRequest).execute();



Request a presigned GET url for a private file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
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
    String fileKey = "fileKey_example";
    String customId = "customId_example";
    Double expiresIn = 3.4D;
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      FileRequestPresignedUrlResponse result = client
              .file
              .requestPresignedUrl(xUploadthingVersion)
              .fileKey(fileKey)
              .customId(customId)
              .expiresIn(expiresIn)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#requestPresignedUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileRequestPresignedUrlResponse> response = client
              .file
              .requestPresignedUrl(xUploadthingVersion)
              .fileKey(fileKey)
              .customId(customId)
              .expiresIn(expiresIn)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#requestPresignedUrl");
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
| **fileRequestPresignedUrlRequest** | [**FileRequestPresignedUrlRequest**](FileRequestPresignedUrlRequest.md)|  | [optional] |

### Return type

[**FileRequestPresignedUrlResponse**](FileRequestPresignedUrlResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved a presigned GET URL. |  -  |

<a name="requestPresignedUrls"></a>
# **requestPresignedUrls**
> FileRequestPresignedUrlsResponse requestPresignedUrls(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).fileRequestPresignedUrlsRequest(fileRequestPresignedUrlsRequest).execute();



Request presigned URLs for file uploads without file routes. NOTE: This spec complies with SDK versions ^6.4. Response may vary for older versions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://uploadthing.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    UploadThing client = new UploadThing(configuration);
    List<FileRequestPresignedUrlsRequestFilesInner> files = Arrays.asList();
    String contentDisposition = "inline";
    String xUploadthingVersion = "6.4.0";
    String acl = "public-read";
    Object metadata = null;
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      FileRequestPresignedUrlsResponse result = client
              .file
              .requestPresignedUrls(files, contentDisposition, xUploadthingVersion)
              .acl(acl)
              .metadata(metadata)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#requestPresignedUrls");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileRequestPresignedUrlsResponse> response = client
              .file
              .requestPresignedUrls(files, contentDisposition, xUploadthingVersion)
              .acl(acl)
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
      System.err.println("Exception when calling FileApi#requestPresignedUrls");
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
| **fileRequestPresignedUrlsRequest** | [**FileRequestPresignedUrlsRequest**](FileRequestPresignedUrlsRequest.md)|  | [optional] |

### Return type

[**FileRequestPresignedUrlsResponse**](FileRequestPresignedUrlsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved presigned URLs. |  -  |

<a name="updateFileName"></a>
# **updateFileName**
> FileUpdateFileNameResponse updateFileName(xUploadthingVersion).xUploadthingFePackage(xUploadthingFePackage).xUploadthingBeAdapter(xUploadthingBeAdapter).fileUpdateFileNameRequest(fileUpdateFileNameRequest).execute();



Use /renameFiles instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UploadThing;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FileApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://uploadthing.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    UploadThing client = new UploadThing(configuration);
    List<FileRenameFilesRequestUpdatesInner> updates = Arrays.asList();
    String xUploadthingVersion = "6.4.0";
    String xUploadthingFePackage = "@uploadthing/react";
    String xUploadthingBeAdapter = "express";
    try {
      FileUpdateFileNameResponse result = client
              .file
              .updateFileName(updates, xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#updateFileName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FileUpdateFileNameResponse> response = client
              .file
              .updateFileName(updates, xUploadthingVersion)
              .xUploadthingFePackage(xUploadthingFePackage)
              .xUploadthingBeAdapter(xUploadthingBeAdapter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#updateFileName");
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
| **fileUpdateFileNameRequest** | [**FileUpdateFileNameRequest**](FileUpdateFileNameRequest.md)|  | [optional] |

### Return type

[**FileUpdateFileNameResponse**](FileUpdateFileNameResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully renamed files. |  -  |

