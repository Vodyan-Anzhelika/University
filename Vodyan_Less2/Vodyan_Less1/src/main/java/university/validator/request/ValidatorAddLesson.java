package university.validator.request;

import university.request.lessonNattendance.AddLessonRequest;
import university.validator.field.*;

import java.util.ArrayList;
import java.util.List;

public class ValidatorAddLesson implements ValidatorInterface<AddLessonRequest> {

    private LessonValidator lessonValidator;
    private IdValidator idValidator;
    private DateValidator dateValidator;

    public ValidatorAddLesson(LessonValidator lessonValidator, IdValidator idValidator, DateValidator dateValidator)
    {
        this.lessonValidator = lessonValidator;
        this.idValidator = idValidator;
        this.dateValidator = dateValidator;
    }

    @Override
    public List<String> validate(AddLessonRequest request) {
        List<String> errors = new ArrayList<>();
        dateValidator.checkDate(request.getDate(), "date", errors);
        idValidator.checkId(request.getGroupId(), "groupId", errors);
        idValidator.checkId(request.getTeacherId(), "teacherId", errors);
        lessonValidator.checkNumberLesson(request.getNumberLesson(), "lessNumber", errors);
        return errors;
    }
}
