
import java.util.HashMap;

public class PhoneBook {
    HashMap<String, Contact> map = new HashMap<>();

    public void addContact(String name, String surname, String number ){
        Contact contact = new Contact(name, surname, number);
        contact.checkName();
        contact.checkSurame();
        contact.checkNumber();
        map.put("name", contact);


    }




}
