package Praktikum09f.bin;
class Orang {
//atribut
	private String Nama = "";
	private int Umur;
	private String Alamat = "";
	private String Status = "";
	private String NoTlp = "";
	
	//metode - constructor
	public Orang (String NM, int UMR, String ALMT, String STS, String NT) {
	Nama = NM;
	Umur = UMR;
	Alamat = ALMT;
	Status = STS;
	NoTlp = NT;		}
	
	//Modifier
	public void setNama(String NM)	{
		this.Nama = NM;	}
	public void setUmur(int UMR) {
		this.Umur = UMR;	}
	public void setAlamat(String ALMT)	{
		this.Alamat = ALMT;	}
	public void setStatus(String STS)	{
		this.Status = STS;	}
	public void setNoTlp(String NT)	{
		this.NoTlp = NT;	}
		
	//Accessor
	public String getNama()	{
		return Nama;   }
	public int getUmur()	{
		return Umur;   }
	public String getStatus()	{
		return Status;   }
	public String getNoTlp()	{
		return NoTlp;   }
	public String Display()	 {
		return "Nama " +Nama+" -Umurnya " +Umur +" -Alamat " +Alamat+ " -Status " +Status + " -Nomer Telponnya " + NoTlp;  
		}
}