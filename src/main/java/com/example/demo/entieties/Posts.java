package com.example.demo.entieties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_posts")
    private Long idPosts;
    private String title;
    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn( name = "id_posts_fk", referencedColumnName = "id_posts")
    List<Comments> commentsList = new ArrayList<>();

    public Posts(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
