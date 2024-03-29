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
import io.swagger.client.model.VehicleStatusTank;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * VehicleStatusTanks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T14:58:43.427Z[GMT]")
public class VehicleStatusTanks {
  @SerializedName("fuel_level")
  private BigDecimal fuelLevel = null;

  @SerializedName("smoothed_fuel_level")
  private BigDecimal smoothedFuelLevel = null;

  @SerializedName("fuel_level_on_raise_start")
  private BigDecimal fuelLevelOnRaiseStart = null;

  @SerializedName("tank")
  private VehicleStatusTank tank = null;

  public VehicleStatusTanks fuelLevel(BigDecimal fuelLevel) {
    this.fuelLevel = fuelLevel;
    return this;
  }

   /**
   * Get fuelLevel
   * @return fuelLevel
  **/
  @Schema(example = "29.17", description = "")
  public BigDecimal getFuelLevel() {
    return fuelLevel;
  }

  public void setFuelLevel(BigDecimal fuelLevel) {
    this.fuelLevel = fuelLevel;
  }

  public VehicleStatusTanks smoothedFuelLevel(BigDecimal smoothedFuelLevel) {
    this.smoothedFuelLevel = smoothedFuelLevel;
    return this;
  }

   /**
   * Get smoothedFuelLevel
   * @return smoothedFuelLevel
  **/
  @Schema(example = "54.87", description = "")
  public BigDecimal getSmoothedFuelLevel() {
    return smoothedFuelLevel;
  }

  public void setSmoothedFuelLevel(BigDecimal smoothedFuelLevel) {
    this.smoothedFuelLevel = smoothedFuelLevel;
  }

  public VehicleStatusTanks fuelLevelOnRaiseStart(BigDecimal fuelLevelOnRaiseStart) {
    this.fuelLevelOnRaiseStart = fuelLevelOnRaiseStart;
    return this;
  }

   /**
   * Get fuelLevelOnRaiseStart
   * @return fuelLevelOnRaiseStart
  **/
  @Schema(example = "29.17", description = "")
  public BigDecimal getFuelLevelOnRaiseStart() {
    return fuelLevelOnRaiseStart;
  }

  public void setFuelLevelOnRaiseStart(BigDecimal fuelLevelOnRaiseStart) {
    this.fuelLevelOnRaiseStart = fuelLevelOnRaiseStart;
  }

  public VehicleStatusTanks tank(VehicleStatusTank tank) {
    this.tank = tank;
    return this;
  }

   /**
   * Get tank
   * @return tank
  **/
  @Schema(description = "")
  public VehicleStatusTank getTank() {
    return tank;
  }

  public void setTank(VehicleStatusTank tank) {
    this.tank = tank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleStatusTanks vehicleStatusTanks = (VehicleStatusTanks) o;
    return Objects.equals(this.fuelLevel, vehicleStatusTanks.fuelLevel) &&
        Objects.equals(this.smoothedFuelLevel, vehicleStatusTanks.smoothedFuelLevel) &&
        Objects.equals(this.fuelLevelOnRaiseStart, vehicleStatusTanks.fuelLevelOnRaiseStart) &&
        Objects.equals(this.tank, vehicleStatusTanks.tank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fuelLevel, smoothedFuelLevel, fuelLevelOnRaiseStart, tank);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleStatusTanks {\n");
    
    sb.append("    fuelLevel: ").append(toIndentedString(fuelLevel)).append("\n");
    sb.append("    smoothedFuelLevel: ").append(toIndentedString(smoothedFuelLevel)).append("\n");
    sb.append("    fuelLevelOnRaiseStart: ").append(toIndentedString(fuelLevelOnRaiseStart)).append("\n");
    sb.append("    tank: ").append(toIndentedString(tank)).append("\n");
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
