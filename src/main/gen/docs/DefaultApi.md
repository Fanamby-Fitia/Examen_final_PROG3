# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**collectivitiesPost**](DefaultApi.md#collectivitiesPost) | **POST** /collectivities | Open a new agricultural collectivity |


<a id="collectivitiesPost"></a>
# **collectivitiesPost**
> collectivitiesPost(collectivitiesPostRequest)

Open a new agricultural collectivity

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    CollectivitiesPostRequest collectivitiesPostRequest = new CollectivitiesPostRequest(); // CollectivitiesPostRequest | 
    try {
      apiInstance.collectivitiesPost(collectivitiesPostRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#collectivitiesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectivitiesPostRequest** | [**CollectivitiesPostRequest**](CollectivitiesPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Collectivity created |  -  |

