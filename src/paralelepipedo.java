import java.util.Scanner;
public class paralelepipedo
{
 public static void main(String[] args) {
 Scanner ler= new Scanner(System.in);
 System.out.println("Escolha o número da opção desejada(tenha em mente que apenas números inteiros serão calculados).");
 System.out.println("1)Calcular Cubo");
 System.out.println("2)Calcular Paralelepipedo");
 System.out.println("3)Calcular Piramide");
 System.out.println("4)Calcular Cilindro");
 System.out.println("5)Calcular Cone");
 System.out.println("6)Calcular Esfera");
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
 break;
 case 2:
 System.out.println("Qual será calculado? 1-Área ou o 2-Volume?");
 num2=ler.nextInt();
 System.out.println("Qual o tamanho da aresta menor do paralelepipedo?");
 aresta=ler.nextFloat();
 System.out.println("Qual o tamanho da aresta maior do paralelepipedo?");
 float aresta2=ler.nextFloat();
 System.out.println("Qual a altura do paralelepipedo?");
 float altura=ler.nextFloat();
 switch(num2){
 case 1:
 System.out.println("A área do paralelepipedo é: "+((aresta*aresta2)+(aresta*altura)+(aresta2*altura))+"m²");
 break;
 case 2:
 System.out.println("O volume do paralelepipedo é "+(aresta*aresta2*altura)+"m³");
 }
 break;
 case 3:
 System.out.println("Qual será calculado? 1-Área ou o 2-Volume?");
 num2=ler.nextInt();
 System.out.println("Qual o tamanho da aresta da base da piramide?");
 aresta=ler.nextFloat();
 System.out.println("Qual é a altura da piramide?");
 altura=ler.nextFloat();
 System.out.println("Qual é a apotema da piramide?");
 float apotema=ler.nextFloat();
 switch(num2){
 case 1:
 System.out.println("O volume da piramide é "+((aresta*altura)/3)+("m³"));
 break;
 case 2:
 System.out.println("A área da piramide é: "+((Math.pow(aresta, 2)*altura)/3)+"m²");
 }
 break;
 case 4:
 System.out.println("Qual será calculado? 1-Área ou o 2-Volume?");
 num2=ler.nextInt();
 System.out.println("Qual é o raio do cilindro?");
 aresta=ler.nextFloat();
 System.out.println("Qual é a altura do cilindro?");
 altura=ler.nextFloat();
 switch(num2){
 case 1:
 System.out.println("A área do cilindro é: "+(((6.28*aresta)*altura)+(Math.pow(aresta, 2)*3.14)*2)+"m²");
 break;
 case 2:
 System.out.println("O volume do cilindro é "+((Math.pow(aresta, 2)*3.14)*altura)+("m³"));
 }
 break;
 case 5:
 System.out.println("Qual será calculado? 1-Área ou o 2-Volume?");
 num2=ler.nextInt();
 System.out.println("Qual é o raio do seu cone?");
 aresta=ler.nextFloat();
 System.out.println("Qual é a geratriz do cone?");
 altura=ler.nextFloat();
 switch(num2){
 case 1:
 System.out.println("A área do cone é: "+((Math.pow(aresta, 2)*3.14)+(3.14*altura*aresta))+"m²");
 break;
 case 2:
 System.out.println("Qual é a altura do cone?");
 float altura1=ler.nextFloat();
 System.out.println("O volume do cone é "+(((Math.pow(aresta, 2)*3.14)*altura1)/3)+("m³"));
 }
 break;
 case 6:
 System.out.println("Qual será calculado? 1-Área ou o 2-Volume?");
 num2=ler.nextInt();
 System.out.println("Qual é o raio da esfera?");
 aresta=ler.nextFloat();
 switch(num2){
 case 1:
 System.out.println("O volume da esfera é "+(((Math.pow(aresta, 2)*3.14)/3)+("m³")));
 break;
 case 2:
 System.out.println("A área da esfera é: "+(((Math.pow(aresta, 2)*3.14)*4))+"m²");
 }
 }
 }
 
}
