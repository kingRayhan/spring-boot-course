package dev.rayhan.spring_blog_api.payment_gateway;

public interface PaymentGateway {
  void pay(double amount);
}
