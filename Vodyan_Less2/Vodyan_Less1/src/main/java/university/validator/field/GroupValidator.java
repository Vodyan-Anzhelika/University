package university.validator.field;

import university.model.Group;

import java.util.List;

public class GroupValidator {

    public boolean checkGroup(Group group, String fieldName, List<String> errorList) {
        if (group == null) {
            errorList.add(fieldName + ": group is NULL");
            return false;
        }
        return true;
    }

}
