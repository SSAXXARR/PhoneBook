
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PhoneBook {
    Map<String, Contact> map = new ConcurrentHashMap<String, Contact>();

    public void addContact(String name, String surname, String number ){
        Contact contact = new Contact(name, surname, number);
        contact.checkName();
        contact.checkSurname();
        contact.checkNumber();
        map.put("1", contact);
    }

    @Override
    public String toString() {
        return String.valueOf(map);
    }

    public Collection<Contact> readAllContacts(){ //возвращает все контакты, которые есть в карте.
        return map.values();
    }






}
