package com.demo.oxygen.web;

import com.demo.oxygen.entity.TourRating;

import lombok.Data;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
public class RatingData {

    @Min(0)
    @Max(5)
    private Integer score;

    @Size(max = 25)
    private String comment;

    @NotNull
    private Integer customerId;

    public RatingData( Integer score, String comment, Integer customerId) {
        this.score = score;
        this.comment = comment;
        this.customerId = customerId;
    }

    public RatingData(TourRating tourRating) {
        this.comment = tourRating.getComment();
        this.customerId = tourRating.getCustomerId();
        this.score = tourRating.getScore();
    }
}
