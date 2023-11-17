package university.validator.request;

import university.request.groupStudents.GetStudentGroupByIdRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetGroupById implements ValidatorInterface<GetStudentGroupByIdRequest> {


    private IdValidator idValidator;

    public ValidatorGetGroupById(IdValidator idValidator)
    {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(GetStudentGroupByIdRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getGroupId(), "id", errors);
        return errors;
    }
}
