LISTA 02

Questão 1:

A utilização de métodos getters e setters oferece maior robustez ao código e impede que atributos sejam alterados de forma indiscriminada por outras classes e objetos. 
A modificação descontrolada de atributos é uma violação do pilar de encapsulamento e pode causar sérios problemas de segurança e confiabilidade no código, o que pode ser prevenido pela utilização de métodos getters e setters. 
Por esse motivo, a utilização desses métodos é considerada uma boa prática dentro da programação orientada a objetos.

Em uma aplicação java que simule a operação de um caixa eletrônico, por exemplo, onde o objeto Conta representa a conta bancária de um cliente do banco, a ausência de restrições sobre quem pode alterar os valores internos da Conta representaria um grave risco à segurança do código, uma vez que os valores poderiam ser alterados abertamente, podendo acarretar prejuízos ao banco e aos clientes. 
Limitar essa operação à própria classe garante que o objeto tenha controle sobre seus próprios atributos, impedindo interferência externa.

Questão 2:

a)Para representar um livro em um sistema de uma biblioteca, as informações importantes são:
    -Código ISBN    (int)
    -Título         (string)
    -Autor          (string)
    -Emprestado     (boolean)

Caso o sistema opte por manter as informações do empréstimo dentro do objeto Livro, e não em outra parte do sistema (como uma classe "Gestão", por exemplo), também deverão ser armazenadas dentro de Livro informações como:
    -Data de empréstimo
    -Data de devolução
    -Renovações (caso haja um limite)
    -Pessoa que pegou

b)A classe Livro seria uma abstração por representar um livro real dentro do universo virtual do sistema da biblioteca, simulando apenas os aspectos essenciais do livro dentro do escopo do sistema onde se encontra, tais como: nome, código, autor e se o livro está ou não disponível ou emprestado, suprimindo informações como editora, gênero, quantidade de páginas e ano de publicação, por não serem essenciais para a operação do sistema.  

c)Os seguintes métodos seriam essenciais para o funcionamento da classe Livro dentro do sistema da biblioteca:
    -Construtor
    -Emprestar
    -Devolver
    -Renovar empréstimo
    -Método getter

Caso o método construtor não instancie o objeto com todos os seus atributos, também seria necessário um método Setter para defini-los.

