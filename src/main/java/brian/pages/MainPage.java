package brian.pages;

import brian.base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends PageObject {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "button-close-popup")
    public WebElement botonPopup;

    @FindBy(xpath = "//span[contains(text(),'Iniciar sesión')]")
    public WebElement botonIniciarSesion;

    public void cerrarPopup(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(botonPopup));
        this.botonPopup.click();
    }

    public void clickIniciarSesion(){
        botonIniciarSesion.click();
    }
}