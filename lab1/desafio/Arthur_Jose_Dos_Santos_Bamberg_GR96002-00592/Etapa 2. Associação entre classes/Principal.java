public class Principal {
    public static void main(String[] args) {
        boolean sair = false;

        do {
            int opcao = Teclado.leInt(
                "(1) criar uma loja\n
                (2) criar um produto\n
                (3) sair"
            );

            
        } while (!sair);
    }
}
