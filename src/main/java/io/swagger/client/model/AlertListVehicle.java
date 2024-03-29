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
import io.swagger.client.model.AlertListVehicleOwner;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AlertListVehicle
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T14:58:43.427Z[GMT]")
public class AlertListVehicle {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("owner")
  private AlertListVehicleOwner owner = null;

  @SerializedName("name")
  private String name = null;

  public AlertListVehicle id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "3", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AlertListVehicle owner(AlertListVehicleOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public AlertListVehicleOwner getOwner() {
    return owner;
  }

  public void setOwner(AlertListVehicleOwner owner) {
    this.owner = owner;
  }

  public AlertListVehicle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Vehicle", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertListVehicle alertListVehicle = (AlertListVehicle) o;
    return Objects.equals(this.id, alertListVehicle.id) &&
        Objects.equals(this.owner, alertListVehicle.owner) &&
        Objects.equals(this.name, alertListVehicle.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertListVehicle {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
