Feature: Ver fotos en The App

  Yo como usuario de The App
  Quiero ver las fotos existentes

  Scenario Outline: Visualizacion de foto exitosa
    Given He ingresado a la interfaz de Photo Demo
    When Selecciono la foto "<id>"
    Then Deberia ver una descripcion de la foto seleccionada, <message>
    Examples:
      | id | message                |
      | 1  | "This is a picture of" |
      | 2  | "This is a picture of" |
      | 3  | "This is a picture of" |