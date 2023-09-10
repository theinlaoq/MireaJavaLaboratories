package ru.mirea.lab2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class TestAuthor{
    public static void main(String[] args) {
        Author a1 = new Author("Alex", "alex@gmail.com", 'm');
        System.out.println(a1);
        a1.setEmail("newalex@mail.ru");
        System.out.println(a1);
        System.out.println("name: " + a1.getName() + ", email: "
                + a1.getEmail() + ", gender: " + a1.getGender());
    }
}
