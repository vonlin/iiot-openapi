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
 * Expression
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-27T18:38:37.514966+08:00[Asia/Shanghai]", comments = "Generator version: 7.12.0")
public class Expression {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @jakarta.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  @jakarta.annotation.Nullable
  private String condition;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  @jakarta.annotation.Nonnull
  private String expression;

  public static final String SERIALIZED_NAME_PROPERTY_PATH = "property_path";
  @SerializedName(SERIALIZED_NAME_PROPERTY_PATH)
  @jakarta.annotation.Nullable
  private String propertyPath;

  public Expression() {
  }

  public Expression name(@jakarta.annotation.Nonnull String name) {
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


  public Expression condition(@jakarta.annotation.Nullable String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @jakarta.annotation.Nullable
  public String getCondition() {
    return condition;
  }

  public void setCondition(@jakarta.annotation.Nullable String condition) {
    this.condition = condition;
  }


  public Expression expression(@jakarta.annotation.Nonnull String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
   */
  @jakarta.annotation.Nonnull
  public String getExpression() {
    return expression;
  }

  public void setExpression(@jakarta.annotation.Nonnull String expression) {
    this.expression = expression;
  }


  public Expression propertyPath(@jakarta.annotation.Nullable String propertyPath) {
    this.propertyPath = propertyPath;
    return this;
  }

  /**
   * Get propertyPath
   * @return propertyPath
   */
  @jakarta.annotation.Nullable
  public String getPropertyPath() {
    return propertyPath;
  }

  public void setPropertyPath(@jakarta.annotation.Nullable String propertyPath) {
    this.propertyPath = propertyPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expression expression = (Expression) o;
    return Objects.equals(this.name, expression.name) &&
        Objects.equals(this.condition, expression.condition) &&
        Objects.equals(this.expression, expression.expression) &&
        Objects.equals(this.propertyPath, expression.propertyPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, condition, expression, propertyPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expression {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    propertyPath: ").append(toIndentedString(propertyPath)).append("\n");
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
    openapiFields.add("condition");
    openapiFields.add("expression");
    openapiFields.add("property_path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("expression");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Expression
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Expression.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Expression is not found in the empty JSON string", Expression.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Expression.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Expression` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Expression.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) && !jsonObj.get("condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition").toString()));
      }
      if (!jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      if ((jsonObj.get("property_path") != null && !jsonObj.get("property_path").isJsonNull()) && !jsonObj.get("property_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property_path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Expression.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Expression' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Expression> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Expression.class));

       return (TypeAdapter<T>) new TypeAdapter<Expression>() {
           @Override
           public void write(JsonWriter out, Expression value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Expression read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Expression given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Expression
   * @throws IOException if the JSON string is invalid with respect to Expression
   */
  public static Expression fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Expression.class);
  }

  /**
   * Convert an instance of Expression to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

