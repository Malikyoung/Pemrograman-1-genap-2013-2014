package Praktikum10d.bin;
public class Karyawan2 extends KomunitasPT2
{
	private int noKaryawan;
	private int Gapok;
	
	//Inisialisai
	Karyawan2 (String NAMA, String ALAMAT, String JK, int NONKARYAWAN, int GAPOK)
	{
		super (NAMA, ALAMAT, JK);
		//Memanggil konstruktor super kelas
		noKaryawan = NONKARYAWAN;
		Gapok = GAPOK;
	}
	//Menampilkan Nomor Karyawan dan Gaji pokok
	public void Tampilkan3()
	{
	System.out.println();
	System.out.println("Nomor karyawan = " +noKaryawan);
	System.out.println("Gaji Pokok     = " +Gapok);
	}
}
	