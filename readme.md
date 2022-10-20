# Exercícios propostos coding tank Ada

## Questão #1 - IMC

Enunciado
Crie um programa que pergunte qual a altura em metros e peso em Kg desta pessoa e retorne o IMC e a classificação deste IMC.

IMC = peso / altura x altura;

Como referência para para a classificação do IMC utilizar a tabela do link Tabela IMC - Wikipedia.

Exemplo:

Informe sua altura em metros?
1,9
Informe seu peso em Kg?
72,2
O valor do seu IMC é 20 (considerado Peso normal)

[**Resolução da questão**](src/IMC.java)

---

## Questão #2 - Média das notas

Enunciado
Faça um programa que receba as quatro notas de 0 a 10 de um aluno e informe a média das notas. Caso receba notas maiores que 10 ou menores que zero é para retornar uma mensagem informando que valor é inválido e encerrar o programa.

Exemplo:

Informe a nota prova 1:
10
Informe a nota prova 2:
10
Informe a nota prova 3:
5
Informe a nota prova 4:
5
A média do aluno foi 7.5

[**Resolução da questão**](src/Media.java)

---

## Questão #3 - Graus Celsius em Fahrenheit

Enunciado
Criar uma função que transforma o valor de uma temperatura em graus celsius em fahrenheit seguindo a fórmula abaixo:

fahrenheit = (celsius * fator1) + fator2

fator1 é representado pela divisão de 9 por 5

fator2 é 32

celcius é o valor variável da temperatura em celsius.

O seu programa deve calcular o valor em fahrenheit de ao menos duas temperaturas distintas e deve imprimir o resultado no console.

Exemplo:

Temperatura 1 XºC são YºF
Temperatura 2 ZºC são WºF

[**Resolução da questão**](src/CelsiusToFahrenheit.java)

---

## Questão #4 - args

Enunciado
Criar uma classe com uma função main que vai receber um número via argumentos do programa (args) e dizer se esse número é par ou impar. Caso tenha recebido mais ou menos de um argumento retornar mensagem "Número inválido de argumentos, é esperado que seja informado um argumento".

[**Resolução da questão**](src/Args.java)

---

## Questão #5 - args (soma)

Enunciado
Criar um programa que recebe 2 números e realiza a soma deles. Porém, nesse caso o programa deve verificar quantos parâmetros são enviados como argumento do método main(args).

Se for nenhum, deve pedir via System.in que o usuário digite 2 números. No caso de vir apenas 1, deve pedir outro parâmetro via System.in. Se for 2, deve realizar a soma dos dois.

No caso de qualquer outra quantidade. Deve apresentar uma mensagem de erro falando que a quantidade é inválida.

[**Resolução da questão**](src/SumArgs.java)

---

## Questão #6 - Operações matemáticas

Enunciado
Realizar uma operação matemática, que deve ser passada via input do usuário ( opções: + - / * ) entre dois números inteiros que também devem ser solicitados via System.in. Caso a operação seja desconhecida exibir uma mensagem "Operação desconhecida" e encerrar o programa.

Exemplo:

Qual operação deseja fazer? ( opções: + - / * )
Informe o primeiro número.
Informe o segundo número.

[**Resolução da questão**](src/MathOperations.java)

---

## Questão #7 - Aplicação de investimentos

Enunciado
Pergunte para a usuária o valor que será investido em uma aplicação, a taxa de juros ao mês e o tempo que o dinheiro ficará aplicado.

Seu programa deverá exibir quanto de juros será pago e o saldo total em cada mês.

Exemplo:

Informe o valor inicial investido em R$.
10000,00
Informe o juros ao mês em %.
5
Informe o tempo em meses que o dinheiro ficará investido.
3

10000.0 reais, 5% de juros ao mês por 3 meses.

