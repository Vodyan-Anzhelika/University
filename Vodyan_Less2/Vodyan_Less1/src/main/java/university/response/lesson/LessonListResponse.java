package university.response.lesson;

import java.util.List;

public class LessonListResponse {
    private List<LessonResponse> lessonList;

    public LessonListResponse(List<LessonResponse> lessonList) {
        setLessonList(lessonList);
    }

    public List<LessonResponse> getLessonList() {
        return lessonList;
    }

    private void setLessonList(List<LessonResponse> lessonList) {
        this.lessonList = lessonList;
    }
}
