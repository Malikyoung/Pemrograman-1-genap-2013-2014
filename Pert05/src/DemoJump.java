package Pertemuan05i.bin;
import java.util.Random;

public class DemoJump
{
	public static void main(String[] Malik)
	{
		Integer faktor =7;
		System.out.println("Mencari kelipatan " +faktor + " dengan break");
		while(true)
		{
			Integer random = new Random().nextInt();
			System.out.println("Bilangan Random : " +random);
			
			if (random % faktor == 0)
			{
				System.out.println("Kelipatan " +faktor + " ditemukan, yaitu : " +random);
				break;
			}
		}
	}
}