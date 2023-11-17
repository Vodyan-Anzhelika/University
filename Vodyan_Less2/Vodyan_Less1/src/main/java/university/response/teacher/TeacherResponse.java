package university.response.teacher;

import java.util.Objects;

public class TeacherResponse {
    private String firstname;
    private String lastname;
    private String patronymic;
    private long id;

    public TeacherResponse(String firstname, String lastname, String patronymic, long id) {
        setFirstname(firstname);
        setId(id);
        setLastname(lastname);
        setPatronymic(patronymic);
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
        if (!(o instanceof TeacherResponse that)) return false;
        return getId() == that.getId() && getFirstname().equals(that.getFirstname()) && getLastname().equals(that.getLastname()) && getPatronymic().equals(that.getPatronymic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getPatronymic(), getId());
    }
}
