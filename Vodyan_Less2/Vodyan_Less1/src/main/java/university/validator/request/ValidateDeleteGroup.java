package university.validator.request;

import university.request.groupStudents.DeleteStudentGroupRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidateDeleteGroup implements ValidatorInterface<DeleteStudentGroupRequest> {

    private IdValidator idValidator;

    public ValidateDeleteGroup(IdValidator idValidator) {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(DeleteStudentGroupRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getGroupId(), "id", errors);
        return errors;
    }
}
