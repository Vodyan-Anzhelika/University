package university.validator.request;

import university.request.student.DeleteStudentRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidateDeleteStudent implements ValidatorInterface<DeleteStudentRequest> {

    private IdValidator idValidator;

    public ValidateDeleteStudent(IdValidator idValidator) {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(DeleteStudentRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getStudentId(), "id", errors);
        return errors;
    }
}
