package Praktikum10c.bin;
public class Karyawan extends KomunitasPT
{
	private int noKaryawan;
	private int Gapok;
	
	//Inisialisai
	Karyawan (String NAMA, String ALAMAT, String JK, int NONKARYAWAN, int GAPOK)
	{
		super (NAMA, ALAMAT, JK);
		//Memanggil konstruktor super kelas
		noKaryawan = NONKARYAWAN;
		Gapok = GAPOK;
	}
	//Menampilkan Nomor Karyawan dan Gaji pokok
	public void Tampilkan2()
	{
	System.out.println();
	System.out.println("Nomor karyawan = " +noKaryawan);
	System.out.println("Gaji Pokok     = " +Gapok);
	}
}
	