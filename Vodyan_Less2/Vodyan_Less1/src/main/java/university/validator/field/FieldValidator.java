package university.validator.field;

import university.model.Group;
import university.model.Teacher;

import java.util.List;

public class FieldValidator {
    public boolean checkGroup(Group group, String fieldName, List<String> errorList) {
        if (group == null) {
            errorList.add(fieldName + ": group is NULL");
            return false;
        }
        return true;
    }

    public boolean checkNumberLesson(int num, String fieldName, List<String> errorList) { //todo
        if (num <= 0) {
            errorList.add(fieldName + ": wrong number");
            return false;
        }
        return true;
    }

    public boolean checkTeacher(Teacher teacher, String fieldName, List<String> errorList) { //todo
        if (teacher == null) {
            errorList.add(fieldName + ": teacher is null");
            return false;
        }
        return true;
    }

    public boolean checkGroupName(String string, String fieldName, List<String> errorList) { //todo
        if (string == null || string.isEmpty()) {
            errorList.add(fieldName + ": should be not empty");
            return false;
        }
        return true;
    }
}
