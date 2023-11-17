package university.model;

import java.util.Objects;

public class Student extends User {
    private StudentStatus status;
    private Group group;

    public Student(String firstname, String lastname, String patronymic, StudentStatus status, Group group) {
        super(firstname, lastname, patronymic);
        setStatus(status);
        setGroup(group);
    }
    public Student(String firstname, String lastname, String patronymic, StudentStatus status, Group group, long id) {
        super(id, firstname, lastname, patronymic);
        setStatus(status);
        setGroup(group);
    }

    public StudentStatus getStatus() {
        return status;
    }

    private void setStatus(StudentStatus status) {
        this.status = status;
    }

    public Group getGroup() {
        return group;
    }

    private void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getStatus() == student.getStatus() && getGroup().equals(student.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus(), getGroup());
    }
}



