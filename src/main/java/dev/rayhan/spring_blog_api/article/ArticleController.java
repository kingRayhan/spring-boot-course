package dev.rayhan.spring_blog_api.article;

import dev.rayhan.spring_blog_api.article.entities.Article;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ArticleController {
  private final ArticleRepository articleRepository = new ArticleRepository();

  @GetMapping("/api/articles")
  public List<Article> index(){
    return articleRepository.findAll();
  }

  @GetMapping("/test")
  public ErrorMessage show(){
    return new ErrorMessage("Test error");
  }
}
