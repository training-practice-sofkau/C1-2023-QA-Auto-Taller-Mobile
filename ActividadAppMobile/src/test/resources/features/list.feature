Feature: List
  yo como usuario de la app v1.100
  quiero probar la funcionalidad del list
  para ver la informacion de las cosas

  Scenario Outline: Ver informacion de una cosa
    Given que el usuario ingresa a la apk v1100
    When entra a la funcionalidad list
    And y seleccionar un <objeto> de la lista
    Then aparece un <mensaje> que indica que objeto selecciono

    Examples:
      | objeto        | mensaje       |
      | "Altocumulus" | "dsadsad"     |
      | "Altocumulus" | "Altocumulus" |