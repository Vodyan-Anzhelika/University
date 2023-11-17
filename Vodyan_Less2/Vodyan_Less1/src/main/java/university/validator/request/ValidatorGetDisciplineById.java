package university.validator.request;

import university.request.discipline.GetDisciplineByIdRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetDisciplineById implements ValidatorInterface<GetDisciplineByIdRequest> {


    private IdValidator idValidator;

    public ValidatorGetDisciplineById(IdValidator idValidator)
    {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(GetDisciplineByIdRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getDisciplineId(), "id", errors);
        return errors;
    }
}
