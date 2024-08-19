public class Atividade01_ManipulacaoVariavel {
    public static void main(String[] args) {
        
        // Declaração de variáveis
        int idade = 25; // Idade de uma pessoa
        double altura = 1.75; // Altura em metros
        String nome = "João"; // Nome da pessoa
        boolean isEstudante = true; // Indica se a pessoa é estudante

        // Operações Simples
        int idade2 = 30; // Outra idade para realizar a soma
        int somaIdades = idade + idade2; // Soma de duas idades

        double alturaMultiplicada = altura * 2; // Multiplicando a altura por 2

        String saudacao = "Olá, " + nome + "!"; // Concatenando o nome com uma saudação

        // Exibição de Resultados
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Nome: " + nome);
        System.out.println("É estudante? " + isEstudante);

        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Altura multiplicada por 2: " + alturaMultiplicada + " metros");
        System.out.println(saudacao);
    }
}