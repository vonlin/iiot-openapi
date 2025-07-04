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
 * EnrichedCatalogNode
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class EnrichedCatalogNode {
  public static final String SERIALIZED_NAME_LEVEL_ID = "level_id";
  @SerializedName(SERIALIZED_NAME_LEVEL_ID)
  @jakarta.annotation.Nullable
  private String levelId;

  public static final String SERIALIZED_NAME_NODE_ID = "node_id";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  @jakarta.annotation.Nullable
  private String nodeId;

  public static final String SERIALIZED_NAME_NODE_NAME = "node_name";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  @jakarta.annotation.Nullable
  private String nodeName;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "display_order";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  @jakarta.annotation.Nullable
  private Integer displayOrder;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  @jakarta.annotation.Nullable
  private String createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  @jakarta.annotation.Nullable
  private String updateTime;

  public EnrichedCatalogNode() {
  }

  public EnrichedCatalogNode levelId(@jakarta.annotation.Nullable String levelId) {
    this.levelId = levelId;
    return this;
  }

  /**
   * Get levelId
   * @return levelId
   */
  @jakarta.annotation.Nullable
  public String getLevelId() {
    return levelId;
  }

  public void setLevelId(@jakarta.annotation.Nullable String levelId) {
    this.levelId = levelId;
  }


  public EnrichedCatalogNode nodeId(@jakarta.annotation.Nullable String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * Get nodeId
   * @return nodeId
   */
  @jakarta.annotation.Nullable
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(@jakarta.annotation.Nullable String nodeId) {
    this.nodeId = nodeId;
  }


  public EnrichedCatalogNode nodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  /**
   * Get nodeName
   * @return nodeName
   */
  @jakarta.annotation.Nullable
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(@jakarta.annotation.Nullable String nodeName) {
    this.nodeName = nodeName;
  }


  public EnrichedCatalogNode displayOrder(@jakarta.annotation.Nullable Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  /**
   * Get displayOrder
   * @return displayOrder
   */
  @jakarta.annotation.Nullable
  public Integer getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(@jakarta.annotation.Nullable Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  public EnrichedCatalogNode createTime(@jakarta.annotation.Nullable String createTime) {
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


  public EnrichedCatalogNode updateTime(@jakarta.annotation.Nullable String updateTime) {
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
    EnrichedCatalogNode enrichedCatalogNode = (EnrichedCatalogNode) o;
    return Objects.equals(this.levelId, enrichedCatalogNode.levelId) &&
        Objects.equals(this.nodeId, enrichedCatalogNode.nodeId) &&
        Objects.equals(this.nodeName, enrichedCatalogNode.nodeName) &&
        Objects.equals(this.displayOrder, enrichedCatalogNode.displayOrder) &&
        Objects.equals(this.createTime, enrichedCatalogNode.createTime) &&
        Objects.equals(this.updateTime, enrichedCatalogNode.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levelId, nodeId, nodeName, displayOrder, createTime, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichedCatalogNode {\n");
    sb.append("    levelId: ").append(toIndentedString(levelId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
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
    openapiFields.add("level_id");
    openapiFields.add("node_id");
    openapiFields.add("node_name");
    openapiFields.add("display_order");
    openapiFields.add("create_time");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EnrichedCatalogNode
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnrichedCatalogNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnrichedCatalogNode is not found in the empty JSON string", EnrichedCatalogNode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnrichedCatalogNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnrichedCatalogNode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("level_id") != null && !jsonObj.get("level_id").isJsonNull()) && !jsonObj.get("level_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level_id").toString()));
      }
      if ((jsonObj.get("node_id") != null && !jsonObj.get("node_id").isJsonNull()) && !jsonObj.get("node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_id").toString()));
      }
      if ((jsonObj.get("node_name") != null && !jsonObj.get("node_name").isJsonNull()) && !jsonObj.get("node_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `node_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("node_name").toString()));
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
       if (!EnrichedCatalogNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnrichedCatalogNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnrichedCatalogNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnrichedCatalogNode.class));

       return (TypeAdapter<T>) new TypeAdapter<EnrichedCatalogNode>() {
           @Override
           public void write(JsonWriter out, EnrichedCatalogNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnrichedCatalogNode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EnrichedCatalogNode given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EnrichedCatalogNode
   * @throws IOException if the JSON string is invalid with respect to EnrichedCatalogNode
   */
  public static EnrichedCatalogNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnrichedCatalogNode.class);
  }

  /**
   * Convert an instance of EnrichedCatalogNode to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

