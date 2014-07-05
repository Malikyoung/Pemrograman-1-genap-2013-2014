package Pertemuan09c.bin;
public class Jawa extends SukuInd
{
	private double GAJI;
	public Jawa ( String Nama, String Alamat, String Hobby, String Pekerjaan) 
	{
		super(Nama, Alamat, Hobby, Pekerjaan);
	}
	public double getGAJI()
	{
		return GAJI;
	}
	public void setGAJI(double Gaji)
	{
		Gaji = Gaji;
	}

//Metode Overloading-Metode yang apabila parameternya berupa pecahan (versi 1?Pecahan)
	public String THR (double persen)	{
		if(persen > 5000000)
			return "Gaji ke 13 terlalu besar !!!!";
		else
			return "Gaji ke 13 sebesar " +persen*GAJI;
	}
//metode yang apabila parameternya berupa bil bulat (versi 2/bilbul)
	public String THR(long persen)	{
		if(persen > 5000000)
			return "Gaji ke 13 terlalu besar !!!!";
		else
			return "Gaji ke 13 sebesar " +persen*GAJI/100;
	}
}