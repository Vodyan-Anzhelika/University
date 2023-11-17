package university.request.student;

import university.model.Group;

public class EditStudentRequest {
    private long studentId;
    private String lastName;
    private String firstName;
    private String patronymic;
    private long groupId;
    private StudentStatusRequest status;

    public EditStudentRequest(long studentId, String lastName, String firstName, String patronymic, long groupId, StudentStatusRequest status) {
        setStudentId(studentId);
        setFirstName(firstName);
        setLastName(lastName);
        setPatronymic(patronymic);
        setGroupId(groupId);
        setStatus(status);
    }

    public long getStudentId() {
        return studentId;
    }

    private void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    private void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public long getGroupId() {
        return groupId;
    }

    private void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public StudentStatusRequest getStatus() {
        return status;
    }

    private void setStatus(StudentStatusRequest status) {
        this.status = status;
    }
}
