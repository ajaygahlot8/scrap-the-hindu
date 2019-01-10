package com.handzap.thehindu.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handzap.thehindu.model.Article;
import com.handzap.thehindu.service.NewsService;

@RestController
public class NewsController {

	@Autowired
	NewsService newsService;

	@GetMapping(value = "/news")
	String getNews() {
		newsService.fetchNews();
		return "Data Fetched Successfully!!";
	}

	@GetMapping(value = "/authors")
	Set<String> getAuthors() {
		return newsService.getAuthors();
	}

	@GetMapping(value = "/articles/author")
	List<Article> getArticlesByAuthorName(@RequestParam String name) throws UnsupportedEncodingException {
		return newsService.getArticlesByAuthorName(name);
	}

	@GetMapping(value = "/articles/content")
	List<Article> getArticlesByTitleOrDescription(@RequestParam String content) {
		return newsService.getArticlesByTitleOrDescription(content);
	}
}
