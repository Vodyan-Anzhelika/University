package university.request.teacher;

public class GetTeacherByIdRequest {
    private long teacherId;

    public GetTeacherByIdRequest(long teacherId) {
        setTeacherId(teacherId);
    }

    public long getTeacherId() {
        return teacherId;
    }

    private void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }
}
