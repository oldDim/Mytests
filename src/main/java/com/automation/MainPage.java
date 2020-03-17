package com.automation;

import core.driver.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    /* private By locatorPopular = By.xpath("//*[contains(text(), 'Popular')]");
     private By locatorBestSeller = By.xpath("//*[contains(text(), 'Best Seller')]");
     private By item = By.xpath("//div[@class = 'product-container']");
     private By itemTitle = By.xpath(".//a[@class ='product-name']");
     private By locatorAddToCart = By.xpath(".//span[text()='Add to cart']");
     private By locatorMore = By.xpath(".//span[text()='More']");

     private final WebDriver driver;


     public MainPage(WebDriver driver) {
         this.driver = driver;
     }
     public void Popular() { driver.findElement(locatorPopular).click(); }
     public void bestseller() { driver.findElement(locatorBestSeller).click(); }
     public void searchItems(String iteamName) {
         List<WebElement> elements = driver.findElements(item);
         for (WebElement element : elements){
             WebElement titleElement = element.findElement(itemTitle);
             if (titleElement.getText().equals(iteamName)) {
                 System.out.println("We got it!!!");
             }
         }

     }
     public void addToCart(String itemName) {
         List<WebElement> elements = driver.findElements(item);
         for (WebElement element : elements) {
             WebElement titleElement = element.findElement(item);
             if (titleElement.getText().equals(itemName)) {
                 element.findElement(locatorAddToCart).click();
                 break;
             }

         }
     }

     */
    private By locatorPopular = By.xpath("//*[a(text(), 'Popular')]");

    private By locatorBestSeller = By.xpath("//*[a(text(), 'Best Seller')]");

    @FindBy(xpath = "//*[a(text(), 'Popular')]") // ctrl + alt + l
    private WebElement popular;
    @FindBy(xpath = "//*[a(text(), 'Best Seller')]")
    private WebElement bestseller;

    private final WebDriver driver;

    public MainPage() {
        this.driver = WebDriverRunner.getInstance();
        PageFactory.initElements(driver, this);
    }

    public void popular() {
        popular.click();
    }

    public void bestsellers() {
        popular.click();
    }

}
