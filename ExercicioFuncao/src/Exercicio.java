import java.util.*;
public class Exercicio {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);	
		int p;
		 
		System.out.println("insira qual exercicio você quer usar");
		p = ler.nextInt();
		
	switch(p){
	case 1:
	Fatorial();
	break;
	
	case 2:
	Tabuada();
	break;
	
	case 3:
	SexIda();
	break;
	
	case 4:
	Potencia();
	break;
	
	case 5:
	System.out.println("Adeus");
	break;
	
	default:
	System.out.println("SAIA,SAIA DO PROGRAMA");
	
	}}
	
	
	public static void SexIda() {
		Scanner ler=new Scanner(System.in);
		String sexo;
		int idade, sobra;
		
		System.out.println("insira a idade");
		idade = ler.nextInt();
		
		System.out.println("insira o sexo");
		sexo = ler.next();
		
		if(sexo.equals("m")){
			sobra = 65-idade;
			System.out.println(sobra);
			
		}
		else if(sexo.equals("f")){
			sobra = 60-idade;
			System.out.println(sobra);
		}
		
		else {
			System.out.println("ja estas aposentado ou não nasceu");
		}
		
		}
	
	public static void Fatorial() {
		Scanner ler=new Scanner(System.in);
		int n, f, i, r=0;
		
		System.out.println("Digite um numero para a fatoração");
		n = ler.nextInt();
		i = 0;
		while(i != n) {
						
		}
		System.out.println(r);
		}
	
	public static void Tabuada() {
		Scanner ler=new Scanner(System.in);
		int i, t, r;
		System.out.println("Digite um número");
		t=ler.nextInt();
		for(i=1; i<=10; i++) {
			r=t*i;
			System.out.println(t+"X"+i+" = "+r);
		}}
		
	public static void Potencia() {
			Scanner ler= new Scanner(System.in);
			int i = 0 ,b ,e ,r ;
			System.out.println("Digite uma base");
			b=ler.nextInt();
			System.out.println("digite o expoente");
			e=ler.nextInt();
			r=b;
			
			for(i=0;i<e;i++) {
				r=b*r;
			
			}
			System.out.println(r);
			
	}


}
