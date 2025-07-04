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
import org.openapitools.client.model.PropertyRef;

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
 * ReferenceConfDetails
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class ReferenceConfDetails {
  public static final String SERIALIZED_NAME_PROPERTY_REF = "property_ref";
  @SerializedName(SERIALIZED_NAME_PROPERTY_REF)
  @jakarta.annotation.Nullable
  private Map<String, PropertyRef> propertyRef = new HashMap<>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @jakarta.annotation.Nullable
  private Object value;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  @jakarta.annotation.Nullable
  private String updateTime;

  public ReferenceConfDetails() {
  }

  public ReferenceConfDetails propertyRef(@jakarta.annotation.Nullable Map<String, PropertyRef> propertyRef) {
    this.propertyRef = propertyRef;
    return this;
  }

  public ReferenceConfDetails putPropertyRefItem(String key, PropertyRef propertyRefItem) {
    if (this.propertyRef == null) {
      this.propertyRef = new HashMap<>();
    }
    this.propertyRef.put(key, propertyRefItem);
    return this;
  }

  /**
   * Get propertyRef
   * @return propertyRef
   */
  @jakarta.annotation.Nullable
  public Map<String, PropertyRef> getPropertyRef() {
    return propertyRef;
  }

  public void setPropertyRef(@jakarta.annotation.Nullable Map<String, PropertyRef> propertyRef) {
    this.propertyRef = propertyRef;
  }


  public ReferenceConfDetails value(@jakarta.annotation.Nullable Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @jakarta.annotation.Nullable
  public Object getValue() {
    return value;
  }

  public void setValue(@jakarta.annotation.Nullable Object value) {
    this.value = value;
  }


  public ReferenceConfDetails updateTime(@jakarta.annotation.Nullable String updateTime) {
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
    ReferenceConfDetails referenceConfDetails = (ReferenceConfDetails) o;
    return Objects.equals(this.propertyRef, referenceConfDetails.propertyRef) &&
        Objects.equals(this.value, referenceConfDetails.value) &&
        Objects.equals(this.updateTime, referenceConfDetails.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyRef, value, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceConfDetails {\n");
    sb.append("    propertyRef: ").append(toIndentedString(propertyRef)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("property_ref");
    openapiFields.add("value");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReferenceConfDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReferenceConfDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReferenceConfDetails is not found in the empty JSON string", ReferenceConfDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReferenceConfDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReferenceConfDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("update_time") != null && !jsonObj.get("update_time").isJsonNull()) && !jsonObj.get("update_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("update_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReferenceConfDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReferenceConfDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReferenceConfDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReferenceConfDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ReferenceConfDetails>() {
           @Override
           public void write(JsonWriter out, ReferenceConfDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReferenceConfDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReferenceConfDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReferenceConfDetails
   * @throws IOException if the JSON string is invalid with respect to ReferenceConfDetails
   */
  public static ReferenceConfDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReferenceConfDetails.class);
  }

  /**
   * Convert an instance of ReferenceConfDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

