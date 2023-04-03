Feature: Obtener lista de aplicaciones
  yo como usuario de The App
  quiero mirar las aplicaciones registradas
  para poder elegir una aplicacion

  Scenario: listar aplicaciones demo
    Given que el usario ingresa a la funcionalidad list demo
    When seleciona una aplicacion
    Then Obtendra el nombre de la aplicacion

