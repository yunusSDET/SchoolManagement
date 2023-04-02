package databases;

import person.Person;

public class Sql extends BaseDatabase{


    @Override
    public void add(Person person) {
        System.out.println(person.getFirstName()+" "+person.getLastName()+" kişisi eklendi "+getClass().getName());
    }

    @Override
    public void delete(Person person) {
        System.out.println(person.getFirstName()+" "+person.getLastName()+" kişisi silindi "+getClass().getName());
    }

    @Override
    public void update(Person person) {
        System.out.println(person.getFirstName()+" "+person.getLastName()+" kişisi güncellendi "+getClass().getName());
    }

    @Override
    public void read(Person person) {
        System.out.println(person.getFirstName()+" "+person.getLastName()+" kişi bilgileri getirildi "+getClass().getName());

    }


}
