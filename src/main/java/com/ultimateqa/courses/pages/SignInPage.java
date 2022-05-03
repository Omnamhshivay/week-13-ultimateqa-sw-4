package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By enterEmail = By.id("user[email]");
    By passwordFild = By.id("user[password]");
    By SignInButton = By.xpath("//body/main[@id='main-content']/div[1]/div[1]/article[1]/form[1]/div[4]/input[1]");
    By verifyText1 = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public void enterEmailId(String emailId){
        sendTextToElement(enterEmail,emailId);}
    public void password(String password){
        sendTextToElement(passwordFild,password);}
    public void clickOnSignInButton(){
        clickOnElement(SignInButton);}
    public String verifyText(){
        return getTextFromElement(verifyText1);}


}
