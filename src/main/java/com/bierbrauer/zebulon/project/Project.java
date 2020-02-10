package com.bierbrauer.zebulon.project;

import com.bierbrauer.zebulon.car.Car;
import com.bierbrauer.zebulon.notes.Note;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String projectName;

    @OneToMany
    @JoinColumn(name = "projectId")
    private List<Note> notes;

    @OneToMany
    @JoinColumn(name = "projectId")
    private List<Car> cars;

    public Long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return getId().equals(project.getId()) &&
                Objects.equals(getProjectName(), project.getProjectName()) &&
                Objects.equals(getNotes(), project.getNotes()) &&
                Objects.equals(getCars(), project.getCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProjectName(), getNotes(), getCars());
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", notes=" + notes +
                ", cars=" + cars +
                '}';
    }
}
