package university.request.lessonNattendance;

public class EditLessonRequest {
    private long lessonId;
    private String date;
    private int numberLesson;
    private long teacherId;
    private long groupId;

    public EditLessonRequest(long lessonId, String date, int numberLesson, long teacher, long group) {
        setDate(date);
        setNumberLesson(numberLesson);
        setLessonId(lessonId);
        setGroupId(group);
        setTeacherId(teacher);
    }

    public long getLessonId() {
        return lessonId;
    }

    private void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }

    public String getDate() {
        return date;
    }

    private void setDate(String date) {
        this.date = date;
    }

    public int getNumberLesson() {
        return numberLesson;
    }

    private void setNumberLesson(int numberLesson) {
        this.numberLesson = numberLesson;
    }

    public long getTeacherId() {
        return teacherId;
    }

    private void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public long getGroupId() {
        return groupId;
    }

    private void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
