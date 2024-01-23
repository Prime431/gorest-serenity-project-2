package com.gorest.testbase;

import com.gorest.constant.Path;
import com.gorest.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class TestBase  {
    public static PropertyReader propertyReader;
    @BeforeClass
    public static void inIt() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseURI");
        RestAssured.basePath = Path.USERS;
    }
}
