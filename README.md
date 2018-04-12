This project is built in a Model View Controller (MVC) frame

View <=> Servlets <=> Model <=> Database

To simply see the output of the program, go to com/social/app package in the src directory, and press play on the launch.java class

Below I have highlighted how the various programs in my project contribute to the mvc framework.

VIEW- Responsible for user interface (view and launch)

-View.java corresponds to the user interface, such as what the user sees and allows the user to bookmark, or in administrator’s case, mark it childsafe. A program is childsafe if it doesn’t have adult tag or horror tag variable. 

-Launch.java launches the program as mentioned above

SERVLETS- connect to the View invoke methods from the model that connect to the database

-BookmarkController.java

-(UserManager/BookmarkManger).java it controls the business logic such as where the underlying logic for e.g ‘set’ name, title, director are set to the movie

MODEL- methods to invoke data from database

-Dao Classes.java, contains the getUser/getBookmark methods to fetch data from the datastore

DATABASE- hard coded data in java files, in future we want to connect this to real database
 
-Everything in com.social.constants package is related to database such as the; types of books, movies, usertypes, genders, genres etc.
