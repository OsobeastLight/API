package ru.api.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;


public class OpenPageTest extends TestBase {


    @Test
    public void loginTest() throws IOException, InterruptedException {
        click(apiPage.searchBtn);
        setValue(apiPage.searchBox, "getStatus");
        click(apiPage.getStatusResult);
        checkCurrentURL( "https://api.encoding.com/reference/responses-getstatus-extended");
        click(apiPage.jsonTab);
        Assert.assertEquals(getText(apiPage.processorParamValue), "\"[AMAZON | RACKSPACE]\"" );
        Assert.assertEquals(getText(apiPage.statusParamValue), "\"[Status]\"" );

    }

}
