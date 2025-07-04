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
 * EventTrigger
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class EventTrigger {
  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  @jakarta.annotation.Nonnull
  private String condition;

  public static final String SERIALIZED_NAME_DURATIOIN = "duratioin";
  @SerializedName(SERIALIZED_NAME_DURATIOIN)
  @jakarta.annotation.Nullable
  private String duratioin;

  public EventTrigger() {
  }

  public EventTrigger condition(@jakarta.annotation.Nonnull String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @jakarta.annotation.Nonnull
  public String getCondition() {
    return condition;
  }

  public void setCondition(@jakarta.annotation.Nonnull String condition) {
    this.condition = condition;
  }


  public EventTrigger duratioin(@jakarta.annotation.Nullable String duratioin) {
    this.duratioin = duratioin;
    return this;
  }

  /**
   * Get duratioin
   * @return duratioin
   */
  @jakarta.annotation.Nullable
  public String getDuratioin() {
    return duratioin;
  }

  public void setDuratioin(@jakarta.annotation.Nullable String duratioin) {
    this.duratioin = duratioin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventTrigger eventTrigger = (EventTrigger) o;
    return Objects.equals(this.condition, eventTrigger.condition) &&
        Objects.equals(this.duratioin, eventTrigger.duratioin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, duratioin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventTrigger {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    duratioin: ").append(toIndentedString(duratioin)).append("\n");
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
    openapiFields.add("condition");
    openapiFields.add("duratioin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("condition");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventTrigger
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventTrigger.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventTrigger is not found in the empty JSON string", EventTrigger.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventTrigger.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventTrigger` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventTrigger.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition").toString()));
      }
      if ((jsonObj.get("duratioin") != null && !jsonObj.get("duratioin").isJsonNull()) && !jsonObj.get("duratioin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duratioin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duratioin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventTrigger.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventTrigger' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventTrigger> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventTrigger.class));

       return (TypeAdapter<T>) new TypeAdapter<EventTrigger>() {
           @Override
           public void write(JsonWriter out, EventTrigger value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventTrigger read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventTrigger given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventTrigger
   * @throws IOException if the JSON string is invalid with respect to EventTrigger
   */
  public static EventTrigger fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventTrigger.class);
  }

  /**
   * Convert an instance of EventTrigger to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

