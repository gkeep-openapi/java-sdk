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
import io.swagger.client.model.UpdateVehicleVehicleTanks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * UpdateVehicleVehicle
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-13T14:58:43.427Z[GMT]")
public class UpdateVehicleVehicle {
  @SerializedName("name")
  private String name = null;

  @SerializedName("nav_system_object_uid")
  private String navSystemObjectUid = null;

  @SerializedName("release_year")
  private Integer releaseYear = null;

  @SerializedName("registration")
  private String registration = null;

  @SerializedName("type")
  private Integer type = null;

  @SerializedName("brand")
  private Integer brand = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("model")
  private Integer model = null;

  @SerializedName("category")
  private Integer category = null;

  @SerializedName("initial_consumption")
  private BigDecimal initialConsumption = null;

  @SerializedName("country")
  private Integer country = null;

  @SerializedName("nav_system")
  private Integer navSystem = null;

  @SerializedName("tanks")
  private List<UpdateVehicleVehicleTanks> tanks = null;

  @SerializedName("tank_position")
  private Integer tankPosition = null;

  @SerializedName("technical")
  private Integer technical = null;

  public UpdateVehicleVehicle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Update By Master", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateVehicleVehicle navSystemObjectUid(String navSystemObjectUid) {
    this.navSystemObjectUid = navSystemObjectUid;
    return this;
  }

   /**
   * Get navSystemObjectUid
   * @return navSystemObjectUid
  **/
  @Schema(example = "updated-vehicle", description = "")
  public String getNavSystemObjectUid() {
    return navSystemObjectUid;
  }

  public void setNavSystemObjectUid(String navSystemObjectUid) {
    this.navSystemObjectUid = navSystemObjectUid;
  }

  public UpdateVehicleVehicle releaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
    return this;
  }

   /**
   * Get releaseYear
   * @return releaseYear
  **/
  @Schema(example = "1999", description = "")
  public Integer getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
  }

  public UpdateVehicleVehicle registration(String registration) {
    this.registration = registration;
    return this;
  }

   /**
   * Get registration
   * @return registration
  **/
  @Schema(example = "reg info", description = "")
  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public UpdateVehicleVehicle type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(example = "1", description = "")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public UpdateVehicleVehicle brand(Integer brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @Schema(example = "3", description = "")
  public Integer getBrand() {
    return brand;
  }

  public void setBrand(Integer brand) {
    this.brand = brand;
  }

  public UpdateVehicleVehicle version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(example = "867", description = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public UpdateVehicleVehicle model(Integer model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @Schema(example = "30", description = "")
  public Integer getModel() {
    return model;
  }

  public void setModel(Integer model) {
    this.model = model;
  }

  public UpdateVehicleVehicle category(Integer category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(example = "42", description = "")
  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  public UpdateVehicleVehicle initialConsumption(BigDecimal initialConsumption) {
    this.initialConsumption = initialConsumption;
    return this;
  }

   /**
   * Get initialConsumption
   * @return initialConsumption
  **/
  @Schema(example = "1.222", description = "")
  public BigDecimal getInitialConsumption() {
    return initialConsumption;
  }

  public void setInitialConsumption(BigDecimal initialConsumption) {
    this.initialConsumption = initialConsumption;
  }

  public UpdateVehicleVehicle country(Integer country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(example = "4", description = "")
  public Integer getCountry() {
    return country;
  }

  public void setCountry(Integer country) {
    this.country = country;
  }

  public UpdateVehicleVehicle navSystem(Integer navSystem) {
    this.navSystem = navSystem;
    return this;
  }

   /**
   * Get navSystem
   * @return navSystem
  **/
  @Schema(example = "1", description = "")
  public Integer getNavSystem() {
    return navSystem;
  }

  public void setNavSystem(Integer navSystem) {
    this.navSystem = navSystem;
  }

  public UpdateVehicleVehicle tanks(List<UpdateVehicleVehicleTanks> tanks) {
    this.tanks = tanks;
    return this;
  }

  public UpdateVehicleVehicle addTanksItem(UpdateVehicleVehicleTanks tanksItem) {
    if (this.tanks == null) {
      this.tanks = new ArrayList<UpdateVehicleVehicleTanks>();
    }
    this.tanks.add(tanksItem);
    return this;
  }

   /**
   * Get tanks
   * @return tanks
  **/
  @Schema(description = "")
  public List<UpdateVehicleVehicleTanks> getTanks() {
    return tanks;
  }

  public void setTanks(List<UpdateVehicleVehicleTanks> tanks) {
    this.tanks = tanks;
  }

  public UpdateVehicleVehicle tankPosition(Integer tankPosition) {
    this.tankPosition = tankPosition;
    return this;
  }

   /**
   * Get tankPosition
   * @return tankPosition
  **/
  @Schema(example = "1", description = "")
  public Integer getTankPosition() {
    return tankPosition;
  }

  public void setTankPosition(Integer tankPosition) {
    this.tankPosition = tankPosition;
  }

  public UpdateVehicleVehicle technical(Integer technical) {
    this.technical = technical;
    return this;
  }

   /**
   * Get technical
   * @return technical
  **/
  @Schema(example = "51", description = "")
  public Integer getTechnical() {
    return technical;
  }

  public void setTechnical(Integer technical) {
    this.technical = technical;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVehicleVehicle updateVehicleVehicle = (UpdateVehicleVehicle) o;
    return Objects.equals(this.name, updateVehicleVehicle.name) &&
        Objects.equals(this.navSystemObjectUid, updateVehicleVehicle.navSystemObjectUid) &&
        Objects.equals(this.releaseYear, updateVehicleVehicle.releaseYear) &&
        Objects.equals(this.registration, updateVehicleVehicle.registration) &&
        Objects.equals(this.type, updateVehicleVehicle.type) &&
        Objects.equals(this.brand, updateVehicleVehicle.brand) &&
        Objects.equals(this.version, updateVehicleVehicle.version) &&
        Objects.equals(this.model, updateVehicleVehicle.model) &&
        Objects.equals(this.category, updateVehicleVehicle.category) &&
        Objects.equals(this.initialConsumption, updateVehicleVehicle.initialConsumption) &&
        Objects.equals(this.country, updateVehicleVehicle.country) &&
        Objects.equals(this.navSystem, updateVehicleVehicle.navSystem) &&
        Objects.equals(this.tanks, updateVehicleVehicle.tanks) &&
        Objects.equals(this.tankPosition, updateVehicleVehicle.tankPosition) &&
        Objects.equals(this.technical, updateVehicleVehicle.technical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, navSystemObjectUid, releaseYear, registration, type, brand, version, model, category, initialConsumption, country, navSystem, tanks, tankPosition, technical);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVehicleVehicle {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    navSystemObjectUid: ").append(toIndentedString(navSystemObjectUid)).append("\n");
    sb.append("    releaseYear: ").append(toIndentedString(releaseYear)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    initialConsumption: ").append(toIndentedString(initialConsumption)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    navSystem: ").append(toIndentedString(navSystem)).append("\n");
    sb.append("    tanks: ").append(toIndentedString(tanks)).append("\n");
    sb.append("    tankPosition: ").append(toIndentedString(tankPosition)).append("\n");
    sb.append("    technical: ").append(toIndentedString(technical)).append("\n");
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
