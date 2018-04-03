package com.social.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.social.constants.MovieGenre;
import com.social.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsChildSafe() {
	
		//test 1: horror in section -- false
		
	
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Jeepers Creepers", "", 2003, new String[] {"Orson Welles", "Joseph Cotten"},new String[] {"Orson Welles"}, MovieGenre.HORROR, 8.5 );
		
		boolean isChildSafe = movie.isChildSafe();
		
		assertFalse("For horror section isChildSafe must return false", isChildSafe);
		
		
		
		
}

	
}