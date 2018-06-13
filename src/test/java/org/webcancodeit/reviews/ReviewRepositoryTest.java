package org.webcancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	ReviewRepository underTest;

	private long firstReviewId = 1L;
	private Review firstReview = new Review(firstReviewId, "cityName", "country", "imageUrl", "date visited",
			"reviewText");

	private long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "cityName", "country", "imageUrl", "date visited",
			"reviewText");

	@Test
	public void shouldFindAReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindASecondReview() {
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));
	}

	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}
}
