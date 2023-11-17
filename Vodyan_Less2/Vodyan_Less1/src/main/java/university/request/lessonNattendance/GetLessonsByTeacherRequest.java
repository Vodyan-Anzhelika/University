package university.request.lessonNattendance;

public class GetLessonsByTeacherRequest {

    private String startDate;
    private String endDate;
    private long teacherId;

    public GetLessonsByTeacherRequest(String startDate, String endDate, long teacherId) {
        setEndDate(endDate);
        setStartDate(startDate);
        setTeacherId(teacherId);
    }

    public String getStartDate() {
        return startDate;
    }

    private void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    private void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public long getTeacherId() {
        return teacherId;
    }

    private void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }
}
//{ “startDate”: string, “endDate”: string, “teacherId”: number }
//получение списка занятий за период
//для преподавателя (без информации о
//посещаемости)