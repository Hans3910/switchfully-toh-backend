# Switchfully Backend for ToH 🦸
[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

Made with ❤️, please deploy carefully! 

## The following goodies are included
* Spring Boot application
* Layered architeture (api -> service -> repository)
* An awesome banner.txt (thank you https://devops.datenkollektiv.de/renderBannerTxt?text=Switchfully&font=doom)
* Swagger (https://springdoc.org/)
* Your heroes are configured in `data.sql`

## ⚠️CORS ⚠️
Please configure CORS properly, otherwise the Browser Deities will get angry! 
* https://en.wikipedia.org/wiki/Cross-origin_resource_sharing
* https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS
* https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-cors
* https://spring.io/guides/gs/rest-service-cors/
* https://spring.io/blog/2015/06/08/cors-support-in-spring-framework

```java
@Configuration
@EnableWebMvc
public class HeroWebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/heroes")
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("GET");
    }
}
```

## DONE
* GET

## TODO
* POST / PUT / DELETE