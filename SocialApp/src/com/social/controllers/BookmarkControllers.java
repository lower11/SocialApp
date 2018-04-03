package com.social.controllers;

import com.social.entities.Bookmark;
import com.social.entities.User;
import com.social.managers.BookmarkManager;

public class BookmarkControllers {
private static BookmarkControllers instance = new BookmarkControllers();
private BookmarkControllers() {}
public static BookmarkControllers getInstance() {
	
	return instance;
	
}
public void saveUserBookmark(User user, Bookmark bookmark) {
	
	BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
	
}
}

