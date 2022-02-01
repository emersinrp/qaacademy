package exercicioInstanciaDeClasse;

public class Execucao {

    public static void main(String[] args) {
        Cachorro objCachorro = new Cachorro(); // Instanciando classe Cachorro, criando na memória

        System.out.println(objCachorro.nome); // Exibir/Chamar o conteudo e valor da variavel da classe Cachorro
        System.out.println(objCachorro.idade);

        objCachorro.latir(); // Executando os metodos criados, da classe Cachorro
        objCachorro.pular();
        objCachorro.deitar();
    }
}
