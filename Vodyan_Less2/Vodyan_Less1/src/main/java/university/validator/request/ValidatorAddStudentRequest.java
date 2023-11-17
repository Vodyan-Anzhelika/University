package university.validator.request;

import university.request.student.*;
import university.validator.field.IdValidator;
import university.validator.field.StatusValidator;
import university.validator.field.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorAddStudentRequest implements ValidatorInterface<AddStudentRequest>{

    private static final int MAX_LENGTH = 100;
    private StringValidator stringValidator;
    private StatusValidator statusValidator;
    private IdValidator idValidator;

    public ValidatorAddStudentRequest(StringValidator stringValidator, StatusValidator statusValidator, IdValidator idValidator)
    {
        this.stringValidator = stringValidator;
        this.statusValidator = statusValidator;
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(AddStudentRequest request) {
        List<String> errors = new ArrayList<>();
        stringValidator.checkNotEmpty(request.getFirstName(), "firstName", errors);
        stringValidator.checkMaxLen(request.getFirstName(), MAX_LENGTH, "firstName", errors);
        stringValidator.checkNotEmpty(request.getLastName(), "lastName", errors);
        stringValidator.checkMaxLen(request.getLastName(), MAX_LENGTH, "lastName", errors);
        stringValidator.checkNotEmpty(request.getPatronymic(), "patronymic", errors);
        stringValidator.checkMaxLen(request.getPatronymic(), MAX_LENGTH, "patronymic", errors);
        statusValidator.checkStudentStatus(request.getStatus(), "status", errors);
        idValidator.checkId(request.getGroupId(), "groupId", errors);
        return errors;
    }
}
