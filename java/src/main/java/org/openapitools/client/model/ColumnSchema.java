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
import org.openapitools.client.model.DataSchema;

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
 * ColumnSchema
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class ColumnSchema {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @jakarta.annotation.Nonnull
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_DIC_ID = "dic_id";
  @SerializedName(SERIALIZED_NAME_DIC_ID)
  @jakarta.annotation.Nullable
  private String dicId;

  public static final String SERIALIZED_NAME_DATA_SCHEMA = "data_schema";
  @SerializedName(SERIALIZED_NAME_DATA_SCHEMA)
  @jakarta.annotation.Nonnull
  private DataSchema dataSchema;

  public ColumnSchema() {
  }

  public ColumnSchema id(@jakarta.annotation.Nonnull String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(@jakarta.annotation.Nonnull String id) {
    this.id = id;
  }


  public ColumnSchema name(@jakarta.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }


  public ColumnSchema dicId(@jakarta.annotation.Nullable String dicId) {
    this.dicId = dicId;
    return this;
  }

  /**
   * Get dicId
   * @return dicId
   */
  @jakarta.annotation.Nullable
  public String getDicId() {
    return dicId;
  }

  public void setDicId(@jakarta.annotation.Nullable String dicId) {
    this.dicId = dicId;
  }


  public ColumnSchema dataSchema(@jakarta.annotation.Nonnull DataSchema dataSchema) {
    this.dataSchema = dataSchema;
    return this;
  }

  /**
   * Get dataSchema
   * @return dataSchema
   */
  @jakarta.annotation.Nonnull
  public DataSchema getDataSchema() {
    return dataSchema;
  }

  public void setDataSchema(@jakarta.annotation.Nonnull DataSchema dataSchema) {
    this.dataSchema = dataSchema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnSchema columnSchema = (ColumnSchema) o;
    return Objects.equals(this.id, columnSchema.id) &&
        Objects.equals(this.name, columnSchema.name) &&
        Objects.equals(this.dicId, columnSchema.dicId) &&
        Objects.equals(this.dataSchema, columnSchema.dataSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dicId, dataSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dicId: ").append(toIndentedString(dicId)).append("\n");
    sb.append("    dataSchema: ").append(toIndentedString(dataSchema)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("dic_id");
    openapiFields.add("data_schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("data_schema");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ColumnSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ColumnSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ColumnSchema is not found in the empty JSON string", ColumnSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ColumnSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ColumnSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ColumnSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("dic_id") != null && !jsonObj.get("dic_id").isJsonNull()) && !jsonObj.get("dic_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dic_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dic_id").toString()));
      }
      // validate the required field `data_schema`
      DataSchema.validateJsonElement(jsonObj.get("data_schema"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ColumnSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ColumnSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ColumnSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ColumnSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ColumnSchema>() {
           @Override
           public void write(JsonWriter out, ColumnSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ColumnSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ColumnSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ColumnSchema
   * @throws IOException if the JSON string is invalid with respect to ColumnSchema
   */
  public static ColumnSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ColumnSchema.class);
  }

  /**
   * Convert an instance of ColumnSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

