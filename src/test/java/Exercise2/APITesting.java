package Exercise2;



import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.when;

public class APITesting {

    @Test
    public void getRequest(){

                when()
                    .get("https://reqres.in/api/users/2")
                        .then()
                        .statusCode(200);


    }

}
