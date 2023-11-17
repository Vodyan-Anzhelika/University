package university.request.student;

public class GetStudentByIdRequest {
    private long studentId;

    public GetStudentByIdRequest(long studentId) {
        setStudentId(studentId);
    }

    public long getStudentId() {
        return studentId;
    }

    private void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
