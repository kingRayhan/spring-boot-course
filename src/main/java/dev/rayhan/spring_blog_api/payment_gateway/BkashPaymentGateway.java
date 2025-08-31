package dev.rayhan.spring_blog_api.payment_gateway;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("bkash")
public class BkashPaymentGateway implements PaymentGateway{
  @Override
  public void pay(double amount) {
    System.out.println("Paying " + amount + " using Bkash");
  }
}
