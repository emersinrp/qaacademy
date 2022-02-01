package medium;
public class Exercicio_01_medio {

    public static void main(String[] args) {

        int i = 0;

        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println("Este número é par: " + i);
            }

            else {
                System.out.println("Este número é impar: " + i);
            }

            i++;
        }

    }
}