Feature: Login en The APP
  AS usuario de la aplicacion The APP
  WANT logearme en la aplicacion
  BECAUSE acceder al contenido de la aplicacion

  @Login
  Scenario Outline: Login exitoso en la aplicacion
    Given Se ingresa a la aplicacion The APP
    When Se llenan los campos con <usuario> y <contrasenna>
    Then Obtenemos un mensaje de logueo exitoso <mensaje>

    Examples:
      | usuario | contrasenna  | mensaje                      |
      | "alice" | "mypassword" | "You are logged in as alice" |

  @Login
  Scenario Outline: Login fallido en la aplicacion
    Given Se ingresa a la aplicacion
    When Se llenan los campos con <usuario> y <contrasenna> con credenciales invalidas
    Then Obtenemos un mensaje de logueo fallido <mensaje>

    Examples:
      | usuario  | contrasenna     | mensaje                                       |
      | "alice"  | "mypassswordle" | "Invalid login credentials, please try again" |
      | "josenn" | "mypassword"    | "Invalid login credentials, please try again" |
      | "456423" | "-----*****45"  | "Invalid login credentials, please try again" |
