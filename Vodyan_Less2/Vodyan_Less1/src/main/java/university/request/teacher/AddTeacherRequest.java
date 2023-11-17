package university.request.teacher;

public class AddTeacherRequest {
    private String firstname;
    private String lastname;
    private String patronymic;

    public AddTeacherRequest(String firstname, String lastname, String patronymic) {
        setFirstname(firstname);
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
}
