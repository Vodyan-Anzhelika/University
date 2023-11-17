package university.validator.request;

import university.request.discipline.DeleteDisciplineRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidateDeleteDiscipline implements ValidatorInterface<DeleteDisciplineRequest> {

    private IdValidator idValidator;

    public ValidateDeleteDiscipline(IdValidator idValidator) {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(DeleteDisciplineRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getDisciplineId(), "id", errors);
        return errors;
    }
}
