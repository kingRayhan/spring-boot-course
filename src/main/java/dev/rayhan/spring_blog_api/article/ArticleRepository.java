package dev.rayhan.spring_blog_api.article;

import dev.rayhan.spring_blog_api.article.entities.Article;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class ArticleRepository {
  private List<Article> articles = List.of(
    Article.builder()
      .id(UUID.randomUUID())
      .title("article 1")
      .handle("article-1")
      .createdAt(LocalDateTime.now())
      .build(),
    Article.builder()
      .id(UUID.randomUUID())
      .title("article 2")
      .handle("article-2")
      .createdAt(LocalDateTime.now())
      .build(),
    Article.builder()
      .id(UUID.randomUUID())
      .title("article 3")
      .handle("article-3")
      .createdAt(LocalDateTime.now())
      .build()
  );


  public List<Article> findAll() {
    return articles;
  }

  public Article findById(UUID id) {
    return articles.stream()
      .filter(article -> article.getId().equals(id))
      .findFirst()
      .orElse(null);
  }
}
