public class ExemploPassagemPorValor {

        public static void main(String[] args) {
            int x = 10;
            System.out.println("Antes: " + x);
            alterarValor(x);
            System.out.println("Depois: " + x);
        }

        public static void alterarValor(int valor) {
            valor = 20;
        }
}
