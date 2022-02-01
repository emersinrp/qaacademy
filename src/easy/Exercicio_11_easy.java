package easy;
import javax.swing.JOptionPane;

public class Exercicio_11_easy {
    
    public static void main(String[] args) {
        
        int numeroDigitado, i=1;

        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número: ");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        while (i <= 100) {

            numeroDigitado = numeroDigitado + 2;
            System.out.println("O total somado é: " + numeroDigitado);

            i++;
        }

    }
}