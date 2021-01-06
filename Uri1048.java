import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, novosalario, reajuste;
        salario = teclado.nextFloat();

        if ( salario <= 400.0f ){
            novosalario = salario * 1.15f;
            reajuste = salario * 0.15f;
            System.out.printf("Novo salario: %.2f%n",novosalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if  ( salario > 400.0f && salario <= 800.0f ){
            novosalario = salario * 1.12f;
            reajuste = salario * 0.12f;
            System.out.printf("Novo salario: %.2f%n",novosalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.println("Em percentual: 12 %");
        }
        else if  ( salario > 800.0f && salario <= 1200.0f ){
            novosalario = salario * 1.10f;
            reajuste = salario * 0.10f;
            System.out.printf("Novo salario: %.2f%n",novosalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.println("Em percentual: 10 %");
        }
        else if  ( salario > 1200.0f && salario <= 2000.0f ){
            novosalario = salario * 1.07f;
            reajuste = salario * 0.07f;
            System.out.printf("Novo salario: %.2f%n",novosalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.println("Em percentual: 7 %");
        }
        else if  ( salario > 2000.0f ){
            novosalario = salario * 1.04f;
            reajuste = salario * 0.04f;
            System.out.printf("Novo salario: %.2f%n",novosalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.println("Em percentual: 4 %");
        }

    }
}