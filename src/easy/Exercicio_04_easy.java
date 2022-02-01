package easy;
import javax.swing.JOptionPane;

public class Exercicio_04_easy {

    public static void main(String[] args) {
        String numeroDigitadoUsuario;
        int numeroDigitado, resultado;

        numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um numero: ");
        numeroDigitado = Integer.parseInt(numeroDigitadoUsuario); //Conversao String para INT
        resultado = numeroDigitado * 2;

        System.out.println("O dobro do numero digitado é: " + resultado);
        JOptionPane.showMessageDialog(null, "O dobro do numero digitado é: " + resultado ); // Mostra em tela o resultado, ao inves do console
    }
    
}
