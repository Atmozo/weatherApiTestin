package Common;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static Common.BasePaths.*;

public class RequestBuilder {

    // Dogs API methods
    public static Response getListOfAllBreedsResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breeds/list/all").then().log().all().extract().response();
    }
    public static Response getSingleRandomImageResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breeds/image/random").then().log().all().extract().response();
    }
    public static Response getMultipleRandomImageResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breeds/image/random/3").then().log().all().extract().response();
    }
    public static Response getDogsImagesByBreedResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breed/hound/images").then().log().all().extract().response();
    }
    public static Response getRandomImagesFromBreedResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breed/hound/images/random").then().log().all().extract().response();
    }
    public static Response getMultipleImagesFromBreedResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breed/hound/images/random/3").then().log().all().extract().response();
    }
    public static Response getListOfAllSubBreedsResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breed/hound/list").then().log().all().extract().response();
    }
    public static Response getListOfAllSubBreedImagesResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breed/hound/afghan/images").then().log().all().extract().response();
    }
    public static Response getSingleRandomImageSubBreedResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breed/hound/afghan/images/random").then().log().all().extract().response();
    }
    public static Response getMultipleRandomImageSubBreedResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breed/hound/afghan/images/random/3").then().log().all().extract().response();
    }
    public static Response getBreedListResponse() {
        return given().baseUri(DogsAPI_baseURL).when().get("/breeds/list/all").then().log().all().extract().response();
    }

    // JSONPlaceholder API (replacement for reqres.in)
    public static Response createEmployeeResponse() {
        return given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .contentType(json_contentType)
                .body("{\"name\": \"Nkosi\", \"job\": \"Test\"}")
                .when().post("/users")
                .then().log().all().extract().response();
    }

    public static Response getEmployeedetailsResponse() {
        return given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/users")
                .then().log().all().extract().response();
    }
}
