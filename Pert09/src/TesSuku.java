//Perintah Inheritance -- Kelas turunannya

package Pertemuan09c.bin;
public class TesSuku	{
	public static void main (String [] Malik)	{
	SukuInd SI = new SukuInd("Tiara", "Jakarta", "Nonton", "Direktur");
	System.out.println("Nama          : " +SI.getNAMA());
	System.out.println("Alamat        : " +SI.getALAMAT());
	System.out.println("Hobby         : " +SI.getHOBBY());
	System.out.println("Pekerjaan     : " +SI.getPEKERJAAN());
	System.out.println();
	System.out.println();
	
	Sunda SD = new Sunda("Sekar Arum", "Bogor", "Menyanyi", "Manager");
	System.out.println("Nama          : " +SD.getNAMA());
	System.out.println("Alamat        : " +SD.getALAMAT());
	System.out.println("Hobby         : " +SD.getHOBBY());
	System.out.println("Pekerjaan     : " +SD.getPEKERJAAN());
	System.out.println();
	System.out.println();
	
	Batak BT = new Batak("Cinthya", "Medan", "Menari", "Marketing");
	System.out.println("Nama          : " +BT.getNAMA());
	System.out.println("Alamat        : " +BT.getALAMAT());
	System.out.println("Hobby         : " +BT.getHOBBY());
	System.out.println("Pekerjaan     : " +BT.getPEKERJAAN());
	System.out.println();
	System.out.println();
	
	//bilangan bulat
	Jawa JWa = new Jawa("Shakila", "Jepara", "Melukis", "Sekretaris");
	System.out.println("Nama          : " +JWa.getNAMA());
	System.out.println("Alamat        : " +JWa.getALAMAT());
	System.out.println("Hobby         : " +JWa.getHOBBY());
	System.out.println("Pekerjaan     : " +JWa.getPEKERJAAN());
	System.out.println("Gaji          : Rp. " +JWa.getGAJI());
	System.out.println("Keterangan    : " +JWa.THR(30000));
	System.out.println();
	System.out.println();
	
	//bilangan pecahan
	Jawa JWb = new Jawa("Shakila", "Jepara", "Melukis", "Sekretaris");
	System.out.println("Nama          : " +JWb.getNAMA());
	System.out.println("Alamat        : " +JWb.getALAMAT());
	System.out.println("Hobby         : " +JWb.getHOBBY());
	System.out.println("Pekerjaan     : " +JWb.getPEKERJAAN());
	System.out.println("Gaji          : Rp. " +JWb.getGAJI());
	System.out.println("Keterangan    : " +JWb.THR(0.75));
	System.out.println();
	System.out.println();
	}
}