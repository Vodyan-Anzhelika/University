package university.request.lessonNattendance;

public class GetAttendanceByLessonRequest {
    private long lessonId;

    public GetAttendanceByLessonRequest(long lessonId) {
        setLessonId(lessonId);
    }

    public long getLessonId() {
        return lessonId;
    }

    public void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }
}