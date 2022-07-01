package com.nttdata.stepsdefinitions;

import com.nttdata.page.TestzheepnzPage;
import com.nttdata.steps.TestsheepnzSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testsheepnzStepsDef {

    private WebDriver driver;
    private Scenario scenario;



    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahuamanz\\Desktop\\NTT DATA\\EXAMEN WEB ANNY\\ex-web-anny-huamani\\qa-lab-selenium\\drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Dado("que me encuentro en la página de testsheepnz")
    public void que_me_encuentro_en_la_página_testsheepnz() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,1000)","");
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }


    @Cuando("ingreso first number {string}")
    public void ingresoFirstNumber(String fnumber) {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.typeFnumer(fnumber);
    }

    @Y("ingreso second number {string}")
    public void ingresoSecondNumber(String snumber) {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.typeSnumer(snumber);
    }

    @Y("hago clic en el boton calcular")
    public void hagoClicEnElBotonCalcular() throws InterruptedException {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.botonCalcular();
        Thread.sleep(3000);

    }

    @Entonces("mi resultado sera {string}")
    public void miResultadoSera(String resultado) {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.resultadoSuma(resultado);
    }

    /*@Y("selecciono operacion {string}")
    public void seleccionoOperacion() {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.selectOperacion();
    }*/

    @Y("selecciono operacion multiplicar")
    public void seleccionoOperacionMultiplicar() {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.selectOperacionMul();
    }

    @Y("selecciono operacion dividir")
    public void seleccionoOperacionDividir() {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.selectOperacionDiv();
    }

    @Y("selecciono operacion concatenar")
    public void seleccionoOperacionConcatenar() {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.selectOperacionConca();
    }

    @Y("marco check")
    public void marcoCheck() {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.marcarCheck();
    }

    @Y("limpio cajas de texto")
    public void limpioCajasDeTexto() {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.limpiarCajas();
    }

    @Y("selecciono operacion restar")
    public void seleccionoOperacionRestar() {
        TestsheepnzSteps testsheepnzSteps = new TestsheepnzSteps(driver);
        testsheepnzSteps.selectOperacionRestar();
    }
}
