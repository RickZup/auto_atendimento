package br.com.catalisa.auto_atendimento;

import java.util.Scanner;

public class Totem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("==== Menu Inicial ====");
            System.out.println("1. Criar Pedido");
            System.out.println("2. Ver pedido");
            System.out.println("3. Adicionar Item ao Pedido");
            System.out.println("4. Remover Item do Pedido");
            System.out.println("5. Atualizar Quantidade do Item");
            System.out.println("6. Finalizar Pedido");
            System.out.println("0. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    break;
                case 2:
                    // Lógica para adicionar item ao pedido
                    break;
                case 3:
                    // Lógica para remover item do pedido
                    break;
                case 4:
                    // Lógica para atualizar quantidade do item
                    break;
                case 5:
                    // Lógica para finalizar pedido
                    break;
                case 6:
                    //
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

