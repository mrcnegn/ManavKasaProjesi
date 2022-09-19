import java.util.Scanner;

public class ManavKasaProjesi {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in); 
		
		int a , e , d , m , p;
		double toplam;
		System.out.println("armut kaç kilo: ");
		
		a= input.nextInt();
		
		System.out.println("elma kaç kilo: ");
		
		e= input.nextInt();
		
		System.out.println("domates kaç kilo: ");
		
		d= input.nextInt();
		
		System.out.println("muz kaç kilo: ");
		
		m= input.nextInt();
		
		System.out.println("patlýcan kaç kilo: ");
		
		p= input.nextInt();
		
		toplam=((a*2.14) + (e*3.67) + (d*1.11) + (m*0.95) + (p*5));
		
		System.out.println("toplam ücret: " + toplam);
		
		
	}

}
