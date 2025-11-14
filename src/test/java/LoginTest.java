
import brian.base.BaseTest;
import brian.pages.impl.LoginPageImpl;
import brian.pages.impl.MainPageImpl;
import brian.utils.ConfigReader;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void loginUserCorrecto() {
        MainPageImpl main = new MainPageImpl(this.driver);
        LoginPageImpl log = new LoginPageImpl(this.driver);

        String usuario = ConfigReader.get("user");
        String pass = ConfigReader.get("pass");

        main.cerrarPopup();
        main.clickIniciarSesion();
        log.ingresar(usuario, pass);
    }
}