Feature: Loggin
  yo como usuario de la app v1.100
  quiero probar la funcionalidad del loggin
  para ver si puedo iniciar sesion correctamente

  Scenario Outline: Iniciar sesion
    Given que el usuario ingresa a la aplicacion v1100
    When entra a la funcionalidad login screen
    And escribe su <usuario> y <contrasenia>
    Then aparece un <mensaje> que indica si se inicio sesion o no segun si es usuario <registrado>

    Examples:
      | usuario | contrasenia  | mensaje       | registrado |
      | "ola"   | "123"        | "Alert"       | 0          |
      | "alice" | "mypassword" | "Secret Area" | 1          |