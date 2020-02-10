
package com.bierbrauer.zebulon.notes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long projectId;

    private String content;

    public Note(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;
        Note note = (Note) o;
        return id == note.id &&
                getProjectId() == note.getProjectId() &&
                Objects.equals(getContent(), note.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getProjectId(), getContent());
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", content='" + content + '\'' +
                '}';
    }
}
