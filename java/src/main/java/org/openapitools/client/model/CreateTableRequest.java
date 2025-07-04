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
import org.openapitools.client.model.AgingSettings;
import org.openapitools.client.model.TableSchema;

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
 * CreateTableRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class CreateTableRequest {
  public static final String SERIALIZED_NAME_TABLE_ID = "table_id";
  @SerializedName(SERIALIZED_NAME_TABLE_ID)
  @jakarta.annotation.Nonnull
  private String tableId;

  public static final String SERIALIZED_NAME_TABLE_NAME = "table_name";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  @jakarta.annotation.Nonnull
  private String tableName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nonnull
  private String type;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalog_id";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  @jakarta.annotation.Nullable
  private String catalogId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @jakarta.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_TABLE_SCHEMA = "table_schema";
  @SerializedName(SERIALIZED_NAME_TABLE_SCHEMA)
  @jakarta.annotation.Nonnull
  private TableSchema tableSchema;

  public static final String SERIALIZED_NAME_AGING_SETTINGS = "aging_settings";
  @SerializedName(SERIALIZED_NAME_AGING_SETTINGS)
  @jakarta.annotation.Nullable
  private AgingSettings agingSettings;

  public CreateTableRequest() {
  }

  public CreateTableRequest tableId(@jakarta.annotation.Nonnull String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * Get tableId
   * @return tableId
   */
  @jakarta.annotation.Nonnull
  public String getTableId() {
    return tableId;
  }

  public void setTableId(@jakarta.annotation.Nonnull String tableId) {
    this.tableId = tableId;
  }


  public CreateTableRequest tableName(@jakarta.annotation.Nonnull String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Get tableName
   * @return tableName
   */
  @jakarta.annotation.Nonnull
  public String getTableName() {
    return tableName;
  }

  public void setTableName(@jakarta.annotation.Nonnull String tableName) {
    this.tableName = tableName;
  }


  public CreateTableRequest type(@jakarta.annotation.Nonnull String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nonnull String type) {
    this.type = type;
  }


  public CreateTableRequest catalogId(@jakarta.annotation.Nullable String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Get catalogId
   * @return catalogId
   */
  @jakarta.annotation.Nullable
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(@jakarta.annotation.Nullable String catalogId) {
    this.catalogId = catalogId;
  }


  public CreateTableRequest description(@jakarta.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@jakarta.annotation.Nullable String description) {
    this.description = description;
  }


  public CreateTableRequest tableSchema(@jakarta.annotation.Nonnull TableSchema tableSchema) {
    this.tableSchema = tableSchema;
    return this;
  }

  /**
   * Get tableSchema
   * @return tableSchema
   */
  @jakarta.annotation.Nonnull
  public TableSchema getTableSchema() {
    return tableSchema;
  }

  public void setTableSchema(@jakarta.annotation.Nonnull TableSchema tableSchema) {
    this.tableSchema = tableSchema;
  }


  public CreateTableRequest agingSettings(@jakarta.annotation.Nullable AgingSettings agingSettings) {
    this.agingSettings = agingSettings;
    return this;
  }

  /**
   * Get agingSettings
   * @return agingSettings
   */
  @jakarta.annotation.Nullable
  public AgingSettings getAgingSettings() {
    return agingSettings;
  }

  public void setAgingSettings(@jakarta.annotation.Nullable AgingSettings agingSettings) {
    this.agingSettings = agingSettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTableRequest createTableRequest = (CreateTableRequest) o;
    return Objects.equals(this.tableId, createTableRequest.tableId) &&
        Objects.equals(this.tableName, createTableRequest.tableName) &&
        Objects.equals(this.type, createTableRequest.type) &&
        Objects.equals(this.catalogId, createTableRequest.catalogId) &&
        Objects.equals(this.description, createTableRequest.description) &&
        Objects.equals(this.tableSchema, createTableRequest.tableSchema) &&
        Objects.equals(this.agingSettings, createTableRequest.agingSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableId, tableName, type, catalogId, description, tableSchema, agingSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTableRequest {\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tableSchema: ").append(toIndentedString(tableSchema)).append("\n");
    sb.append("    agingSettings: ").append(toIndentedString(agingSettings)).append("\n");
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
    openapiFields.add("table_id");
    openapiFields.add("table_name");
    openapiFields.add("type");
    openapiFields.add("catalog_id");
    openapiFields.add("description");
    openapiFields.add("table_schema");
    openapiFields.add("aging_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("table_id");
    openapiRequiredFields.add("table_name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("table_schema");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTableRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTableRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTableRequest is not found in the empty JSON string", CreateTableRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTableRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTableRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTableRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("table_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_id").toString()));
      }
      if (!jsonObj.get("table_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("catalog_id") != null && !jsonObj.get("catalog_id").isJsonNull()) && !jsonObj.get("catalog_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `catalog_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("catalog_id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `table_schema`
      TableSchema.validateJsonElement(jsonObj.get("table_schema"));
      // validate the optional field `aging_settings`
      if (jsonObj.get("aging_settings") != null && !jsonObj.get("aging_settings").isJsonNull()) {
        AgingSettings.validateJsonElement(jsonObj.get("aging_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTableRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTableRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTableRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTableRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTableRequest>() {
           @Override
           public void write(JsonWriter out, CreateTableRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTableRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTableRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTableRequest
   * @throws IOException if the JSON string is invalid with respect to CreateTableRequest
   */
  public static CreateTableRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTableRequest.class);
  }

  /**
   * Convert an instance of CreateTableRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

