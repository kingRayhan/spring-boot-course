package dev.rayhan.spring_blog_api.payment_gateway;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("ssl")
public class SSLCommerce implements PaymentGateway{
  @Override
  public void pay(double amount) {
    System.out.println("Paying " + amount + " using SSLCommerce");
  }
}
