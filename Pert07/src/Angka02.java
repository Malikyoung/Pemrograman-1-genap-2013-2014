package Pertemuan07a.bin;
public class Angka02
{
	public static void main(String[] Malik)
	{
		double Penyebut = 9;
		double Pembilang = 2;
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