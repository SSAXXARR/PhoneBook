
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PhoneBook {
    Map<String, Contact> map = new ConcurrentHashMap<String, Contact>();

    public void addContact(String name, String surname, String number ){
        Contact contact = new Contact(name, surname, number);
        validateContact(contact);
        map.put(generateKey(contact), contact);
    }

    @Override
    public String toString() {
        return String.valueOf(map);
    }

    public Collection<Contact> readAllContacts(){ //возвращает все контакты, которые есть в карте.
        return map.values();
    }

    private void validateContact(Contact contact){
        contact.checkName();
        contact.checkSurname();
        contact.checkNumber();
    }

    private String generateKey(Contact contact) { //генератор ключа.
        return String.format("%s-%s", contact.getName(), contact.getSurname());
    }
}







