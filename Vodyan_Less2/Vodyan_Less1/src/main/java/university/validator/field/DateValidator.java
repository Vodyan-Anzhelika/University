package university.validator.field;

import java.util.List;

public class DateValidator
{
    public boolean checkDate(String string, String fieldName, List<String> errorList)
    { //todo
        if (string == null || string.isEmpty())
        {
            errorList.add(fieldName + ": should be not empty");
            return false;
        }
        return true;
    }
}
