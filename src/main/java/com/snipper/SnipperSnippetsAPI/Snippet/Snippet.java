package com.snipper.SnipperSnippetsAPI.Snippet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Snippet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String language;
    private String code;

    public Snippet() {
    }

    public Snippet(int id, String language, String code) {
        this.id = id;
        this.language = language;
        this.code = code;
    }

    public Snippet(String language, String code) {
        this.language = language;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
