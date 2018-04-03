package com.social.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.social.constants.BookGenre;
import com.social.constants.MovieGenre;
import com.social.managers.BookmarkManager;

class BookTest {

	@Test
	void testIsChildSafe() {
	
		//test 1: horror in section -- false
		
	
		Book book = BookmarkManager.getInstance().createBook(4000, "Dracula", 1854, "Wilder Publications", new String[] {"Bram Stoker"}, BookGenre.HORROR, 9.1);
		
		boolean isChildSafe = book.isChildSafe();
		
		assertFalse("For horror section isChildSafe must return false", isChildSafe);
		
		
}

}
