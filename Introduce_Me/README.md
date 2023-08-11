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
![splash](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/f7813932-697a-459b-a00f-a935f6bed429) | ![signIn1](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/0c3bba09-792c-4745-908f-1efd93f44624) | ![signUp1](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/cce76e2b-9f8e-4250-8b42-5ee6a4382a4a) | ![signUp2](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/397dc42d-eecc-49d1-b494-104360119db2) | ![signIn2](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/4987d8c8-0347-48c3-a600-11ebacdce9ce)
--- | --- | --- | --- | --- |

![introduction1](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/70060fa5-71f0-407c-956b-6ce598755a9a) | ![introduction2](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/ac57ea88-6a4e-4c62-a4d5-a00f58b72191) | ![introduction3](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/9f8ddcda-81b5-40f0-8f60-89f42b5d6488) | ![introduction4](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/b07b9f41-7e9b-4065-94d2-d68d886774bf) | ![introduction5](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/f432689a-c16f-483d-b491-686e2e74c80f)
--- | --- | --- | --- | --- | 

![click](https://github.com/ars-yeon/Study-Kotlin/assets/68272722/a9f3da68-a451-44d7-b85d-e7185ba55357)
