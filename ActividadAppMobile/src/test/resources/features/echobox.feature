Feature: Echo Box
  yo como usuario de la app v1.100
  quiero probar la funcionalidad echo box
  para ver si el mensaje mostrado es el mismo que el guardado

  Scenario Outline: Ver el mensaje guardado
    Given que el usuario ingresa a la app v1100
    When entra a la funcionalidad echo box
    And escribe y guarda un <mensaje>
    Then obtenemos un mensaje de <respuesta>

    Examples:
      | mensaje   | respuesta |
      | "khepasa" | "khepa"   |
      | "prueba"  | "prueb"   |
      | "wenas"   | "khepasa" |