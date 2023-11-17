package university.validator.request;

import university.request.IdRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorIdRequest implements ValidatorInterface<IdRequest>
{
    private IdValidator idValidator;

    public ValidatorIdRequest(IdValidator idValidator)
    {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(IdRequest request)
    {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getId(), "id", errors);
        return errors;
    }
}
