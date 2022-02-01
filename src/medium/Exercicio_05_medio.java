package medium;

import javax.swing.JOptionPane;

public class Exercicio_05_medio {

    public static void main(String[] args) {

        int numeroDigitado, menorNumero = 0, i = 1, qtdDigitos = 1;

        while (i <= 5 && qtdDigitos <= 5) {
            String numeroDigitadoStg = JOptionPane.showInputDialog("Digite o " + qtdDigitos + " número :");
            numeroDigitado = Integer.parseInt(numeroDigitadoStg);

            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;

            }
            i++;
            qtdDigitos++;
        }
        System.out.println("O: " + menorNumero + " é o MENOR número entre os digitados.");
    }
}

// 5- Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor.  
