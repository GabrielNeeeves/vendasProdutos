package model;

public abstract class Produto {

    private int codigo;
    private String descricao;
    private int quantidade;

    public Produto(int cod, String desc, int q) {
        codigo = cod;
        descricao = desc;
        quantidade = q;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
