import java.util.Scanner;

public class Exercicio03Qui {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do{
            System.out.print("Digite um valor inteiro\n> ");
            num = entrada.nextInt();
            if(num <= 0){
                break;
            }
            System.out.println("O valor é " + num);
            System.out.println("O quadrado de " + num + " é " + (num * num));
            System.out.println("O cubo de " + num + " é " + (num * num * num));
            System.out.println("A raiz quadrada de " + num + " é " + Math.sqrt(num));
        }while(num > 0);
        
        entrada.close();

    }
}
