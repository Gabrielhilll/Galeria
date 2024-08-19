public class Atividade02_ManipulacaoVariavel {
    public static void main(String[] args) {
        
        // Criação de Variáveis
        String nome = "Maria"; // Nome da pessoa
        int idade = 30; // Idade da pessoa
        double salarioMensal = 5000.00; // Salário bruto mensal em reais
        int mesesTrabalhados = 12; // Quantidade de meses trabalhados em um ano
        int quantidadeProdutos = 20; // Quantidade de produtos comprados
        double totalCompras = 4000.00; // Valor total gasto em compras

        // Operações Simples
        double salarioAnualBruto = salarioMensal * mesesTrabalhados; // Cálculo do salário anual bruto
        double desconto = 2000.00; // Valor fixo de desconto
        double salarioAnualLiquido = salarioAnualBruto - desconto; // Cálculo do salário anual líquido

        double mediaGastoPorProduto = totalCompras / quantidadeProdutos; // Cálculo da média de gasto por produto

        String mensagem = "Olá, " + nome + ". Seu salário anual líquido é de R$ " + salarioAnualLiquido; // Mensagem personalizada

        // Exibição de Resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Mensal: R$ " + salarioMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido (após desconto): R$ " + salarioAnualLiquido);
        System.out.println("Quantidade de Produtos Comprados: " + quantidadeProdutos);
        System.out.println("Total Gasto em Compras: R$ " + totalCompras);
        System.out.println("Média de Gasto por Produto: R$ " + mediaGastoPorProduto);
        System.out.println(mensagem);
    }
}
    