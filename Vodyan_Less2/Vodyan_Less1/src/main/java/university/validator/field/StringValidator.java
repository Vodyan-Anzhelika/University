package university.validator.field;

import java.util.List;

public class StringValidator {
    public boolean checkNotEmpty(String string, String fieldName,  List<String> errorList){
        if (string == null || string.isEmpty()) {
            errorList.add(fieldName + ": should be not empty");
            return false;
        }
        return true;
    }

    public boolean checkMaxLen(String string, int maxLen, String fieldName, List<String> errorList) {
        if (string.length() > maxLen) {
            errorList.add(fieldName + ": should be <= " + maxLen);
            return false;
        }
        return true;
    }
}
