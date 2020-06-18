package com.kipngetich.populardishes.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Kipngetich
 */
@Entity
public class Dish {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String briefDescription;
    private String description;
    @ElementCollection
    private List<String> ingredients;
    @ElementCollection
    private List<String> instructions;
    @ElementCollection
    private List<String> comments;
    private String imgURL;
    @ElementCollection
    private List<String> serve;

    public Dish() {
    }

    public Dish(String name, String briefDescription, String description, List<String> ingredients, List<String> instructions, List<String> comments, String imgURL, List<String> serve) {
        this.name = name;
        this.briefDescription = briefDescription;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.comments = comments;
        this.imgURL = imgURL;
        this.serve = serve;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getServe() {
        return serve;
    }

    public void setServe(List<String> serve) {
        this.serve = serve;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }
}
