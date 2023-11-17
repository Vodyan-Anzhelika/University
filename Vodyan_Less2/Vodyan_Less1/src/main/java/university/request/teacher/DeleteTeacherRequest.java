package university.request.teacher;

public class DeleteTeacherRequest {
    private long teacherId;

    public DeleteTeacherRequest(long teacherId) {
        setTeacherId(teacherId);
    }

    public long getTeacherId() {
        return teacherId;
    }

    private void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }
}
