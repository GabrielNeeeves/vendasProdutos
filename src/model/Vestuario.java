package model;

public class Vestuario extends Produto{

    private String tamanho;

    public Vestuario(int cod, String desc, int q, String tam) {
        super(cod, desc, q);
        tamanho = tam;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return String.format("""
                Código: %d | Descrição: %s | Quantidade em estoque: %d | Data de Validade: %s
                """, getCodigo(),
                     getDescricao(),
                     getQuantidade(),
                     getTamanho().toUpperCase());
    }



}
