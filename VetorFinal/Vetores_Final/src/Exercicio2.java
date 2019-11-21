import java.util.*;
public class Exercicio2{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[],i,resultado,resultado2,resultado3,resultado4,resultado5;
        a = new int [6];
        
		for (i = 1;i<=5;i++) {
			System.out.println("Digite os valores");
			a[i] = ler.nextInt();
		}
		
		
		for (i = 1;i<=10;i++) {
			resultado = a[1] * i;
			System.out.println("A Tabuado do 1º indice é:" +resultado);
		}
		for (i = 1;i<=10;i++) {
			resultado2 = a[2] * i;
			System.out.println("A Tabuado do 2º indice é:" +resultado2);
		}
		for (i = 1;i<=10;i++) {
			resultado3 = a[3] * i;
			System.out.println("A Tabuado do 3º indice é:" +resultado3);
		}
		for (i = 1;i<=10;i++) {
			resultado4 = a[4] * i;
			System.out.println("A Tabuado do 4º indice é:" +resultado4);
		}
		for (i = 1;i<=10;i++) {
			resultado5 = a[5] * i;
			System.out.println("A Tabuado do 5º indice é:" +resultado5);
		}
    }
}