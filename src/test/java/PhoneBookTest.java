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

        }

}