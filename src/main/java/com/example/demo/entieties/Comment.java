package com.example.demo.entieties;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comment")
    private long idComment;
    private String text;

    public Comment() {
    }

    public Comment(String text) {
        super();
        this.text = text;
    }
    public long getId() {
        return idComment;
    }
    public void setId(long id) {
        this.idComment = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}