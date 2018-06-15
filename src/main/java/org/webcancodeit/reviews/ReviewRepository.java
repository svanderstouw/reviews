package org.webcancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review paris = new Review(1L, "Paris", "France", "image URL", "date visited", "review text");
		Review london = new Review(2L, "London", "England", "image URL", "date visited", "review text");
		Review amsterdam = new Review(3L, "Amsterdam", "Netherlands", "image URL", "date visited", "review text");
		Review nazare = new Review(4L, "Nazare", "Portugal", "image URL", "date visited", "review text");
		
		reviewList.put(paris.getId(), paris);
		reviewList.put(london.getId(), london);
		reviewList.put(amsterdam.getId(), amsterdam);
		reviewList.put(nazare.getId(), nazare);
	}

	//constructor for testing purposes
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
