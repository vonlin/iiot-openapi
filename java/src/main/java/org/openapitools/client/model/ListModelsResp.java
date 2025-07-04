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
import org.openapitools.client.model.BriefModel;

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
 * ListModelsResp
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class ListModelsResp {
  public static final String SERIALIZED_NAME_MODELS = "models";
  @SerializedName(SERIALIZED_NAME_MODELS)
  @jakarta.annotation.Nullable
  private List<BriefModel> models = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  @jakarta.annotation.Nullable
  private Integer count;

  public ListModelsResp() {
  }

  public ListModelsResp models(@jakarta.annotation.Nullable List<BriefModel> models) {
    this.models = models;
    return this;
  }

  public ListModelsResp addModelsItem(BriefModel modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }

  /**
   * Get models
   * @return models
   */
  @jakarta.annotation.Nullable
  public List<BriefModel> getModels() {
    return models;
  }

  public void setModels(@jakarta.annotation.Nullable List<BriefModel> models) {
    this.models = models;
  }


  public ListModelsResp count(@jakarta.annotation.Nullable Integer count) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListModelsResp listModelsResp = (ListModelsResp) o;
    return Objects.equals(this.models, listModelsResp.models) &&
        Objects.equals(this.count, listModelsResp.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListModelsResp {\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("models");
    openapiFields.add("count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListModelsResp
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListModelsResp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListModelsResp is not found in the empty JSON string", ListModelsResp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListModelsResp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListModelsResp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("models") != null && !jsonObj.get("models").isJsonNull()) {
        JsonArray jsonArraymodels = jsonObj.getAsJsonArray("models");
        if (jsonArraymodels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("models").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `models` to be an array in the JSON string but got `%s`", jsonObj.get("models").toString()));
          }

          // validate the optional field `models` (array)
          for (int i = 0; i < jsonArraymodels.size(); i++) {
            BriefModel.validateJsonElement(jsonArraymodels.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListModelsResp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListModelsResp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListModelsResp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListModelsResp.class));

       return (TypeAdapter<T>) new TypeAdapter<ListModelsResp>() {
           @Override
           public void write(JsonWriter out, ListModelsResp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListModelsResp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListModelsResp given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListModelsResp
   * @throws IOException if the JSON string is invalid with respect to ListModelsResp
   */
  public static ListModelsResp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListModelsResp.class);
  }

  /**
   * Convert an instance of ListModelsResp to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

