/*
 * Gkeep API
 * Gkeep API
 *
 * OpenAPI spec version: 0.0.1
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
 * VehicleListSensor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-01-22T09:48:50.100Z[GMT]")
public class VehicleListSensor {
  @SerializedName("gkeep_id")
  private String gkeepId = null;

  public VehicleListSensor gkeepId(String gkeepId) {
    this.gkeepId = gkeepId;
    return this;
  }

   /**
   * Get gkeepId
   * @return gkeepId
  **/
  @Schema(example = "KEEPER-00010", description = "")
  public String getGkeepId() {
    return gkeepId;
  }

  public void setGkeepId(String gkeepId) {
    this.gkeepId = gkeepId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleListSensor vehicleListSensor = (VehicleListSensor) o;
    return Objects.equals(this.gkeepId, vehicleListSensor.gkeepId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gkeepId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleListSensor {\n");
    
    sb.append("    gkeepId: ").append(toIndentedString(gkeepId)).append("\n");
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
