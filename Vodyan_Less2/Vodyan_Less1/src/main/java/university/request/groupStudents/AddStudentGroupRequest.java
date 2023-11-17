package university.request.groupStudents;

public class AddStudentGroupRequest {
    private String groupName;

    public AddStudentGroupRequest(String groupName) {
        setGroupName(groupName);
    }

    public String getGroupName() {
        return groupName;
    }

    private void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
