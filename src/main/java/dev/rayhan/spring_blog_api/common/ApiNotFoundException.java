package dev.rayhan.spring_blog_api.common;

public class ApiNotFoundException extends RuntimeException{
  public ApiNotFoundException(String message) {
    super(message);
  }
}
