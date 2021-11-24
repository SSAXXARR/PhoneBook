import java.util.Arrays;

public class Contact {
    private String name;
    private String surname;
    private String number;

    public Contact(String name, String surname, String number) {
        setName(name);
        setSurname(surname);
        setNumber(number);
        getName();
        getSurname();
        getNumber();
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", номер телефона: " + number;
    }

    public void checkName(){
        if(this.name.isBlank()){
            throw new RuntimeException("Вы ничего не ввели в поле \"Имя\"");
        }
    }
    public void checkSurname(){
        if(this.surname.isBlank()){
            throw new RuntimeException("Вы ничего не ввели в поле \"Фамилия\"");
        }
    }
    public void checkNumber(){
        if(this.number.isBlank()){
            throw new RuntimeException("Вы ничего не ввели в поле \"Номер\"");
        }
        if(this.number.length() > 12){
            throw new RuntimeException("Введено много цифр");
        }
        if (this.number.length() < 11){
            throw new RuntimeException("Введено мало цифр");
        }
    }

}
