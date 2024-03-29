# swagger-java-client

Gkeep API
- API version: 1.0.0
  - Build date: 2022-05-13T14:58:43.427Z[GMT]

Gkeep API


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.UserAuthorizationApi;

import java.io.File;
import java.util.*;

public class UserAuthorizationApiExample {

    public static void main(String[] args) {
        
        UserAuthorizationApi apiInstance = new UserAuthorizationApi();
        UserCredentials body = new UserCredentials(); // UserCredentials | A JSON object containing user credentials info
        try {
            AuthorizedUser result = apiInstance.authorize(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserAuthorizationApi#authorize");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://staging-transport.smart-gamma.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*UserAuthorizationApi* | [**authorize**](docs/UserAuthorizationApi.md#authorize) | **POST** /api/login_check | 
*V1Api* | [**getCountriesList**](docs/V1Api.md#getCountriesList) | **GET** /api/v1/countries/by | 
*V1Api* | [**getTankTypeList**](docs/V1Api.md#getTankTypeList) | **GET** /api/v1/tank/types/by | 
*V1Api* | [**getUserGroupList**](docs/V1Api.md#getUserGroupList) | **GET** /api/v1/user/allowed/groups | 
*V1Api* | [**getVehicleBrandList**](docs/V1Api.md#getVehicleBrandList) | **GET** /api/v1/vehicle/brands | 
*V1Api* | [**getVehicleFuelTypesList**](docs/V1Api.md#getVehicleFuelTypesList) | **GET** /api/v1/vehicle/fuel-types | 
*V1Api* | [**getVehicleModelList**](docs/V1Api.md#getVehicleModelList) | **GET** /api/v1/vehicle/models | 
*V1Api* | [**getVehicleNationalTypeList**](docs/V1Api.md#getVehicleNationalTypeList) | **GET** /api/v1/vehicle/national-types | 
*V1Api* | [**getVehiclePropertiesList**](docs/V1Api.md#getVehiclePropertiesList) | **GET** /api/v1/vehicle/properties | 
*V1Api* | [**getVehicleTypeList**](docs/V1Api.md#getVehicleTypeList) | **GET** /api/v1/vehicle/types | 
*V1Api* | [**getVehicleVersionList**](docs/V1Api.md#getVehicleVersionList) | **GET** /api/v1/vehicle/versions | 
*V2Api* | [**createUserProfile**](docs/V2Api.md#createUserProfile) | **POST** /api/v2/user-profiles | 
*V2Api* | [**createVehicleCategory**](docs/V2Api.md#createVehicleCategory) | **POST** /api/v2/vehicles/categories | 
*V2Api* | [**deleteUserProfile**](docs/V2Api.md#deleteUserProfile) | **DELETE** /api/v2/user-profiles/{profileId} | 
*V2Api* | [**deleteVehicleCategory**](docs/V2Api.md#deleteVehicleCategory) | **DELETE** /api/v2/vehicles/categories/{categoryId} | 
*V2Api* | [**enableVehicleMaintenance**](docs/V2Api.md#enableVehicleMaintenance) | **PUT** /api/v2/vehicles/maintenance/{vehicleId} | 
*V2Api* | [**getAlertList**](docs/V2Api.md#getAlertList) | **GET** /api/v2/alerts | 
*V2Api* | [**getAlertsStatus**](docs/V2Api.md#getAlertsStatus) | **GET** /api/v2/alerts/status | 
*V2Api* | [**getCurrentUserProfile**](docs/V2Api.md#getCurrentUserProfile) | **GET** /api/v2/user-profiles | 
*V2Api* | [**getFleetStatus**](docs/V2Api.md#getFleetStatus) | **GET** /api/v2/fleet/status | 
*V2Api* | [**getNotificationSettings**](docs/V2Api.md#getNotificationSettings) | **GET** /api/v2/user-profiles/notification-settings | 
*V2Api* | [**getRelatedUserProfiles**](docs/V2Api.md#getRelatedUserProfiles) | **GET** /api/v2/user-profiles/{levelName} | 
*V2Api* | [**getUserProfile**](docs/V2Api.md#getUserProfile) | **GET** /api/v2/user-profiles/{profileId} | 
*V2Api* | [**getVehicleCategory**](docs/V2Api.md#getVehicleCategory) | **GET** /api/v2/vehicles/categories/{categoryId} | 
*V2Api* | [**getVehicleCategoryList**](docs/V2Api.md#getVehicleCategoryList) | **GET** /api/v2/vehicles/categories | 
*V2Api* | [**getVehicleStatus**](docs/V2Api.md#getVehicleStatus) | **GET** /api/v2/vehicles/{vehicleId}/status | 
*V2Api* | [**getVehicles**](docs/V2Api.md#getVehicles) | **GET** /api/v2/vehicles | 
*V2Api* | [**getVehiclesDailyStats**](docs/V2Api.md#getVehiclesDailyStats) | **GET** /api/v2/vehicles/{vehicleId}/daily-statistics | 
*V2Api* | [**getVehiclesFrameHistory**](docs/V2Api.md#getVehiclesFrameHistory) | **GET** /api/v2/vehicles/{vehicleId}/frame-history | 
*V2Api* | [**getVehiclesRefuels**](docs/V2Api.md#getVehiclesRefuels) | **GET** /api/v2/vehicles/{vehicleId}/refuels | 
*V2Api* | [**getVehiclesStoppedConsumptions**](docs/V2Api.md#getVehiclesStoppedConsumptions) | **GET** /api/v2/vehicles/{vehicleId}/stopped-consumptions | 
*V2Api* | [**refreshApiToken**](docs/V2Api.md#refreshApiToken) | **PUT** /api/v2/user-profiles/tokens/refresh | 
*V2Api* | [**updateNotificationSettings**](docs/V2Api.md#updateNotificationSettings) | **PUT** /api/v2/user-profiles/notification-settings | 
*V2Api* | [**updateUserProfile**](docs/V2Api.md#updateUserProfile) | **PUT** /api/v2/user-profiles/{profileId} | 
*V2Api* | [**updateVehicle**](docs/V2Api.md#updateVehicle) | **PUT** /api/v2/vehicles/{vehicleId} | 
*V2Api* | [**updateVehicleCategory**](docs/V2Api.md#updateVehicleCategory) | **PUT** /api/v2/vehicles/categories/{categoryId} | 

## Documentation for Models

 - [AlertList](docs/AlertList.md)
 - [AlertListCode](docs/AlertListCode.md)
 - [AlertListDriver](docs/AlertListDriver.md)
 - [AlertListLevel](docs/AlertListLevel.md)
 - [AlertListList](docs/AlertListList.md)
 - [AlertListVehicle](docs/AlertListVehicle.md)
 - [AlertListVehicleOwner](docs/AlertListVehicleOwner.md)
 - [AlertsStatus](docs/AlertsStatus.md)
 - [AlertsStatusInner](docs/AlertsStatusInner.md)
 - [AuthorizedUser](docs/AuthorizedUser.md)
 - [CountryList](docs/CountryList.md)
 - [CountryListInner](docs/CountryListInner.md)
 - [CreateProfile](docs/CreateProfile.md)
 - [CreateProfileUser](docs/CreateProfileUser.md)
 - [CreateProfileUserNavSystemAccessData](docs/CreateProfileUserNavSystemAccessData.md)
 - [CreateVehicleCategory](docs/CreateVehicleCategory.md)
 - [CreateVehicleCategoryVehicleCategoryForm](docs/CreateVehicleCategoryVehicleCategoryForm.md)
 - [FleetStatus](docs/FleetStatus.md)
 - [FrameHistory](docs/FrameHistory.md)
 - [FrameHistoryList](docs/FrameHistoryList.md)
 - [NotificationSettings](docs/NotificationSettings.md)
 - [NotificationSettingsInner](docs/NotificationSettingsInner.md)
 - [RefuelsList](docs/RefuelsList.md)
 - [RefuelsListInner](docs/RefuelsListInner.md)
 - [StopppedConsumptionList](docs/StopppedConsumptionList.md)
 - [StopppedConsumptionListList](docs/StopppedConsumptionListList.md)
 - [TankTypeList](docs/TankTypeList.md)
 - [TankTypeListInner](docs/TankTypeListInner.md)
 - [UpdateNotificationSettings](docs/UpdateNotificationSettings.md)
 - [UpdateNotificationSettingsNotification](docs/UpdateNotificationSettingsNotification.md)
 - [UpdateNotificationSettingsNotificationAlert1](docs/UpdateNotificationSettingsNotificationAlert1.md)
 - [UpdateNotificationSettingsNotificationAlert2](docs/UpdateNotificationSettingsNotificationAlert2.md)
 - [UpdateNotificationSettingsNotificationAlert3](docs/UpdateNotificationSettingsNotificationAlert3.md)
 - [UpdateNotificationSettingsNotificationAlert4](docs/UpdateNotificationSettingsNotificationAlert4.md)
 - [UpdateNotificationSettingsNotificationAlert9](docs/UpdateNotificationSettingsNotificationAlert9.md)
 - [UpdateProfile](docs/UpdateProfile.md)
 - [UpdateProfileUser](docs/UpdateProfileUser.md)
 - [UpdateVehicle](docs/UpdateVehicle.md)
 - [UpdateVehicleCategory](docs/UpdateVehicleCategory.md)
 - [UpdateVehicleCategoryVehicleCategoryForm](docs/UpdateVehicleCategoryVehicleCategoryForm.md)
 - [UpdateVehicleVehicle](docs/UpdateVehicleVehicle.md)
 - [UpdateVehicleVehicleTanks](docs/UpdateVehicleVehicleTanks.md)
 - [UserCredentials](docs/UserCredentials.md)
 - [UserGroupList](docs/UserGroupList.md)
 - [UserGroupListInner](docs/UserGroupListInner.md)
 - [UserLevel](docs/UserLevel.md)
 - [UserProfile](docs/UserProfile.md)
 - [UserProfileGeoLocalizationSettings](docs/UserProfileGeoLocalizationSettings.md)
 - [UserProfileGroups](docs/UserProfileGroups.md)
 - [UserProfileLang](docs/UserProfileLang.md)
 - [UserProfileList](docs/UserProfileList.md)
 - [UserProfileListGeoLocalizationSettings](docs/UserProfileListGeoLocalizationSettings.md)
 - [UserProfileListGroups](docs/UserProfileListGroups.md)
 - [UserProfileListList](docs/UserProfileListList.md)
 - [Vehicle](docs/Vehicle.md)
 - [VehicleBrand](docs/VehicleBrand.md)
 - [VehicleBrandList](docs/VehicleBrandList.md)
 - [VehicleBrandListInner](docs/VehicleBrandListInner.md)
 - [VehicleCategory](docs/VehicleCategory.md)
 - [VehicleCategoryList](docs/VehicleCategoryList.md)
 - [VehicleCategoryListList](docs/VehicleCategoryListList.md)
 - [VehicleCategoryOwner](docs/VehicleCategoryOwner.md)
 - [VehicleCategoryType](docs/VehicleCategoryType.md)
 - [VehicleCountry](docs/VehicleCountry.md)
 - [VehicleDailyStats](docs/VehicleDailyStats.md)
 - [VehicleDriver](docs/VehicleDriver.md)
 - [VehicleFuelTypeList](docs/VehicleFuelTypeList.md)
 - [VehicleFuelTypeListInner](docs/VehicleFuelTypeListInner.md)
 - [VehicleList](docs/VehicleList.md)
 - [VehicleListGroups](docs/VehicleListGroups.md)
 - [VehicleListList](docs/VehicleListList.md)
 - [VehicleListSensor](docs/VehicleListSensor.md)
 - [VehicleMaintenance](docs/VehicleMaintenance.md)
 - [VehicleModel](docs/VehicleModel.md)
 - [VehicleModelList](docs/VehicleModelList.md)
 - [VehicleModelListList](docs/VehicleModelListList.md)
 - [VehicleNationalTypeList](docs/VehicleNationalTypeList.md)
 - [VehicleNationalTypeListInner](docs/VehicleNationalTypeListInner.md)
 - [VehicleNavSystem](docs/VehicleNavSystem.md)
 - [VehicleOwner](docs/VehicleOwner.md)
 - [VehiclePropertyList](docs/VehiclePropertyList.md)
 - [VehiclePropertyListInner](docs/VehiclePropertyListInner.md)
 - [VehicleSensor](docs/VehicleSensor.md)
 - [VehicleStatus](docs/VehicleStatus.md)
 - [VehicleStatusTank](docs/VehicleStatusTank.md)
 - [VehicleStatusTankTankType](docs/VehicleStatusTankTankType.md)
 - [VehicleStatusTanks](docs/VehicleStatusTanks.md)
 - [VehicleStatusVehicle](docs/VehicleStatusVehicle.md)
 - [VehicleStatusVehicleDriver](docs/VehicleStatusVehicleDriver.md)
 - [VehicleTankPosition](docs/VehicleTankPosition.md)
 - [VehicleTankType](docs/VehicleTankType.md)
 - [VehicleTanks](docs/VehicleTanks.md)
 - [VehicleTechnical](docs/VehicleTechnical.md)
 - [VehicleTypeList](docs/VehicleTypeList.md)
 - [VehicleVersion](docs/VehicleVersion.md)
 - [VehicleVersionList](docs/VehicleVersionList.md)
 - [VehicleVersionListList](docs/VehicleVersionListList.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


