package brian.pages.impl;

import brian.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPageImpl extends LoginPage {

    public LoginPageImpl(WebDriver driver) {
        super(driver);
    }

    public void ingresar(String usuario, String password){
        this.enviarDatosUsuario(usuario, password);
        clickIngresar();
    }

    public void enviarDatosUsuario(String usuario, String contrasenia){
        setUsuario(usuario);
        setContrasenia(contrasenia);
    }
}
