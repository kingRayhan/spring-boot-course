package dev.rayhan.spring_blog_api;

import dev.rayhan.spring_blog_api.payment_gateway.BkashPaymentGateway;
import dev.rayhan.spring_blog_api.payment_gateway.SSLCommerce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBlogApiApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringBlogApiApplication.class, args);

    var orderService = context.getBean(OrderService.class);

    orderService.placeOrder();

//    OrderService orderService = new OrderService(
//      new SSLCommerce()
//    );
//    orderService.placeOrder();
  }

}
