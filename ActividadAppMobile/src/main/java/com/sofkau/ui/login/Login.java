package com.sofkau.ui.login;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Login {

    public static final Target CAMPO_USUARIO=Target.the("Campo de usuario")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"username\"]"));

    public static final Target CAMPO_CONTRASENIA=Target.the("Campo de contrasenia")
            .located(By.xpath("//android.widget.EditText[@content-desc=\"password\"]"));

    public static final Target BOTON_LOGIN=Target.the("Boton de login")
            .located(By.xpath("//android.view.ViewGroup[@content-desc=\"loginBtn\"]/android.widget.TextView"));

}
