Feature: Comprobar la Funcionalidad de Login Screen
  Yo como usuario de la app "The App"
  Quiero Iniciar sesion mediante la funcionalidad Login Screen
  Para Verificar el funcionamiento del Login Screen

  Background:
    Given El usuario ingresa a la aplicacion The App del telefono android

  Scenario Outline: Iniciar sesion correctamente
    When ingreso a la pantalla de inicio de sesion y escribo un <correo_electronico> y <contrasenna> validos
    Then el usuario deberia ser redirigido y ver el siguiente mensaje "Secret Area"
    Examples:
      | correo_electronico | contrasenna |
      | "alice"              | "mypassword"  |

  Scenario Outline: Iniciar sesion incorrectamente
    When El usuario navega hasta la funcionalidad Login Screen e introduce un <correo_electronico> y <contrasenna> invalidos
    Then el usuario deberia ver el siguiente mensaje "Invalid login credentials, please try again"
    Examples:
      | correo_electronico | contrasenna |
      | "Bryan"              | "Bryan123"  |