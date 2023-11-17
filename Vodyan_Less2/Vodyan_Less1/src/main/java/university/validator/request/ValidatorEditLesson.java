package university.validator.request;

import university.request.lessonNattendance.EditLessonRequest;
import university.validator.field.*;

import java.util.ArrayList;
import java.util.List;

public class ValidatorEditLesson implements ValidatorInterface<EditLessonRequest> {

    private DateValidator dateValidator;
    private LessonValidator lessonValidator;
    private IdValidator idValidator;

    public ValidatorEditLesson(DateValidator dateValidator, LessonValidator lessonValidator, IdValidator idValidator) {
        this.dateValidator = dateValidator;
        this.lessonValidator = lessonValidator;
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validate(EditLessonRequest request) {
        List<String> errors = new ArrayList<>();
        dateValidator.checkDate(request.getDate(), "date", errors);
        lessonValidator.checkNumberLesson(request.getNumberLesson(), "lessNumber", errors);
        idValidator.checkId(request.getTeacherId(), "teacherId", errors);
        idValidator.checkId(request.getGroupId(),"groupId", errors);
        idValidator.checkId(request.getLessonId(), "id", errors);
        return errors;
    }
}
