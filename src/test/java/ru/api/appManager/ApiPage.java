package ru.api.appManager;

import org.openqa.selenium.By;


public class ApiPage {

    public By searchBtn = By.xpath("//button[contains(@class, \"searchbox-button\")]");
    public By searchBox = By.xpath("//input[contains(@class, \"SearchBox\")]");
    public By getStatusResult = By.xpath("//span[contains(text(), \"GetStatus (extended)\")]");
    public By jsonTab = By.xpath("(//div[contains(text(), 'Response')]/parent::h2//following-sibling::div//button[contains(text(), 'JSON')])[1]");
    public By processorParamValue = By.xpath("(//span[contains(text(), 'processor')])[3]/following-sibling::span[1]");
    public By statusParamValue = By.xpath("(//span[contains(text(), 'format')])[5]/following-sibling::span[contains(text(), 'Status')][1]");
}