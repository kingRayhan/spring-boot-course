package dev.rayhan.spring_blog_api;

import dev.rayhan.spring_blog_api.payment_gateway.BkashPaymentGateway;
import dev.rayhan.spring_blog_api.payment_gateway.PaymentGateway;
import dev.rayhan.spring_blog_api.payment_gateway.SSLCommerce;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppBeanConfig {

  @Value("${spring.payment_gateway}")
  private String paymentGateway;

  @Bean
  public PaymentGateway bkashPaymentGateway(){
    return new BkashPaymentGateway();
  }

  @Bean
  public PaymentGateway sslCommercePaymentGateway(){
    return new SSLCommerce();
  }

  @Bean
  public OrderService orderService(){
    if(paymentGateway.equals("bkash")){
      return new OrderService(bkashPaymentGateway());
    }
    return new OrderService(sslCommercePaymentGateway());
  }
}
