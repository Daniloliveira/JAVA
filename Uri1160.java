import java.util.Scanner;

public class Uri1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int T, anos=0; //Numero de testes
        int PA; // Populaçao de A
        int PB; //Populacao de B
        double G1; // Crescimento populacional percentual A
        double G2; // Crescimento populacional percentual B

        T = teclado.nextInt();             
        for (int cont=1; cont <= T; cont++){
            PA = teclado.nextInt();
            PB = teclado.nextInt();  
            G1 = teclado.nextDouble();  
            G2 = teclado.nextDouble();   
            for (anos=0; PA  <= PB ; anos++){
                PA = (int)(PA * (1+(G1/100)));
                PB = (int)(PB * (1+(G2/100)));
                if (anos > 100){
                    break ;
                }
            }
            if (anos > 100 ){
                System.out.println("Mais de 1 seculo.");
            }
            else {
            System.out.println(anos + " anos.");
            }
        }
    }
}