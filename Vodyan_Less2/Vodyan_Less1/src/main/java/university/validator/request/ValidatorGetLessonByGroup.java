package university.validator.request;

import university.request.lessonNattendance.GetLessonsByGroupRequest;
import university.validator.field.DateValidator;
import university.validator.field.IdValidator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorGetLessonByGroup implements ValidatorInterface<GetLessonsByGroupRequest> {


    private IdValidator idValidator;
    private DateValidator dateValidator;

    public ValidatorGetLessonByGroup(IdValidator idValidator, DateValidator dateValidator)
    {
        this.idValidator = idValidator;
        this.dateValidator = dateValidator;
    }

    @Override
    public List<String> validate(GetLessonsByGroupRequest request) {
        List<String> errors = new ArrayList<>();
        idValidator.checkId(request.getGroupId(), "id", errors);
        dateValidator.checkDate(request.getStartDate(), "startDate", errors);
        dateValidator.checkDate(request.getEndDate(), "endDate", errors);
        return errors;
    }
}
