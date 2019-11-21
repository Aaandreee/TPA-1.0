import java.util.*;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[]= new int[10];
		int b[] = new int [10];
		int i=0;
		
		for (i=0;i<10;i++){
			System.out.println("Digite o " +(i+1)+ "° valor:");
			a[i] = ler.nextInt();
			}
		i = 10;
		while(i>10) {	
			
			b[i] = a[i];
			System.out.println(b[i]);
			i--;
		}
		
	
	}
}
