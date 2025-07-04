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
import org.openapitools.client.model.BriefProcessSettings;
import org.openapitools.client.model.ITStatReports;
import org.openapitools.client.model.IntegratedReports;
import org.openapitools.client.model.OriginalReports;
import org.openapitools.client.model.OtstatReports;

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
 * BriefTable
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class BriefTable {
  public static final String SERIALIZED_NAME_TABLE_ID = "table_id";
  @SerializedName(SERIALIZED_NAME_TABLE_ID)
  @jakarta.annotation.Nullable
  private String tableId;

  public static final String SERIALIZED_NAME_TABLE_NAME = "table_name";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  @jakarta.annotation.Nullable
  private String tableName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @jakarta.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalog_id";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  @jakarta.annotation.Nullable
  private String catalogId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @jakarta.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  @jakarta.annotation.Nullable
  private String createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  @jakarta.annotation.Nullable
  private String updateTime;

  public static final String SERIALIZED_NAME_ORIGINAL_REPORTS = "original_reports";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REPORTS)
  @jakarta.annotation.Nullable
  private OriginalReports originalReports;

  public static final String SERIALIZED_NAME_INTEGRATED_REPORTS = "integrated_reports";
  @SerializedName(SERIALIZED_NAME_INTEGRATED_REPORTS)
  @jakarta.annotation.Nullable
  private IntegratedReports integratedReports;

  public static final String SERIALIZED_NAME_ITSTAT_REPORTS = "itstat_reports";
  @SerializedName(SERIALIZED_NAME_ITSTAT_REPORTS)
  @jakarta.annotation.Nullable
  private ITStatReports itstatReports;

  public static final String SERIALIZED_NAME_OTSTAT_REPORTS = "otstat_reports";
  @SerializedName(SERIALIZED_NAME_OTSTAT_REPORTS)
  @jakarta.annotation.Nullable
  private OtstatReports otstatReports;

  public static final String SERIALIZED_NAME_PROCESS_SETTINGS = "process_settings";
  @SerializedName(SERIALIZED_NAME_PROCESS_SETTINGS)
  @jakarta.annotation.Nullable
  private BriefProcessSettings processSettings;

  public BriefTable() {
  }

  public BriefTable tableId(@jakarta.annotation.Nullable String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * Get tableId
   * @return tableId
   */
  @jakarta.annotation.Nullable
  public String getTableId() {
    return tableId;
  }

  public void setTableId(@jakarta.annotation.Nullable String tableId) {
    this.tableId = tableId;
  }


  public BriefTable tableName(@jakarta.annotation.Nullable String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Get tableName
   * @return tableName
   */
  @jakarta.annotation.Nullable
  public String getTableName() {
    return tableName;
  }

  public void setTableName(@jakarta.annotation.Nullable String tableName) {
    this.tableName = tableName;
  }


  public BriefTable type(@jakarta.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@jakarta.annotation.Nullable String type) {
    this.type = type;
  }


  public BriefTable catalogId(@jakarta.annotation.Nullable String catalogId) {
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


  public BriefTable description(@jakarta.annotation.Nullable String description) {
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


  public BriefTable createTime(@jakarta.annotation.Nullable String createTime) {
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


  public BriefTable updateTime(@jakarta.annotation.Nullable String updateTime) {
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


  public BriefTable originalReports(@jakarta.annotation.Nullable OriginalReports originalReports) {
    this.originalReports = originalReports;
    return this;
  }

  /**
   * Get originalReports
   * @return originalReports
   */
  @jakarta.annotation.Nullable
  public OriginalReports getOriginalReports() {
    return originalReports;
  }

  public void setOriginalReports(@jakarta.annotation.Nullable OriginalReports originalReports) {
    this.originalReports = originalReports;
  }


  public BriefTable integratedReports(@jakarta.annotation.Nullable IntegratedReports integratedReports) {
    this.integratedReports = integratedReports;
    return this;
  }

  /**
   * Get integratedReports
   * @return integratedReports
   */
  @jakarta.annotation.Nullable
  public IntegratedReports getIntegratedReports() {
    return integratedReports;
  }

  public void setIntegratedReports(@jakarta.annotation.Nullable IntegratedReports integratedReports) {
    this.integratedReports = integratedReports;
  }


  public BriefTable itstatReports(@jakarta.annotation.Nullable ITStatReports itstatReports) {
    this.itstatReports = itstatReports;
    return this;
  }

  /**
   * Get itstatReports
   * @return itstatReports
   */
  @jakarta.annotation.Nullable
  public ITStatReports getItstatReports() {
    return itstatReports;
  }

  public void setItstatReports(@jakarta.annotation.Nullable ITStatReports itstatReports) {
    this.itstatReports = itstatReports;
  }


  public BriefTable otstatReports(@jakarta.annotation.Nullable OtstatReports otstatReports) {
    this.otstatReports = otstatReports;
    return this;
  }

  /**
   * Get otstatReports
   * @return otstatReports
   */
  @jakarta.annotation.Nullable
  public OtstatReports getOtstatReports() {
    return otstatReports;
  }

  public void setOtstatReports(@jakarta.annotation.Nullable OtstatReports otstatReports) {
    this.otstatReports = otstatReports;
  }


  public BriefTable processSettings(@jakarta.annotation.Nullable BriefProcessSettings processSettings) {
    this.processSettings = processSettings;
    return this;
  }

  /**
   * Get processSettings
   * @return processSettings
   */
  @jakarta.annotation.Nullable
  public BriefProcessSettings getProcessSettings() {
    return processSettings;
  }

  public void setProcessSettings(@jakarta.annotation.Nullable BriefProcessSettings processSettings) {
    this.processSettings = processSettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BriefTable briefTable = (BriefTable) o;
    return Objects.equals(this.tableId, briefTable.tableId) &&
        Objects.equals(this.tableName, briefTable.tableName) &&
        Objects.equals(this.type, briefTable.type) &&
        Objects.equals(this.catalogId, briefTable.catalogId) &&
        Objects.equals(this.description, briefTable.description) &&
        Objects.equals(this.createTime, briefTable.createTime) &&
        Objects.equals(this.updateTime, briefTable.updateTime) &&
        Objects.equals(this.originalReports, briefTable.originalReports) &&
        Objects.equals(this.integratedReports, briefTable.integratedReports) &&
        Objects.equals(this.itstatReports, briefTable.itstatReports) &&
        Objects.equals(this.otstatReports, briefTable.otstatReports) &&
        Objects.equals(this.processSettings, briefTable.processSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableId, tableName, type, catalogId, description, createTime, updateTime, originalReports, integratedReports, itstatReports, otstatReports, processSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BriefTable {\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    originalReports: ").append(toIndentedString(originalReports)).append("\n");
    sb.append("    integratedReports: ").append(toIndentedString(integratedReports)).append("\n");
    sb.append("    itstatReports: ").append(toIndentedString(itstatReports)).append("\n");
    sb.append("    otstatReports: ").append(toIndentedString(otstatReports)).append("\n");
    sb.append("    processSettings: ").append(toIndentedString(processSettings)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("update_time");
    openapiFields.add("original_reports");
    openapiFields.add("integrated_reports");
    openapiFields.add("itstat_reports");
    openapiFields.add("otstat_reports");
    openapiFields.add("process_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BriefTable
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BriefTable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BriefTable is not found in the empty JSON string", BriefTable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BriefTable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BriefTable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("table_id") != null && !jsonObj.get("table_id").isJsonNull()) && !jsonObj.get("table_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_id").toString()));
      }
      if ((jsonObj.get("table_name") != null && !jsonObj.get("table_name").isJsonNull()) && !jsonObj.get("table_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `table_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("table_name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("catalog_id") != null && !jsonObj.get("catalog_id").isJsonNull()) && !jsonObj.get("catalog_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `catalog_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("catalog_id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonNull()) && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if ((jsonObj.get("update_time") != null && !jsonObj.get("update_time").isJsonNull()) && !jsonObj.get("update_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("update_time").toString()));
      }
      // validate the optional field `original_reports`
      if (jsonObj.get("original_reports") != null && !jsonObj.get("original_reports").isJsonNull()) {
        OriginalReports.validateJsonElement(jsonObj.get("original_reports"));
      }
      // validate the optional field `integrated_reports`
      if (jsonObj.get("integrated_reports") != null && !jsonObj.get("integrated_reports").isJsonNull()) {
        IntegratedReports.validateJsonElement(jsonObj.get("integrated_reports"));
      }
      // validate the optional field `itstat_reports`
      if (jsonObj.get("itstat_reports") != null && !jsonObj.get("itstat_reports").isJsonNull()) {
        ITStatReports.validateJsonElement(jsonObj.get("itstat_reports"));
      }
      // validate the optional field `otstat_reports`
      if (jsonObj.get("otstat_reports") != null && !jsonObj.get("otstat_reports").isJsonNull()) {
        OtstatReports.validateJsonElement(jsonObj.get("otstat_reports"));
      }
      // validate the optional field `process_settings`
      if (jsonObj.get("process_settings") != null && !jsonObj.get("process_settings").isJsonNull()) {
        BriefProcessSettings.validateJsonElement(jsonObj.get("process_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BriefTable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BriefTable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BriefTable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BriefTable.class));

       return (TypeAdapter<T>) new TypeAdapter<BriefTable>() {
           @Override
           public void write(JsonWriter out, BriefTable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BriefTable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BriefTable given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BriefTable
   * @throws IOException if the JSON string is invalid with respect to BriefTable
   */
  public static BriefTable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BriefTable.class);
  }

  /**
   * Convert an instance of BriefTable to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

