package rodriguez.manuel.databaseconnection;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PersonDAO {

    @Insert
    public void addPerson(Person person);
    @Delete
    public void updatePerson(Person person);
    @Update
    public void deletePerson(Person person);

    @Query("SELECT * FROM person")
    public List<Person> getAllPerson();

    @Query("SELECT * FROM person WHERE person_id = :person_id")
    public Person getPerson(int person_id);
}
