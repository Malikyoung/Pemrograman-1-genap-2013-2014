package Praktikum09d.bin;
class PajakApply
{
	public static void main(String[] Malik)
	{
		Pajak PJK = new Pajak(); //Membuat Obyek
		PJK.Pendapatan = 6000000; //Memberikan nilai
		PJK.Propinsi = "Jawa Timur";
		PJK.Kota = "Mojosari-Mojokerto";
		double PajakAnda = PJK.HitungPajak(); //Menghitung Pajak
		
		PajakProp PJK01 = new PajakProp();
		double PajakAndaProp = PJK01.HitungPjkProp(PajakAnda);
		
		//Menampilkan Data Pajak
		System.out.println("Besar Pajak Anda sebesar Rp.    " +PajakAnda);
		System.out.println("Anda berada di propinsi         " +PJK.Propinsi);
		System.out.println("Anda di kota                    " +PJK.Kota);
		System.out.println("Potongan Pajak Anda sebesar Rp. " +PajakAndaProp);
	}
}