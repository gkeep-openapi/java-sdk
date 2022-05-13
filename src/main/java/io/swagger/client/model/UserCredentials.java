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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UserCredentials
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T14:58:43.427Z[GMT]")
public class UserCredentials {
  @SerializedName("_username")
  private String _username = null;

  @SerializedName("_password")
  private String _password = null;

  public UserCredentials _username(String _username) {
    this._username = _username;
    return this;
  }

   /**
   * Get _username
   * @return _username
  **/
  @Schema(example = "example@example.com", description = "")
  public String getUsername() {
    return _username;
  }

  public void setUsername(String _username) {
    this._username = _username;
  }

  public UserCredentials _password(String _password) {
    this._password = _password;
    return this;
  }

   /**
   * Get _password
   * @return _password
  **/
  @Schema(example = "example_password", description = "")
  public String getPassword() {
    return _password;
  }

  public void setPassword(String _password) {
    this._password = _password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCredentials userCredentials = (UserCredentials) o;
    return Objects.equals(this._username, userCredentials._username) &&
        Objects.equals(this._password, userCredentials._password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_username, _password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCredentials {\n");
    
    sb.append("    _username: ").append(toIndentedString(_username)).append("\n");
    sb.append("    _password: ").append(toIndentedString(_password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
