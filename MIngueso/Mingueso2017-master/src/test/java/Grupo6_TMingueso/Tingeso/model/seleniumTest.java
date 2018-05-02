package Grupo6_TMingueso.Tingeso.model;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
/*
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
*/

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class seleniumTest {
    /*
    private WebDriver driver;

    @Before
    public void setUp() throws Exception,MalformedURLException{

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL("http://207.154.197.207:4444//wd/hub"), capabilities);
        //driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test_1_titlepage() throws Exception  {

        boolean iguales = false;
        driver.get("http://localhost:1919/#!/index");
        System.out.println(driver.getTitle());
        if (driver.getTitle().equals("Home"))
        {
            iguales = true;
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("No son iguales");
        }
    }*/

    /*
    @Test
    public void test_2_newExercises () throws Exception{
            driver.get("http://localhost:1919/");
            driver.findElement(By.linkText("Iniciar sesión")).click();
            driver.findElement(By.name("name")).click();
            driver.findElement(By.name("name")).clear();
            driver.findElement(By.name("name")).sendKeys("profesor@gmail.com");
            driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
            driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
            driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("1234512345");
            driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
            driver.findElement(By.xpath("//div[@class='row']/div[2]/div/div/p[2]/a")).click();
            driver.findElement(By.id("name")).click();
            driver.findElement(By.id("name")).clear();
            driver.findElement(By.id("name")).sendKeys("Carlos Perez");
            driver.findElement(By.id("rut")).click();
            driver.findElement(By.id("rut")).clear();
            driver.findElement(By.id("rut")).sendKeys("123456789");
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("carlos.perez.s@usach.cl");
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("1234567891234");
            driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
            driver.quit();
    }

    @Test
    public void test_3_checkMyStudent () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("profesor@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("12345789");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        driver.findElement(By.linkText("Button")).click();
        if (!driver.findElement(By.tagName("html")).getText().contains("Nombre")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Estado")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Avance")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Home Iniciar sesión")) {
            System.out.println("verifyTextPresent failed");
        }
        driver.quit();
    }

    @Test
    public void test_4_addExercises () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        driver.findElement(By.linkText("Vamos")).click();
        driver.findElement(By.cssSelector("input.form-control")).click();
        driver.findElement(By.cssSelector("input.form-control")).clear();
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("El pack humano");
        driver.findElement(By.id("rut")).click();
        driver.findElement(By.id("rut")).clear();
        driver.findElement(By.id("rut")).sendKeys("13/13/13");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div[2]/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div[2]/input")).sendKeys("12:00");
        driver.findElement(By.cssSelector("textarea.form-control")).click();
        driver.findElement(By.cssSelector("textarea.form-control")).clear();
        driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Este nuevo enunciado se realiazará en clases y se dará en la misma ");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        driver.quit();
    }

    @Test
    public void test_5_coordinadorListCourse () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("coordinador@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("123456789");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[3]")).click();
        driver.findElement(By.xpath("//div[@class='row']/div[2]/div/div/p[2]/a")).click();
        if (!driver.findElement(By.tagName("html")).getText().contains("Nombre")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Estado")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Avance")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Iniciar sesión")) {
            System.out.println("verifyTextPresent failed");
        }
        driver.quit();
    }

    @Test
    public void test_6_coordinadorAddExercises () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("coordinador@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("123456789");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[3]")).click();
        driver.findElement(By.linkText("Vamos")).click();
        driver.findElement(By.cssSelector("input.form-control")).click();
        driver.findElement(By.cssSelector("input.form-control")).clear();
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("el pack mans");
        driver.findElement(By.id("rut")).click();
        driver.findElement(By.id("rut")).clear();
        driver.findElement(By.id("rut")).sendKeys("13/13/13");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div[2]/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div[2]/input")).sendKeys("12:00");
        driver.findElement(By.cssSelector("textarea.form-control")).click();
        driver.findElement(By.cssSelector("textarea.form-control")).clear();
        driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Este enunciado sera entregado en clases. ");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        if (!driver.findElement(By.tagName("html")).getText().contains("Iniciar sesión")) {
            System.out.println("verifyTextPresent failed");
        }
        driver.quit();
    }

    @Test
    public void test_7_coordinadorListTeacher () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("coordinador@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("123456789");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[3]")).click();
        driver.findElement(By.linkText("Button")).click();
        if (!driver.findElement(By.tagName("html")).getText().contains("Nombre")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Coordinacion")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Estado")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Iniciar sesión")) {
            System.out.println("verifyTextPresent failed");
        }
        driver.quit();
    }

    @Test
    public void test_8_myHomewordStudent () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("estudiante@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("123456799");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[2]")).click();
        driver.findElement(By.linkText("Button")).click();
        if (!driver.findElement(By.tagName("html")).getText().contains("Nombre")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Estado")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Acción")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Iniciar sesión")) {
            System.out.println("verifyTextPresent failed");
        }
        driver.quit();
    }

    @Test
    public void test_9_reviewStudent () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("estudiante@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("12345689234");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[2]")).click();
        driver.findElement(By.xpath("//main/div/div[2]/div[1]/div/div/p[2]/a")).click();
        if (!driver.findElement(By.tagName("html")).getText().contains("Iniciar sesión")) {
            System.out.println("verifyTextPresent failed");
        }
        driver.quit();
    }

    @Test
    public void test_10_teacherListCourses () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("profesor@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("12345789");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        driver.findElement(By.linkText("Button")).click();
        if (!driver.findElement(By.tagName("html")).getText().contains("Nombre")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Estado")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Avance")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Home Iniciar sesión")) {
            System.out.println("verifyTextPresent failed");
        }
        driver.quit();
    }

    @Test
    public void test_11_teacherReviewListCourses () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("profesor@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("123456789");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        driver.findElement(By.linkText("Button")).click();
        if (!driver.findElement(By.tagName("html")).getText().contains("Nombre")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Estado")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Avance")) {
            System.out.println("verifyTextPresent failed");
        }
        if (!driver.findElement(By.tagName("html")).getText().contains("Iniciar sesión")) {
            System.out.println("verifyTextPresent failed");
        }
        driver.quit();
    }

    @Test
    public void test_12_studentPracticPrograming () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("estudiante@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("234566789");
        driver.findElement(By.xpath("//div[@class='panel-footer']/input[2]")).click();
        driver.findElement(By.xpath("//main/div/div[1]/div[2]/div/div/p[2]/a")).click();
        driver.findElement(By.xpath("//div[@class='CodeMirror-code']//pre[.='​']")).click();
        if (!driver.findElement(By.tagName("html")).getText().contains("Iniciar sesión")) {
            System.out.println("verifyTextPresent failed");
        }
        driver.quit();
    }

    @Test
    public void test_13_teacherAddNewStudent () throws Exception{
        driver.get("http://localhost:1919/");
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("profesor@gmail.com");
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@class='panel-body']/div[2]/div/input")).sendKeys("1234512345");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        driver.findElement(By.xpath("//div[@class='row']/div[2]/div/div/p[2]/a")).click();
        driver.findElement(By.id("name")).click();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Carlos Perez");
        driver.findElement(By.id("rut")).click();
        driver.findElement(By.id("rut")).clear();
        driver.findElement(By.id("rut")).sendKeys("123456789");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("carlos.perez.s@usach.cl");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("1234567891234");
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
        driver.quit();
    }

    @After
    public void tearDown() throws Exception {
        this.driver.quit();
    }*/
}
