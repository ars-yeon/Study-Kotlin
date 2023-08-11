# Introduce_Me
personal project

## Overview
Introduce_Me is an Android application that allows users to create a self-introduction profile. The application consists of three main activities: Sign In, Sign Up, and Introduction.

## Features
### Sign In Page
- Implement input fields for username, and password.
- Enable the "Sign Up" button only when all fields are filled.
- Display a toast message if all fields are not filled.
- Hide entered password text.
- After completing all the text fields, click the "Sign In" button to go to the "Introduction" page.
- If you press the "Sign Up" button, go to the "Sign Up" page.

### Sign Up Page
- Implement input fields for name, username, and password.
- Enable the "Sign Up" button only when all fields are filled.
- Display a toast message if all fields are not filled.
- Hide entered password text.
- Navigate to "Sign In" Page upon successful registration.

### Introduction Page
- Display a random profile picture from a collection of 5 images.
- Display the username received from SignInActivity as an extra.
- Include elements for name, age, MBTI, and more.
- Click the Close button to exit the current screen and return to the previous screen.
- Created and applied a custom button design.
- When you press the close button, the background color, icon, and text color change.

### Additional Features
- Use registerForActivityResult' to auto-fill 'Sign In' with ID and PW entered in 'Sign Up'.

## Development Environment
- Android Studio @Giraffe

## Application Version
- minSdk 24
- targetSdk 33

## Screenshot
![Splash](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/eb5425c2-bf6e-4ae9-ae05-f89f4f9b3511) | ![SignIn1](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/1ad597ba-971f-4eab-9313-e360fb5d9b8c) | ![SignUp1](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/3fcfd328-6234-4ed2-a508-d7136a9dc933) | ![SignUp2](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/e9d625c0-58d9-4ef4-82bf-e6d558ff1a7d) | ![SignIn2](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/fb41919e-0f89-4428-8458-040c340946af)
--- | --- | --- | --- | --- | 

![Home1](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/c6ab123b-a012-46cf-9206-38301aabc00b) | ![Home2](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/13763e23-67da-48e4-9acc-8262722c46be) | ![Home3](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/c223d25e-9fc5-45cd-b02c-19e6b1ef4b8b) | ![Home4](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/38934b71-2cac-4f3b-8d76-2d7912b065d8) | ![Home5](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/f5ebdffe-26ae-4752-b72c-49661a81d028)
--- | --- | --- | --- | --- | 

![toast1](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/41a2fec6-21f6-42de-8244-40c8eee99d0d) | ![toast2](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/b3d16123-3e2e-4085-a116-2d69052f3259) | ![close1](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/04a3f0a8-8b45-44c7-85d1-c660b05cc7b0) | ![close2](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/324faa12-ae5b-416e-9ab8-482dbb8caa08)
--- | --- | --- | --- | 
