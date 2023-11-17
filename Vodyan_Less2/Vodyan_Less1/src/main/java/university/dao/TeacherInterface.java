package university.dao;

import university.model.*;

import java.util.List;

public interface TeacherInterface {//Что он может делать?

    long insert(Teacher teacher);

    long insertGroup(Group group);

    long insertStudent(Student student);

    long insertDiscipline(Discipline discipline);

    long insertAttendance(Attendance attendance);

    long insertLesson(Lesson lesson);

    void delete(Teacher teacher);

    void deleteStudent(Student student);

    void deleteDiscipline(Discipline discipline);

    void deleteAttendance(Attendance attendance);//???

    long deleteStudentIntoAttendance(Student student, Attendance attendance);

    void deleteLesson(Lesson lesson);

    void deleteGroup(Group group);

    long addLesson(long idLesson, Teacher teacher);

    long addStudentToAttendance(Student student, Attendance attendance);

    long addGroup(long idGroup);

    Teacher getTeacherById(long id);

    Teacher getTeacherByLesson(Lesson lesson);

    Lesson getLessonById(long id);

    List<Lesson> getLessonListByTeacher(Teacher teacher);

    List<Lesson> getLessonListByTeacherAndGroup(Teacher teacher, Group group);

    List<Lesson> getLessonListByStudent(Student student);

    Discipline getDisciplineById(long id);

    List<Student> getStudentListByAttendance(Attendance attendance);

    Attendance getAttendanceById(long id);

    List<Attendance> getAttendanceListByStudent(Student student);

    //.....
}
