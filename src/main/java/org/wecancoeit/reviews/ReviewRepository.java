package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review stickOne = new Review(1L, "Bret Kuhn", "/images/bretkuhn.jpeg", "Performance", "These sticks are great " +
                "for out-door performances. Well balanced with a large bead for a more rounded sound. Smaller diameter " +
                "and a bit litter for more fine control at many dynamic levels.");
        Review stickTwo = new Review(2L, "Ralph Chop Busters", "/images/chopbusters.jpeg", "Training", "These are sticks " +
                "are made for the drummer that takes the old school approach of building your chops. Almost like weight" +
                " lifting these sticks are made out of a high density wood that creates a feel almost like two sticks " +
                "in one! I would only suggest these for the practice pad unless you want to be going though a lot of" +
                " drum heads!");
        Review stickThree = new Review(3L, "Ralph Chop-Out", "/images/chopout.jpeg", "Training", "These sticks are maybe" +
                " even better than the chop busters because they come with a built in rubber tip that makes it possible" +
                " to play on any hard surface! Sticks and a drum pad for the price of a pair of sticks! Durability comes" +
                " into the question with these sticks. Nothing some super glue cant fix.");
        Review stickFour = new Review(4L, "Paul Rennick", "/images/paulrennick.jpeg", "Indoor", "Made for the Santa " +
                "Claura Vangaurd and their playing style these sticks are made to produce a lot of sound that punches" +
                " you in the face! With a short taper these sticks are not as easy to play with but this is what makes" +
                " playing with such volume possible");
        Review stickFive = new Review(5L, "Ralph Hardimon", "/images/ralphhardimon.jpeg", "Performance", "These sticks " +
                "are a favorite to many novice players in the marching percussion space due to the large diameter for " +
                "added control. These sticks have a square bead that produces a pronounced attack. Taper is longer to help the novice player. The weight of the stick is just right for the novice to learn to use the drum to their favor");
        Review stickSix = new Review(6L, "Scott Johnson", "/images/ScottJohnson.jpeg", "Performance", "Sticks of the Blue" +
                " Devils snare line. These sticks produce a short attack that creates a crisp sound in the context of a " +
                "line. Well ballanced for very complex sticking sections. Why work harder when you dont have to? From " +
                "california these sticks are fun to play with.");


        reviewsList.put(stickOne.getId(), stickOne);
        reviewsList.put(stickTwo.getId(), stickTwo);
        reviewsList.put(stickThree.getId(), stickThree);
        reviewsList.put(stickFour.getId(), stickFour);
        reviewsList.put(stickFive.getId(), stickFive);
        reviewsList.put(stickSix.getId(), stickSix);
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }


}