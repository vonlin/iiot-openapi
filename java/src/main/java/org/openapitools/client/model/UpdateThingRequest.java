/*
 * IIoT OpenAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 5.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.ComponentReferenceConfDetails;
import org.openapitools.client.model.PropertyValue;
import org.openapitools.client.model.ReferenceConfDetails;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * UpdateThingRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class UpdateThingRequest {
  public static final String SERIALIZED_NAME_THING_NAME = "thing_name";
  @SerializedName(SERIALIZED_NAME_THING_NAME)
  @jakarta.annotation.Nullable
  private String thingName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @jakarta.annotation.Nullable
  private Map<String, PropertyValue> tags = new HashMap<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  @jakarta.annotation.Nullable
  private ReferenceConfDetails properties;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  @jakarta.annotation.Nullable
  private ComponentReferenceConfDetails components;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  @jakarta.annotation.Nullable
  private String createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  @jakarta.annotation.Nullable
  private String updateTime;

  public UpdateThingRequest() {
  }

  public UpdateThingRequest thingName(@jakarta.annotation.Nullable String thingName) {
    this.thingName = thingName;
    return this;
  }

  /**
   * Get thingName
   * @return thingName
   */
  @jakarta.annotation.Nullable
  public String getThingName() {
    return thingName;
  }

  public void setThingName(@jakarta.annotation.Nullable String thingName) {
    this.thingName = thingName;
  }


  public UpdateThingRequest tags(@jakarta.annotation.Nullable Map<String, PropertyValue> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateThingRequest putTagsItem(String key, PropertyValue tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @jakarta.annotation.Nullable
  public Map<String, PropertyValue> getTags() {
    return tags;
  }

  public void setTags(@jakarta.annotation.Nullable Map<String, PropertyValue> tags) {
    this.tags = tags;
  }


  public UpdateThingRequest properties(@jakarta.annotation.Nullable ReferenceConfDetails properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @jakarta.annotation.Nullable
  public ReferenceConfDetails getProperties() {
    return properties;
  }

  public void setProperties(@jakarta.annotation.Nullable ReferenceConfDetails properties) {
    this.properties = properties;
  }


  public UpdateThingRequest components(@jakarta.annotation.Nullable ComponentReferenceConfDetails components) {
    this.components = components;
    return this;
  }

  /**
   * Get components
   * @return components
   */
  @jakarta.annotation.Nullable
  public ComponentReferenceConfDetails getComponents() {
    return components;
  }

  public void setComponents(@jakarta.annotation.Nullable ComponentReferenceConfDetails components) {
    this.components = components;
  }


  public UpdateThingRequest createTime(@jakarta.annotation.Nullable String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Get createTime
   * @return createTime
   */
  @jakarta.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(@jakarta.annotation.Nullable String createTime) {
    this.createTime = createTime;
  }


  public UpdateThingRequest updateTime(@jakarta.annotation.Nullable String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Get updateTime
   * @return updateTime
   */
  @jakarta.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(@jakarta.annotation.Nullable String updateTime) {
    this.updateTime = updateTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateThingRequest updateThingRequest = (UpdateThingRequest) o;
    return Objects.equals(this.thingName, updateThingRequest.thingName) &&
        Objects.equals(this.tags, updateThingRequest.tags) &&
        Objects.equals(this.properties, updateThingRequest.properties) &&
        Objects.equals(this.components, updateThingRequest.components) &&
        Objects.equals(this.createTime, updateThingRequest.createTime) &&
        Objects.equals(this.updateTime, updateThingRequest.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thingName, tags, properties, components, createTime, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateThingRequest {\n");
    sb.append("    thingName: ").append(toIndentedString(thingName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("thing_name");
    openapiFields.add("tags");
    openapiFields.add("properties");
    openapiFields.add("components");
    openapiFields.add("create_time");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateThingRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateThingRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateThingRequest is not found in the empty JSON string", UpdateThingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateThingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateThingRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("thing_name") != null && !jsonObj.get("thing_name").isJsonNull()) && !jsonObj.get("thing_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thing_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thing_name").toString()));
      }
      if ((jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonNull()) && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if ((jsonObj.get("update_time") != null && !jsonObj.get("update_time").isJsonNull()) && !jsonObj.get("update_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("update_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateThingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateThingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateThingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateThingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateThingRequest>() {
           @Override
           public void write(JsonWriter out, UpdateThingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateThingRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateThingRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateThingRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateThingRequest
   */
  public static UpdateThingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateThingRequest.class);
  }

  /**
   * Convert an instance of UpdateThingRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

