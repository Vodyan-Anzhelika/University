package university.request.lessonNattendance;

import java.util.List;

public class AddAttendanceListRequest {
    private long lessonId;
    private List<Integer> studentIdList;

    public AddAttendanceListRequest(long lessonId, List<Integer> studentIdList) {
        setLessonId(lessonId);
        setStudentIdList(studentIdList);
    }

    public long getLessonId() {
        return lessonId;
    }

    private void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }

    public List<Integer> getStudentIdList() {
        return studentIdList;
    }

    private void setStudentIdList(List<Integer> studentIdList) {
        this.studentIdList = studentIdList;
    }
}
