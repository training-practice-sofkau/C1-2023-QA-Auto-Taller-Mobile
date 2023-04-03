Feature:Inicio de sesion

  Scenario Outline:inicio de secion exitoso
    Given el usuario esta en la aplicacion TheApp
    When el usuario ingresa usuario <usuario> y contrasenia <password>
    Then el usuario debera observar un mensaje
    Examples:
      | usuario | password     |
      | "alice" | "mypassword" |
