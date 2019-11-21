import java.util.*;
public class Exercicio5{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[],i,d;
	    a = new int [11];
		for (i = 1;i<=10;i++) {
			System.out.println("Digite os valores");
			a[i] = ler.nextInt();
			
			for (d = 1;d<=a[i];d++) {
				if (a[i] % d == 0) {
					
					System.out.println(d);
					
				}
		    }
		}
    }
}

        