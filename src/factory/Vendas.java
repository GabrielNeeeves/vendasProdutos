package factory;

import model.*;

import java.util.List;
import java.util.Scanner;

public class Vendas {

    //EFETUAR VENDA DE VESTUARIO
    public static Vestuario efetuarVendaVestuario(Scanner scanner, List<Vestuario> lista) {
        lista.forEach(System.out::print);

        System.out.println("Selecione o código do produto a ser vendido: ");
        int prodCod = scanner.nextInt();

        System.out.println("Quantidade a ser vendida: ");
        int quantiaVenda = scanner.nextInt();

        for(Vestuario v : lista) {
            if(v.getCodigo() == prodCod) v.setQuantidade(
                    v.getQuantidade() - quantiaVenda
            );
            return v;
        }
        return null;
    }

    //EFETUAR VENDA DE ALIMENTO
    public static Alimento efetuarVendaAlimento(Scanner scanner, List<Alimento> lista) {
        lista.forEach(System.out::print);

        System.out.println("Código do Alimento: ");
        int codigo = scanner.nextInt();

        System.out.println("Quantidade a ser vendida: ");
        int qtd = scanner.nextInt();

        for(Alimento a : lista) {
            if(a.getCodigo() == codigo)
                a.setQuantidade(
                        a.getQuantidade() - qtd
                );
            return a;
        }
        return null;
    }

}
