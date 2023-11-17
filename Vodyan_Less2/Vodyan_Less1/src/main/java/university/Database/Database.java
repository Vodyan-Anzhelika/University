package university.Database;

import university.model.*;

import java.util.List;
import java.util.Map;

public class Database {

    private Map<Long, User> userId;
    private Map<Group, List<Student>> studentGroup;
    private Map<Teacher, List<Lesson>> teacherLesson;
    private Map<Lesson, List<Attendance>> lessonAttendance;
    private List<Discipline> disciplineList;//кто это
}
