package com.example.tutorial4.Model;
import java.io.Serializable;
@SuppressWarnings("serial")
public class Course implements Serializable {

    private long id;
    private String title;
    private String code;

    public Course(){

    }

    public Course(long id, String title, String code) {
        this.id = id;
        this.title = title;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
