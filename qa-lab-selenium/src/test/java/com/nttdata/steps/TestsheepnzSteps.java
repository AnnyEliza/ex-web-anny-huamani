package com.nttdata.steps;
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
        this.driver.findElement(TestzheepnzPage.btnCalcular).click();
    }

    public void resultadoSuma(String resultado){
        System.out.println("VERR RESULTADOOO " + this.driver.findElement(TestzheepnzPage.resultado).getAttribute("value"));
        this.driver.findElement(TestzheepnzPage.resultado).getAttribute("value").equals(resultado);

        Boolean verificar  = this.driver.findElement(TestzheepnzPage.resultado).getAttribute("value").equals(resultado);
        assertTrue(verificar);
    }

    public void selectOperacionRestar(){
        this.driver.findElement(TestzheepnzPage.operacion).click();
        this.driver.findElement(TestzheepnzPage.resta).click();

    }

    public void selectOperacionMul(){
        this.driver.findElement(TestzheepnzPage.operacion).click();
        this.driver.findElement(TestzheepnzPage.multiplicar).click();

    }

    public void selectOperacionDiv(){
        this.driver.findElement(TestzheepnzPage.operacion).click();
        this.driver.findElement(TestzheepnzPage.dividir).click();

    }

    public void selectOperacionConca(){
        this.driver.findElement(TestzheepnzPage.operacion).click();
        this.driver.findElement(TestzheepnzPage.concatenar).click();

    }

    public void marcarCheck(){
        this.driver.findElement(TestzheepnzPage.check).click();
    }

    public void limpiarCajas(){
        this.driver.findElement(TestzheepnzPage.pNumero).clear();
        this.driver.findElement(TestzheepnzPage.sNumero).clear();
    }

}
