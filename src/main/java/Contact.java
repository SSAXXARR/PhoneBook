public class Contact {
    private String name;
    private String surname;
    private String number;

    public Contact(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSurname(String surname) {
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
    public void checkName(){
        if(this.name.isBlank()){
            System.out.println("Вы ничего не ввели в поле имя :(");
        }
    }
    public void checkSurame(){
        if(this.surname.isBlank()){
            System.out.println("Вы ничего не ввели в поле фамилия :(");
        }
    }
    public void checkNumber(){
        if(this.number.isBlank()){
            System.out.println("Вы ничего не ввели в поле номер :(");
        }
        if(this.number.length() > 12){
            System.out.println("Введено много цифр");
        }
        if (this.number.length() < 11){
            System.out.println("Не хватает цифр");
        }
    }

}
