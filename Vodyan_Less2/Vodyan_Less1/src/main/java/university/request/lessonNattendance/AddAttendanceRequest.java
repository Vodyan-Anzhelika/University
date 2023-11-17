package university.request.lessonNattendance;

public class AddAttendanceRequest {
    private long lessonId;
    private long studentId;

    public AddAttendanceRequest(long lessonId, long studentId) {
        setLessonId(lessonId);
        setStudentId(studentId);
    }

    public long getLessonId() {
        return lessonId;
    }

    private void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }

    public long getStudentId() {
        return studentId;
    }

    private void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
