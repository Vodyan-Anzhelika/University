package university.model;


public class Teacher extends User {

    public Teacher(String firstname, String lastname, String patronymic) {
        super(firstname, lastname, patronymic);
    }

    public Teacher(long id, String firstname, String lastname, String patronymic) {
        super(id, firstname, lastname, patronymic);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
