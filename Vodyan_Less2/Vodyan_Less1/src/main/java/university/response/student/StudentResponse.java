package university.response.student;

import java.util.Objects;

public class StudentResponse {
    private String firstname;
    private String lastname;
    private String patronymic;
    private StudentStatusResponse status;
    private long groupId;
    private long id;

    public StudentResponse(String firstname, String lastname, String patronymic, StudentStatusResponse status, long groupId, long id) {
        setFirstname(firstname);
        setLastname(lastname);
        setPatronymic(patronymic);
        setStatus(status);
        setId(id);
        setGroupId(groupId);
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

    public StudentStatusResponse getStatus() {
        return status;
    }

    private void setStatus(StudentStatusResponse status) {
        this.status = status;
    }

    public long getGroupId() {
        return groupId;
    }

    private void setGroupId(long groupId) {
        this.groupId = groupId;
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
        if (!(o instanceof StudentResponse that)) return false;
        return getGroupId() == that.getGroupId() && getId() == that.getId() && getFirstname().equals(that.getFirstname()) && getLastname().equals(that.getLastname()) && getPatronymic().equals(that.getPatronymic()) && getStatus() == that.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getPatronymic(), getStatus(), getGroupId(), getId());
    }
}
