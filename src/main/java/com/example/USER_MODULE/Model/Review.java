package com.example.USER_MODULE.Model;




import jakarta.persistence.*;


@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Customer user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    private String reviewText;
    private int rating; // 1 to 5

    public int getRating() {
        return 0;
    }

    // Getters and Setters
}
