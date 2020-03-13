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
import io.swagger.client.model.UserProfileGeoLocalizationSettings;
import io.swagger.client.model.UserProfileGroups;
import io.swagger.client.model.UserProfileLang;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * UserProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-13T13:13:52.012Z[GMT]")
public class UserProfile {
  @SerializedName("email")
  private String email = null;

  @SerializedName("groups")
  private List<UserProfileGroups> groups = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("parent_id")
  private String parentId = null;

  @SerializedName("association")
  private String association = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("company_short_name")
  private String companyShortName = null;

  @SerializedName("contract")
  private String contract = null;

  @SerializedName("external_company")
  private String externalCompany = null;

  @SerializedName("nav_system_access_data")
  private String navSystemAccessData = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lang")
  private UserProfileLang lang = null;

  @SerializedName("nav_system")
  private String navSystem = null;

  @SerializedName("notify_by_email")
  private Boolean notifyByEmail = null;

  @SerializedName("notify_by_sms")
  private Boolean notifyBySms = null;

  @SerializedName("notify_timezone")
  private String notifyTimezone = null;

  @SerializedName("partner_type")
  private String partnerType = null;

  @SerializedName("is_terms_accepted")
  private Boolean isTermsAccepted = null;

  @SerializedName("geo_localization_settings")
  private UserProfileGeoLocalizationSettings geoLocalizationSettings = null;

  @SerializedName("api_token")
  private String apiToken = null;

