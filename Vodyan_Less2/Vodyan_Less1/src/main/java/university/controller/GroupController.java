package university.controller;

import university.request.groupStudents.AddStudentGroupRequest;
import university.response.CommonResponse;
import university.response.ResponseEntity;
import university.response.group.AddGroupResponse;
import university.validator.field.StringValidator;
import university.validator.request.ValidatorAddGroupStudents;

import java.util.List;

public class GroupController {
    private ValidatorAddGroupStudents validatorAddGroupStudents;
    private CommonResponse<AddGroupResponse> response;

    public ResponseEntity<CommonResponse<AddGroupResponse>> addStudentGroup(AddStudentGroupRequest request){
        int httpStatus = 200;//400 404

        StringValidator stringValidator = new StringValidator();
        ValidatorAddGroupStudents validatorAddGroupStudents = new ValidatorAddGroupStudents(stringValidator);

        List<String> errorList = validatorAddGroupStudents.validate(request);

        AddGroupResponse addGroupResponse = null;
        if (errorList.size() == 0) {
            addGroupResponse = new AddGroupResponse(0);//откуда брать id?
            response = new CommonResponse<AddGroupResponse>(addGroupResponse);
        } else {
            httpStatus = 400;
            response = new CommonResponse<AddGroupResponse>(httpStatus,
                    "Error request", errorList);//int codeError, String errorMessage, List<String> details) {
        }

        return new ResponseEntity<CommonResponse<AddGroupResponse>>(httpStatus, response);
    }
}
