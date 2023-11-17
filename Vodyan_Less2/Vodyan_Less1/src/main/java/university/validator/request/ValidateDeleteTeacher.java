package university.validator.request;

import university.request.teacher.DeleteTeacherRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidateDeleteTeacher implements ValidatorInterface<DeleteTeacherRequest> {

    private IdValidator idValidator;

    public ValidateDeleteTeacher(IdValidator idValidator) {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(DeleteTeacherRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getTeacherId(), "id", errors);
        return errors;
    }
}
