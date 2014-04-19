//Praktikum02 - Soal nomor 5b
//Untuk Anatomi Aplikasi Java & Class Path
//Deklarasi Interface  --- PersonDao --- PersonDaoImpl

public interface PersonDao {
	void save (Person11 p);
	void delete(Person11 p);
	Person11 getById(Long id);
}