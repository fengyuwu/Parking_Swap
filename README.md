ParkingSwap
===================================

Pre-requisites
--------------

- Android Studio
- Android API 19 or above
- Android Virtual Device

Getting Started
---------------

This project implemented a mobile app that assists the users to find and swap their parking spot.


Project detail
---------------

ParkingSwap is an Android parking app that allows users who are parking on campus to find the parking spot of another user who is leaving. Android Studio was used to create the app itself. The app incorporates Facebook login to authenticate users. When a new user signs in to the app a new ID will be assigned to the user in our back-end. User data such as car make, model, and color can then be saved to an AWS S3 bucket unique and private to the user’s ID. The application running on the server is written in Java which is then hosted on AWS EC2.

In the parkingswap package is the code which constitutes the Android Studio activities for the app. The app uses Google Maps API to determine user location. When the user clicks the “Find by Lots” the user can choose the parking lot they want from a list of UB north/south campus parking lots. The app will take the user and then place them into queue for the desired lot until another user from that lot clicks the “Leave” button (placing them in the complementary leaving queue) which will match the two users together.

The intention of this app is to make parking at UB as painless as possible.



Deployment
-------

Deployment zip that includes, installation instructions, user guide and the apk file
http://www.mediafire.com/file/2yt1u116wl0o107/ParkingSwap.zip


![alt text](https://github.com/fengyuwu/Parking_Swap/blob/master/15843_screen_shot_20170308_at_101303_pmf.png) 







