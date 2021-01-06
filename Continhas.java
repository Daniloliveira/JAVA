public class Continhas{
    public static void main(String args[]){
        // Declarando Variaveis
        int a, b, c;
        a = 19;
        b = 3;
        c = a + b;

        System.out.println("Valor do a = " + a);
        System.out.println("Valor do b = " + b);
        System.out.println("Valor da Soma = " + c + "\n");
        System.out.println("Executando subtração de a e b");
        c = a - b ;
        System.out.println("Valor da Subtração = " + c + "\n");
        System.out.println("Executando a multiplicação de a e b");
        c = a * b ;
        System.out.println("Valor da Multiplicação = " + c + "\n");
        System.out.println("Executando a Divisão de a e b");
        c = a / b ;
        System.out.println("Valor da Subtração = " + c);
        c = a % b ;
        System.out.println("Valor do Resto = " + c);
    }
}