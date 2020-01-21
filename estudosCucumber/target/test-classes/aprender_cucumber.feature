# language: pt
Funcionalidade: Aprender Cucumber
	Como aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu posso automatizar critérios de aceitação

Cenário: Deve incrementar o contador
	Dado que o valor do contado3 é 15
	Quando eu incrementar em 5
	Então o valor do contador será 18
	
	Cenário: Deve calcular endereço de entrega
	Dado que a entrega é dia 15/04/2019
	Quando a entrega atrasar em 2 dias
	Então entrega será efetuada em 17/04/2019
		