package brian.pages;

import brian.base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageObject {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[contains(@placeholder, 'Email')]")
    private WebElement usuario;

    @FindBy (xpath = "//input[contains(@placeholder, 'Password')]")
    private WebElement password;

    @FindBy (xpath = "//span[contains(text(), 'Ingresar')]")
    public WebElement btnIngresar;

    public void setUsuario(String usuario){
        this.usuario.clear();
        this.usuario.sendKeys(usuario);
    }

    public void setContrasenia(String contrasenia){
        this.password.clear();
        this.password.sendKeys(contrasenia);
    }

    public void clickIngresar(){
        this.btnIngresar.click();
    }
}
