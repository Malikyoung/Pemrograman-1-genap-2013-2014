package Praktikum10d.bin;

public class TesOverriding4
{
	public static void main(String[] Malik)
	{
		//Membuat objek kelas komunitasPT dan memanggil turunan serta fungsi lokal
		KomunitasPT2 DtJRS = new KomunitasPT2 ("Teknik Informatika", "Jakarta Selatan", "LK");
		Karyawan2 KA = new Karyawan2("Malik", "Depok", "Laki-Laki", 318, 2000000);
		System.out.println();
		DtJRS.Tampilkan3();
		KA.Tampilkan3();
	}
}