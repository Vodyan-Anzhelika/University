package university.validator.request;

import university.request.student.GetStudentByIdRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetStudentById implements ValidatorInterface<GetStudentByIdRequest> {


    private IdValidator idValidator;

    public ValidatorGetStudentById(IdValidator idValidator)
    {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(GetStudentByIdRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getStudentId(), "id", errors);
        return errors;
    }
}
