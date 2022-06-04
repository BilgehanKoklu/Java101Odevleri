package notOrtalamasiHesapla;
import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int mat, fiz, kim, tur, tar, muz, toplam;
		double ort = 0;
		boolean sinifGecti;
		String gecti ="";

		System.out.print("Matematik Notunuz : ");
		mat=sc.nextInt();

		System.out.print("Fizik Notunuz : ");
		fiz= sc.nextInt();
		
		System.out.print("Kimya Notunuz : ");
		kim=sc.nextInt();
		
		System.out.print("Turkce Notunuzu : ");
		tur= sc.nextInt();
		
		System.out.print("Tarih Notunuzu : ");
		tar= sc.nextInt();
		
		System.out.print("Muzik Notunuz : ");
		muz= sc.nextInt();
		
		toplam = (mat+fiz+kim+tur+tar+muz);
		 
		ort = toplam/6;
		
		sinifGecti = ort> 59;
		
		System.out.println("Ortalamaniz : " + ort);
			
		gecti = sinifGecti ? "Sınıfı Geçti" : "Sınıta Kaldı";
		
		System.out.print(gecti);
		
		
		

	}

}
