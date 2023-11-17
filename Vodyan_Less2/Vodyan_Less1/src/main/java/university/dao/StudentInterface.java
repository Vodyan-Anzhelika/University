package university.dao;

import university.model.Group;
import university.model.Lesson;
import university.model.Student;
import university.model.Teacher;

import java.util.List;

public interface StudentInterface {//Что он может делать?

    List<Lesson> getLessonListByStudent(Student student);

    List<Lesson> getLessonListByGroup(Group group);

    List<Lesson> getLessonListByTeacher(Teacher teacher);

    List<Lesson> getLessonListByGroupAndDate(Group group, String date);

    //.....
}
