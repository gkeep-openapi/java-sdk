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
 * NotificationSettingsInner
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T14:58:43.427Z[GMT]")
public class NotificationSettingsInner {
  @SerializedName("id")
  private String id = null;

  @SerializedName("notify_by_email")
  private Boolean notifyByEmail = null;

  @SerializedName("notify_by_sms")
  private Boolean notifyBySms = null;

  @SerializedName("level")
  private Object level = null;

  @SerializedName("code")
  private Object code = null;

  public NotificationSettingsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "5e4514c63587bb0b35749a02", description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NotificationSettingsInner notifyByEmail(Boolean notifyByEmail) {
    this.notifyByEmail = notifyByEmail;
    return this;
  }

   /**
   * Get notifyByEmail
   * @return notifyByEmail
  **/
  @Schema(description = "")
  public Boolean isNotifyByEmail() {
    return notifyByEmail;
  }

  public void setNotifyByEmail(Boolean notifyByEmail) {
    this.notifyByEmail = notifyByEmail;
  }

  public NotificationSettingsInner notifyBySms(Boolean notifyBySms) {
    this.notifyBySms = notifyBySms;
    return this;
  }

   /**
   * Get notifyBySms
   * @return notifyBySms
  **/
  @Schema(description = "")
  public Boolean isNotifyBySms() {
    return notifyBySms;
  }

  public void setNotifyBySms(Boolean notifyBySms) {
    this.notifyBySms = notifyBySms;
  }

  public NotificationSettingsInner level(Object level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public Object getLevel() {
    return level;
  }

  public void setLevel(Object level) {
    this.level = level;
  }

  public NotificationSettingsInner code(Object code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public Object getCode() {
    return code;
  }

  public void setCode(Object code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSettingsInner notificationSettingsInner = (NotificationSettingsInner) o;
    return Objects.equals(this.id, notificationSettingsInner.id) &&
        Objects.equals(this.notifyByEmail, notificationSettingsInner.notifyByEmail) &&
        Objects.equals(this.notifyBySms, notificationSettingsInner.notifyBySms) &&
        Objects.equals(this.level, notificationSettingsInner.level) &&
        Objects.equals(this.code, notificationSettingsInner.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, notifyByEmail, notifyBySms, level, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSettingsInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notifyByEmail: ").append(toIndentedString(notifyByEmail)).append("\n");
    sb.append("    notifyBySms: ").append(toIndentedString(notifyBySms)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
