package university.validator.request;

import university.request.teacher.GetTeacherByIdRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetTeacherById implements ValidatorInterface<GetTeacherByIdRequest> {


    private IdValidator idValidator;

    public ValidatorGetTeacherById(IdValidator idValidator)
    {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(GetTeacherByIdRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getTeacherId(), "id", errors);
        return errors;
    }
}
