package Praktikum10b.bin;

abstract class Bentuk
{
	protected int a; //Nilai Panjang = a
	protected int b; //Nilai Lebar = b
	
	public String getBentuk()
	{
		return "BENTUK DARI SEGIEMPAT, LINGKARAN & SEGITIGA";
	}
	public abstract int HitungLuas();
}