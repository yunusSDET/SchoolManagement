package person.manager;

import interfaces.IPersonManagementDal;
import person.Person;

public class PersonManager implements IPersonManagementDal {

    public void add(Person person) {

        database.add(person);

    }

    public void delete(Person person) {
        database.delete(person);
    }

    public void update(Person person) {
        database.update(person);
    }

    public void read(Person person) {
        database.read(person);
    }


}
