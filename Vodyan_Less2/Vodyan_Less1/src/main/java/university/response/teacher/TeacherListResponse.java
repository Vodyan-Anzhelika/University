package university.response.teacher;

import java.util.List;

public class TeacherListResponse {
    private List<TeacherResponse> teacherList;

    public TeacherListResponse(List<TeacherResponse> teacherList) {
        setTeacherList(teacherList);
    }

    public List<TeacherResponse> getTeacherList() {
        return teacherList;
    }

    private void setTeacherList(List<TeacherResponse> teacherList) {
        this.teacherList = teacherList;
    }
}
