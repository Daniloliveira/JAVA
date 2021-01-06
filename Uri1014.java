import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X; // Distancia em KM
        float Y; // Consumo em Litros
        float ConsMed;
        
        X = teclado.nextInt();
        Y = teclado.nextFloat();
        
        ConsMed = X / Y;

        System.out.printf("%.3f km/l%n", ConsMed);
        
    }
}


//    
        