import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest{
        PhoneBook contactBook; //создан непроинициализированный.
        @BeforeAll
        public  static void printTxt(){
                System.out.println("Test run"); //запустится перед началом теста.
        }
        @BeforeEach
        public void setup(){
                contactBook = new PhoneBook(); // создастся для каждого метода своя.
        }

        @Test
        public void CheckAddsContact(){
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

        @Test
        @DisplayName("The contact has not been created, the \"surname\" variable is null")
        public void chekSurnameRuntimeException(){
                Assertions.assertThrows(RuntimeException.class, () ->
                {contactBook.addContact("Vika", null, "89321109765");
                });
        }

        @Test
        @DisplayName("The contact has not been created, the \"name\" variable is null")
        public void chekNameRuntimeException(){
                Assertions.assertThrows(RuntimeException.class, () ->
                {contactBook.addContact(null, "Surina", "89321109765");
                });
        }

        @Test
        @DisplayName("The contact has not been created, the \"number\" variable is null")
        public void chekNumberRuntimeException(){
                Assertions.assertThrows(RuntimeException.class, () ->
                {contactBook.addContact("Vika", "Surina", null);
                });
        }
        @AfterEach
        public void after(){
                System.out.println("AfterEach message");
        }
        @AfterAll
        public static void afterAll(){
                System.out.println("AfterAll message");
        }


}