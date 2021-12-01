import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            answerT(scan);
            String answer = scan.next();
            if (answer.equals("нет") || answer.equals("Нет")) {
                scan.close();
                break;
            } else if (answer.equals("да") || answer.equals("Да")) {

            } else {
                System.out.println("некоректный ответ");
                scan.close();
                break;
            }

        }
    }


    public static void answerT(Scanner scan){
        System.out.println("Введите имя нового контакта: ");
        String name = scan.next();
        System.out.println("Введите фимилию нового контакта: ");
        String surname = scan.next();
        System.out.println("Введите номер нового контакта: ");
        String number = scan.next();
        System.out.printf("Вы хотите ввести в контакты: %s %s %s ?\n", name, surname, number);
        String answer = scan.next();
        if(answer.equals("да") || answer.equals("Да")){
            PhoneBook book = new PhoneBook();
            book.addContact(name, surname, number);
            System.out.println("Данные успешно занесены в телефонную книгу");
            System.out.println("Хотите занести еще один контакт? : ");

        }
        else{
            scan.close();
        }
    }



}
