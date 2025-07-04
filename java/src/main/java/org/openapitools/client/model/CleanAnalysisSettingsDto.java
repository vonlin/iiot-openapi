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
import org.openapitools.client.model.CleanSettings;

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
 * CleanAnalysisSettingsDto
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class CleanAnalysisSettingsDto {
  public static final String SERIALIZED_NAME_CLEAN_SETTINGS = "clean_settings";
  @SerializedName(SERIALIZED_NAME_CLEAN_SETTINGS)
  @jakarta.annotation.Nullable
  private CleanSettings cleanSettings;

  public CleanAnalysisSettingsDto() {
  }

  public CleanAnalysisSettingsDto cleanSettings(@jakarta.annotation.Nullable CleanSettings cleanSettings) {
    this.cleanSettings = cleanSettings;
    return this;
  }

  /**
   * Get cleanSettings
   * @return cleanSettings
   */
  @jakarta.annotation.Nullable
  public CleanSettings getCleanSettings() {
    return cleanSettings;
  }

  public void setCleanSettings(@jakarta.annotation.Nullable CleanSettings cleanSettings) {
    this.cleanSettings = cleanSettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanAnalysisSettingsDto cleanAnalysisSettingsDto = (CleanAnalysisSettingsDto) o;
    return Objects.equals(this.cleanSettings, cleanAnalysisSettingsDto.cleanSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanAnalysisSettingsDto {\n");
    sb.append("    cleanSettings: ").append(toIndentedString(cleanSettings)).append("\n");
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
    openapiFields.add("clean_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CleanAnalysisSettingsDto
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CleanAnalysisSettingsDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CleanAnalysisSettingsDto is not found in the empty JSON string", CleanAnalysisSettingsDto.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CleanAnalysisSettingsDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CleanAnalysisSettingsDto` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `clean_settings`
      if (jsonObj.get("clean_settings") != null && !jsonObj.get("clean_settings").isJsonNull()) {
        CleanSettings.validateJsonElement(jsonObj.get("clean_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CleanAnalysisSettingsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CleanAnalysisSettingsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CleanAnalysisSettingsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CleanAnalysisSettingsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CleanAnalysisSettingsDto>() {
           @Override
           public void write(JsonWriter out, CleanAnalysisSettingsDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CleanAnalysisSettingsDto read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CleanAnalysisSettingsDto given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CleanAnalysisSettingsDto
   * @throws IOException if the JSON string is invalid with respect to CleanAnalysisSettingsDto
   */
  public static CleanAnalysisSettingsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CleanAnalysisSettingsDto.class);
  }

  /**
   * Convert an instance of CleanAnalysisSettingsDto to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

