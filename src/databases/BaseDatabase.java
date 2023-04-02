package databases;

import interfaces.IBaseDatabase;
import person.Person;


public class BaseDatabase implements IBaseDatabase {

    public  BaseDatabase() {


    }

    public  IBaseDatabase  getDatabase(){
        return new MySql();
    }

    @Override
    public void add(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void read(Person person) {

    }
}
