Feature: Combobox Fechas
  Yo como usuario de la aplicación The App
  Quiero poder elegir una fecha de la funcionalidad picker demo
  para recibir información de algun suceso que ocurrio en esta fecha

  Scenario: Elegir una fecha
    Given que el user se encuentra en la pagina del inicio
    When el usuario entra a la funcion Picker Demo y selecciona una fecha
    Then el usuario debera ver un mensaje con informacion de algo ocurrido en la fecha