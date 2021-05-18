package besinciGunOdev.dataAccess.abstracts;

public interface UserDao {
	void add(int id , String firstName , String lastName, String mail, String password);
	void update(int id , String firstName , String lastName, String mail, String password);
	void delete(int id);
	void getById(int id);
}
