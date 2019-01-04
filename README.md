# order salami process
First tryout with the new official camunda springboot starter pom.

First steps with the camunda spring boot things: https://docs.camunda.org/get-started/spring-boot/

![ordersalamiprocess](orderprocess.png)

German Blogpost: https://sebastianmonzel.de/2017/12/camunda-playground-spring-boot-starter-pom-ausprobiert/


# API

## order/
order a new salami - if too much salamis are ordered a human task is created to inform the customer:
/order/salami

## stock/

get actual stock count:
GET stock/salami/count

take a salami from the stock:
GET /stock/salami

