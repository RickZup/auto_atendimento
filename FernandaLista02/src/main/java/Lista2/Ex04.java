import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade;
        int resposta;
        boolean acompnhado = false;

        System.out.println("Olá, seja bem-vindo! Qual a sua idade?");
        idade = sc.nextInt();

        if (idade < 16){
            System.out.println("Sentimos muito, a entrada para pessoas abaixo de 16 anos não é permitida.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Você está acompanhado?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            resposta = sc.nextInt();

            if (resposta == 1){
                System.out.println("Que ótimo, espero que aproveitem o evento.");
            } else {
                System.out.println("Infezliemnte com a sua idade e sem acompanhamento não podemos permitir sua entrada.");
            }

        } else {
            System.out.println("É um prazer recebermos você, espero que o evento seja proveitoso!");
        }


    }

}
