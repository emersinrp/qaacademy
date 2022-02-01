package exemploMetodos;

public class Exercicio03Metodos {

    public static void main(String[] args) {
        // Com Retorno
        System.out.println(exibirNomeEIdade(33, "Emerson"));
        System.out.println(retornarPalavra("Teste"));
        System.out.println(retornarDobro(10));
        System.out.println(retornarNomeSobrenome("Silva", "Rodrigues"));
        System.out.println(retornarSalario(2000));

        // Sem Retorno
        exibirNomeEIdadeSemRetorno(29, "Emerson");
        retornarPalavraSemRetorno("Teste");
        retornarDobroSemRetorno(50);
        retornarNomeESobrenomeSemRetorno("Emerson", "Rodrigues");
        retornarSalarioSemRetorno(10511);
    }

    // 5 com retorno
    public static String exibirNomeEIdade(int idade, String nome) { // metodo com retorno
        return "Nome: " + idade + " Idade: " + idade;
    }
    public static String retornarPalavra(String palavra) { // metodo com retorno
        return palavra;
    }
    public static int retornarDobro(int numero) { // metodo com retorno
        return numero * 2;
    }
    public static String retornarNomeSobrenome(String nome, String sobreNome) { // metodo com retorno
        return nome + " " + sobreNome;
    }
    public static int retornarSalario(int salario) { // metodo com retorno
        return salario;
    }

    // 5 sem retorno
    public static void exibirNomeEIdadeSemRetorno(int idade, String nome){
        System.out.println("Nome: "+nome+" - Idade: " + idade);
    }
    public static void retornarPalavraSemRetorno(String palavra){
        System.out.println("Exemplo: " + palavra);
    }
    public static void retornarDobroSemRetorno(int numero){
        System.out.println("Dobro: "+ numero*2);
    }
    public static void retornarNomeESobrenomeSemRetorno(String nome, String sobrenome){
        System.out.println(nome + sobrenome);
    }
    public static void retornarSalarioSemRetorno(int salario){
        System.out.println("Salario: " + salario);
    }

} 