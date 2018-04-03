package com.social.app;

import com.social.constants.ChildSafeStatus;
import com.social.constants.UserType;
import com.social.controllers.BookmarkControllers;
import com.social.entities.Bookmark;
import com.social.entities.User;

public class View {
	
	/*public static void bookmark(User user, Bookmark[][] bookmarks) {
		
	System.out.println("\n" + user.getEmail() + "  is bookmarking");
	
	for(int i = 0; i < DataStore.USER_BOOKMARK_LIMIT; i++) {
		
		int typeOffset = (int)(Math.random() * DataStore.BOOKMARK_TYPES_COUNT);
		int bookmarkOffset =  (int)(Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPE);
		
		Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
		
		BookmarkControllers.getInstance().saveUserBookmark(user,bookmark);
		
		System.out.println(bookmark);
	}
		
		
	}*/
	
	
	public static void browse(User user, Bookmark[][] bookmarks) {
		
	System.out.println("\n" + user.getEmail() + "  is browsing items...");
	int bookmarkCount = 0;
	
	for(Bookmark[] bookmarkList: bookmarks) {
		for(Bookmark bookmark: bookmarkList) {
			//Bookmarking!!
			if(bookmarkCount < DataStore.USER_BOOKMARK_LIMIT) {
				boolean isBookmarked = getBookmarkDecision(bookmark);
				if(isBookmarked ) {
					bookmarkCount++;
					
					BookmarkControllers.getInstance().saveUserBookmark(user,bookmark);
					
					System.out.println("New Item Bookmarked..." +bookmark);
					
				}
			}
			
			//mark as child safe
			if(user.getUserType().equals(UserType.EDITOR)  || user.getUserType().equals(UserType.CHIEF_EDITOR)){
				if(bookmark.isChildSafe() && bookmark.getChildSafeStatus().equals(ChildSafeStatus.UNKNOWN)) {
					String childSafeStatus = getChildSafeStatusDecision(bookmark);
					if(!childSafeStatus.equals(ChildSafeStatus.UNKNOWN)) {
						bookmark.setChildSafeStatus(childSafeStatus);
						System.out.println("Child Safe Status: " + childSafeStatus + "," + bookmark);
					}
					
				}
			}
				
			}
		}
	}

	

	private static String getChildSafeStatusDecision(Bookmark bookmark) {
		
		
		return Math.random() < 0.4 ? ChildSafeStatus.APPROVED : 
			(Math.random()>= 0.4 && Math.random() < 0.8) ? ChildSafeStatus.REJECTED : ChildSafeStatus.UNKNOWN;
		
		
	}



	private static boolean getBookmarkDecision(Bookmark bookmark) {
		return Math.random() < 0.5 ? true: false;
		
	}

}
