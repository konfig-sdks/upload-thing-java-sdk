/*
 * UploadThing REST API
 * UploadThing is the easiest way to add file uploads to your full stack TypeScript application. Many services have tried to build a \"better S3\", but in our opinion, none found the right compromise of ownership, flexibility and safety.
 *
 * The version of the OpenAPI document: 6.4.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * PresignedPostURLs
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PresignedPostURLs {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_TYPE = "fileType";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private String fileType;

  public static final String SERIALIZED_NAME_FILE_URL = "fileUrl";
  @SerializedName(SERIALIZED_NAME_FILE_URL)
  private String fileUrl;

  /**
   * Gets or Sets contentDisposition
   */
  @JsonAdapter(ContentDispositionEnum.Adapter.class)
 public enum ContentDispositionEnum {
    INLINE("inline"),
    
    ATTACHMENT("attachment");

    private String value;

    ContentDispositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContentDispositionEnum fromValue(String value) {
      for (ContentDispositionEnum b : ContentDispositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContentDispositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentDispositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentDispositionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContentDispositionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTENT_DISPOSITION = "ContentDisposition";
  @SerializedName(SERIALIZED_NAME_CONTENT_DISPOSITION)
  private ContentDispositionEnum contentDisposition;

  public static final String SERIALIZED_NAME_POLLING_JWT = "pollingJwt";
  @SerializedName(SERIALIZED_NAME_POLLING_JWT)
  private String pollingJwt;

  public static final String SERIALIZED_NAME_POLLING_URL = "pollingUrl";
  @SerializedName(SERIALIZED_NAME_POLLING_URL)
  private String pollingUrl;

  public static final String SERIALIZED_NAME_CUSTOM_ID = "customId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ID)
  private String customId;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Map<String, String> fields = null;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<String> urls = null;

  public static final String SERIALIZED_NAME_UPLOAD_ID = "uploadId";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ID)
  private String uploadId;

  public static final String SERIALIZED_NAME_CHUNK_SIZE = "chunkSize";
  @SerializedName(SERIALIZED_NAME_CHUNK_SIZE)
  private Double chunkSize;

  public static final String SERIALIZED_NAME_CHUNK_COUNT = "chunkCount";
  @SerializedName(SERIALIZED_NAME_CHUNK_COUNT)
  private Double chunkCount;

  public PresignedPostURLs() {
  }

  public PresignedPostURLs key(String key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    
    
    
    this.key = key;
  }


  public PresignedPostURLs fileName(String fileName) {
    
    
    
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    
    
    
    this.fileName = fileName;
  }


  public PresignedPostURLs fileType(String fileType) {
    
    
    
    
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFileType() {
    return fileType;
  }


  public void setFileType(String fileType) {
    
    
    
    this.fileType = fileType;
  }


  public PresignedPostURLs fileUrl(String fileUrl) {
    
    
    
    
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * Get fileUrl
   * @return fileUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFileUrl() {
    return fileUrl;
  }


  public void setFileUrl(String fileUrl) {
    
    
    
    this.fileUrl = fileUrl;
  }


  public PresignedPostURLs contentDisposition(ContentDispositionEnum contentDisposition) {
    
    
    
    
    this.contentDisposition = contentDisposition;
    return this;
  }

   /**
   * Get contentDisposition
   * @return contentDisposition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ContentDispositionEnum getContentDisposition() {
    return contentDisposition;
  }


  public void setContentDisposition(ContentDispositionEnum contentDisposition) {
    
    
    
    this.contentDisposition = contentDisposition;
  }


  public PresignedPostURLs pollingJwt(String pollingJwt) {
    
    
    
    
    this.pollingJwt = pollingJwt;
    return this;
  }

   /**
   * Get pollingJwt
   * @return pollingJwt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPollingJwt() {
    return pollingJwt;
  }


  public void setPollingJwt(String pollingJwt) {
    
    
    
    this.pollingJwt = pollingJwt;
  }


  public PresignedPostURLs pollingUrl(String pollingUrl) {
    
    
    
    
    this.pollingUrl = pollingUrl;
    return this;
  }

   /**
   * Get pollingUrl
   * @return pollingUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPollingUrl() {
    return pollingUrl;
  }


  public void setPollingUrl(String pollingUrl) {
    
    
    
    this.pollingUrl = pollingUrl;
  }


  public PresignedPostURLs customId(String customId) {
    
    
    
    
    this.customId = customId;
    return this;
  }

   /**
   * Get customId
   * @return customId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getCustomId() {
    return customId;
  }


  public void setCustomId(String customId) {
    
    
    
    this.customId = customId;
  }


  public PresignedPostURLs url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public PresignedPostURLs fields(Map<String, String> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public PresignedPostURLs putFieldsItem(String key, String fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getFields() {
    return fields;
  }


  public void setFields(Map<String, String> fields) {
    
    
    
    this.fields = fields;
  }


  public PresignedPostURLs urls(List<String> urls) {
    
    
    
    
    this.urls = urls;
    return this;
  }

  public PresignedPostURLs addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUrls() {
    return urls;
  }


  public void setUrls(List<String> urls) {
    
    
    
    this.urls = urls;
  }


  public PresignedPostURLs uploadId(String uploadId) {
    
    
    
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * Get uploadId
   * @return uploadId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUploadId() {
    return uploadId;
  }


  public void setUploadId(String uploadId) {
    
    
    
    this.uploadId = uploadId;
  }


  public PresignedPostURLs chunkSize(Double chunkSize) {
    
    
    
    
    this.chunkSize = chunkSize;
    return this;
  }

  public PresignedPostURLs chunkSize(Integer chunkSize) {
    
    
    
    
    this.chunkSize = chunkSize.doubleValue();
    return this;
  }

   /**
   * Get chunkSize
   * @return chunkSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getChunkSize() {
    return chunkSize;
  }


  public void setChunkSize(Double chunkSize) {
    
    
    
    this.chunkSize = chunkSize;
  }


  public PresignedPostURLs chunkCount(Double chunkCount) {
    
    
    
    
    this.chunkCount = chunkCount;
    return this;
  }

  public PresignedPostURLs chunkCount(Integer chunkCount) {
    
    
    
    
    this.chunkCount = chunkCount.doubleValue();
    return this;
  }

   /**
   * Get chunkCount
   * @return chunkCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getChunkCount() {
    return chunkCount;
  }


  public void setChunkCount(Double chunkCount) {
    
    
    
    this.chunkCount = chunkCount;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PresignedPostURLs instance itself
   */
  public PresignedPostURLs putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresignedPostURLs presignedPostURLs = (PresignedPostURLs) o;
    return Objects.equals(this.key, presignedPostURLs.key) &&
        Objects.equals(this.fileName, presignedPostURLs.fileName) &&
        Objects.equals(this.fileType, presignedPostURLs.fileType) &&
        Objects.equals(this.fileUrl, presignedPostURLs.fileUrl) &&
        Objects.equals(this.contentDisposition, presignedPostURLs.contentDisposition) &&
        Objects.equals(this.pollingJwt, presignedPostURLs.pollingJwt) &&
        Objects.equals(this.pollingUrl, presignedPostURLs.pollingUrl) &&
        Objects.equals(this.customId, presignedPostURLs.customId) &&
        Objects.equals(this.url, presignedPostURLs.url) &&
        Objects.equals(this.fields, presignedPostURLs.fields) &&
        Objects.equals(this.urls, presignedPostURLs.urls) &&
        Objects.equals(this.uploadId, presignedPostURLs.uploadId) &&
        Objects.equals(this.chunkSize, presignedPostURLs.chunkSize) &&
        Objects.equals(this.chunkCount, presignedPostURLs.chunkCount)&&
        Objects.equals(this.additionalProperties, presignedPostURLs.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, fileName, fileType, fileUrl, contentDisposition, pollingJwt, pollingUrl, customId, url, fields, urls, uploadId, chunkSize, chunkCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresignedPostURLs {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
    sb.append("    pollingJwt: ").append(toIndentedString(pollingJwt)).append("\n");
    sb.append("    pollingUrl: ").append(toIndentedString(pollingUrl)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
    sb.append("    chunkCount: ").append(toIndentedString(chunkCount)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("key");
    openapiFields.add("fileName");
    openapiFields.add("fileType");
    openapiFields.add("fileUrl");
    openapiFields.add("ContentDisposition");
    openapiFields.add("pollingJwt");
    openapiFields.add("pollingUrl");
    openapiFields.add("customId");
    openapiFields.add("url");
    openapiFields.add("fields");
    openapiFields.add("urls");
    openapiFields.add("uploadId");
    openapiFields.add("chunkSize");
    openapiFields.add("chunkCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("fileName");
    openapiRequiredFields.add("fileType");
    openapiRequiredFields.add("fileUrl");
    openapiRequiredFields.add("ContentDisposition");
    openapiRequiredFields.add("pollingJwt");
    openapiRequiredFields.add("pollingUrl");
    openapiRequiredFields.add("customId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PresignedPostURLs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PresignedPostURLs.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PresignedPostURLs is not found in the empty JSON string", PresignedPostURLs.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PresignedPostURLs.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (!jsonObj.get("fileType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileType").toString()));
      }
      if (!jsonObj.get("fileUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileUrl").toString()));
      }
      if (!jsonObj.get("ContentDisposition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ContentDisposition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ContentDisposition").toString()));
      }
      if (!jsonObj.get("pollingJwt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pollingJwt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pollingJwt").toString()));
      }
      if (!jsonObj.get("pollingUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pollingUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pollingUrl").toString()));
      }
      if (!jsonObj.get("customId").isJsonNull() && !jsonObj.get("customId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customId").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("urls") != null && !jsonObj.get("urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `urls` to be an array in the JSON string but got `%s`", jsonObj.get("urls").toString()));
      }
      if ((jsonObj.get("uploadId") != null && !jsonObj.get("uploadId").isJsonNull()) && !jsonObj.get("uploadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploadId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PresignedPostURLs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PresignedPostURLs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PresignedPostURLs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PresignedPostURLs.class));

       return (TypeAdapter<T>) new TypeAdapter<PresignedPostURLs>() {
           @Override
           public void write(JsonWriter out, PresignedPostURLs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PresignedPostURLs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PresignedPostURLs instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PresignedPostURLs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PresignedPostURLs
  * @throws IOException if the JSON string is invalid with respect to PresignedPostURLs
  */
  public static PresignedPostURLs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PresignedPostURLs.class);
  }

 /**
  * Convert an instance of PresignedPostURLs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

