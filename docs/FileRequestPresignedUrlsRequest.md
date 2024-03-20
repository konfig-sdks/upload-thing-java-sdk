

# FileRequestPresignedUrlsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**files** | [**List&lt;FileRequestPresignedUrlsRequestFilesInner&gt;**](FileRequestPresignedUrlsRequestFilesInner.md) |  |  |
|**acl** | [**AclEnum**](#AclEnum) |  |  [optional] |
|**metadata** | **Object** |  |  [optional] |
|**contentDisposition** | [**ContentDispositionEnum**](#ContentDispositionEnum) |  |  |



## Enum: AclEnum

| Name | Value |
|---- | -----|
| PUBLIC_READ | &quot;public-read&quot; |
| PRIVATE | &quot;private&quot; |



## Enum: ContentDispositionEnum

| Name | Value |
|---- | -----|
| INLINE | &quot;inline&quot; |
| ATTACHMENT | &quot;attachment&quot; |



