import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.*;

public class APITest {
    String API_key = "3000879ffc53b92eb4641a1d983be079";
    Map<String, Object> reqBody = new HashMap<>();

    @BeforeEach
    public void Preconditions() {
        Map<String, Object> methodProperties = new HashMap<>();
        methodProperties.put("FindByString", "Бровари");
        methodProperties.put("Limit", 5);
        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
    }

    @Test
    public void checkWarehouse() {
        given()
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post("https://api.novaposhta.ua/v2.0/json/")
                .then().log().all()
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true))
                .body("data[0].Warehouse", equalTo("1"));
    }

    @Test
    public void checkRegions() {
        given()
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post("https://api.novaposhta.ua/v2.0/json/")
                .then().log().all()
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true))
                .body("data[1].RegionsDescription", equalTo("Кам'янець-Подільський р-н"))
                .body("data[1].Regions", notNullValue());
    }

    @Test
    public void checkJSONSchema() {
        given()
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post("https://api.novaposhta.ua/v2.0/json/")
                .then().log().all()
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchema(new File(System.getProperty("user.dir") + "//src/main/resources/schema.json")));
    }
}
