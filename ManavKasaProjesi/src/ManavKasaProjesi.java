import java.util.Scanner;

public class ManavKasaProjesi {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in); 
		
		int a , e , d , m , p;
		double toplam;
		System.out.println("armut ka� kilo: ");
		
		a= input.nextInt();
		
		System.out.println("elma ka� kilo: ");
		
		e= input.nextInt();
		
		System.out.println("domates ka� kilo: ");
		
		d= input.nextInt();
		
		System.out.println("muz ka� kilo: ");
		
		m= input.nextInt();
		
		System.out.println("patl�can ka� kilo: ");
		
		p= input.nextInt();
		
		toplam=((a*2.14) + (e*3.67) + (d*1.11) + (m*0.95) + (p*5));
		
		System.out.println("toplam �cret: " + toplam);
		
		
	}

}
