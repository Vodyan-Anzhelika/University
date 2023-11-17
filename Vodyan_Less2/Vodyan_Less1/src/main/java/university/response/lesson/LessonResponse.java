package university.response.lesson;

import java.util.Objects;

public class LessonResponse {
    private String date;
    private int numberLesson;
    private long teacherId;
    private long groupId;
    private long id;

    public LessonResponse(String date, int numberLesson, long teacherId, long groupId, long id) {
        setDate(date);
        setId(id);
        setGroupId(groupId);
        setTeacherId(teacherId);
        setNumberLesson(numberLesson);
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

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LessonResponse that)) return false;
        return getNumberLesson() == that.getNumberLesson() && getTeacherId() == that.getTeacherId() && getGroupId() == that.getGroupId() && getId() == that.getId() && getDate().equals(that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getNumberLesson(), getTeacherId(), getGroupId(), getId());
    }
}
