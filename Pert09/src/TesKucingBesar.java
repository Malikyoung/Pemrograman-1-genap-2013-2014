package Pertemuan09a.KucingBesar.bin;

public class TesKucingBesar {
	public static void main(String[] Malik){
		Singa mySinga = new Singa("SIMBARA SURAI");
		System.out.println("Singa merupakan " + Singa.nama);
		mySinga.Makan();
		
		Harimau myHarimau = new Harimau("HARIMAU SUMATRA");
		System.out.println("Harimau merupakan " + Harimau.nama);
		myHarimau.Makan();
	}
}