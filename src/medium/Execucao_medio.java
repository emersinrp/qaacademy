package medium;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import utils.Utils;

public class Execucao_medio {
    
    public static void main(String[] args) {
        
        int selecionaExercicio = 1;

        String selecionaExercicioStg = JOptionPane.showInputDialog("Digite um número para selecionar um exercicio: ");
        selecionaExercicio = Integer.parseInt(selecionaExercicioStg);

        if (selecionaExercicio == 1) { // metodo exercicio 01 - medio
            Exercicio_01_medio objexercicio01medio = new Exercicio_01_medio();
            objexercicio01medio.exibeParOuImpar();            
        }
        if (selecionaExercicio == 2) { // metodo exericio 02 - medio
            String valorInvestidoStg = JOptionPane.showInputDialog("Insira o valor a ser investido: ");
            double valorInvestido = Utils.converteStringDouble(valorInvestidoStg);
            DecimalFormat df = new DecimalFormat("#,###.00");
            Exercicio_02_medio objexercicio02 = new Exercicio_02_medio();
            System.out.println(df.format(objexercicio02.resultadoInvestimento(valorInvestido)));          
        }
        else {
            System.out.println("Esse exercicio ainda não existe");
        }
    }
}
