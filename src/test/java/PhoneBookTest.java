import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest{
        @Test
        public void CheckAddsContact(){
                PhoneBook contactBook = new PhoneBook();
                contactBook.addContact("Viktoria", "Surina", "89321109765");
                System.out.println(contactBook);
                Assertions.assertFalse(contactBook.readAllContacts().isEmpty());//проверяет пустой ли список
                //утверждает, что является ложным.
                Assertions.assertEquals(1, contactBook.readAllContacts().size()); //проверяет, что там 1 элемент.
                //Сравнивает 2 значения.
                Assertions.assertTrue(contactBook.readAllContacts().stream()
                        .filter(contact -> contact.getName().equals("Viktoria") //фильтруем записи, будут только те, кот. подходят по условию
                        && contact.getSurname().equals("Surina")
                        && contact.getNumber().equals("89321109765"))
                        .findAny() //возвр любой подход элемент из стрима
                        .isPresent()); //существует ли объект

        }

}