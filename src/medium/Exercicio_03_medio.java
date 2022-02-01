package medium;
import javax.swing.JOptionPane;

public class Exercicio_03_medio {

    public static void main(String[] args) {

        int i = 0, soma = 0;

        String somaStg = JOptionPane.showInputDialog("Insira um numero de 0 a 1000: ");
        soma = Integer.parseInt(somaStg);

        while (i <= 1000) {

            soma = soma + 1;
            System.out.println("O resultado da soma de todos os números é: " + soma);

            if (soma >= 1500) {
                break;

            }

            i++;
        }

    }
}