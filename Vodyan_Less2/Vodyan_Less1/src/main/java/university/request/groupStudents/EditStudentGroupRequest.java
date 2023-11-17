package university.request.groupStudents;

public class EditStudentGroupRequest {
    private long groupId;
    private String groupName;

    public EditStudentGroupRequest(long groupId, String groupName) {
        setGroupId(groupId);
        setGroupName(groupName);
    }

    public long getGroupId() {
        return groupId;
    }

    private void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    private void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
