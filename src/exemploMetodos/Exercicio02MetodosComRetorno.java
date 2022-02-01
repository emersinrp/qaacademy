package exemploMetodos;

public class Exercicio02MetodosComRetorno {

    public static void main(String[] args) {
        System.out.println(metodoUm());
        System.out.println(idade());
        System.out.println(numeroDecimal());
        System.out.println(retornoFloat());
        System.out.println(metodoBoolean());
    }

    public static String metodoUm() { // metodo com retorno
        String mensagem = "metodoUm";
        return mensagem;

    }
    public static int idade() { // metodo com retorno
        return 10;

    }
    public static double numeroDecimal() { // metodo com retorno
        return 10.80;

    }
    public static float retornoFloat() { // metodo com retorno
        return 50;

    }
    public static boolean metodoBoolean() { // metodo com retorno
        return true;

    }

}
