package university.request.groupStudents;

public class DeleteStudentGroupRequest {
    private long  groupId;

    public DeleteStudentGroupRequest(long groupId) {
        setGroupId(groupId);
    }

    public long getGroupId() {
        return groupId;
    }

    private void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
