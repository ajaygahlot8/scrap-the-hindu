package com.handzap.thehindu.model;

public class ArticleDTO {

	String author;
	String title;
	String description;
	String content;

	public ArticleDTO() {

	}
	public ArticleDTO(Article article) {
		this.author = article.getAuthor();
		this.title = article.getTitle();
		this.description = article.getDescription();
		this.content = article.getContent();
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
