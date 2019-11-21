import java.util.*;
public class Exercicio4{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a[],i,n;
        a = new int [11];
            for (i = 1;i<=10;i++) {
                System.out.println("Digite os valores");
                a[i] = ler.nextInt();
                
                for (n = 0;n<=a[i];n++) {
                    if (n % 2 == 0) {
                        
                        System.out.println(n);
                        
                    }
                }
            }
          
    }
}