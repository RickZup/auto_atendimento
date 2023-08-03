import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroDigitado;

        System.out.println("Digite um número!");
        numeroDigitado = sc.nextInt();

        if (numeroDigitado == 0){
            System.out.println("O número digitado é zero!");
        } else if (numeroDigitado % 2 != 0) {
            System.out.println("O número digitado é impar!");
        } else {
            System.out.println("O número digitado é par!");
        }

    }

}
