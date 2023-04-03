Feature: Login The App

  Yo como usuario de The App
  Quiero loguearme para tener acceso
  a las funcionalidades

  Scenario: Login exitoso
    Given He ingresado a la interfaz de Login
    When Ingresamos los datos de inicio de sesion
    Then Obtenemos el correcto mensaje de inicio exitoso

  @Failed
  Scenario Outline: Login Fallido
    Given He ingresado a la interfaz dee Login
    When Ingresamos los datos incorrectos de inicio de sesion <user>,<password>
    Then Se obtiene mensaje indicando que las credenciales son incorrectas
    Examples:
      | user     | password |
      | "juan"   | "1234"   |
      | ""       | "0215"   |
      | "melody" | ""       |