package university.validator.request;

import university.request.groupStudents.EditStudentGroupRequest;
import university.validator.field.IdValidator;
import university.validator.field.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEditDiscipline implements ValidatorInterface<EditStudentGroupRequest> {

    private static final int MAX_LENGTH = 100;
    private StringValidator stringValidator;
    private IdValidator idValidator;

    public ValidatorEditDiscipline(StringValidator stringValidator, IdValidator idValidator)
    {
        this.stringValidator = stringValidator;
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(EditStudentGroupRequest request) {
        List<String> errors = new ArrayList<>();
        stringValidator.checkMaxLen(request.getGroupName(), MAX_LENGTH,"groupName", errors);
        stringValidator.checkNotEmpty(request.getGroupName(), "groupName", errors);
        idValidator.checkId(request.getGroupId(), "id", errors);
        return errors;
    }
}
