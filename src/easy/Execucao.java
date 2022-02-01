package easy;

import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

public class Execucao {

    public static void main(String[] args) { //execucao dos metodos

        int selecioneExercicio;

        String selecioneExercicioStg = JOptionPane.showInputDialog("Digite um número para selecionar um exercicio: ");
        selecioneExercicio = Integer.parseInt(selecioneExercicioStg);

        if (selecioneExercicio == 2) { // metodo exercicio 02
            Exercicio_02_easy objExercicio02 = new Exercicio_02_easy();
            System.out.println(objExercicio02.exibirPalavraDigitada());
        }

        if (selecioneExercicio == 3) { // metodo exercicio 03

            Exercicio_03_easy objExercicio03_1 = new Exercicio_03_easy(); 
            System.out.println(objExercicio03_1.valorVariavelNomeUm());
            Exercicio_03_easy objExercicio03_2 = new Exercicio_03_easy();
            System.out.println(objExercicio03_2.valorVariavelNomeDois());
        }
        
        else {
            System.out.println("Esse exercicio ainda não existe");
        }
    }

}
