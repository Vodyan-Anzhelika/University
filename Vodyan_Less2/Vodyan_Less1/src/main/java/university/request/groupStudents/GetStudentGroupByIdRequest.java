package university.request.groupStudents;

public class GetStudentGroupByIdRequest {
    private long groupId;

    public GetStudentGroupByIdRequest(long groupId) {
        setGroupId(groupId);
    }

    public long getGroupId() {
        return groupId;
    }

    private void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
