package com.muccio.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String statement;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public Question() {
    }

    public Question(Long id, String statement) {
        this.id = id;
        this.statement = statement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
