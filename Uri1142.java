import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        // N será o numero de Linhas
        int N, prim=1, seg, terc;
        N = teclado.nextInt();
        for (int cont=1; cont <= N; cont++){
                seg = prim + 1;
                terc = seg + 1;
                System.out.println(prim + " " + seg + " " + terc + " PUM");
                prim = terc + 2;
        }
    }
}