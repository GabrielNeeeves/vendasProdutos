package model;

import java.time.LocalDate;

public class Alimento extends Produto{

    private LocalDate dataValidade;

    public Alimento(int cod, String desc, int q, LocalDate val) {
        super(cod, desc, q);
        dataValidade = val;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return String.format("""
                Código: %d | Descrição: %s | Quantidade em estoque: %d | Data de Validade: %s
                """, getCodigo(),
                     getDescricao(),
                     getQuantidade(),
                     getDataValidade());
    }
}
