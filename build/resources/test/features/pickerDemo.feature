Feature: Comprobar la Funcionalidad Picker Demo
  Yo como usuario de la app "The App"
  Quiero ver las noticia mas relevante de una fecha de la funcionalidad Picker Demo
  Para Verificar el correcto funcionamiento de esta funcionalidad

  Scenario: Verificar que se muestren noticias en la Funcionalidad Picker Demo
    Given El usuario ingresa a la app The App del celular android
    When El usuario navega hasta la funcionalidad Picker Demo y selecciona el mes y el dia del cual desea ver la noticia
    Then deberia ver una noticia relevante para la fecha que escogio