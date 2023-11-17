package university.request.lessonNattendance;

public class GetLessonByIdRequest {
    private long lessonId;

    public GetLessonByIdRequest(long lessonId) {
        setLessonId(lessonId);
    }

    public long getLessonId() {
        return lessonId;
    }

    private void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }
}
//{ “id”: number } получение занятия по id
//(с данными о посещаемости)