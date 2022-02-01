package easy;
import javax.swing.JOptionPane;

public class Exercicio_07_easy {

    public static void main(String[] args) {
        
        double salarioInformado, aliquota1 = 0.075, aliquota2 = 0.09, aliquota3 = 0.12, aliquota4 = 0.14;
        String salarioInformadoStg = JOptionPane.showInputDialog("Digite o salário ");

        salarioInformado = Double.parseDouble(salarioInformadoStg);

        if (salarioInformado <= 1045.00) {
            System.out.println("Seu valor do INSS é de: " + (salarioInformado * aliquota1));
        }

        if (salarioInformado >= 1045.01 && salarioInformado <= 2089.60) {
            System.out.println("Seu valor do INSS é de: " + (salarioInformado * aliquota2));
        }

        if (salarioInformado >= 2089.61 && salarioInformado <= 3134.40) {
            System.out.println("Seu valor do INSS é de: " + (salarioInformado * aliquota3));
        }

        if (salarioInformado >= 3134.41 && salarioInformado <= 6101.06) {
            System.out.println("Seu valor do INSS é de: " + (salarioInformado * aliquota4));
        }
        if (salarioInformado > 6101.06) {
            System.out.println("Seu valor do INSS é de: 854.15");
        }
    
    }
    
}
