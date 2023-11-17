package university.request.discipline;

public class DeleteDisciplineRequest {
    private long disciplineId;

    public DeleteDisciplineRequest(long disciplineId) {
        setDisciplineId(disciplineId);
    }

    public long getDisciplineId() {
        return disciplineId;
    }

    private void setDisciplineId(long disciplineId) {
        this.disciplineId = disciplineId;
    }
}
