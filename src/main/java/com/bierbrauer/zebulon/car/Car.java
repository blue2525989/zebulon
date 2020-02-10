package com.bierbrauer.zebulon.car;

import com.bierbrauer.zebulon.parts.Part;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;

    @OneToMany
    @JoinColumn(name = "carId")
    private List<Part> parts;

    public void setContent(String content) {
        this.content = content;
    }

    public Car(Long id, String content, List<Part> parts) {
        this.id = id;
        this.content = content;
        this.parts = parts;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public void addPart(Part part) { this.parts.add(part); }

    public void removePart(Part part) { this.parts.remove(part); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getId().equals(car.getId()) &&
                Objects.equals(getContent(), car.getContent()) &&
                Objects.equals(getParts(), car.getParts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContent(), getParts());
    }
}
