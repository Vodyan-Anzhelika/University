package university.response.student;

import java.util.List;

public class StudentListResponse {
    private List<StudentResponse> studentList;

    public StudentListResponse(List<StudentResponse> studentList) {
        setStudentList(studentList);
    }

    public List<StudentResponse> getStudentList() {
        return studentList;
    }

    private void setStudentList(List<StudentResponse> studentList) {
        this.studentList = studentList;
    }
}
