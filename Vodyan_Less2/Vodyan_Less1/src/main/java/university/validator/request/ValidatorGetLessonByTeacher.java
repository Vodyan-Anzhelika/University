package university.validator.request;

import university.request.lessonNattendance.GetLessonsByTeacherRequest;
import university.validator.field.DateValidator;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetLessonByTeacher implements ValidatorInterface<GetLessonsByTeacherRequest> {

    private IdValidator idValidator;
    private DateValidator dateValidator;

    public ValidatorGetLessonByTeacher(IdValidator idValidator, DateValidator dateValidator)
    {
        this.idValidator = idValidator;
        this.dateValidator = dateValidator;
    }

    @Override
    public List<String> validate(GetLessonsByTeacherRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getTeacherId(), "id", errors);
        dateValidator.checkDate(request.getStartDate(), "startDate", errors);
        dateValidator.checkDate(request.getEndDate(), "endDate", errors);
        return errors;
    }
}
