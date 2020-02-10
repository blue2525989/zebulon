package com.bierbrauer.zebulon.car;

import java.util.Objects;

public class Car {

    private final long id;
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public Car(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getId() == car.getId() &&
                Objects.equals(getContent(), car.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContent());
    }
}
