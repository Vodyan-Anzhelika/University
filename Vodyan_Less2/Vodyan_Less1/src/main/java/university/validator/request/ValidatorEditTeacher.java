package university.validator.request;

import university.request.teacher.EditTeacherRequest;
import university.validator.field.IdValidator;
import university.validator.field.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEditTeacher implements ValidatorInterface<EditTeacherRequest> {

    private static final int MAX_LENGTH = 100;
    private StringValidator stringValidator;
    private IdValidator idValidator;

    public ValidatorEditTeacher(StringValidator stringValidator, IdValidator idValidator) {
        this.stringValidator = stringValidator;
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(EditTeacherRequest request) {
        List<String> errors = new ArrayList<>();
        stringValidator.checkNotEmpty(request.getFirstName(), "firstName", errors);
        stringValidator.checkMaxLen(request.getFirstName(), MAX_LENGTH, "firstName", errors);
        stringValidator.checkNotEmpty(request.getLastName(), "lastName", errors);
        stringValidator.checkMaxLen(request.getLastName(), MAX_LENGTH, "lastName", errors);
        stringValidator.checkNotEmpty(request.getPatronymic(), "patronymic", errors);
        stringValidator.checkMaxLen(request.getPatronymic(), MAX_LENGTH, "patronymic", errors);
        idValidator.checkId(request.getTeacherId(), "id", errors);
        return errors;
    }
}
