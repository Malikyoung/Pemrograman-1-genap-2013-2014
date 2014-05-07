package Pertemuan06b.bin;

public class Dosen
{
	String nama;
	String email;
	
	//begitu kita mendefinisikan construktor
	//java tidak akan membuatkan default constructor
	
	public Dosen(String nama, String email)
	{
		this.nama = nama;
		this.email= email;
	}
	//tidak otomatis dibuatkan oleh java
	//bila dibutuhkan kita harus buat sendiri
	public Dosen()	{}
	
	//method
	public void info()
	{
		System.out.println("Nama Dosen	: " +nama);
		System.out.println("Email Dosen	: " +email);
		System.out.println();
		System.out.println();
	}
}