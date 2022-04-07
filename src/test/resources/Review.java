package io.github.tnlx.jfxoo.test;

import io.github.tnlx.jfxoo.annotation.JFXooForm;
import io.github.tnlx.jfxoo.annotation.JFXooTable;

@JFXooTable
@JFXooForm
public class Review {
    private Integer score;
    private String comment;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}