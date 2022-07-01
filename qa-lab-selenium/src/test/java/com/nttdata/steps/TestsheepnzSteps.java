package com.nttdata.steps;
import com.nttdata.page.LoginPage;
import com.nttdata.page.TestzheepnzPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class TestsheepnzSteps {

    private WebDriver driver;

    //constructor
    public TestsheepnzSteps(WebDriver driver){

        this.driver = driver;
    }

    public void typeFnumer(String fnumber){
        WebElement userInputElement = driver.findElement(TestzheepnzPage.pNumero);
        userInputElement.sendKeys(fnumber);
    }

    public void typeSnumer(String snumber){
        WebElement userInputElement = driver.findElement(TestzheepnzPage.sNumero);
        userInputElement.sendKeys(snumber);
    }

    public void botonCalcular(){
        WebElement userInputElement = driver.findElement(TestzheepnzPage.pNumero);
        this.driver.findElement(TestzheepnzPage.btnCalcular).click();
    }

    public void resultadoSuma(String resultado){
        WebElement userInputElement = driver.findElement(TestzheepnzPage.resultado);
        System.out.println("VERR RESULTADOOO " + this.driver.findElement(TestzheepnzPage.resultado).getAttribute("value"));
        this.driver.findElement(TestzheepnzPage.resultado).getAttribute("value").equals(resultado);

        Boolean verificar  = this.driver.findElement(TestzheepnzPage.resultado).getAttribute("value").equals(resultado);
        assertTrue(verificar);
    }

    public void selectOperacion(String operacion){
        WebElement userInputElement = driver.findElement(TestzheepnzPage.operacion);
        this.driver.findElement(TestzheepnzPage.operacion).click();
        this.driver.findElement(TestzheepnzPage.resta).click();

    }

}