Mês 1: Juros: R$ 500.0 , saldo: 10500.0 
Mês 2: Juros: R$ 525.0 , saldo: 11025.0 
Mês 3: Juros: RS 551.25 , saldo: 11576.25 

[**Resolução da questão**](src/Investment.java)

---

## Questão #8 - Somatório

Enunciado
Faça um programa que pede para a usuária digitar um número inteiro positivo. Seu programa deverá responder a soma de do número com todos os seus antecessores positivos.

Ex: se o número digitado for 5, a conta a ser realizada será 5 + 4 + 3 + 2 + 1, e o resultado na tela será "15".

[**Resolução da questão**](src/Sum.java)

---

## Questão #9 - Média, a maior e a menor nota.

Enunciado
Faça um programa que peça para o usuário quantas provas eles fez, depois pergunte para ele a nota inteira, de 0 a 100, de cada prova, e retorne a média, a maior nota e a menor nota entre as provas informadas. Exemplo:

Informe a quantidade de provas:
5
Informe a nota da prova 1:
75
Informe a nota da prova 2:
60
Informe a nota da prova 3:
50
Informe a nota da prova 4:
80
Informe a nota da prova 5:
90
A menor nota é: 50
A maior nota é: 90
A média das notas é: 71

[**Resolução da questão**](src/Grades.java)

---

## Questão #10 - Tabela Price.

Enunciado
Vamos implementar uma Tabela Price.

A tabela Price é utilizada em empréstimos de longo prazo, como no financiamento de um imóvel.

Um empréstimo pelo sistema Price utiliza prestações com valor fixo, isto é, você sempre irá pagar o mesmo valor todo mês.

Porém, uma taxa de juros corrige o seu saldo devedor, sendo assim, parte do valor que você paga no mês serve apenas para pagar juros, e outra parte realmente reduz o seu saldo devedor. Essa redução é a chamada amortização.

Como o saldo devedor diminui com o tempo, a parcela de juros diminui a cada mês, nos primeiros meses a maior parte do valor pago por mês serve para pagar juros, enquanto mais próximo do final, a maior parte do valor está de fato amortizando a dívida.

Você pode aprender mais sobre as colunas da tabela e o cálculo para determinar o valor das prestações neste site.

Conhecendo o valor fixo, como fazemos para determinar quanto de amortização, quanto de juros e qual o novo saldo devedor a cada mês?

Primeiro aplica-se a taxa de juros sobre o saldo devedor (multiplicar por i). Esse valor é o valor de juros pagos no mês. Subtraindo-se os juros do valor da prestação, descobre-se o quanto se amortizou naquele mês. O novo saldo devedor é obtido subtraindo a amortização do valor.

Faça um programa que pergunta:

o valor de um empréstimo
a taxa de juros do empréstimo
o tempo para pagamento
O seu programa deverá imprimir na tela uma "tabela" mostrando, o valor fixo da prestação e mês a mês, o saldo devedor, juros, amortização e no final os valores totais das prestações, juros e amortização.

Exemplo: para 30000.00 reais em 12 meses com juros de 1,5%:

Valor fixo da parcela R$ 2750.40, Saldo devedor total R$ 30000.00
Parcela 1 | Juros: R$ 450.00 | Amortização: R$ 2300.40 | Saldo devedor: R$ 27699.60
Parcela 2 | Juros: R$ 415.49 | Amortização: R$ 2334.91 |  Saldo devedor: R$ 25364.69
Parcela 3 | Juros: R$ 380.47 | Amortização: R$ 2369.93 |  Saldo devedor: R$ 22994.76

...

Parcela 11 | Juros: R$ 80.69 | Amortização: R$ 2669.71 | Saldo devedor: R$ 5379.46
Parcela 12 | Juros: R$ 40.65 | Amortização: R$ 2709.75 | Saldo devedor: R$ 0
Total: Prestação R$ 33004.80, Juros R$ 3004.80, Amortização R$ 30000.00

[**Resolução da questão**](src/Price.java)
