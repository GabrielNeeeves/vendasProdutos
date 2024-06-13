package factory;

import model.Alimento;

import java.time.LocalDate;
import java.util.Scanner;

public class AlimentoFactory {

    private int codigo = 0;
    private String descricao = null;
    private int quantidade = 0;
    private LocalDate validade = null;

    //CRIAR ALIMENTO
    public Alimento criarAlimento(Scanner scanner) {
        while(true) {
            codigo = defCodigo(scanner);
            if(codigo > 0) break;
            System.out.println("Código deve ser maior que 0.");
        } // CÓDIGO

        while(true) {
            descricao = defDescricao(scanner);
            if(descricao != null) break;
            System.out.println("Descrição inválida");
        } // DESCRIÇÃO

        while(true) {
            quantidade = defQuantidade(scanner);
                if(quantidade > 0) break;
                System.out.println("Quantidade deve ser maior que 0.");
        } // QUANTIDADE

        validade = defValidade(scanner);

        return new Alimento(codigo, descricao, quantidade, validade);

    }

    //DEFINIR CÓDIGO
    private int defCodigo(Scanner scanner ){
        System.out.println("Código do Alimento: ");
        return scanner.nextInt();
    }

    //DEFINIR DESCRIÇÃO
    private String defDescricao(Scanner scanner ){
        System.out.println("Descrição do Alimento: ");
        return scanner.next().strip();
    }

    //DEFINIR QUANTIDADE
    private int defQuantidade(Scanner scanner ){
        System.out.println("Quantidade do Alimento: ");
        return scanner.nextInt();
    }

    //DEFINIR DATA DE VALIDADE
    private LocalDate defValidade(Scanner scanner) {
        System.out.println("Dia de Validade: ");
        int dia = scanner.nextInt();

        System.out.println("Mês de Validade: ");
        int mes = scanner.nextInt();

        System.out.println("Ano de Validade: ");
        int ano = scanner.nextInt();

        return LocalDate.of(ano, mes, dia);
    }

}
