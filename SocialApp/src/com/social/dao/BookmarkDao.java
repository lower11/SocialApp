package com.social.dao;

import com.social.app.DataStore;
import com.social.entities.Bookmark;
import com.social.entities.UserBookmark;

public class BookmarkDao {

	
		public Bookmark[][] getBookmarks(){
		return DataStore.getBookmarks();
	}

		public void saveUserBookmark(UserBookmark userBookmark) {
			DataStore.add(userBookmark);
			
			
		}
}
