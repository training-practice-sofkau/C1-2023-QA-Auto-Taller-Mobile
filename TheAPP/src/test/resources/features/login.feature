Feature: The app Loggin
  yo como usuario de The App
  quiero loggerame en la app
  para poder accer a los servicios de la App

  Scenario Outline: Login exitoso
    Given el usuario està funcionalidad Loggin screen
    When ingresa usuario <usuario> y password <pass>
    Then Obtendra un mensaje de login exitoso

    Examples:
      | usuario |  | pass         |
      | "alice" |  | "mypassword" |
