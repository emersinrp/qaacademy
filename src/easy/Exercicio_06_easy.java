package easy;
import javax.swing.JOptionPane;

public class Exercicio_06_easy {
    
    public static void main(String[] args) {

        double nota1, nota2,resultado; //variavel do tipo numerico real, cujo resultado é decimal
        String primeiraNota = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String segundaNota = JOptionPane.showInputDialog("Digite a segunda nota: ");

        nota1 = Double.parseDouble(primeiraNota);
        nota2 = Double.parseDouble(segundaNota);

        resultado = (nota1 + nota2) / 2;
        
        if (resultado > 5) { // inicio SE
            System.out.println("Aprovado");            
        } // fim SE

        if (resultado < 5 ) {
            System.out.println("Reprovado");            
        }
        
        if (resultado == 5) {
            System.out.println("Exame");            
        }
        
    }

}
