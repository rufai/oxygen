package com.demo.oxygen.entity;

import jakarta.persistence.*;

@Entity
public class Tour {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String title;

    @Column(length = 3000)
    private String description;

    @Column
    private Integer price;

//    @Column
//    private String duration;

    public Tour( String title, String description, Integer price) {
        this.title = title;
        this.description = description;
        this.price = price;
//        this.duration = duration;

    }

    public Tour() {

    }


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "TourEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
