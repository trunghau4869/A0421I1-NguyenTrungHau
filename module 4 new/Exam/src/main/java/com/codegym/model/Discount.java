package com.codegym.model;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiscount;

    @NotEmpty(message = "Title is not empty")
//    @Size(min = 5, max = 100)
    private String title;

    @NotEmpty(message = "Time start is not empty")
    private String timeStart;

    @NotEmpty(message = "Time end is not empty")

    private String timeEnd;

    @NotEmpty(message = "Level discount is not empty")
    //    @Size(min = 1000,max=1000000)
    @Min(message = "Level discount greater than to 10000 ",value = 10001)
    private String levelDiscount;

    @NotEmpty(message = "Detail is not empty")

    private String detail;


    public Discount() {
    }

    public int getIdDiscount() {
        return idDiscount;
    }

    public void setIdDiscount(int idDiscount) {
        this.idDiscount = idDiscount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getLevelDiscount() {
        return levelDiscount;
    }

    public void setLevelDiscount(String levelDiscount) {
        this.levelDiscount = levelDiscount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}