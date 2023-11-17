package university.model;

import java.util.Objects;

public class Lesson {
    private String date;
    private int numberLesson;
    private Teacher teacher;
    private Group group;
    private long id;

    public Lesson(String date, int numberLesson, Teacher teacher, Group group) {
        setDate(date);
        setNumberLesson(numberLesson);
        setTeacher(teacher);
        setGroup(group);
    }

    public Lesson(String date, int numberLesson, Teacher teacher, Group group, long id) {
        this(date, numberLesson, teacher, group);
        setId(id);
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

    public Teacher getTeacher() {
        return teacher;
    }

    private void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group getGroup() {
        return group;
    }

    private void setGroup(Group group) {
        this.group = group;
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
        if (!(o instanceof Lesson)) return false;
        Lesson lesson = (Lesson) o;
        return getNumberLesson() == lesson.getNumberLesson() && getId() == lesson.getId() && Objects.equals(getDate(), lesson.getDate()) && Objects.equals(getTeacher(), lesson.getTeacher()) && Objects.equals(getGroup(), lesson.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getNumberLesson(), getTeacher(), getGroup(), getId());
    }
}
