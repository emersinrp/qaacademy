package medium;

public class Exercicio_10_medio {

    public static void main(String[] args) {

        int[] vetorFibonacci = new int[10];
        int i = 2, elemento; // Se utilizar i=0 da BUG, resultado fica -1 no While.

        vetorFibonacci[0] = 0;
        vetorFibonacci[1] = 1;

        elemento = 10;

        while (i < elemento) {
            vetorFibonacci[i] = vetorFibonacci[i - 1] + vetorFibonacci[i - 2];
            i++;
        }

        i = 0;

        while (i < elemento) {
            System.out.println(vetorFibonacci[i]);
            i++;
        }
    }
}

// 10 - Faca um algoritmo que :
// - Calcule e exiba a sequencia de Fibonaci ate o 10 elemento.
// EX.: 0,1,1... 3,4. Usando vetor, para armazenar o resultado.
// A sequencia de Fibonacci, é calculada com a soma dos 2 termos anteriores,
// sendo o primeiro e o segundo, 0 e 1, respectivamente.