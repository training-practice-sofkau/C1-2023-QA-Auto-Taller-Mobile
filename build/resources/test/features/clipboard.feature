Feature: Usar un portapapeles

  Scenario: usar exitosamente el portapepeles
    Given Ingresamos a la app TheApp
    When seleccionamos la opcion de Clipboard Demo
    And Agregamos el texto deseado
    Then Obtenemos el mismo texto guardado en pantalla

