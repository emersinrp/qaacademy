package easy;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio_08_easy {
    
    public static void main(String[] args) {
        
        double salarioInformado, salarioLiquido = 0, impostoRenda = 0;
        String salarioInformadoStg = JOptionPane.showInputDialog("Informe o salario: ");

        salarioInformado = Double.parseDouble(salarioInformadoStg);
        DecimalFormat df = new DecimalFormat("#,###.00");

        if (salarioInformado >= 0.00 && salarioInformado <= 1903.98) {
            impostoRenda = 0;
            salarioLiquido = salarioInformado - impostoRenda;            
        }
       
        if (salarioInformado >= 1903.99 && salarioInformado <= 2826.65) {
            impostoRenda = (salarioInformado * 0.075) - 142.80;
            salarioLiquido = salarioInformado - impostoRenda;          
        }
       
        if (salarioInformado >= 2826.66 && salarioInformado <= 3751.05) {
            impostoRenda = (salarioInformado * 0.15) - 354.80;
            salarioLiquido = salarioInformado - impostoRenda;           
        }
       
        if (salarioInformado >= 3751.06 && salarioInformado <= 4664.68) {
            impostoRenda = (salarioInformado * 0.225) - 636.13;
            salarioLiquido = salarioInformado - impostoRenda;             
        }

        if (salarioInformado >= 4664.69) {
            impostoRenda = (salarioInformado * 0.275) - 869.36;
            salarioLiquido = salarioInformado - impostoRenda;    
        }

        System.out.println("Seu salario BRUTO e de: R$ " + df.format(salarioInformado));
        System.out.println("Seu salario LIQUIDO e de: R$ " + df.format(salarioLiquido));
        System.out.println("Seu IMPOSTO é de: R$ " + df.format(impostoRenda));
    }
}