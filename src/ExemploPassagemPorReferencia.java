public class ExemploPassagemPorReferencia {

        public static void main(String[] args) {
            StringBuilder str = new StringBuilder("Olá");
            System.out.println("Antes: " + str);
            alterarValor(str);
            System.out.println("Depois: " + str);
        }
        public static void alterarValor(StringBuilder valor) {
            valor.append(", mundo!");
        }
}
