Feature: Usar una fecha para aprender cosas nuevas

  Scenario Outline: usar exitosamente una fecha
    Given que estamos en la app TheApp
    When seleccionamos la opcion de PickerDemo
    When Agregamos el mes seleccionado <mes> y el dia elegido <dia>
    Then Obtenemos la informacion adecuada en pantalla

    Examples:
      | mes       | dia |
      | October   | 7   |
      | September | 4   |
