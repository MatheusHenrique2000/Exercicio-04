import java.util.Scanner;

public class App {

    
    public static void main(String args []) {
        // Requisito 1 Pedir 4 notas bimestrais 
        Scanner sc = new Scanner(System.in);
        // Pendindo 4 notas ao bimestre
        System.out.print("Entre com a primeira Nota: ");
        double  n1 = sc.nextDouble();
        System.out.println("");
        System.out.print("Entre com a segunda Nota: ");
        double n2 = sc.nextDouble();
        System.out.println("");
        System.out.print("Entre com a terceira Nota ");
        double n3 = sc.nextDouble();
        System.out.println("");
        System.out.print("Entre com a quarta Nota ");
        double n4 = sc.nextDouble();
        sc.close();

        // calcular e imprimir a média das notas
        double media = (n1 + n2 + n3 + n4)/4;
        System.out.print("A média das 4 notas é: " + media);
    
    }
} 