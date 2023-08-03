import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaração de variáveis
        boolean idade = false;
        boolean deficiencia = false;
        boolean gestacao = false;
        int resposta1;
        int resposta2;
        int resposta3;

        //Pergunta numero 1
        System.out.println("Qual sua idade?");
        resposta1 = sc.nextInt();

        if (resposta1 >= 65){
            idade = true;
        }

        //Pergunta número 2
        System.out.println("Você possui algum tipo de deficiência?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        resposta2 = sc.nextInt();

        if (resposta2 == 1){
            deficiencia = true;
        } else if (resposta2 == 2) {
            deficiencia = false;
        } else {
            System.out.println("Opção inválida!");
        }

        //Pergunta número 3
        System.out.println("Você é gestante?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        resposta3 = sc.nextInt();

        if (resposta3 == 1){
            gestacao = true;
        } else if (resposta3 == 2) {
            gestacao = false;
        } else {
            System.out.println("Opção inválida!");
        }

        //Definindo para qual fila o cliente vai
        if (idade || deficiencia || gestacao){
            System.out.println("Por favor, siga-me! A fila preferêncial é por aqui!");
        } else {
            System.out.println("Olá! A fila comum para atendimento é aqui ao lado.");
        }

    }

}
