import factory.AlimentoFactory;
import factory.Vendas;
import factory.VestuarioFactory;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Temos as seguintes classes:
//        Produto (codigo, descricao, quantidade) e suas subclasses
//        Vestuario(tamanho) e Alimento(dataValidade)
//                Crie as classes, indique a herança, crie os construtores,
//        sets e gets e uma classe com o método main que execute.
//        A classe main deve realizar:
//        - o cadastramento de Vestuario e Alimento
//                - listar os produtos cadastrados
//                - realizar a venda de produtos e baixa do estoque
//
//        ao cadastrar os produtos, deverá realizar a validação
//        de cada campo/atributo
//
//        Crie uma opção no menu que mostre os produtos que foram
//        vendidos e a quantidade em estoque de cada produto

        Scanner scanner = new Scanner(System.in);

        var listaVestuario = new ArrayList<Vestuario>();
        var listaAlimento = new ArrayList<Alimento>();
        var listaVendidos = new ArrayList<Produto>();

        boolean sair = false;
        while(!sair) {
            System.out.println("1. Cadastrar Vestuario");
            System.out.println("2. Cadastrar Alimento");
            System.out.println("3. Exibir produtos");
            System.out.println("4. Fazer uma Venda de Vestuario");
            System.out.println("5. Fazer uma Venda de Alimento");
            System.out.println("6. Exibir itens vendidos");
            System.out.println("7. Sair");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    var vestFac = new VestuarioFactory();
                    var vestuario = vestFac.criarVestuario(scanner);
                    listaVestuario.add(vestuario);
                    System.out.println("Vestuário registrado!");
                    break;
                case 2:
                    var alimentoFactory = new AlimentoFactory();
                    var alimento =  alimentoFactory.criarAlimento(scanner);
                    listaAlimento.add(alimento);
                    System.out.println("Alimento registrado!");
                    break;
                case 3:
                    System.out.println("=== Vestuários ===");
                    listaVestuario.forEach(System.out::print);

                    System.out.println("=== Alimentos ===");
                    listaAlimento.forEach(System.out::print);
                    break;
                case 4:
                    var vestuarioVendido = Vendas.efetuarVendaVestuario(scanner, listaVestuario);
                    listaVendidos.add(vestuarioVendido);
                    System.out.println("Venda efetivada.");
                    break;
                case 5:
                    var alimentoVendido = Vendas.efetuarVendaAlimento(scanner, listaAlimento);
                    listaVendidos.add(alimentoVendido);
                    System.out.println("Venda efetivada.");
                    break;
                case 6:
                    listaVendidos.forEach(System.out::print);
                    break;
                case 7:
                    System.out.println("Saiu");
                    sair = true;
                    break;
                default:
                    System.out.println("Valor Inválido.");

            }

        }


    }
}
