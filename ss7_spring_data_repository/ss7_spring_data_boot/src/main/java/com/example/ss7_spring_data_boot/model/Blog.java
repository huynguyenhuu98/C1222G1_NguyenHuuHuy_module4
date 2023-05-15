package com.example.ss7_spring_data_boot.model;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nameBlog;
    private String content;
    private String date;
    @ManyToOne
    @JoinColumn(name = "category.id", referencedColumnName = "id")
    private Category category;

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
