package com.bierbrauer.zebulon.parts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Part {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long carId;

    private String name;

    private String url;

    private String description;

//    private List<String> imgUrls;

//    public Part(Long carId, String name, String url, String description, List<String> imgUrls) {
//        if (carId != null) {
//
//        }
//        this.carId = carId;
//        this.name = name;
//        this.url = url;
//        this.description = description;
//        this.imgUrls = imgUrls;
//    }

    public Long getId() {
        return id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public List<String> getImgUrls() {
//        return imgUrls;
//    }
//
//    public void setImgUrls(List<String> imgUrls) {
//        this.imgUrls = imgUrls;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Part)) return false;
//        Part part = (Part) o;
//        return getId().equals(part.getId()) &&
//                getCarId().equals(part.getCarId()) &&
//                Objects.equals(getName(), part.getName()) &&
//                Objects.equals(getUrl(), part.getUrl()) &&
//                Objects.equals(getDescription(), part.getDescription()) &&
//                Objects.equals(getImgUrls(), part.getImgUrls());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getCarId(), getName(), getUrl(), getDescription(), getImgUrls());
//    }
//
//    @Override
//    public String toString() {
//        return "Part{" +
//                "id=" + id +
//                ", carId=" + carId +
//                ", name='" + name + '\'' +
//                ", url='" + url + '\'' +
//                ", description='" + description + '\'' +
//                ", imgUrls=" + imgUrls +
//                '}';
//    }
}
