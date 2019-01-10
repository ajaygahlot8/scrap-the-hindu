package com.handzap.thehindu.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.handzap.thehindu.model.Article;
import com.handzap.thehindu.model.News;

@Service
public class NewsService {

	Map<String, List<Integer>> authorsMap = null;
	List<Article> articles = null;

	public void fetchNews() {
		ObjectMapper objectMapper = new ObjectMapper();
		RestTemplate restTemplate = new RestTemplate();
		News news = null;
		List<Integer> articleIds = new ArrayList<>();
		authorsMap = new HashMap<>();
		articles = new ArrayList<>();
		Integer count = 0;
		final String uri = "https://newsapi.org/v2/everything?sources=the-hindu&apiKey=e0ba8be8d4084586aa07631828dfee9b";

		//fetching data from https://newsapi.org/s/the-hindu-api
		String result = restTemplate.getForObject(uri, String.class);
		try {
			news = objectMapper.readValue(result, News.class);

			for (Article article : news.getArticles()) {
				article.setId(count++);
				String authorName = article.getAuthor();
				articleIds = authorsMap.get(authorName);

				if (articleIds == null) {
					articleIds = new ArrayList<>();
					articleIds.add(article.getId());
				} else {
					articleIds.add(article.getId());
				}
				authorsMap.put(authorName, articleIds);
				articles.add(article);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Set<String> getAuthors() {
		isDataPresent();
		return authorsMap.keySet();
	}

	public List<Article> getArticlesByAuthorName(String name) {
		isDataPresent();
		List<Integer> ids = authorsMap.get(name);
		List<Article> selectedArticles = new ArrayList<>();

		for (Integer id : ids) {
			selectedArticles.add(articles.get(id));
		}
		return selectedArticles;
	}

	public List<Article> getArticlesByTitleOrDescription(String content) {
		isDataPresent();
		List<Article> selectedArticles = new ArrayList<>();

		for (Article article : articles) {
			if (article.getTitle().contains(content) || article.getDescription().contains(content)) {
				selectedArticles.add(article);
			}
		}
		return selectedArticles;
	}

	private void isDataPresent() {
		if (articles == null || authorsMap == null) {
			fetchNews();
		}
	}

}
