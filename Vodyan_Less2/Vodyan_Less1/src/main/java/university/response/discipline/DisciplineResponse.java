package university.response.discipline;

import java.util.Objects;

public class DisciplineResponse {
    private long id;
    private String name;

    DisciplineResponse(String name, long id) {
        setId(id);
        setName(name);
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DisciplineResponse that)) return false;
        return getId() == that.getId() && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
