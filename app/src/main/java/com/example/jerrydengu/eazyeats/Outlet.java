package com.example.jerrydengu.eazyeats;

/**
 * Created by JAMBO on 1/27/17.
 * EazyEats
 */

public class Outlet {

    private String outletTitle;
    private String outletDescription;

    private String outletImages;

    private String reviewerAvatar;
    private String reviewerUsername;
    private String outletReview;

    private int outletRating;

    public Outlet(String outletTitle,
                  String outletDescription,

                  String outletImages,

                  String reviewerAvatar,
                  String reviewerUsername,
                  String outletReview,

                  int outletRating) {

        this.outletTitle = outletTitle;
        this.outletDescription = outletDescription;

        this.outletImages = outletImages;

        this.reviewerAvatar = reviewerAvatar;
        this.reviewerUsername = reviewerUsername;
        this.outletReview = outletReview;

        this.outletRating = outletRating;

    }

    public void setOutletImages(String outletImages) {
        this.outletImages = outletImages;
    }

    public void setReviewerUsername(String reviewerUsername) {
        this.reviewerUsername = reviewerUsername;
    }

    public void setOutletDescription(String outletDescription) {
        this.outletDescription = outletDescription;
    }

    public void setOutletRating(int outletRating) {
        this.outletRating = outletRating;
    }

    public void setOutletTitle(String outletTitle) {
        this.outletTitle = outletTitle;
    }

    public void setOutletReview(String outletReview) {
        this.outletReview = outletReview;
    }

    public void setReviewerAvatar(String reviewerAvatar) {
        this.reviewerAvatar = reviewerAvatar;
    }

    public String getOutletImages() {
        return outletImages;
    }

    public String getReviewerUsername() {
        return reviewerUsername;
    }

    public String getOutletDescription() {
        return outletDescription;
    }

    public int getOutletRating() {
        return outletRating;
    }

    public String getOutletTitle() {
        return outletTitle;
    }

    public String getOutletReview() {
        return outletReview;
    }

    public String getReviewerAvatar() {
        return reviewerAvatar;
    }
}
