package university.validator.request;

import university.request.lessonNattendance.DeleteLessonRequest;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidateDeleteLesson implements ValidatorInterface<DeleteLessonRequest> {

    private IdValidator idValidator;

    public ValidateDeleteLesson(IdValidator idValidator) {
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(DeleteLessonRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getLessonId(), "id", errors);
        return errors;
    }
}
