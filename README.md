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
  **Result** : [{"source":{"id":"the-hindu","name":"The Hindu"},"author":"PTI","title":"Rajlaxmi Arora new head of BCCI’s Internal Committee","description":"The committee deals with complaints of sexual harassment","url":"https://www.thehindu.com/sport/cricket/rajlaxmi-arora-new-head-of-bccis-internal-committee/article25961770.ece","urlToImage":"https://www.thehindu.com/migration_catalog/article14191889.ece/ALTERNATES/LANDSCAPE_615/BCCI","publishedAt":"2019-01-10T15:53:09.000+0000","content":"Rajlaxmi Arora was on Thursday appointed the head of BCCIs four-member Internal Committee (IC), which deals with complaints of sexual harassment. \r\nWhile Saba Karim, Rupawati Rao and Veena Gowda (external member) continue to serve the committee, Ms. Arora has… [+518 chars]"}] <br />
  
 4. To search with Title or Description of Articles <br />
   **Details** : Pass title name or description in request parameter **content** <br />
  **URL** : http://localhost:8080/articles/content?content=Rajlaxmi Arora new head of BCCI’s Internal Committee<br />
  **Result** : [{"source":{"id":"the-hindu","name":"The Hindu"},"author":"PTI","title":"Rajlaxmi Arora new head of BCCI’s Internal Committee","description":"The committee deals with complaints of sexual harassment","url":"https://www.thehindu.com/sport/cricket/rajlaxmi-arora-new-head-of-bccis-internal-committee/article25961770.ece","urlToImage":"https://www.thehindu.com/migration_catalog/article14191889.ece/ALTERNATES/LANDSCAPE_615/BCCI","publishedAt":"2019-01-10T15:53:09.000+0000","content":"Rajlaxmi Arora was on Thursday appointed the head of BCCIs four-member Internal Committee (IC), which deals with complaints of sexual harassment. \r\nWhile Saba Karim, Rupawati Rao and Veena Gowda (external member) continue to serve the committee, Ms. Arora has… [+518 chars]"}]<br />
 
