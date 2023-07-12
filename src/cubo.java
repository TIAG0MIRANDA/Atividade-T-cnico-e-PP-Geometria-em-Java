//T.M
import java.util.Scanner;
public class cubo
    {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite 1");
        System.out.println("1) Calcular Cubo");
        int num1=ler.nextInt();

    switch(num1){
    case 1:
        System.out.println("Qual será calculado? 1-Área ou o 2-Volume?");

        int num2=ler.nextInt();

        System.out.println("qual o tamanho da aresta do cubo?");

        float aresta=ler.nextFloat();
        
    switch(num2){
    case 1:
    System.out.println("A area do cubo é: "+(Math.pow(aresta, 2)*6)+"m²");
    break;
    case 2:
    System.out.println("O volume do cubo é "+Math.pow(aresta, 3)+"m³");
    }
    
    }
    }
 
}
