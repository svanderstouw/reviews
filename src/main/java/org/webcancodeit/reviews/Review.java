package org.webcancodeit.reviews;

public class Review {

	private long id;
	private String cityName;
	private String countryName;
	private String imageUrl;
	private String photoCaption;
	private String dateVisited;
	private String reviewText;

	public Long getId() {
		return id;
	}

	public String getCityName() {
		return cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getPhotoCaption() {
		return photoCaption;
	}
	
	public String getDateVisited() {
		return dateVisited;
	}

	public String getReviewText() {
		return reviewText;
	}

	public Review(long id, String cityName, String countryName, String imageUrl, String photoCaption, String dateVisited,
			String reviewText) {
		this.id = id;
		this.cityName = cityName;
		this.countryName = countryName;
		this.imageUrl = imageUrl;
		this.photoCaption = photoCaption;
		this.dateVisited = dateVisited;
		this.reviewText = reviewText;
	}
}
