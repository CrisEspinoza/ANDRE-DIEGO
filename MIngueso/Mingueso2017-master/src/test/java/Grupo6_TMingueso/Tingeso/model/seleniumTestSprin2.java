package Grupo6_TMingueso.Tingeso.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class seleniumTestSprin2 {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception,MalformedURLException{

        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        //capabilities.setBrowserName("chrome");
        //capabilities.setPlatform(Platform.LINUX);
        //driver = new RemoteWebDriver(new URL("http://207.154.197.207:4444//wd/hub"), capabilities);
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @Test
    public void newExercisesTeacher() throws Exception  {

        driver.get("http://localhost:1919/");
        driver.findElement(By.xpath("//div[@class='panel-footer']//button[.='Dev:teacher']")).click();
        driver.findElement(By.linkText("Agregar Enunciado")).click();
        driver.findElement(By.id("otro")).click();
        driver.findElement(By.id("otro")).clear();
        driver.findElement(By.id("otro")).sendKeys("hola mundo");
        driver.findElement(By.id("date-input")).click();
        driver.findElement(By.id("date-input")).sendKeys("\\9");
        driver.findElement(By.id("time-input")).click();
        driver.findElement(By.id("time-input")).sendKeys("\\9");
        driver.findElement(By.id("text")).click();
        driver.findElement(By.id("text")).sendKeys("\\9");
        driver.findElement(By.id("date-input")).click();
        driver.findElement(By.id("date-input")).click();
        driver.findElement(By.id("date-input")).clear();
        driver.findElement(By.id("date-input")).sendKeys("2017-01-01");
        driver.findElement(By.id("time-input")).click();
        driver.findElement(By.id("time-input")).clear();
        driver.findElement(By.id("time-input")).sendKeys("24:55:00");
        driver.findElement(By.id("text")).click();
        driver.findElement(By.id("text")).clear();
        driver.findElement(By.id("text")).sendKeys("Escriba un hola mundo en Python");
        driver.findElement(By.id("answer")).click();
        driver.findElement(By.id("answer")).clear();
        driver.findElement(By.id("answer")).sendKeys("Hola mundo");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[2]")).click();
    }

    @Test
    public void newStudentTeacher() throws Exception  {

        driver.get("http://localhost:1919/");
        driver.findElement(By.xpath("//div[@class='panel-footer']//button[.='Dev:teacher']")).click();
        driver.findElement(By.linkText("Agregar Alumno")).click();
        driver.findElement(By.id("nameUser")).click();
        driver.findElement(By.id("nameUser")).clear();
        driver.findElement(By.id("nameUser")).sendKeys("ejemplo");
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("ejemplo");
        driver.findElement(By.id("rut")).click();
        driver.findElement(By.id("rut")).clear();
        driver.findElement(By.id("rut")).sendKeys("12.332.123-1");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("ejemplo10@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[2]")).click();
    }

    @Test
    public void newCoordinatorCoordinator() throws Exception  {

        driver.get("http://localhost:1919/");
        driver.findElement(By.xpath("//div[@class='panel-footer']//button[.='Dev:coordinator']")).click();
        driver.findElement(By.xpath("//div[@class='row']/div[3]/div/div")).click();
        driver.findElement(By.linkText("Agregar nuevo profesor")).click();
        driver.findElement(By.id("nameUser")).click();
        driver.findElement(By.id("nameUser")).clear();
        driver.findElement(By.id("nameUser")).sendKeys("juani perez");
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("espinoza martinez");
        driver.findElement(By.id("rut")).click();
        driver.findElement(By.id("rut")).clear();
        driver.findElement(By.id("rut")).sendKeys("19.181.876-6");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("elcorreonuevo@gmail.com");
        driver.findElement(By.cssSelector("label.checkbox-inline")).click();
        if (!driver.findElement(By.xpath("//label[@class='checkbox-inline']/input")).isSelected()) {
            driver.findElement(By.xpath("//label[@class='checkbox-inline']/input")).click();
        }
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[2]")).click();
    }

    @Test
    public void newTeacherCoordinator() throws Exception  {

        driver.get("http://localhost:1919/");
        driver.findElement(By.xpath("//div[@class='panel-footer']//button[.='Dev:coordinator']")).click();
        driver.findElement(By.linkText("Agregar nuevo profesor")).click();
        driver.findElement(By.id("nameUser")).click();
        driver.findElement(By.id("nameUser")).clear();
        driver.findElement(By.id("nameUser")).sendKeys("profesor");
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("nuevo");
        driver.findElement(By.id("rut")).click();
        driver.findElement(By.id("rut")).clear();
        driver.findElement(By.id("rut")).sendKeys("10.191.818-8");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("ejemplo@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[2]")).click();
    }

    @Test
    public void newExercisesAdmin() throws Exception  {

        driver.get("http://localhost:1919/");
        driver.findElement(By.xpath("//div[@class='panel-footer']//button[.='Dev:administrator']")).click();
        driver.findElement(By.linkText("Agregar usuario")).click();
        driver.findElement(By.id("nameUser")).click();
        driver.findElement(By.id("nameUser")).clear();
        driver.findElement(By.id("nameUser")).sendKeys("ejemplo");
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("ejemplo");
        driver.findElement(By.id("rut")).click();
        driver.findElement(By.id("rut")).clear();
        driver.findElement(By.id("rut")).sendKeys("12.123.123-1");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("ejemplo123123@gmail.com");
        driver.findElement(By.cssSelector("label.checkbox-inline")).click();
        if (!driver.findElement(By.xpath("//label[@class='checkbox-inline']/input")).isSelected()) {
            driver.findElement(By.xpath("//label[@class='checkbox-inline']/input")).click();
        }
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[2]")).click();
    }

    @Test
    public void newExercisesCoordinator() throws Exception  {

        driver.get("http://localhost:1919/");
        driver.findElement(By.xpath("//div[@class='panel-footer']//button[.='Dev:coordinator']")).click();
        driver.findElement(By.cssSelector("div.jumbotron.jumbotron-fluid")).click();
        driver.findElement(By.linkText("Vamos agrega un enunciado")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[1]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[1]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[1]/div/input")).sendKeys("ejemplo3");
        driver.findElement(By.id("date-input")).click();
        driver.findElement(By.id("date-input")).clear();
        driver.findElement(By.id("date-input")).sendKeys("2017-21-12");
        driver.findElement(By.id("time-input")).click();
        driver.findElement(By.id("time-input")).clear();
        driver.findElement(By.id("time-input")).sendKeys("23:59:59");
        driver.findElement(By.xpath("//div[@class='panel-body']//textarea[.=' ']")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']//textarea[.=' ']")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']//textarea[.=' ']")).sendKeys("Entregue un programa que realice la suma de dos numeros y luego muestre por pantalla l resutlado de ese problema");
        driver.findElement(By.id("answer")).click();
        driver.findElement(By.id("answer")).clear();
        driver.findElement(By.id("answer")).sendKeys("La suma de los numeros");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[1]")).click();
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[2]")).click();
    }

    @After
    public void tearDown() throws Exception {
        this.driver.quit();
    }
}
