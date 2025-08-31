package dev.rayhan.spring_blog_api;

import dev.rayhan.spring_blog_api.payment_gateway.BkashPaymentGateway;
import dev.rayhan.spring_blog_api.payment_gateway.PaymentGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;




public class OrderService {
  PaymentGateway paymentGateway;


  public OrderService(PaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public void placeOrder(){
    paymentGateway.pay(1000);
  }
}
