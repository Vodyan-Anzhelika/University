package university.validator.request;

import university.request.student.GetStudentsByGroupIdRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetStudentsByGroup implements ValidatorInterface<GetStudentsByGroupIdRequest> {


    private IdValidator idValidator;

    public ValidatorGetStudentsByGroup(IdValidator idValidator)
    {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(GetStudentsByGroupIdRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getGroupId(), "id", errors);
        return errors;
    }
}
