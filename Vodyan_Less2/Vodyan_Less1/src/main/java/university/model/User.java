package university.model;

import java.util.Objects;

public abstract class User {
    private long id;
    private String firstname;
    private String lastname;
    private String patronymic;

    public User(String firstname, String lastname, String patronymic) {
        setFirstname(firstname);
        setLastname(lastname);
        setPatronymic(patronymic);
    }

    public User(long id, String firstname, String lastname, String patronymic) {
        this(firstname,lastname,patronymic);
        setId(id);
    }

    public String getFirstname() {
        return firstname;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    private void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getId() == user.getId() && getFirstname().equals(user.getFirstname()) && getLastname().equals(user.getLastname()) && getPatronymic().equals(user.getPatronymic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstname(), getLastname(), getPatronymic());
    }
}
