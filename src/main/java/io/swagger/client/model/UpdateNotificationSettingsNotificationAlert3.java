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
 * UpdateNotificationSettingsNotificationAlert3
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-13T13:13:52.012Z[GMT]")
public class UpdateNotificationSettingsNotificationAlert3 {
  @SerializedName("level")
  private Integer level = null;

  @SerializedName("notify_by_sms")
  private Integer notifyBySms = null;

  @SerializedName("notify_by_email")
  private Integer notifyByEmail = null;

  public UpdateNotificationSettingsNotificationAlert3 level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(example = "4", description = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public UpdateNotificationSettingsNotificationAlert3 notifyBySms(Integer notifyBySms) {
    this.notifyBySms = notifyBySms;
    return this;
  }

   /**
   * Get notifyBySms
   * @return notifyBySms
  **/
  @Schema(example = "1", description = "")
  public Integer getNotifyBySms() {
    return notifyBySms;
  }

  public void setNotifyBySms(Integer notifyBySms) {
    this.notifyBySms = notifyBySms;
  }

  public UpdateNotificationSettingsNotificationAlert3 notifyByEmail(Integer notifyByEmail) {
    this.notifyByEmail = notifyByEmail;
    return this;
  }

   /**
   * Get notifyByEmail
   * @return notifyByEmail
  **/
  @Schema(example = "1", description = "")
  public Integer getNotifyByEmail() {
    return notifyByEmail;
  }

  public void setNotifyByEmail(Integer notifyByEmail) {
    this.notifyByEmail = notifyByEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNotificationSettingsNotificationAlert3 updateNotificationSettingsNotificationAlert3 = (UpdateNotificationSettingsNotificationAlert3) o;
    return Objects.equals(this.level, updateNotificationSettingsNotificationAlert3.level) &&
        Objects.equals(this.notifyBySms, updateNotificationSettingsNotificationAlert3.notifyBySms) &&
        Objects.equals(this.notifyByEmail, updateNotificationSettingsNotificationAlert3.notifyByEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, notifyBySms, notifyByEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNotificationSettingsNotificationAlert3 {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    notifyBySms: ").append(toIndentedString(notifyBySms)).append("\n");
    sb.append("    notifyByEmail: ").append(toIndentedString(notifyByEmail)).append("\n");
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
