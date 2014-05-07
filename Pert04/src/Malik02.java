package Praktikum02.bin;
//Tugas Praktikum 2 Variable dan Tipe data

public class Malik02{
	private String nama;
	public static void main (String [] Malik)	{
		Malik02 test;
		test = new Malik02(); //membuat constractor
		test.setNama ("andi");
		byte b = 100;
		short s = 100;
		
		Malik02 belajarVariable = test;
		belajarVariable.setNama("belajar variable");
		
		System.out.println(b + s); //penjumlahan variabel
		System.out.println("nama : " + test.getNama() + " " + b);
		}
		
		public void setNama(String aNama){
			this.nama = aNama;
		}
		//mendefinisikan method
		public String getNama(){
			return this.nama;
		}
	}
		
	