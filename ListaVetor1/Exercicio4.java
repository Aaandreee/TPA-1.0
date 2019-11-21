import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[]= new int[7];
		int b[]= new int[7];
		int i=0;

		while (i<7){
			System.out.println("Digite o " +(i+1)+ " valor:");
			a[i] = ler.nextInt();
			i++;
		}
		i=0;
		while (i<7) {
			b[i] = a[i] * a[i];
			System.out.println(b[i] + " ");
			i++; 
		}
	}
}