  public UserProfile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(example = "example@example.com", description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserProfile groups(List<UserProfileGroups> groups) {
    this.groups = groups;
    return this;
  }

  public UserProfile addGroupsItem(UserProfileGroups groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<UserProfileGroups>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @Schema(description = "")
  public List<UserProfileGroups> getGroups() {
    return groups;
  }

  public void setGroups(List<UserProfileGroups> groups) {
    this.groups = groups;
  }

  public UserProfile roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public UserProfile addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public UserProfile firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @Schema(example = "John", description = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public UserProfile lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @Schema(example = "Dou", description = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public UserProfile phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(description = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserProfile parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(description = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public UserProfile association(String association) {
    this.association = association;
    return this;
  }

   /**
   * Get association
   * @return association
  **/
  @Schema(description = "")
  public String getAssociation() {
    return association;
  }

  public void setAssociation(String association) {
    this.association = association;
  }

  public UserProfile comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @Schema(description = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public UserProfile company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @Schema(description = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UserProfile companyShortName(String companyShortName) {
    this.companyShortName = companyShortName;
    return this;
  }

   /**
   * Get companyShortName
   * @return companyShortName
  **/
  @Schema(description = "")
  public String getCompanyShortName() {
    return companyShortName;
  }

  public void setCompanyShortName(String companyShortName) {
    this.companyShortName = companyShortName;
  }

  public UserProfile contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @Schema(description = "")
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public UserProfile externalCompany(String externalCompany) {
    this.externalCompany = externalCompany;
    return this;
  }

   /**
   * Get externalCompany
   * @return externalCompany
  **/
  @Schema(description = "")
  public String getExternalCompany() {
    return externalCompany;
  }

  public void setExternalCompany(String externalCompany) {
    this.externalCompany = externalCompany;
  }

  public UserProfile navSystemAccessData(String navSystemAccessData) {
    this.navSystemAccessData = navSystemAccessData;
    return this;
  }

   /**
   * Get navSystemAccessData
   * @return navSystemAccessData
  **/
  @Schema(description = "")
  public String getNavSystemAccessData() {
    return navSystemAccessData;
  }

  public void setNavSystemAccessData(String navSystemAccessData) {
    this.navSystemAccessData = navSystemAccessData;
  }

  public UserProfile id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "1", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserProfile lang(UserProfileLang lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @Schema(description = "")
  public UserProfileLang getLang() {
    return lang;
  }

  public void setLang(UserProfileLang lang) {
    this.lang = lang;
  }

  public UserProfile navSystem(String navSystem) {
    this.navSystem = navSystem;
    return this;
  }

   /**
   * Get navSystem
   * @return navSystem
  **/
  @Schema(description = "")
  public String getNavSystem() {
    return navSystem;
  }

  public void setNavSystem(String navSystem) {
    this.navSystem = navSystem;
  }

  public UserProfile notifyByEmail(Boolean notifyByEmail) {
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

  public UserProfile notifyBySms(Boolean notifyBySms) {
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

  public UserProfile notifyTimezone(String notifyTimezone) {
    this.notifyTimezone = notifyTimezone;
    return this;
  }

   /**
   * Get notifyTimezone
   * @return notifyTimezone
  **/
  @Schema(description = "")
  public String getNotifyTimezone() {
    return notifyTimezone;
  }

  public void setNotifyTimezone(String notifyTimezone) {
    this.notifyTimezone = notifyTimezone;
  }

  public UserProfile partnerType(String partnerType) {
    this.partnerType = partnerType;
    return this;
  }

   /**
   * Get partnerType
   * @return partnerType
  **/
  @Schema(description = "")
  public String getPartnerType() {
    return partnerType;
  }

  public void setPartnerType(String partnerType) {
    this.partnerType = partnerType;
  }

  public UserProfile isTermsAccepted(Boolean isTermsAccepted) {
    this.isTermsAccepted = isTermsAccepted;
    return this;
  }

   /**
   * Get isTermsAccepted
   * @return isTermsAccepted
  **/
  @Schema(description = "")
  public Boolean isIsTermsAccepted() {
    return isTermsAccepted;
  }

  public void setIsTermsAccepted(Boolean isTermsAccepted) {
    this.isTermsAccepted = isTermsAccepted;
  }

  public UserProfile geoLocalizationSettings(UserProfileGeoLocalizationSettings geoLocalizationSettings) {
    this.geoLocalizationSettings = geoLocalizationSettings;
    return this;
  }

   /**
   * Get geoLocalizationSettings
   * @return geoLocalizationSettings
  **/
  @Schema(description = "")
  public UserProfileGeoLocalizationSettings getGeoLocalizationSettings() {
    return geoLocalizationSettings;
  }

  public void setGeoLocalizationSettings(UserProfileGeoLocalizationSettings geoLocalizationSettings) {
    this.geoLocalizationSettings = geoLocalizationSettings;
  }

  public UserProfile apiToken(String apiToken) {
    this.apiToken = apiToken;
    return this;
  }

   /**
   * Get apiToken
   * @return apiToken
  **/
  @Schema(example = "eyJhbGciOiJSUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1NVUEVSX0FETUlOIiwiUk9MRV9BTExPV0VEX1RPX1NXSVRDSCIsIlJPTEVfTUFTVEVSIiwiUk9MRV9VU0VSIl0sInVzZXJuYW1lIjoiYWRtaW5AZ2tlZXAubG9jIiwiZXhwIjpudWxsLCJpYXQiOjE1NzkwOTUzMDV9.rBRdRTRPA9J50LwwiFq7c-IE7KMUyUkdXKbOlTwm8cTSkk3aZWZB3MD6FSaCAPppqqjvaMk6WUDNPqutj9l0A6nDyh6WKCnevVwG69Nqgggt2Zd1lscAJoviz7dVdZKHQB3EMFqOG3-FtgAcGf6BxFYqdx-u-fKM9PoOl7esXACtL8P2mmikvtUH8B60GQxSLRFpXZ_GKg0RPD5quG_62tAehcB63kikFvBycP5vIxseQGRr5Tsdclp-G4hltIy56J8kiLZE3jW-1Nw72J4rnauG7gngBgaWLa6h62SIhONsPe2xz-sm0_ZoelX6C_6c1WDbtOHryrdXJQ-IbT2iSTANDtQ3kuhV3vgvqzVgCloZa-qd3xJAf1ECxaoc1Q4Skvr_cZ1DBRwDDcpm4AFCzBOhDgrWK6sTRl3EryOW6zxjch5WCBtSwa0bGI82mLt4rUBmcvACMm_bXcRR3blf5UD9-ida2X3bQf6rf1paQBjvsBf3Wh81wPK3gGIR8EJn2UcWiaJSGdwM_BLUmm1NgOtraplLtFy7oDd8H61Te5fpJnlzHP3WqFJOBY54vU2wyYeV3znrOIJnyXWcEQVirC4fQOyhQc30CXdZO-qRPYRd3qVKUnv8NUZAwz6Ul07190qS2xwZ1oadaHidwiTyysPvcc6qH_QFHVYZjhm3DEo", description = "")
  public String getApiToken() {
    return apiToken;
  }

  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.email, userProfile.email) &&
        Objects.equals(this.groups, userProfile.groups) &&
        Objects.equals(this.roles, userProfile.roles) &&
        Objects.equals(this.firstname, userProfile.firstname) &&
        Objects.equals(this.lastname, userProfile.lastname) &&
        Objects.equals(this.phone, userProfile.phone) &&
        Objects.equals(this.parentId, userProfile.parentId) &&
        Objects.equals(this.association, userProfile.association) &&
        Objects.equals(this.comment, userProfile.comment) &&
        Objects.equals(this.company, userProfile.company) &&
        Objects.equals(this.companyShortName, userProfile.companyShortName) &&
        Objects.equals(this.contract, userProfile.contract) &&
        Objects.equals(this.externalCompany, userProfile.externalCompany) &&
        Objects.equals(this.navSystemAccessData, userProfile.navSystemAccessData) &&
        Objects.equals(this.id, userProfile.id) &&
        Objects.equals(this.lang, userProfile.lang) &&
        Objects.equals(this.navSystem, userProfile.navSystem) &&
        Objects.equals(this.notifyByEmail, userProfile.notifyByEmail) &&
        Objects.equals(this.notifyBySms, userProfile.notifyBySms) &&
        Objects.equals(this.notifyTimezone, userProfile.notifyTimezone) &&
        Objects.equals(this.partnerType, userProfile.partnerType) &&
        Objects.equals(this.isTermsAccepted, userProfile.isTermsAccepted) &&
        Objects.equals(this.geoLocalizationSettings, userProfile.geoLocalizationSettings) &&
        Objects.equals(this.apiToken, userProfile.apiToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, groups, roles, firstname, lastname, phone, parentId, association, comment, company, companyShortName, contract, externalCompany, navSystemAccessData, id, lang, navSystem, notifyByEmail, notifyBySms, notifyTimezone, partnerType, isTermsAccepted, geoLocalizationSettings, apiToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    companyShortName: ").append(toIndentedString(companyShortName)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    externalCompany: ").append(toIndentedString(externalCompany)).append("\n");
    sb.append("    navSystemAccessData: ").append(toIndentedString(navSystemAccessData)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    navSystem: ").append(toIndentedString(navSystem)).append("\n");
    sb.append("    notifyByEmail: ").append(toIndentedString(notifyByEmail)).append("\n");
    sb.append("    notifyBySms: ").append(toIndentedString(notifyBySms)).append("\n");
    sb.append("    notifyTimezone: ").append(toIndentedString(notifyTimezone)).append("\n");
    sb.append("    partnerType: ").append(toIndentedString(partnerType)).append("\n");
    sb.append("    isTermsAccepted: ").append(toIndentedString(isTermsAccepted)).append("\n");
    sb.append("    geoLocalizationSettings: ").append(toIndentedString(geoLocalizationSettings)).append("\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
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
