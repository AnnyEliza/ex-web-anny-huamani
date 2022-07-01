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
  Escenario: Restar dos números y se valida el resultado
    Dado que me encuentro en la página de testsheepnz
    Y marco check
    Y limpio cajas de texto
    Cuando ingreso first number "5"
    Y ingreso second number "4"
    Y selecciono operacion restar
    Y hago clic en el boton calcular
    Entonces mi resultado sera "1"

  @Escenario3
  Escenario: Multiplicar dos números y se valida el resultado
    Dado que me encuentro en la página de testsheepnz
    Y marco check
    Y limpio cajas de texto
    Cuando ingreso first number "5"
    Y ingreso second number "4"
    Y selecciono operacion multiplicar
    Y hago clic en el boton calcular
    Entonces mi resultado sera "20"

  @Escenario4
  Escenario: Dividir dos números y se valida el resultado
    Dado que me encuentro en la página de testsheepnz
    Y marco check
    Y limpio cajas de texto
    Cuando ingreso first number "8"
    Y ingreso second number "2"
    Y selecciono operacion dividir
    Y hago clic en el boton calcular
    Entonces mi resultado sera "4"

  @Escenario5
  Escenario: Concatenar dos números y se valida el resultado
    Dado que me encuentro en la página de testsheepnz
    Y marco check
    Y limpio cajas de texto
    Cuando ingreso first number "8"
    Y ingreso second number "2"
    Y selecciono operacion concatenar
    Y hago clic en el boton calcular
    Entonces mi resultado sera "82"