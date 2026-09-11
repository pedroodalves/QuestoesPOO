Questão 5:

O Scanner é utilizado para leitura de dados informados pelo usuário (input), sendo tais dados normalmente informados através do teclado. Já o System.out.printf é um recurso destinado á saída de dados (output). 
Utilizando o System.out.printf, é possível formatar os dados de maneira semelhante à linguagem C, facilitando a inserção de dados de variáveis em corpos de texto a serem exibidos pelo programa.

Por exemplo, no código abaixo:

public static void lerEEscrever(int idade) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o seu nome:");
    String nome = scanner.nextLine();

    System.out.printf("Seu nome é %s e sua idade é %d.", nome, idade);
}

É facilitada a exibição de dados do programa, além de ser possível controlar a quantidade de caass decimais de um número real, por exemplo, como no trecho de código abaixo:

double valor = 34.356;
System.out.printf("O valor do produto é %.2f.", valor);

Da forma como o código está escrito, a terceira casa decimal é suprimida, e o valor é arredondado para cima.

Questão 6:

import java.util.Scanner;

public class Contador {
    public static void main(String args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador)
        }
    }
}

O código acima possui diversos erros. Dentre eles, podemos listar: 

-O método main() recebe como parâmetro "String args". Contudo, a sintaxe está incorreta, uma vez que não foram inseridos colchetes. A forma correta seria public void main(String[] args) ou public void main(String args[]);
-Embora seja criado um contador, ele não chega a ser incrementado, apesar de ser inicializado. Dessa forma, o while nunca alcançará a condição de parada, se transformando em um laço infinito. Pode-se corrigir esse erro ao incluir uma soma dentro do while("contador++", "contador += 1" ou "contador = contador + 1") para garantir que a variável seja incrementada corretamente.
-Falta um ponto e vírgula após a linha "System.out.println("Contador: " + contador)". A ausência desse caractere impedirá o compilador de executar corretamente o código, visto que a linguagem Java exige a inserção do ponto e vírgula ao final de cada linha.

O código corrigido ficaria da seguinte forma:

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}