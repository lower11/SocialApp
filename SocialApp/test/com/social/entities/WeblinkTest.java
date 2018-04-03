package com.social.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.social.managers.BookmarkManager;

class WeblinkTest {

	@Test
	void testIsChildSafe() {
	
		//test 1: porn in url -- false
		
	
		WebLink webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger", "http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html", "http://www.javaworld.com");
		
		boolean isChildSafe = webLink.isChildSafe();
		
		assertFalse("For porn in url isChildSafe must return false", isChildSafe);
		
		//test 2: porn in title -- false
		
	 
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn", "http://www.javaworld.com/article/2072759/core-java/taming-ptiger--part-2.html", "http://www.javaworld.com");
		
		isChildSafe = webLink.isChildSafe();
		
		assertFalse("For porn in title isChildSafe must return false", isChildSafe);
		
		
		
		
		
		
	}

}
