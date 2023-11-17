package university.validator.field;

import university.request.student.StudentStatusRequest;

import java.util.List;

public class StatusValidator
{
    public boolean checkStudentStatus(StudentStatusRequest status, String fieldName, List<String> errorList) {
        if (status == null) {
            errorList.add(fieldName + ": status is NULL");
            return false;
        }
        return true;
    }
}
