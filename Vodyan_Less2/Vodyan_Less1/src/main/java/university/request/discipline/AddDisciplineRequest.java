package university.request.discipline;

public class AddDisciplineRequest {
    private String disciplineName;

    public AddDisciplineRequest(String disciplineName) {
        setDisciplineName(disciplineName);
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    private void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }
}
