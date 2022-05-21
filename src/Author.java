public class Author {
    String name;
    String surname;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        return name + "" + surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
