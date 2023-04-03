Feature: Login Screen
  Yo como usuario de la aplicacion TheApp
  Quiero diligenciar los campos del formulario de inicio de sesion
  Para ingresar a la seccion de Secret Area

  Scenario: Login exitoso
    Given el usuario ingresa a la aplicacion
    When el usuario diligencia el formulario de inicio de sesion
    Then es dirigido a la seccion Secret Area y visualiza un mensaje con su nombre de usuario