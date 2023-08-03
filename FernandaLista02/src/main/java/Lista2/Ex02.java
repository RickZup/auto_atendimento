import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite um número:");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = sc.nextInt();

        if (numero1 > numero2){
            System.out.println(numero1 + " é o maior número!");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " é o maior número!");
        } else {
            System.out.println("Os números digitados são os mesmos!");
        }

    }

}
