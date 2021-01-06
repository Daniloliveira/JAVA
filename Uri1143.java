import java.util.Scanner;

public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;
        N = teclado.nextInt();             
        for (int cont=1; cont <= N; cont++){ 
            System.out.println(cont + " " + (cont * cont) + " " +  (cont*cont*cont));
        }
    }
}
