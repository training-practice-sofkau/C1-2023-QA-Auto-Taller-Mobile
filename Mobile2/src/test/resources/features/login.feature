Feature: Login The App

  Yo como usuario de The App
  Quiero loguearme para tener acceso
  a las funcionalidades

  Scenario: Login exitoso
    Given He ingresado a la interfaz de Login
    When Ingresamos los datos de inicio de sesion
    Then Obtenemos el correcto mensaje de inicio exitoso
