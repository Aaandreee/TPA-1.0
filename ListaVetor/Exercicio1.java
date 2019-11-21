import java.util.*;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[ ]= new int[10];
		int b[] = new int [10];
				
		for (int i=0;i<10;i++){
			System.out.println("Digite o " +(i+1)+ "° valor:");
			a[i] = ler.nextInt();
			b[i] = a[i] * a[i];
			System.out.println(b[i]);
		}
	}
}

