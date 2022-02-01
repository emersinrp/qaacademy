package medium;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio_02_medio {
    
    public static void main(String[] args) {
        
        double valorInvestido, taxaJuros = 0.05, totalAtualizadoComJuros = 0;
        int ano = 1;

        String valorInvestidoStg = JOptionPane.showInputDialog("Insira o valor a ser investido: ");
        valorInvestido = Double.parseDouble(valorInvestidoStg);
        DecimalFormat df = new DecimalFormat("#,###.00");

        totalAtualizadoComJuros = valorInvestido;

        while (ano <= 10) {

            totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros; //Regime juros compostos

            ano++;
        }

        System.out.println("O valor investido foi de: R$ "+ df.format(valorInvestido));
        System.out.println("O valor dos juros é de: R$ " + df.format(totalAtualizadoComJuros - valorInvestido));
        System.out.println("O valor total é de: R$ "+ df.format(totalAtualizadoComJuros));
    }
}