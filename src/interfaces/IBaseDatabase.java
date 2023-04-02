package interfaces;

import person.Person;

public interface IBaseDatabase {

    void add(Person person);
    void delete(Person person);
    void  update(Person person);
    void read(Person person);




}
