package university.validator.request;

import university.request.lessonNattendance.GetLessonByIdRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetLessonById implements ValidatorInterface<GetLessonByIdRequest> {


    private IdValidator idValidator;

    public ValidatorGetLessonById(IdValidator idValidator)
    {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(GetLessonByIdRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getLessonId(), "id", errors);
        return errors;
    }
}
