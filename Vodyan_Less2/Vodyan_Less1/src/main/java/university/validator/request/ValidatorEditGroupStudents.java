package university.validator.request;

import university.request.discipline.EditDisciplineRequest;
import university.validator.field.IdValidator;
import university.validator.field.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEditGroupStudents implements ValidatorInterface<EditDisciplineRequest> {

    private static final int MAX_LENGTH = 100;
    private StringValidator stringValidator;
    private IdValidator idValidator;

    public ValidatorEditGroupStudents(StringValidator stringValidator, IdValidator idValidator)
    {
        this.stringValidator = stringValidator;
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(EditDisciplineRequest request) {
        List<String> errors = new ArrayList<>();
        stringValidator.checkMaxLen(request.getDisciplineName(), MAX_LENGTH,"disciplineName", errors);
        stringValidator.checkNotEmpty(request.getDisciplineName(), "disciplineName", errors);
        idValidator.checkId(request.getDisciplineId(), "id", errors);
        return errors;
    }


}
