package university.validator.request;

import university.request.student.EditStudentRequest;
import university.validator.field.IdValidator;
import university.validator.field.StatusValidator;
import university.validator.field.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEditStudentRequest implements ValidatorInterface<EditStudentRequest> {

    private static final int MAX_LENGTH = 100;
    private StringValidator stringValidator;
    private IdValidator idValidator;
    private StatusValidator statusValidator;

    public ValidatorEditStudentRequest(StringValidator stringValidator, IdValidator idValidator, StatusValidator statusValidator) {
        this.stringValidator = stringValidator;
        this.idValidator = idValidator;
        this.statusValidator = statusValidator;
    }

    @Override
    public List<String> validate(EditStudentRequest request) {
        List<String> errors = new ArrayList<>();
        stringValidator.checkNotEmpty(request.getFirstName(), "firstName", errors);
        stringValidator.checkMaxLen(request.getFirstName(), MAX_LENGTH, "firstName", errors);
        stringValidator.checkNotEmpty(request.getLastName(), "lastName", errors);
        stringValidator.checkMaxLen(request.getLastName(), MAX_LENGTH, "lastName", errors);
        stringValidator.checkNotEmpty(request.getPatronymic(), "patronymic", errors);
        stringValidator.checkMaxLen(request.getPatronymic(), MAX_LENGTH, "patronymic", errors);
        idValidator.checkId(request.getStudentId(), "id", errors);
        idValidator.checkId(request.getGroupId(), "group", errors);
        statusValidator.checkStudentStatus(request.getStatus(), "status", errors);
        return errors;
    }
}
