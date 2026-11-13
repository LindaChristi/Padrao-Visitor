package padroescomportamentais.visitor;

public interface Visitor {

    String exibirMadeira(Madeira madeira);
    String exibirFerramenta(Ferramenta ferramenta);
    String exibirEquipamento(Equipamento equipamento);

}
