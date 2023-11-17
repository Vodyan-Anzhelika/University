package university.request.lessonNattendance;

public class GetAttendanceByStudentRequest {
    private long studentId;

    public GetAttendanceByStudentRequest(long studentId) {
        setStudentId(studentId);
    }

    public long getStudentId() {
        return studentId;
    }

    private void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}