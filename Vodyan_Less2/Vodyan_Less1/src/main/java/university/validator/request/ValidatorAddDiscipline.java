package university.validator.request;

import university.request.groupStudents.AddStudentGroupRequest;
import university.validator.field.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorAddDiscipline implements ValidatorInterface<AddStudentGroupRequest> {
    private static final int MAX_LENGTH = 100;
    private StringValidator stringValidator;

    public ValidatorAddDiscipline(StringValidator stringValidator)
    {
        this.stringValidator = stringValidator;
    }

    @Override
    public List<String> validate(AddStudentGroupRequest request) {
        List<String> errors = new ArrayList<>();
        stringValidator.checkMaxLen(request.getGroupName(), MAX_LENGTH,"groupName", errors);
        stringValidator.checkNotEmpty(request.getGroupName(), "groupName", errors);
        return errors;
    }
}
