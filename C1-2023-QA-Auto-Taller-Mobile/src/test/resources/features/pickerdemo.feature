Feature: Picker Demo
  yo como usuario de la app movil
  quiero usar los servicios photo demo
  para poder usar los servicios de la app

  @Picker
  Scenario:PickerDemo
    Given el usuario esta en el  inicio de la the app
    When navega hasta la opcion picker demo selecciona una feche mes y dia
    Then el usuario debe ver la informacion del evento de esa fecha
