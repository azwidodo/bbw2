# BBW App

## Authentication

Go to url: http://localhost:8080/oauth/authorize?client_id=clientapp&response_type=code&scope=read_profile_info  

Page will be redirected to login. Login with username: user001 and password: user001.  

<img width="677" alt="Screenshot 2022-08-10 at 11 41 26" src="https://user-images.githubusercontent.com/61899073/183817389-57cea894-0783-41dc-8369-94cb36b2f5f0.png">  

Then page will be redirected to url: http://localhost:8081/login?code=[CODE]
Here, the code is TKQSQW.  

<img width="678" alt="Screenshot 2022-08-10 at 11 42 35" src="https://user-images.githubusercontent.com/61899073/183817478-da614fd4-6671-4f1c-8acb-451fb1a18773.png">

In Postman, go to url: http://localhost:8080/oauth/token with headers below. The authorization header is "Basic base64(clientapp:123456)".  

<img width="854" alt="Screenshot 2022-08-10 at 11 43 53" src="https://user-images.githubusercontent.com/61899073/183817634-c46e4ad5-3249-4428-b541-05e9973a5497.png">

In the body, send these variables. The code is the code that was returned before, which is TKQSQW.

<img width="852" alt="Screenshot 2022-08-10 at 11 45 03" src="https://user-images.githubusercontent.com/61899073/183817751-db94fa2e-f0fc-4a57-bb3f-2d8bcec23719.png">

Postman will return this response body.  

<img width="853" alt="Screenshot 2022-08-10 at 11 46 10" src="https://user-images.githubusercontent.com/61899073/183817853-b43411bf-08ea-4c24-b59b-e30703b6ffad.png">
