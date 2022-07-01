package com.nttdata.page;
import org.openqa.selenium.By;

public class TestzheepnzPage {

    public static By pNumero = By.id("number1Field");
    public static By sNumero = By.id("number2Field");
    public static By btnCalcular = By.id("calculateButton");
    public static By resultado = By.id("numberAnswerField");

    public static By operacion = By.id("selectOperationDropdown");

    public static By resta = By.xpath("/html/body/section/div/div/div/form[2]/div[3]/div[2]/select/option[2]");

    public static By multiplicar = By.xpath("/html/body/section/div/div/div/form[2]/div[3]/div[2]/select/option[3]");

    public static By dividir = By.xpath("/html/body/section/div/div/div/form[2]/div[3]/div[2]/select/option[4]");

    public static By concatenar = By.xpath("/html/body/section/div/div/div/form[2]/div[3]/div[2]/select/option[5]");

    public static By check = By.id("integerSelect");

}
