package university.request.teacher;

public class EditTeacherRequest {
    private long teacherId;
    private String lastName;
    private String firstName;
    private String patronymic;

    public EditTeacherRequest(long teacherId, String lastName, String firstName, String patronymic) {
        setTeacherId(teacherId);
        setLastName(lastName);
        setFirstName(firstName);
        setPatronymic(patronymic);
    }

    public long getTeacherId() {
        return teacherId;
    }

    private void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }//??

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
}
