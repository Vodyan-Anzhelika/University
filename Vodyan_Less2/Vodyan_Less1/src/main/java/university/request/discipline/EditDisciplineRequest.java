package university.request.discipline;

public class EditDisciplineRequest {
    private String disciplineName;
    private long disciplineId;

    public EditDisciplineRequest(String disciplineName, long disciplineId) {
        setDisciplineName(disciplineName);
        setDisciplineId(disciplineId);
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    private void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public long getDisciplineId() {
        return disciplineId;
    }

    private void setDisciplineId(long disciplineId) {
        this.disciplineId = disciplineId;
    }//?
}
