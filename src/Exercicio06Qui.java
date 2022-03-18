import java.util.Scanner;

public class Exercicio06Qui {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        double media_geral = 0;

        for(int num=1; num <= 6; num++){
            do{
                System.out.print("Digite a primeira nota do aluno " + num + "\n> ");
                n1 = entrada1.nextInt();
            }while(n1 < 0 || n1 > 10);
            do{
                System.out.print("Digite a segunda nota do aluno " + num + "\n> ");
                n2 = entrada2.nextInt();
            }while(n2 < 0 || n2 > 10);
            double media = (n1+n2) / 2.0;
            media_geral += media;
            if(media <= 3){
                System.out.println("REPROVADO");
            }
        }

        System.out.println("A média da turma é " + (media_geral / 5));

        entrada1.close();
        entrada2.close();
    }
}
