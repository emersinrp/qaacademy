package easy;
import javax.swing.JOptionPane;

public class Exercicio_09_easy {
    
    public static void main(String[] args) {
        
        int numeroDigitado, i=1, resultado;
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um numero entre 1 e 10:");

        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        while (i <= 10) {
            resultado = numeroDigitado * i;
            System.out.println( numeroDigitado + " x " + i + " = " + resultado);

            i++;
        }

    }

}