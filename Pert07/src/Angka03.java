package Pertemuan07b.bin;
public class Angka03
{
	public static void main(String[] Malik)
	{
		int Penyebut = 9;
		int Pembilang = 0;
		try
		{
			System.out.println("Hasil pembagiannya adalah " + Penyebut/Pembilang);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Pembagian dengan angka 0...");
		}
		System.out.println("Selesai");
	}
}