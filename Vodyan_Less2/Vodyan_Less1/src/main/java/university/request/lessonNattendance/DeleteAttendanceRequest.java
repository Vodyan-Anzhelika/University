package university.request.lessonNattendance;

public class DeleteAttendanceRequest {
    private long attendanceId;

    public DeleteAttendanceRequest(long attendanceId) {
        setAttendanceId(attendanceId);
    }

    public long getAttendanceId() {
        return attendanceId;
    }

    private void setAttendanceId(long attendanceId) {
        this.attendanceId = attendanceId;
    }
}
