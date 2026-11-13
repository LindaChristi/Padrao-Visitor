package padroescomportamentais.visitor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoVisitorTest {

    @Test
    void deveExibirMadeira() {
        Madeira madeira = new Madeira(1, "Eucalipto", new Categoria("Madeira serrada"));

        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Madeira{codigo=1, nome='Eucalipto', categoria=Madeira serrada}", visitor.exibir(madeira));
    }

    @Test
    void deveExibirFerramenta() {
        Ferramenta ferramenta = new Ferramenta(1, "Serrote", "Tramontina");

        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Ferramenta{codigo=1, nome='Serrote', fabricante='Tramontina'}", visitor.exibir(ferramenta));
    }

    @Test
    void deveExibirEquipamento() {
        Equipamento equipamento = new Equipamento(1, "Serra elétrica", 1500.0f);

        ProdutoVisitor visitor = new ProdutoVisitor();
        assertEquals("Equipamento{codigo=1, nome='Serra elétrica', preco=1500.0}", visitor.exibir(equipamento));
    }

}