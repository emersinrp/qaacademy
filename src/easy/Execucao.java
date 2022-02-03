package easy;

import javax.swing.JOptionPane;

import utils.Utils;

public class Execucao {

    public static void main(String[] args) { // execucao dos metodos

        int selecionaExercicio;

        String selecionaExercicioStg = JOptionPane.showInputDialog("Digite um número para selecionar um exercicio: ");
        selecionaExercicio = Integer.parseInt(selecionaExercicioStg);

        if (selecionaExercicio == 2) { // metodo exercicio 02
            Exercicio_02_easy objexercicio_02 = new Exercicio_02_easy();
            System.out.println(objexercicio_02.exibirPalavraDigitada());
        }
        if (selecionaExercicio == 3) { // metodo exercicio 03
            String nomeUm = JOptionPane.showInputDialog("Digite o primeiro nome: ");
            String nomeDois = JOptionPane.showInputDialog("Digte o segundo nome: ");
            Exercicio_03_easy objexercicio03 = new Exercicio_03_easy();
            System.out.println(objexercicio03.valorVariavelNomes(nomeUm, nomeDois));
        }
        if (selecionaExercicio == 4) { // metodo exercicio 04
            String numeroDigitadoUsuarioStg = JOptionPane.showInputDialog("Digite um numero: ");
            int numeroDigitado = Utils.converteStringInteiro(numeroDigitadoUsuarioStg);
            Exercicio_04_easy objexercicio04 = new Exercicio_04_easy();
            System.out.println(objexercicio04.multiplicacaoVariavelArmazenada(numeroDigitado));
        }
        if (selecionaExercicio == 5) { // metodo exercicio 05
            String primeiroNumeroStg = JOptionPane.showInputDialog("Digite o primeiro numero: ");
            String segundoNumeroStg = JOptionPane.showInputDialog("Digite o segundo numero: ");
            String terceiroNumeroStg = JOptionPane.showInputDialog("Digite o terceiro numero: ");
            int primeiroNumero = Utils.converteStringInteiro(primeiroNumeroStg);
            int segundoNumero = Utils.converteStringInteiro(segundoNumeroStg);
            int terceiroNumero = Utils.converteStringInteiro(terceiroNumeroStg);
            Exercicio_05_easy objexercicio05 = new Exercicio_05_easy();
            System.out.println(objexercicio05.operacoesMatematicas(primeiroNumero, segundoNumero, terceiroNumero));
        }
        else {
            System.out.println("Esse exercicio ainda não existe");
        }
    }

}
