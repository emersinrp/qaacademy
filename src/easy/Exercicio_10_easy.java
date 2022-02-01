package easy;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio_10_easy {
    
    public static void main(String[] args) {
        
        double valorJuros = 0, taxaJuros = 0.05, valorTotal, valorInvestimento;
        int ano = 1;

        String valorInvestimentoStg = JOptionPane.showInputDialog("Digite o valor investido: ");
        valorInvestimento = Integer.parseInt(valorInvestimentoStg);
        DecimalFormat df = new DecimalFormat("#,###.##");

        while (ano <= 10) {

            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano++;            
        }

        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor investido: R$ " + df.format(valorInvestimento));
        System.out.println("Valor juros: R$ " + df.format(valorJuros));
        System.out.println("Valor total com juros: R$ " + df.format(valorTotal));

    }
}