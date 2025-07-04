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
import org.openapitools.client.model.SubEventGenSetting;

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
 * EventGenSetting
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class EventGenSetting {
  public static final String SERIALIZED_NAME_START_TRIGGER = "start_trigger";
  @SerializedName(SERIALIZED_NAME_START_TRIGGER)
  @jakarta.annotation.Nullable
  private EventTrigger startTrigger;

  public static final String SERIALIZED_NAME_END_TRIGGER = "end_trigger";
  @SerializedName(SERIALIZED_NAME_END_TRIGGER)
  @jakarta.annotation.Nullable
  private EventTrigger endTrigger;

  public static final String SERIALIZED_NAME_EXPRESSIONS = "expressions";
  @SerializedName(SERIALIZED_NAME_EXPRESSIONS)
  @jakarta.annotation.Nonnull
  private List<EventGenExpression> expressions = new ArrayList<>();

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  @jakarta.annotation.Nullable
  private EventGenOutput outputs;

  public static final String SERIALIZED_NAME_SUBEVENTS = "subevents";
  @SerializedName(SERIALIZED_NAME_SUBEVENTS)
  @jakarta.annotation.Nullable
  private List<SubEventGenSetting> subevents = new ArrayList<>();

  public EventGenSetting() {
  }

  public EventGenSetting startTrigger(@jakarta.annotation.Nullable EventTrigger startTrigger) {
    this.startTrigger = startTrigger;
    return this;
  }

  /**
   * Get startTrigger
   * @return startTrigger
   */
  @jakarta.annotation.Nullable
  public EventTrigger getStartTrigger() {
    return startTrigger;
  }

  public void setStartTrigger(@jakarta.annotation.Nullable EventTrigger startTrigger) {
    this.startTrigger = startTrigger;
  }


  public EventGenSetting endTrigger(@jakarta.annotation.Nullable EventTrigger endTrigger) {
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


  public EventGenSetting expressions(@jakarta.annotation.Nonnull List<EventGenExpression> expressions) {
    this.expressions = expressions;
    return this;
  }

  public EventGenSetting addExpressionsItem(EventGenExpression expressionsItem) {
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
  @jakarta.annotation.Nonnull
  public List<EventGenExpression> getExpressions() {
    return expressions;
  }

  public void setExpressions(@jakarta.annotation.Nonnull List<EventGenExpression> expressions) {
    this.expressions = expressions;
  }


  public EventGenSetting outputs(@jakarta.annotation.Nullable EventGenOutput outputs) {
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


  public EventGenSetting subevents(@jakarta.annotation.Nullable List<SubEventGenSetting> subevents) {
    this.subevents = subevents;
    return this;
  }

  public EventGenSetting addSubeventsItem(SubEventGenSetting subeventsItem) {
    if (this.subevents == null) {
      this.subevents = new ArrayList<>();
    }
    this.subevents.add(subeventsItem);
    return this;
  }

  /**
   * Get subevents
   * @return subevents
   */
  @jakarta.annotation.Nullable
  public List<SubEventGenSetting> getSubevents() {
    return subevents;
  }

  public void setSubevents(@jakarta.annotation.Nullable List<SubEventGenSetting> subevents) {
    this.subevents = subevents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventGenSetting eventGenSetting = (EventGenSetting) o;
    return Objects.equals(this.startTrigger, eventGenSetting.startTrigger) &&
        Objects.equals(this.endTrigger, eventGenSetting.endTrigger) &&
        Objects.equals(this.expressions, eventGenSetting.expressions) &&
        Objects.equals(this.outputs, eventGenSetting.outputs) &&
        Objects.equals(this.subevents, eventGenSetting.subevents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTrigger, endTrigger, expressions, outputs, subevents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventGenSetting {\n");
    sb.append("    startTrigger: ").append(toIndentedString(startTrigger)).append("\n");
    sb.append("    endTrigger: ").append(toIndentedString(endTrigger)).append("\n");
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    subevents: ").append(toIndentedString(subevents)).append("\n");
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
    openapiFields.add("start_trigger");
    openapiFields.add("end_trigger");
    openapiFields.add("expressions");
    openapiFields.add("outputs");
    openapiFields.add("subevents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expressions");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventGenSetting
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventGenSetting.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventGenSetting is not found in the empty JSON string", EventGenSetting.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventGenSetting.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventGenSetting` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventGenSetting.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `start_trigger`
      if (jsonObj.get("start_trigger") != null && !jsonObj.get("start_trigger").isJsonNull()) {
        EventTrigger.validateJsonElement(jsonObj.get("start_trigger"));
      }
      // validate the optional field `end_trigger`
      if (jsonObj.get("end_trigger") != null && !jsonObj.get("end_trigger").isJsonNull()) {
        EventTrigger.validateJsonElement(jsonObj.get("end_trigger"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("expressions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expressions` to be an array in the JSON string but got `%s`", jsonObj.get("expressions").toString()));
      }

      JsonArray jsonArrayexpressions = jsonObj.getAsJsonArray("expressions");
      // validate the required field `expressions` (array)
      for (int i = 0; i < jsonArrayexpressions.size(); i++) {
        EventGenExpression.validateJsonElement(jsonArrayexpressions.get(i));
      };
      // validate the optional field `outputs`
      if (jsonObj.get("outputs") != null && !jsonObj.get("outputs").isJsonNull()) {
        EventGenOutput.validateJsonElement(jsonObj.get("outputs"));
      }
      if (jsonObj.get("subevents") != null && !jsonObj.get("subevents").isJsonNull()) {
        JsonArray jsonArraysubevents = jsonObj.getAsJsonArray("subevents");
        if (jsonArraysubevents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subevents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subevents` to be an array in the JSON string but got `%s`", jsonObj.get("subevents").toString()));
          }

          // validate the optional field `subevents` (array)
          for (int i = 0; i < jsonArraysubevents.size(); i++) {
            SubEventGenSetting.validateJsonElement(jsonArraysubevents.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventGenSetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventGenSetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventGenSetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventGenSetting.class));

       return (TypeAdapter<T>) new TypeAdapter<EventGenSetting>() {
           @Override
           public void write(JsonWriter out, EventGenSetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventGenSetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventGenSetting given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventGenSetting
   * @throws IOException if the JSON string is invalid with respect to EventGenSetting
   */
  public static EventGenSetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventGenSetting.class);
  }

  /**
   * Convert an instance of EventGenSetting to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

