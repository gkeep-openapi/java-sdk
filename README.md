# swagger-java-client

Gkeep API
- API version: 0.0.1
  - Build date: 2020-01-23T08:15:44.580Z[GMT]

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
*V2Api* | [**getAlertList**](docs/V2Api.md#getAlertList) | **GET** /api/v2/alerts | 
*V2Api* | [**getAlertsStatus**](docs/V2Api.md#getAlertsStatus) | **GET** /api/v2/alerts/status | 
*V2Api* | [**getFleetStatus**](docs/V2Api.md#getFleetStatus) | **GET** /api/v2/fleet/status | 
*V2Api* | [**getUserProfile**](docs/V2Api.md#getUserProfile) | **GET** /api/v2/user-profiles | 
*V2Api* | [**getVehicleStatus**](docs/V2Api.md#getVehicleStatus) | **GET** /api/v2/vehicles/{vehicleId}/status | 
*V2Api* | [**getVehicles**](docs/V2Api.md#getVehicles) | **GET** /api/v2/vehicles | 
*V2Api* | [**getVehiclesDailyStats**](docs/V2Api.md#getVehiclesDailyStats) | **GET** /api/v2/vehicles/{vehicleId}/daily-statistics | 

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
 - [FleetStatus](docs/FleetStatus.md)
 - [UserCredentials](docs/UserCredentials.md)
 - [UserProfile](docs/UserProfile.md)
 - [UserProfileGeoLocalizationSettings](docs/UserProfileGeoLocalizationSettings.md)
 - [UserProfileGroups](docs/UserProfileGroups.md)
 - [UserProfileLang](docs/UserProfileLang.md)
 - [VehicleDailyStats](docs/VehicleDailyStats.md)
 - [VehicleList](docs/VehicleList.md)
 - [VehicleListGroups](docs/VehicleListGroups.md)
 - [VehicleListList](docs/VehicleListList.md)
 - [VehicleListSensor](docs/VehicleListSensor.md)
 - [VehicleStatus](docs/VehicleStatus.md)
 - [VehicleStatusTank](docs/VehicleStatusTank.md)
 - [VehicleStatusTankTankType](docs/VehicleStatusTankTankType.md)
 - [VehicleStatusTanks](docs/VehicleStatusTanks.md)
 - [VehicleStatusVehicle](docs/VehicleStatusVehicle.md)
 - [VehicleStatusVehicleDriver](docs/VehicleStatusVehicleDriver.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


