package padroescomportamentais.visitor;

public class Principal {

    public static void main(String[] args) {

        Madeira madeira = new Madeira(1, "Eucalipto", new Categoria("Madeira serrada"));

        Ferramenta ferramenta = new Ferramenta(2, "Serrote", "Tramontina");

        Equipamento equipamento = new Equipamento(3, "Serra elétrica", 1500.0f);

        ProdutoVisitor visitor = new ProdutoVisitor();

        System.out.println("===== CONTROLE DE ESTOQUE =====");

        System.out.println(madeira.aceitar(visitor));

        System.out.println(ferramenta.aceitar(visitor));

        System.out.println(equipamento.aceitar(visitor));

    }

}