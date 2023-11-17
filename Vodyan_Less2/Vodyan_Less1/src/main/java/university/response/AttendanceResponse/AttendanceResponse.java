package university.response.AttendanceResponse;

import java.util.List;
import java.util.Objects;

public class AttendanceResponse {
    private List<Integer> studentIdList;
    private long id;
    private long lessonId;

    public AttendanceResponse(List<Integer> studentIdList, long id, long lessonId) {
        setLessonId(lessonId);
        setId(id);
        setStudentIdList(studentIdList);
    }

    public List<Integer> getStudentIdList() {
        return studentIdList;
    }

    private void setStudentIdList(List<Integer> studentIdList) {
        this.studentIdList = studentIdList;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public long getLessonId() {
        return lessonId;
    }

    private void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttendanceResponse that)) return false;
        return getId() == that.getId() && getLessonId() == that.getLessonId() && getStudentIdList().equals(that.getStudentIdList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentIdList(), getId(), getLessonId());
    }
}
