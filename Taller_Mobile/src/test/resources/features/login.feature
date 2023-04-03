Feature: Iniciar Sesión
  Yo como usuario de la aplicación The App
  Quiero poder inciar sesión en mi cuanta
  para acceder a las funciones protegidas por contraseña.

  Scenario Outline: Inciar Sesión
    Given que el usuario esta en la pagina de inicio
    When el usuario ingresa el usario <user> y el password <password>
    Then el usuario debera ver el mensaje <message>
    Examples:
      | user    | password     | message                      |
      | "alice" | "mypassword" | "You are logged in as alice" |
      | ""      | "mypassword" | "Alert"                      |
      | "alice" | ""           | "Alert"                      |


