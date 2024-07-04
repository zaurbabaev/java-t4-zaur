package az.edu.itbrains.lesson6;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;
    private int point;

    private String cardNumber;

    public String getCardNumber() {
        StringBuilder builder = new StringBuilder(cardNumber);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < builder.length(); i++) {
            if (i > 3 && i < 12) {
                result.append("*");
            } else {
                result.append(builder.charAt(i));
            }
        }
        return result.toString();
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


    public String hesabla() {
        if (point >= 51) {
            return name + " imtahandan keçdiniz";
        }
        return name + " kəsildiniz";
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", point=" + point +
                '}';
    }
}
