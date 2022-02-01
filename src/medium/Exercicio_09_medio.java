package medium;

import javax.swing.JOptionPane;

public class Exercicio_09_medio {

    public static void main(String[] args) {

        String[] vetorNome = new String[5];
        int[] vetorNumero = new int[5];
        int i = 0;

        while (i<5) {

            vetorNumero[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: ")); //Inserindo o número e ja convertendo de String p/ Integer.
            vetorNome[i] = JOptionPane.showInputDialog("Insira o nome do aluno:");

            i++;
        }

        i = 0;

        while (i<5) {
                        
            System.out.println(vetorNumero[i] + " - " + vetorNome[i]);
            i++;
        }

    }
}

// 9- Faça um algoritmo para:
// Criar dois vetores.
// Em um vetor: ler e armazenar o nomes de alunos.
// No outro vetor: ler e armazenar a numeração de cada aluno, de acordo com a
// ordem inserida no vetor de nomes.
// E exiba, o Nome e o número correspondente de cada um.
