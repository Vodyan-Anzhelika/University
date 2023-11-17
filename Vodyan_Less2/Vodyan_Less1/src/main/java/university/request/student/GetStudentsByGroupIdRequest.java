package university.request.student;

public class GetStudentsByGroupIdRequest {
    private long groupId;

    public GetStudentsByGroupIdRequest(long groupId) {
        setGroupId(groupId);
    }

    public long getGroupId() {
        return groupId;
    }

    private void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
