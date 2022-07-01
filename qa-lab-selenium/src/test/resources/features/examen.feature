#language: es

Característica: Examen Auto Web
  Utilizando Cucumber y Selenium, automatice la página

  @Escenario1
  Escenario: Sumar dos números y se valida el resultado
    Dado que me encuentro en la página de testsheepnz
    Cuando ingreso first number "4"
    Y ingreso second number "5"
    Y hago clic en el boton calcular
    Entonces mi resultado sera "9"

  @Escenario2
  Escenario: Sumar dos números y se valida el resultado
    Dado que me encuentro en la página de testsheepnz
    Cuando ingreso first number "5"
    Y ingreso second number "4"
    Y selecciono operacion "Subtract"
    Y hago clic en el boton calcular
    Entonces mi resultado sera "1"