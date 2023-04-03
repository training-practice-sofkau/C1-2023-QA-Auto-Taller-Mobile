Feature: Loggin
  yo como usuario de la app v1.100
  quiero probar la funcionalidad del loggin
  para ver si puedo iniciar sesion correctamente

  Scenario Outline: Iniciar sesion
    Given que el usuario ingresa a la aplicacion v1100
    When entra a la funcionalidad login screen
    And escribe su <usuario> y <contrasenia>
    Then aparece un mensaje que indica el inicio de sesion

    Examples:
      | usuario | contrasenia  |
      | "ola"   | "123"        |
      | "alice" | "mypassword" |