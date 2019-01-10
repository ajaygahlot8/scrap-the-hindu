# scrap-the-hindu
Spring boot project which fetches data from https://newsapi.org/s/the-hindu-api and gives ability to search data via API written

# NOTE
Newsapi returns latest 20 articles sorted by recent date. Hence this project will show data based upon recent articles fetched.

# Steps to run the project
1. Cone the project
2. Inside project folder run $ mvn spring-boot:run
3. Open browser and use below API to access data.

# API

1. To Fetch Latest 20 news from https://newsapi.org/s/the-hindu-api .<br />
  **URL** : http://localhost:8080/news <br />
  **Result** : Data Fetched Successfully!! <br />

2. To fetch all Authors from scrapped data. <br />
  **URL** : ttp://localhost:8080/authors<br />
  **Result** : ["ஆர்.ஷபிமுன்னா","Special Correspondent New Delhi","Lalatendu Mishra","PTI","The Hindu","faith","Staff Reporter","Agence France-Presse","AP","Yuthika Bhargava","இந்து தமிழ் திசை","Krishnadas Rajagopal","Special Correspondent","Aditya Anand"] <br />
  
3. To search article with author name<br />
  **Details** : Pass author name in request parameter **name** <br />
  **URL** : http://localhost:8080/articles/author?name=PTI<br />
  **Result** : [{"author":"PTI","title":"Bengaluru to host first T20I against Australia","description":"Bengaluru will host the first match of Australia’s limited-over tour of India with a T20I on Feb. 24, the BCCI announced on Thursday.The second T20I will be played in Visakhapatnam on Feb. 27, followe","content":"Bengaluru will host the first match of Australias limited-over tour of India with a T20I on Feb. 24, the BCCI announced on Thursday.\r\nThe second T20I will be played in Visakhapatnam on Feb. 27, followed by five ODIs.\r\nThe first ODI will be held in Hyderabad o… [+511 chars]"}] <br />
  
 4. To search with Title or Description of Articles <br />
   **Details** : Pass title name or description in request parameter **content** <br />
  **URL** : http://localhost:8080/articles/content?content=Rajlaxmi Arora new head of BCCI’s Internal Committee<br />
  **Result** : [{"author":"PTI","title":"Bengaluru to host first T20I against Australia","description":"Bengaluru will host the first match of Australia’s limited-over tour of India with a T20I on Feb. 24, the BCCI announced on Thursday.The second T20I will be played in Visakhapatnam on Feb. 27, followe","content":"Bengaluru will host the first match of Australias limited-over tour of India with a T20I on Feb. 24, the BCCI announced on Thursday.\r\nThe second T20I will be played in Visakhapatnam on Feb. 27, followed by five ODIs.\r\nThe first ODI will be held in Hyderabad o… [+511 chars]"}]<br />
 
