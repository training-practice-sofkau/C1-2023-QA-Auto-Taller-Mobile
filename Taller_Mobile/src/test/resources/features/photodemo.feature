Feature: Liberia de fotos
  Yo como usuario de la aplicación The App
  Quiero poder usar la libreria de fotos
  para ver información de las fotos.

  Scenario: Seleccionar foto
    Given que el usuario se encuentra en la pagina del inicio
    When el usuario entra a la funcion Photo Demo y selecciona la primer foto
    Then el usuario debera ver en pantalla la información de la foto