package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class ForgotMyPassword {
    private WebDriver driver;

    public ForgotMyPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email){
        WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/form/div/div[2]/input"));
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    public void clickSendButton(){
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/form/button")).click();
    }

    public String getTitleForgotMyPasswordPage(){
        return driver.getTitle();
    }

    public void verifyErrorMessage(){
        String [] errors = {"Informe um email", "Informe um email válido","  Email não cadastrado. "};
        int size = 2;

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/form/div/div[3]"));

        for(int i= 0; i < size; i++) {
            if(errorMessage.getText() == errors[i]){
                Assert.assertEquals(errors[i] , errorMessage.getText());
            }
        }
    }

    public String getSuccessMessage() throws InterruptedException{
        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div"));

        return successMessage.getText();
    }

}
