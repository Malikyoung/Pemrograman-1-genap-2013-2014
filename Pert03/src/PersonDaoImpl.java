//Praktikum02 - Soal nomor 5c
//Untuk Anatomi Aplikasi Java & Class Path
//Deklarasi Interface  --- PersonDao --- PersonDaoImpl

public class PersonDaoImpl implements PersonDao {
	public void save (Person11 p) {
		System.Out.println("Menyimpan Person11");
	}
	public void delete(Person11 p)	{
		System.out.println("Menghapus Person11");
	}
	public Person11 getById(Long id)	{
		Person11 p = new Person11();
		p.setId(Id);
		p.setNama("Malik");
		return p;
	}
}