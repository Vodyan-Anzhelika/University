package university.request.lessonNattendance;

public class GetAttendanceByIdRequest {
    private long attendanceId;

    public GetAttendanceByIdRequest(long attendanceId) {
        setAttendanceId(attendanceId);
    }

    public long getAttendanceId() {
        return attendanceId;
    }

    private void setAttendanceId(long attendanceId) {
        this.attendanceId = attendanceId;
    }
}