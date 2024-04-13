public class Principal {
    public static void main(String[] args) {
        boolean sair = false;
        Loja loja = null;
        Produto produto = null;

        do {
            int opcao = Teclado.leInt(
                    "(1) criar uma loja\n" +
                            "(2) criar um produto\n" +
                            "(3) sair");

            switch (opcao) {
                case 1:
                    loja = Principal.createLoja();
                    break;

                case 2:
                    produto = Principal.createProduto();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            if (loja != null && produto != null && produto.estaVencido(new Data(20, 10, 2023))) {
                System.out.println(loja.toString());

                System.out.println("PRODUTO VENCIDO");
            } else if (loja != null && produto != null) {
                System.out.println(loja.toString());

                System.out.println("PRODUTO NÃO VENCIDO");
            }

        } while (!sair);
    }

    private static Loja createLoja() {
        String nome = Teclado.leString(
                Principal.createMessage("nome", "loja"));
        int quantidadeFuncionarios = Teclado.leInt(
                Principal.createMessage("quantidade de funcionários", "loja"));
        double salarioBaseFuncionario = Teclado.leDouble(
                Principal.createMessage("salário base dos funcionários", "loja"));

        Endereco endereco = new Endereco(
                Teclado.leString(
                        Principal.createMessage("nome da rua", "endereço", "loja")),
                Teclado.leString(
                        Principal.createMessage("cidade", "endereço", "loja")),
                Teclado.leString(
                        Principal.createMessage("estado", "endereço", "loja")),
                Teclado.leString(
                        Principal.createMessage("país", "endereço", "loja")),
                Teclado.leString(
                        Principal.createMessage("CEP", "endereço", "loja")),
                Teclado.leString(
                        Principal.createMessage("número", "endereço", "loja")),
                Teclado.leString(
                        Principal.createMessage("complemento", "endereço", "loja")));

        Data dataFundacao = new Data(
                Teclado.leInt(
                        Principal.createMessage("dia", "data de fundação", "loja")),
                Teclado.leInt(
                        Principal.createMessage("mês", "data de fundação", "loja")),
                Teclado.leInt(
                        Principal.createMessage("ano", "data de fundação", "loja")));

        return new Loja(
                nome,
                quantidadeFuncionarios,
                salarioBaseFuncionario,
                endereco,
                dataFundacao);
    }

    private static Produto createProduto() {
        String nome = Teclado.leString(
                Principal.createMessage("nome", "produto"));
        double preco = Teclado.leDouble(
                Principal.createMessage("preço", "produto"));
        Data dataValidade = new Data(
                Teclado.leInt(
                        Principal.createMessage("dia", "data de validade", "produto")),
                Teclado.leInt(
                        Principal.createMessage("mês", "data de validade", "produto")),
                Teclado.leInt(
                        Principal.createMessage("ano", "data de validade", "produto")));

        return new Produto(
                nome,
                preco,
                dataValidade);
    }

    private static String createMessage(String parametro, String classe) {
        return "Insira o/a " + parametro + " do/da " + classe;
    }

    private static String createMessage(String parametro, String classe, String classePai) {
        return "Insira o/a " + parametro + " do/da " + classe + " do/da " + classePai;
    }
}
