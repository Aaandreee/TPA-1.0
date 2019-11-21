import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int i=0;

		while(i<5){
			a[i] = ler.nextInt();
			i++;
		}
		i=0;
		while(i<5){
			b[i] = ler.nextInt();
			i++;
		}
		i=0;
		while (i<5) {
			System.out.print(a[i] +" ");
			i++;
		}
		i=0;
		while (i<5) {
			System.out.print(b[i] +" ");
			i++;
		}
	}
}