//Perintah Inheritance
package Praktikum09e.bin;
class Mobil
{
	private String Jenis; //Merupakan variabel superkelas
	
	//constructor superkelas
	public Mobil (String aTipe)
	{
		Jenis = new String (aTipe);
	}
	public String JenisMobil()
	{
		return "Merupakan Jenis Mobil = " +Jenis;
	}
}