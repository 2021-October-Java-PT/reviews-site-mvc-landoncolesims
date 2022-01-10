package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String title;
    private String image;
    private String reviewCategory;
    private String content;

    public Review(long id, String title, String image, String reviewCategory, String content) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.reviewCategory = reviewCategory;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }
}