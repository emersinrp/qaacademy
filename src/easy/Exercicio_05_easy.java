package easy;
import javax.swing.JOptionPane;

public class Exercicio_05_easy { //Inicio classe

    public static void main(String[] args) {

        int primeiroNumero, segundoNumero, terceiroNumero, soma, subtracao, multiplicacao, media;

        String primeiroDigitadoStg = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String segundoDigitadoStg = JOptionPane.showInputDialog("Digite o segundo numero: ");
        String terceiroDigitadoStg = JOptionPane.showInputDialog("Digite o terceiro numero: ");

        primeiroNumero = Integer.parseInt(primeiroDigitadoStg);
        segundoNumero = Integer.parseInt(segundoDigitadoStg);
        terceiroNumero = Integer.parseInt(terceiroDigitadoStg);

        soma = (primeiroNumero + segundoNumero + terceiroNumero);
        subtracao = (primeiroNumero - segundoNumero - terceiroNumero);
        multiplicacao = (primeiroNumero * segundoNumero * terceiroNumero);
        media = (primeiroNumero + segundoNumero + terceiroNumero) / 3;

        System.out.println("A some dos tres numeros digitados é: " + soma);
        System.out.println("A subtração dos tres numeros digitados é: " + subtracao);
        System.out.println("A multiplicação dos tres numeros digitados é: " + multiplicacao);
        System.out.println("A média dos tres numeros digitados é: " + media);
    }
    
} //Fim classe
