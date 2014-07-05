package Praktikum11a.bin;

class TV01 implements Kontrol
{
	String[] LineTV = {"Net.tv", "Kompas TV", "Metro TV", "DAI TV", "TVOne"};
	//Implementasi method yang didapat dari interface
	public void PindahLine (int Line)
	{
		System.out.println("Memindahkan Line Pada TV01 ke : " +LineTV[Line]);
	}
	public void VolBesar (int Vol)
	{
		System.out.println("Memperbesar Suara TV01   : " +Vol);
	}
	public void VolKecil(int Vol)
	{
		System.out.println("Memperkecil suara TV01   ; " +Vol);
	}
}