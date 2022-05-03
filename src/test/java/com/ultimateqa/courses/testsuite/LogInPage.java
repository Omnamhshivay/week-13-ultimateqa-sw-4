package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPage extends TestBase {
    HomePage home = new HomePage();
    SignInPage signIn =new SignInPage();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        home.clickOnSignInLink();
        String expectedMessage="Welcome Back!";
        String actualMessage = home.verifyTextMessage();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Test
    public void verifyTheErrorMessage(){
        home.clickOnSignInLink();
        signIn.enterEmailId("mitesh@tom.com");
        signIn.password("123");
        signIn.clickOnSignInButton();
        String actualMessage = signIn.verifyText();
        String expectedMessage ="Invalid email or password.";
        Assert.assertEquals(expectedMessage,actualMessage);


    }
}
