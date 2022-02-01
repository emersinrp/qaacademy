package medium;

import javax.swing.JOptionPane;

public class Exercicio_06_medio {

    public static void main(String[] args) {

        int fatorial, i;
        String fatorialStg = JOptionPane.showInputDialog("Insira um número para calcular o fatorial: ");
        fatorial = Integer.parseInt(fatorialStg);
        i = fatorial;

        while (i > 1) {
            fatorial = fatorial * (i - 1);
            i--;
        }
        System.out.println("O resultado do FATORIAL é: " + fatorial);

    }
}

// 6- Faça um algoritmo para ler um número inteiro, calcular e exibir o
// Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3)..
// *(10-1) = 3.628.800