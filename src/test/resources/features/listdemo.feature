Feature: obtener una lista de informacion

  Scenario: obtener exitosamente la lista de informacion
    Given que accedemos a la app TheApp
    When seleccionamos la opcion de ListDemo
    And elegimos la opcion de FOG
    Then Obtenemos un mensaje en pantalla de confirmacion
