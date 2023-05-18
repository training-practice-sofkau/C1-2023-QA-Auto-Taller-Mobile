Feature: Inicio de sesion en TheApp
  Yo como usuario de la app TheApp
  Quiero iniciar sesion
  para quedar logueado en la app

  Scenario: inicio de sesion exitoso
    Given que accedemos a la aplicacion TheApp
    When seleccionamos la opcion LoginScreen e ingreso los dados
    Then obtemos un mensaje de inicio de sesion exitoso