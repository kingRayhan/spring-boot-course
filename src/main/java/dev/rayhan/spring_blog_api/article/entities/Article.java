package dev.rayhan.spring_blog_api.article.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Article {
  private UUID id;
  private String title;
  private String handle;
  private String body;
//  private String author_id;
  private LocalDateTime createdAt;
}
