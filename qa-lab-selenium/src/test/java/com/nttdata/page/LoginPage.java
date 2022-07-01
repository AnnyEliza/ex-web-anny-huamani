package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By userInput = By.id("user-name");
    public static By passInput = By.id("password");
    public static By loginButton = By.id("login-button");

    public static By signButton = By.cssSelector(("a.login"));

}
