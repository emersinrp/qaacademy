package easy;
import javax.swing.JOptionPane;

public class Exercicio_03_easy {
    
    // public static void main(String[] args) {
    //     String nomeUm, nomeDois;

    //     nomeUm = JOptionPane.showInputDialog("Digite o primeiro nome: ");
    //     nomeDois = JOptionPane.showInputDialog("Digte o seuundo nome: ");

    //     System.out.println("Primeiro nome digitado: " + nomeDois);
    //     System.out.println("Segundo nome digitado: " + nomeUm);

    // }

    public String valorVariavelNomeUm() {
        String nomeUm = JOptionPane.showInputDialog("Digite o primeiro nome: ");
        return ("Segundo nome digitado: " + nomeUm);
        
    }
    public String valorVariavelNomeDois() {
        String nomeDois = JOptionPane.showInputDialog("Digte o segundo nome: ");
        return ("Primeiro nome digitado: " + nomeDois);
    }

}

// Exercício 3 - Faça um algoritmo para ler dois valores, armazenar em variáveis, e exibir os valores das variáveis, trocados. 
