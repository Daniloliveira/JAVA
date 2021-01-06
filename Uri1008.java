import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numfunc, numhoras;
        double valorhora, salary;
        numfunc = teclado.nextInt();
        numhoras = teclado.nextInt();
        valorhora = teclado.nextDouble();
        salary = numhoras * valorhora ;
        System.out.println("NUMBER = " + numfunc);
        System.out.printf("SALARY = U$ %.2f%n",salary);
    }
}