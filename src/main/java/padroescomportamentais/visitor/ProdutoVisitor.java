package padroescomportamentais.visitor;

public class ProdutoVisitor implements Visitor {

    public String exibir(Produto produto) {
        return produto.aceitar(this);
    }

    @Override
    public String exibirMadeira(Madeira madeira) {
        return "Madeira{" +
                "codigo=" + madeira.getCodigo() +
                ", nome='" + madeira.getNome() + '\'' +
                ", categoria=" + madeira.getNomeCategoria() +
                '}';
    }

    @Override
    public String exibirFerramenta(Ferramenta ferramenta) {
        return "Ferramenta{" +
                "codigo=" + ferramenta.getCodigo() +
                ", nome='" + ferramenta.getNome() + '\'' +
                ", fabricante='" + ferramenta.getFabricante() + '\'' +
                '}';
    }

    @Override
    public String exibirEquipamento(Equipamento equipamento) {
        return "Equipamento{" +
                "codigo=" + equipamento.getCodigo() +
                ", nome='" + equipamento.getNome() + '\'' +
                ", preco=" + equipamento.getPreco() +
                '}';
    }
}
