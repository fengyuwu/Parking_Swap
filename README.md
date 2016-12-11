# parkingswap
parkingswap is an Android parking app that allow user to find another app user's parking location. 
The app uses Android Studio to create the user interface. The app incorporates FaceBook login to verify the user. 
When a new user signs in to the app a new ID will be assign to the user which the user data such as car color, type, and model can then be saved on the AWS S3 bucket. 
The server itself is written in java which is then hosted on AWS EC2.
In the amazonaws/mobile folder it contains the java files which are server codes that run on the AWS EC2 which will handle the parking swap.
In the parkingswap folder are the codes which handle the Android Studio activities for the app. 
It also contains google map API to determine user location. 
When the user clicks find lot the user can choose the parking lots they want from a list of UB parking lots. 
The app will take the user and then place them into queue of the desired lot until another user from that lot click the leave button which will match the two user together.
The quick find button will use the user location from google map to determine which queue of lot to place the user in.
