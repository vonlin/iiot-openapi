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
import org.openapitools.client.model.BriefTable;

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
 * ListTablesResp
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class ListTablesResp {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  @jakarta.annotation.Nullable
  private Integer count;

  public static final String SERIALIZED_NAME_TABLES = "tables";
  @SerializedName(SERIALIZED_NAME_TABLES)
  @jakarta.annotation.Nullable
  private List<BriefTable> tables = new ArrayList<>();

  public ListTablesResp() {
  }

  public ListTablesResp count(@jakarta.annotation.Nullable Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   */
  @jakarta.annotation.Nullable
  public Integer getCount() {
    return count;
  }

  public void setCount(@jakarta.annotation.Nullable Integer count) {
    this.count = count;
  }


  public ListTablesResp tables(@jakarta.annotation.Nullable List<BriefTable> tables) {
    this.tables = tables;
    return this;
  }

  public ListTablesResp addTablesItem(BriefTable tablesItem) {
    if (this.tables == null) {
      this.tables = new ArrayList<>();
    }
    this.tables.add(tablesItem);
    return this;
  }

  /**
   * Get tables
   * @return tables
   */
  @jakarta.annotation.Nullable
  public List<BriefTable> getTables() {
    return tables;
  }

  public void setTables(@jakarta.annotation.Nullable List<BriefTable> tables) {
    this.tables = tables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTablesResp listTablesResp = (ListTablesResp) o;
    return Objects.equals(this.count, listTablesResp.count) &&
        Objects.equals(this.tables, listTablesResp.tables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, tables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTablesResp {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("tables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListTablesResp
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListTablesResp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListTablesResp is not found in the empty JSON string", ListTablesResp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListTablesResp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListTablesResp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("tables") != null && !jsonObj.get("tables").isJsonNull()) {
        JsonArray jsonArraytables = jsonObj.getAsJsonArray("tables");
        if (jsonArraytables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tables` to be an array in the JSON string but got `%s`", jsonObj.get("tables").toString()));
          }

          // validate the optional field `tables` (array)
          for (int i = 0; i < jsonArraytables.size(); i++) {
            BriefTable.validateJsonElement(jsonArraytables.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListTablesResp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListTablesResp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListTablesResp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListTablesResp.class));

       return (TypeAdapter<T>) new TypeAdapter<ListTablesResp>() {
           @Override
           public void write(JsonWriter out, ListTablesResp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListTablesResp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListTablesResp given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListTablesResp
   * @throws IOException if the JSON string is invalid with respect to ListTablesResp
   */
  public static ListTablesResp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListTablesResp.class);
  }

  /**
   * Convert an instance of ListTablesResp to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

