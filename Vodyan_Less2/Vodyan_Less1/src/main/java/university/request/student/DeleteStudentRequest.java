package university.request.student;

public class DeleteStudentRequest {
    private long studentId;

    public DeleteStudentRequest(long studentId) {
        setStudentId(studentId);
    }

    public long getStudentId() {
        return studentId;
    }

    private void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
