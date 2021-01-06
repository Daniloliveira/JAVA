import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num,qtdeimpares=0;
        num = teclado.nextInt();             

        for (int cont=1; cont <= num; cont++){ 
            if (cont % 2 != 0){
                System.out.println(cont);
            }
        }
    }
}