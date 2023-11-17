package university.request.discipline;

public class GetDisciplineByIdRequest {
    private long disciplineId;

    public GetDisciplineByIdRequest(long disciplineId) {
        setDisciplineId(disciplineId);
    }

    public long getDisciplineId() {
        return disciplineId;
    }

    private void setDisciplineId(long disciplineId) {
        this.disciplineId = disciplineId;
    }
}
