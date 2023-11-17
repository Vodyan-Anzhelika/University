package university.validator.field;

import university.model.Teacher;

import java.util.List;

public class TeacherValidator {

    public boolean checkTeacher(Teacher teacher, String fieldName, List<String> errorList) { //todo
        if (teacher == null) {
            errorList.add(fieldName + ": teacher is null");
            return false;
        }
        return true;
    }

}
