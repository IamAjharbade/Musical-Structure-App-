# Musical-Structure-App-
Android Basics Nanodegree Udacity Project 4: Musical Structure App
# PROJECT SPECIFICATION
1. The app’s structure is suitable for a music player app. A similarly structured app which focuses on audiobooks, podcasts, or other audio media is also acceptable.

2. The purpose of each activity is easy for a user to understand through the UI design and feature labeling.

3. The app contains 2 to 6 activities.

4. The app contains multiple activities, each labelled, which together make a cohesive music app.

5. Features in the app are clearly defined either by labelling or images. For example, a button to play music could use a universally recognized triangular "Play" symbol or could have the text label "Play".

6. Each activity contains button(s) which link it to other activities a user should be able to reach from that activity. For instance, a ‘Library’ activity might contain a button to move to the ‘Now Playing’ activity.

7. The code adheres to all of the following best practices:

     - Text sizes are defined in sp
     - Lengths are defined in dp
     - Padding and margin is used appropriately, such that the views are not crammed up against each other.
     - Each button’s behavior is determined by an OnClickListener in the Java code rather than by the android:onClick attribute in the XML Layout.
8. Each button properly opens the intended activity using an explicit Intent.

9. App uses a custom adapter to populate the layout with views based on instances of the custom class.

10. Information about instances of the custom class are stored in an appropriate data structure (e.g. ArrayList, Array). When the information needs to be displayed, it is efficiently retrieved (e.g. Looping).

11. Data about each song (or equivalent audio media such as podcast episode) should be stored in a custom class that contains at least 2 states (e.g. Song Name, Artist Name) If images are included (e.g. Album Art), they are stored as drawables. All drawables are stored at multiple densities. Images are not required.

About Musical App

The app contains 3 activities.

  - MainActivity
  - SongsActivity
  - NowPlaying
  
This app only shows the structure of the app and how the app transit from one Activity to another Activity. (eg: From MainActivity to NowPlayingActivity etc...)
# Screenshot
 ![Screenshot_2020-06-01-18-37-14-002_com example musicalstructureappproject](https://user-images.githubusercontent.com/65824232/83412314-7ddccb80-a437-11ea-8c44-c0585fcc48ee.jpg)
 
 ![Screenshot_2020-06-01-18-37-22-873_com example musicalstructureappproject](https://user-images.githubusercontent.com/65824232/83412364-93ea8c00-a437-11ea-934f-75b00095d361.jpg)
 
 ![Screenshot_2020-06-01-18-37-32-559_com example musicalstructureappproject](https://user-images.githubusercontent.com/65824232/83412414-a8c71f80-a437-11ea-801d-efd23794271d.jpg)
