package dev.rayhan.spring_blog_api.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler {
  @ExceptionHandler(ApiNotFoundException.class)
  public ResponseEntity<?> handleException(ApiNotFoundException exception) {
    return new ResponseEntity<>(
      ErrorMessage.builder()
        .code(HttpStatus.NOT_FOUND)
        .message(exception.getMessage())
        .build()
      , HttpStatus.NOT_FOUND);
  }
}
