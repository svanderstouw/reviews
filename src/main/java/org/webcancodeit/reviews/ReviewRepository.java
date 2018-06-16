package org.webcancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review amsterdam = new Review(1L, "Amsterdam", "Netherlands", "amsterdam640.jpg",
				"Prinsengracht (Prince's Canal) with the Westerkerk Tower in the background", "September 2015",
				"Amsterdam still looks much like it did in the 1600s — the Dutch Golden Age — when it was the world's richest city, an international sea-trading port, and the cradle of capitalism. Wealthy, democratic burghers built a city upon millions of pilings, creating a wonderland of canals lined with trees and townhouses topped with fancy gables. Today's Amsterdam is still a city of good living, with cozy cafés, great art, street-corner jazz, stately history, and a spirit of live and let live. It's a place where carillons chime quaintly from spires towering above coffeeshops where yuppies go to smoke pot. Take it all in, then pause to watch the clouds blow past stately old gables — and see the Golden Age reflected in a quiet canal.");
		Review colmar = new Review(2L, "Colmar", "France", "colmar640.jpg", 
				"A canal in La Petite Venise", "June 2014", 
				"Colmar, Alsace's most beautiful city, feels made for wonder-struck tourists — its essentially traffic-free city center is a fantasy of steep pitched roofs, pastel stucco, and aged timbers. Plus, it offers a few heavyweight sights in a comfortable, midsize-town package. The town's distinctly French shutters, combined with the ye-olde German half-timbering, give Colmar an intriguing ambience. Antiques shops welcome browsers, homeowners fuss over their geraniums, and hoteliers hurry down the sleepy streets to pick up fresh croissants in time for breakfast.");
		Review london = new Review(3L, "London", "England", "london640.jpg", 
				"Big Ben and the London Underground", "April 2017",
				"London is the L.A., D.C., and N.Y.C. of Britain — a living, breathing, thriving organism…a coral reef of humanity. Blow through the city on a double-decker bus, and take a pinch-me-I'm-in-London walk through the West End. Ogle the crown jewels at the Tower of London, hear the chimes of Big Ben, and see the Houses of Parliament in action. Cruise the Thames River, and take a spin on the London Eye. Hobnob with the tombstones in Westminster Abbey, visit with Leonardo, Botticelli, and Rembrandt in the National Gallery, and explore Harry Potter's stomping grounds at the film studio in Leavesden. Enjoy Shakespeare in a replica of the Globe Theatre and marvel at a glitzy, fun musical at a modern-day theater. Whisper across the dome of St. Paul's Cathedral, then rummage through our civilization's attic at the British Museum.");
		Review nazare = new Review(4L, "Nazar\u00E9", "Portugal", "nazare640.jpg", 
				"Overlooking Nazaré and Sítio", "April 2017",
				"Nazaré falls somewhere between a real-life, narrow-laned fishing village and a busy resort with a beach littered with frolicking families. You'll be greeted by the energetic applause of the surf, widows with rooms to rent, and big plates of percebes (barnacles). Relax in the Portuguese sun in a land of cork groves, eucalyptus trees, ladies in petticoats, and men who stow cigarettes and fishhooks in their stocking caps. Wander the back streets for a fine look at Portuguese family-in-the-street life: Laundry flaps in the wind, kids play soccer, and fish sizzle over tiny curbside hibachis. While the town doesn’t have any real \"sights,\" a few worthy stops lay within easy day-trip distance: Batalha (for its monastery), the pilgrimage site at Fátima, and Alcobaça, home to Portugal's largest church (and saddest romance).");
		Review paris = new Review(5L, "Paris", "France", "paris640.jpg", 
				"Notre-Dame Cathedral and the Seine River", "June 2014", 
				"Paris — the City of Light — has been a beacon of culture for centuries. As a world capital of art, fashion, food, literature, and ideas, it stands as a symbol of all the fine things human civilization can offer. Paris offers sweeping boulevards, chatty crêpe stands, chic boutiques, and world-class art galleries. Sip decaf with deconstructionists at a sidewalk café, then step into an Impressionist painting in a tree-lined park. Climb Notre-Dame and rub shoulders with a gargoyle. Cruise the Seine, zip to the top of the Eiffel Tower, and saunter down Avenue des Champs-Elysées. Master the Louvre and Orsay museums. Save some after-dark energy for one of the world's most romantic cities.");

		reviewList.put(amsterdam.getId(), amsterdam);
		reviewList.put(colmar.getId(), colmar);
		reviewList.put(london.getId(), london);
		reviewList.put(nazare.getId(), nazare);
		reviewList.put(paris.getId(), paris);
	}

	// constructor for testing purposes
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
