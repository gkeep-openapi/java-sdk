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
 * UpdateVehicleVehicleTanks
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T14:58:43.427Z[GMT]")
public class UpdateVehicleVehicleTanks {
  @SerializedName("tank_type")
  private Integer tankType = null;

  public UpdateVehicleVehicleTanks tankType(Integer tankType) {
    this.tankType = tankType;
    return this;
  }

   /**
   * Get tankType
   * @return tankType
  **/
  @Schema(example = "2", description = "")
  public Integer getTankType() {
    return tankType;
  }

  public void setTankType(Integer tankType) {
    this.tankType = tankType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVehicleVehicleTanks updateVehicleVehicleTanks = (UpdateVehicleVehicleTanks) o;
    return Objects.equals(this.tankType, updateVehicleVehicleTanks.tankType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tankType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVehicleVehicleTanks {\n");
    
    sb.append("    tankType: ").append(toIndentedString(tankType)).append("\n");
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
