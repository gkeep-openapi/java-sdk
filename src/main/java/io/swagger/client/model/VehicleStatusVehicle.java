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
import io.swagger.client.model.VehicleStatusVehicleDriver;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * VehicleStatusVehicle
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-13T13:13:52.012Z[GMT]")
public class VehicleStatusVehicle {
  @SerializedName("capacity")
  private Integer capacity = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("driver")
  private VehicleStatusVehicleDriver driver = null;

  public VehicleStatusVehicle capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @Schema(example = "2100", description = "")
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public VehicleStatusVehicle id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "9", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VehicleStatusVehicle driver(VehicleStatusVehicleDriver driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @Schema(description = "")
  public VehicleStatusVehicleDriver getDriver() {
    return driver;
  }

  public void setDriver(VehicleStatusVehicleDriver driver) {
    this.driver = driver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleStatusVehicle vehicleStatusVehicle = (VehicleStatusVehicle) o;
    return Objects.equals(this.capacity, vehicleStatusVehicle.capacity) &&
        Objects.equals(this.id, vehicleStatusVehicle.id) &&
        Objects.equals(this.driver, vehicleStatusVehicle.driver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, id, driver);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleStatusVehicle {\n");
    
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
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
