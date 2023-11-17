package university.validator.request;

import university.request.teacher.AddTeacherRequest;
import university.validator.field.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorAddTeacher implements ValidatorInterface<AddTeacherRequest> {

    private static final int MAX_LENGTH = 100;
    private StringValidator stringValidator;

    public ValidatorAddTeacher(StringValidator stringValidator)
    {
        this.stringValidator = stringValidator;
    }

    @Override
    public List<String> validate(AddTeacherRequest request) {
        List<String> errors = new ArrayList<>();
        stringValidator.checkNotEmpty(request.getFirstname(), "firstName", errors);
        stringValidator.checkMaxLen(request.getFirstname(), MAX_LENGTH, "firstName", errors);
        stringValidator.checkNotEmpty(request.getLastname(), "lastName", errors);
        stringValidator.checkMaxLen(request.getLastname(), MAX_LENGTH, "lastName", errors);
        stringValidator.checkNotEmpty(request.getPatronymic(), "patronymic", errors);
        stringValidator.checkMaxLen(request.getPatronymic(), MAX_LENGTH, "patronymic", errors);
        return errors;
    }

}
