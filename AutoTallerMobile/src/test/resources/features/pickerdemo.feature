Feature: Picker Demo
  Yo como usuario de TheApp
  QUIERO ingresar a la funcionalidad
  Para obtener datos curiosos de las fechas seleccionadas

  Scenario: Pick Date
    Given el usuario ingresa a la aplicacion TheApp
    When nave hasta la funcionalidad PickerDemo, luego ingresa una fecha
    Then debe observar eventos sucedidos en la fecha seleccionada

