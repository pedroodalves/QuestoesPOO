1. 
a) Verdadeiro. Construtores não são herdados pelas subclasses, mas são chamados durante a inicialização do objeto.

b) Falso. O relacionamento “tem um” é implementado por composição ou agregação. A herança representa “é um”.

c) Falso. Redefinir um método com a mesma assinatura é sobrescrita (overriding). Sobrecarga (overloading) ocorre quando os métodos têm parâmetros diferentes.

2. 
protected: permite acesso pelas subclasses, facilitando a reutilização, mas reduz o encapsulamento.

private: restringe o acesso à própria classe, protegendo os dados e facilitando a manutenção.

Conclusão: private é geralmente preferível para proteger atributos, enquanto protected pode ser útil para métodos destinados às subclasses.

3. 
Ao criar um objeto de uma subclasse, o construtor da superclasse é executado primeiro, por meio de super() explícito ou implícito.

Isso é necessário para garantir a inicialização correta da parte herdada do objeto. 

Se a superclasse não tiver um construtor sem argumentos, deve-se chamar explicitamente um construtor adequado usando super(argumentos).