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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ColumnSchema;
import org.openapitools.client.model.IndexSchema;

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
 * TableSchema
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class TableSchema {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  @jakarta.annotation.Nonnull
  private List<ColumnSchema> columns = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRIMARY_KEY = "primary_key";
  @SerializedName(SERIALIZED_NAME_PRIMARY_KEY)
  @jakarta.annotation.Nonnull
  private List<String> primaryKey = new ArrayList<>();

  public static final String SERIALIZED_NAME_INDEXES = "indexes";
  @SerializedName(SERIALIZED_NAME_INDEXES)
  @jakarta.annotation.Nullable
  private List<IndexSchema> indexes = new ArrayList<>();

  public TableSchema() {
  }

  public TableSchema columns(@jakarta.annotation.Nonnull List<ColumnSchema> columns) {
    this.columns = columns;
    return this;
  }

  public TableSchema addColumnsItem(ColumnSchema columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Get columns
   * @return columns
   */
  @jakarta.annotation.Nonnull
  public List<ColumnSchema> getColumns() {
    return columns;
  }

  public void setColumns(@jakarta.annotation.Nonnull List<ColumnSchema> columns) {
    this.columns = columns;
  }


  public TableSchema primaryKey(@jakarta.annotation.Nonnull List<String> primaryKey) {
    this.primaryKey = primaryKey;
    return this;
  }

  public TableSchema addPrimaryKeyItem(String primaryKeyItem) {
    if (this.primaryKey == null) {
      this.primaryKey = new ArrayList<>();
    }
    this.primaryKey.add(primaryKeyItem);
    return this;
  }

  /**
   * Get primaryKey
   * @return primaryKey
   */
  @jakarta.annotation.Nonnull
  public List<String> getPrimaryKey() {
    return primaryKey;
  }

  public void setPrimaryKey(@jakarta.annotation.Nonnull List<String> primaryKey) {
    this.primaryKey = primaryKey;
  }


  public TableSchema indexes(@jakarta.annotation.Nullable List<IndexSchema> indexes) {
    this.indexes = indexes;
    return this;
  }

  public TableSchema addIndexesItem(IndexSchema indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * Get indexes
   * @return indexes
   */
  @jakarta.annotation.Nullable
  public List<IndexSchema> getIndexes() {
    return indexes;
  }

  public void setIndexes(@jakarta.annotation.Nullable List<IndexSchema> indexes) {
    this.indexes = indexes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableSchema tableSchema = (TableSchema) o;
    return Objects.equals(this.columns, tableSchema.columns) &&
        Objects.equals(this.primaryKey, tableSchema.primaryKey) &&
        Objects.equals(this.indexes, tableSchema.indexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, primaryKey, indexes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableSchema {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
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
    openapiFields.add("columns");
    openapiFields.add("primary_key");
    openapiFields.add("indexes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("columns");
    openapiRequiredFields.add("primary_key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TableSchema
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TableSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TableSchema is not found in the empty JSON string", TableSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TableSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TableSchema` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TableSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("columns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
      }

      JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
      // validate the required field `columns` (array)
      for (int i = 0; i < jsonArraycolumns.size(); i++) {
        ColumnSchema.validateJsonElement(jsonArraycolumns.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("primary_key") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("primary_key").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_key` to be an array in the JSON string but got `%s`", jsonObj.get("primary_key").toString()));
      }
      if (jsonObj.get("indexes") != null && !jsonObj.get("indexes").isJsonNull()) {
        JsonArray jsonArrayindexes = jsonObj.getAsJsonArray("indexes");
        if (jsonArrayindexes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("indexes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `indexes` to be an array in the JSON string but got `%s`", jsonObj.get("indexes").toString()));
          }

          // validate the optional field `indexes` (array)
          for (int i = 0; i < jsonArrayindexes.size(); i++) {
            IndexSchema.validateJsonElement(jsonArrayindexes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TableSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TableSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TableSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TableSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<TableSchema>() {
           @Override
           public void write(JsonWriter out, TableSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TableSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TableSchema given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TableSchema
   * @throws IOException if the JSON string is invalid with respect to TableSchema
   */
  public static TableSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TableSchema.class);
  }

  /**
   * Convert an instance of TableSchema to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

