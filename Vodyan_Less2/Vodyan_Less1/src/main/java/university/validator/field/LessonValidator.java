package university.validator.field;

import java.util.List;

public class LessonValidator {

    public boolean checkNumberLesson(int num, String fieldName, List<String> errorList) { //todo
        if (num <= 0) {
            errorList.add(fieldName + ": wrong number");
            return false;
        }
        return true;
    }

}
