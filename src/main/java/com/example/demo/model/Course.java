package com.example.demo.model;

public class Course {
    private Integer id;
    private String courseName;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Course() {
        super();
    }

    public Course(Integer id, String courseName, Double price) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", price=" + price +
                '}';
    }
}
