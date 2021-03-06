/*
 * Gkeep API
 * Gkeep API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets UserLevel
 */
@JsonAdapter(UserLevel.Adapter.class)
public enum UserLevel {
  DRIVER("driver"),
  TECHNICAL("technical"),
  PARTNER("partner"),
  CLIENT("client"),
  FLEET_MANAGER("fleet_manager");

  private String value;

  UserLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserLevel fromValue(String text) {
    for (UserLevel b : UserLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UserLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserLevel.fromValue(String.valueOf(value));
    }
  }
}
