package university.request.lessonNattendance;

public class DeleteLessonRequest {
    private long lessonId;

    public DeleteLessonRequest(long lessonId) {
        setLessonId(lessonId);
    }

    public long getLessonId() {
        return lessonId;
    }

    private void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }
}
