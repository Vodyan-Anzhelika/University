package university.validator.field;

import java.util.List;

public class IdValidator {
    public boolean checkId(long id, String fieldName, List<String> errorList) {
        if (id < 0) {
            errorList.add(fieldName + ": should be not < 0");
            return false;
        }
        return true;
    }
}
