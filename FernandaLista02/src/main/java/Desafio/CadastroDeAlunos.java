package Desafio;

import java.util.Scanner;

public class ListaAlunos {

    String[] alunos = new String[30];
    Double[][] notas = new Double[30][2];
    /* O Java não permitiu a iniciação de arrays vazios, por isso foi o usado o termo new String [30],
    isso faz com que a lista comece com 30 itens de valor null.
    Assim como o Double [30][2] Sendo 30 itens para armazenar 2 notas */

    int quantidadeDeAlunos = 0;
    int opcao;

    void menu() {
        Scanner scanner = new Scanner(System.in);
        while (opcao != 5) {
            System.out.println("\n Menu Principal");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Excluir aluno");
            System.out.println("3 - Inserir nota do aluno");
            System.out.println("4 - Imprimir lista de alunos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastraAluno();
                    break;
                case 2:
                    excluirAluno();
                    break;
                case 3:
                    inserirNotas();
                    break;
                case 4:
                    imprimirLista();
                    break;
                case 5:
                    System.out.println("Fechando Sistema.");
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }

        }
    }

    void cadastraAluno() {
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Digite nome do aluno:");
        nome = scanner.nextLine();

        if (nome.equals(" ")) {
            System.out.println("Nome inválido");
        } else {


            alunos[quantidadeDeAlunos] = nome;
            quantidadeDeAlunos++;
            //cadastra o aluno dentro do índice de acordo com a quantidade de alunos,
            //depois incrementa assim passando para o próximo índice.

            System.out.println("Aluno cadastrado com sucesso!");
        }
    }

    void excluirAluno() {
        Scanner scanner = new Scanner(System.in);
        int numeroDoAluno;

        if (quantidadeDeAlunos == 0) {
            System.out.println("Não há alunos cadastrados para excluir.");
            menu();
        } else {
            imprimirNumeroDosAlunos();
        }
        System.out.println("Digite o número do aluno que deseja excluir: ");
        numeroDoAluno = scanner.nextInt();

        if (numeroDoAluno >= 1 && numeroDoAluno <= quantidadeDeAlunos) {
            numeroDoAluno--; //Converte para o índice do array
            for (int i = numeroDoAluno; i < quantidadeDeAlunos - 1; i++) {
                alunos[i] = alunos[i + 1];
                notas[i] = notas[i + 1];
                /* Este loop pega a informação do índice que será excluído e substitui pela informação do próximo
                 * Por exemplo ele pega a informação do aluno 2, troca pelo do aluno 3.
                 * Consequentemente a informação do aluno 3, é trocada pelo aluno 4.
                 * E assim sucetivamente, até trocar o último item da lista*/

            }
            quantidadeDeAlunos--; //Diminui o índice da quantidade de alunos
            System.out.println("Aluno excluído com sucesso!");


        } else {
            System.out.println("Número de aluno inválido."); excluirAluno();
        }

    }

    void inserirNotas() {
        Scanner scanner = new Scanner(System.in);
        int numeroDoAluno;
        double nota1;
        double nota2;

        if (quantidadeDeAlunos == 0) {
            System.out.println("Não há alunos cadastrados para inserir notas.");
        } else {
            imprimirNumeroDosAlunos();
        }


        System.out.print("Digite o número do aluno que deseja inserir notas: ");
        numeroDoAluno = scanner.nextInt();

        if (numeroDoAluno >= 1 && numeroDoAluno <= quantidadeDeAlunos) {
            numeroDoAluno--; //Converte para o índice
            System.out.println("Digite nota 1 do aluno: ");
            nota1 = scanner.nextDouble();
            System.out.println("Digite nota 2 do aluno: ");
            nota2 = scanner.nextDouble();

            notas[numeroDoAluno][0] = nota1; //Inseri nota 1 no indice informado anteriormente na posição 0
            notas[numeroDoAluno][1] = nota2; //Inseri nota 2 no indice informado anteriormente na posição 1
            System.out.println("Notas inseridas com sucesso!");

        } else {
            System.out.println("Número do aluno inválido.");
        }
    }

    void imprimirLista () {
        double media;
        String situacaodoAluno;
        if (quantidadeDeAlunos == 0) {
            System.out.println("Não há alunos cadastrados para imprimir.");
        }

        /*Neste trecho o loop percorre o Array e imprimir o aluno de acordo com o indice [i]
         * e mapeia junto com as notas com o mesmo indice
         * Assim as notas salvas no indice 4 vão ser impressas junto como nome do aluno no indice 4 */

        System.out.println("\n Lista de Alunos");
        for (int i = 0; i < quantidadeDeAlunos; i++) {
            System.out.println("\n Aluno: " + alunos[i]);
            if (notas[i][0] == null || notas[i][1] == null) {
                System.out.println("Notas não inseridas");
            } else {
                media = (notas[i][0] + notas[i][1]) / 2;
                System.out.println("Nota 1: " + notas[i][0] + " | Nota 2: " + notas[i][1] + " | Média Final: " + media);

                if (media >= 5) {
                    situacaodoAluno = "Aprovado";
                } else {
                    situacaodoAluno = "Reprovado";
                }

                System.out.println("Situação do Aluno: " + situacaodoAluno);
            }
        }
    }
    void imprimirNumeroDosAlunos () {
        System.out.println("Alunos Cadastrados");
        for (int i = 0; i < quantidadeDeAlunos; i++) {
            System.out.println((i + 1) + "- " + alunos[i]);
            //Imprimi lista de alunos cadastrados para o usuário escolher qual deseja manipular.
        }


    }
}


