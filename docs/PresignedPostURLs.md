

# PresignedPostURLs


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** |  |  |
|**fileName** | **String** |  |  |
|**fileType** | **String** |  |  |
|**fileUrl** | **String** |  |  |
|**contentDisposition** | [**ContentDispositionEnum**](#ContentDispositionEnum) |  |  |
|**pollingJwt** | **String** |  |  |
|**pollingUrl** | **String** |  |  |
|**customId** | **String** |  |  |
|**url** | **String** |  |  [optional] |
|**fields** | **Map&lt;String, String&gt;** |  |  [optional] |
|**urls** | **List&lt;String&gt;** |  |  [optional] |
|**uploadId** | **String** |  |  [optional] |
|**chunkSize** | **Double** |  |  [optional] |
|**chunkCount** | **Double** |  |  [optional] |



## Enum: ContentDispositionEnum

| Name | Value |
|---- | -----|
| INLINE | &quot;inline&quot; |
| ATTACHMENT | &quot;attachment&quot; |



