package com.example.restservice;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class RestTest {

    @Test
    public void existence(){
        given().get("http://localhost:8080/calculation").then().statusCode(200);
    }
    @Test
    public void operation(){
        given().get("http://localhost:8080/calculation?operation=dif").then().statusCode(200).body("answer", equalTo("-1.0"));;
    }
    @Test
    public void firstNumber(){
        given().get("http://localhost:8080/calculation?operation=sum&firstNumber=10").then().statusCode(200).body("answer", equalTo("11.0"));;
    }
    @Test
    public void secondNumber(){
        given().get("http://localhost:8080/calculation?operation=sum&firstNumber=10&secondNumber=3").then().statusCode(200).body("answer", equalTo("13.0"));;
    }
}