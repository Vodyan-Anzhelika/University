package university.model;

import java.util.List;
import java.util.Objects;

public class Attendance {
    private Lesson lesson;
    private List<Student> studentList;
    private long id;

    public Attendance(Lesson lesson, List<Student> studentList) {
        setLesson(lesson);
        setStudentList(studentList);
    }

    public Attendance(Lesson lesson, List<Student> studentList, long id) {
        this(lesson, studentList);
        setId(id);
    }

    public Lesson getLesson() {
        return lesson;
    }

    private void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    private void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
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
        if (!(o instanceof Attendance)) return false;
        Attendance that = (Attendance) o;
        return getId() == that.getId() && Objects.equals(getLesson(), that.getLesson()) && Objects.equals(getStudentList(), that.getStudentList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLesson(), getStudentList(), getId());
    }
}
