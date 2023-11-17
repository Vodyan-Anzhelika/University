package university.response.discipline;

import java.util.List;

public class DisciplineListResponse {
    private List<DisciplineResponse> disciplineList;

    public DisciplineListResponse(List<DisciplineResponse> disciplineList) {
        setDisciplineList(disciplineList);
    }

    public List<DisciplineResponse> getDisciplineList() {
        return disciplineList;
    }

    private void setDisciplineList(List<DisciplineResponse> disciplineList) {
        this.disciplineList = disciplineList;
    }
}
