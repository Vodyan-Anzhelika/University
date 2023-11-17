package university.request.lessonNattendance;

import java.util.List;

public class EditAttendanceRequest {
    private long lessonId;
    private List<Integer> studentIdList;
    private long attendanceId;

    public EditAttendanceRequest(long lessonId, List<Integer> studentIdList, long attendanceId) {
        setAttendanceId(attendanceId);
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

    public long getAttendanceId() {
        return attendanceId;
    }

    private void setAttendanceId(long attendanceId) {
        this.attendanceId = attendanceId;
    }
}
