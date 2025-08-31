package dev.rayhan.spring_blog_api.common;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Builder
@Getter
public class ErrorMessage {
  private String message;
  private HttpStatus code;
}
