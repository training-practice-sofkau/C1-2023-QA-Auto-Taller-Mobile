Feature: Acceder a una cuenta
  YO como usuario de TheApp
  QUIERO iniciar sesion
  PARA poder hacer cosas

  Background:
    Given El usuario esta en la aplicacion

  Scenario: Iniciar sesion
    Given El usuario esta en Login Screen
    When Ingresa el usuario y contrasenna
    Then Se redirige a la secret area
