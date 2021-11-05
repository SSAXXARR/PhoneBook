public class TestContact {
    public static void main(String[] args) {
        Contact contact = new Contact("Vika", "Surina", "89321109732");

        System.out.println(contact.getName());
        System.out.println(contact.getSurname());
        System.out.println(contact.getNumber());
        PhoneBook book = new PhoneBook();
        book.addContact(contact.getName(), contact.getSurname(), contact.getNumber());
        System.out.println(book.map.get("name"));
    }
}
