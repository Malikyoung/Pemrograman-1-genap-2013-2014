package Pertemuan05j.bin;
import java.util.Random;

public class DemoJump2 {
	public static void main (String[] Malik)	{
		Integer faktor = 7;
		Integer jumlahFaktorDiinginkan = 4;
		Integer batasAtas = 1000000;
		System.out.println("Mencari kelipatan " +faktor + " dengan break dan Continue");
		Integer jumlahFaktorDitemukan = 0;
		while (true)	{
			Integer random = new Random().nextInt();
			System.out.println("Bilangan Random : " +random);
			if (random> batasAtas)	{
				System.out.println("Melewati batas atas, langsung selesai ");
				return;		}
			if(random % faktor == 0)	{
				System.out.println("kelipatan " +faktor + " ditemukan, yaitu : " +random);
				jumlahFaktorDitemukan++;
				if(jumlahFaktorDitemukan < jumlahFaktorDiinginkan)	{
					System.out.println("Baru menemukan " +jumlahFaktorDitemukan+ " Yang diminta, lanjut lagi");
					continue;	}
				else	{
					System.out.println("Sudah menemukan " +jumlahFaktorDiinginkan + " Selesai Looping");
					break;
					}	}	}
				System.out.println("selesai mencari kelipatan");	
	}	
}
