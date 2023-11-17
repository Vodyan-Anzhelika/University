package university.request.lessonNattendance;

public class GetLessonsByGroupRequest {

    private long groupId;
    private String startDate;
    private String endDate;

    public GetLessonsByGroupRequest(long groupId, String startDate, String endDate) {
        setGroupId(groupId);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public long getGroupId() {
        return groupId;
    }

    private void setGroupId(long groupId) {
        this.groupId = groupId;
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
}
//{ “startDate”: string, “endDate”: string, “groupId”: number }
//получение списка занятий за период
//для группы (без информации о
//посещаемости)