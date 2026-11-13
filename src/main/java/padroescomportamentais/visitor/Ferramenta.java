package padroescomportamentais.visitor;

public class Ferramenta implements Produto {

    private int codigo;
    private String nome;
    private String fabricante;

    public Ferramenta(int codigo, String nome, String fabricante) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFerramenta(this);
    }

}