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
import io.swagger.client.model.UpdateVehicleVehicle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UpdateVehicle
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-13T13:13:52.012Z[GMT]")
public class UpdateVehicle {
  @SerializedName("vehicle")
  private UpdateVehicleVehicle vehicle = null;

  public UpdateVehicle vehicle(UpdateVehicleVehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  @Schema(description = "")
  public UpdateVehicleVehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(UpdateVehicleVehicle vehicle) {
    this.vehicle = vehicle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVehicle updateVehicle = (UpdateVehicle) o;
    return Objects.equals(this.vehicle, updateVehicle.vehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVehicle {\n");
    
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
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
