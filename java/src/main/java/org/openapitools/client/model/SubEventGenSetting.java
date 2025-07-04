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
import org.openapitools.client.model.EventGenExpression;
import org.openapitools.client.model.EventGenOutput;
import org.openapitools.client.model.EventTrigger;

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
 * SubEventGenSetting
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class SubEventGenSetting {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_START_TRIGGER = "start_trigger";
  @SerializedName(SERIALIZED_NAME_START_TRIGGER)
  @jakarta.annotation.Nonnull
  private EventTrigger startTrigger;

  public static final String SERIALIZED_NAME_END_TRIGGER = "end_trigger";
  @SerializedName(SERIALIZED_NAME_END_TRIGGER)
  @jakarta.annotation.Nullable
  private EventTrigger endTrigger;

  public static final String SERIALIZED_NAME_EXPRESSIONS = "expressions";
  @SerializedName(SERIALIZED_NAME_EXPRESSIONS)
  @jakarta.annotation.Nullable
  private List<EventGenExpression> expressions = new ArrayList<>();

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  @jakarta.annotation.Nullable
  private EventGenOutput outputs;

  public SubEventGenSetting() {
  }

  public SubEventGenSetting name(@jakarta.annotation.Nonnull String name) {
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


  public SubEventGenSetting startTrigger(@jakarta.annotation.Nonnull EventTrigger startTrigger) {
    this.startTrigger = startTrigger;
    return this;
  }

  /**
   * Get startTrigger
   * @return startTrigger
   */
  @jakarta.annotation.Nonnull
  public EventTrigger getStartTrigger() {
    return startTrigger;
  }

  public void setStartTrigger(@jakarta.annotation.Nonnull EventTrigger startTrigger) {
    this.startTrigger = startTrigger;
  }


  public SubEventGenSetting endTrigger(@jakarta.annotation.Nullable EventTrigger endTrigger) {
    this.endTrigger = endTrigger;
    return this;
  }

  /**
   * Get endTrigger
   * @return endTrigger
   */
  @jakarta.annotation.Nullable
  public EventTrigger getEndTrigger() {
    return endTrigger;
  }

  public void setEndTrigger(@jakarta.annotation.Nullable EventTrigger endTrigger) {
    this.endTrigger = endTrigger;
  }


  public SubEventGenSetting expressions(@jakarta.annotation.Nullable List<EventGenExpression> expressions) {
    this.expressions = expressions;
    return this;
  }

  public SubEventGenSetting addExpressionsItem(EventGenExpression expressionsItem) {
    if (this.expressions == null) {
      this.expressions = new ArrayList<>();
    }
    this.expressions.add(expressionsItem);
    return this;
  }

  /**
   * Get expressions
   * @return expressions
   */
  @jakarta.annotation.Nullable
  public List<EventGenExpression> getExpressions() {
    return expressions;
  }

  public void setExpressions(@jakarta.annotation.Nullable List<EventGenExpression> expressions) {
    this.expressions = expressions;
  }


  public SubEventGenSetting outputs(@jakarta.annotation.Nullable EventGenOutput outputs) {
    this.outputs = outputs;
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  @jakarta.annotation.Nullable
  public EventGenOutput getOutputs() {
    return outputs;
  }

  public void setOutputs(@jakarta.annotation.Nullable EventGenOutput outputs) {
    this.outputs = outputs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubEventGenSetting subEventGenSetting = (SubEventGenSetting) o;
    return Objects.equals(this.name, subEventGenSetting.name) &&
        Objects.equals(this.startTrigger, subEventGenSetting.startTrigger) &&
        Objects.equals(this.endTrigger, subEventGenSetting.endTrigger) &&
        Objects.equals(this.expressions, subEventGenSetting.expressions) &&
        Objects.equals(this.outputs, subEventGenSetting.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startTrigger, endTrigger, expressions, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubEventGenSetting {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTrigger: ").append(toIndentedString(startTrigger)).append("\n");
    sb.append("    endTrigger: ").append(toIndentedString(endTrigger)).append("\n");
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("start_trigger");
    openapiFields.add("end_trigger");
    openapiFields.add("expressions");
    openapiFields.add("outputs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("start_trigger");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubEventGenSetting
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubEventGenSetting.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubEventGenSetting is not found in the empty JSON string", SubEventGenSetting.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubEventGenSetting.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubEventGenSetting` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubEventGenSetting.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `start_trigger`
      EventTrigger.validateJsonElement(jsonObj.get("start_trigger"));
      // validate the optional field `end_trigger`
      if (jsonObj.get("end_trigger") != null && !jsonObj.get("end_trigger").isJsonNull()) {
        EventTrigger.validateJsonElement(jsonObj.get("end_trigger"));
      }
      if (jsonObj.get("expressions") != null && !jsonObj.get("expressions").isJsonNull()) {
        JsonArray jsonArrayexpressions = jsonObj.getAsJsonArray("expressions");
        if (jsonArrayexpressions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("expressions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `expressions` to be an array in the JSON string but got `%s`", jsonObj.get("expressions").toString()));
          }

          // validate the optional field `expressions` (array)
          for (int i = 0; i < jsonArrayexpressions.size(); i++) {
            EventGenExpression.validateJsonElement(jsonArrayexpressions.get(i));
          };
        }
      }
      // validate the optional field `outputs`
      if (jsonObj.get("outputs") != null && !jsonObj.get("outputs").isJsonNull()) {
        EventGenOutput.validateJsonElement(jsonObj.get("outputs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubEventGenSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubEventGenSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubEventGenSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubEventGenSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<SubEventGenSetting>() {
           @Override
           public void write(JsonWriter out, SubEventGenSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubEventGenSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubEventGenSetting given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubEventGenSetting
   * @throws IOException if the JSON string is invalid with respect to SubEventGenSetting
   */
  public static SubEventGenSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubEventGenSetting.class);
  }

  /**
   * Convert an instance of SubEventGenSetting to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

