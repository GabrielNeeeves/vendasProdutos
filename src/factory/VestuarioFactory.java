package factory;

import model.Vestuario;

import java.util.Scanner;

public class VestuarioFactory{

    private int vestCodigo = 0;
    String vestDesc = null;
    int vestQuant = 0;
    String tamanho = null;

    //CRIAR VESTUARIO
    public Vestuario criarVestuario(Scanner scanner) {
         while(true) {
            System.out.println("Código do Vestuário: ");
            vestCodigo = scanner.nextInt();
            if (vestCodigo > 0) break;
            System.out.println("Deve ser um número positivo.");
        }

        while(true) {
            System.out.println("Descrição do Vestuário: ");
            vestDesc = scanner.next();
            if (vestDesc != null && !vestDesc.trim().isEmpty()) break;
            System.out.println("Não pode ser vazia.");
        }

        while(true) {
            System.out.println("Quantidade de Vestuário no estoque: ");
            vestQuant = scanner.nextInt();
            if (vestQuant > 0) break;
            System.out.println("Deve ser um número positivo.");
        }

        while(true) {
            System.out.println("Tamanho do Produto de Vestuário (P, M, G, GG): ");
            tamanho = scanner.next();
            if (tamanho.equalsIgnoreCase("P") || tamanho.equalsIgnoreCase("M") || tamanho.equalsIgnoreCase("G") || tamanho.equalsIgnoreCase("GG")) break;
            System.out.println("Tamanho inválido. Deve ser um dos seguintes: P, M, G, GG.");
        }

        return new Vestuario(vestCodigo, vestDesc, vestQuant, tamanho);
    }

}
