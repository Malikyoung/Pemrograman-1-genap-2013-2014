package Praktikum11a.bin;

class User
{
	public static void main(String[] Malik)
	{
		//Membuat objek dari class
		TV02 tv02 = new TV02();
		TV01 tv01 = new TV01();
		Remote RM = new Remote();
		
		//mengirimkan perintah ke Net.tv & MNCTV
		System.out.println();
		RM.PerintahTV(Remote.PINDAHLINE, tv01, 1);
		RM.PerintahTV(Remote.VOLBESAR, tv01,6);
		System.out.println();
		RM.PerintahTV(Remote.PINDAHLINE, tv02, 3);
		RM.PerintahTV(Remote.VOLKECIL, tv02,3);
		System.out.println();
	}
}