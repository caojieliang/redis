package redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@RestController
public class RedisApplication {

  public static void main(String[] args) {
    SpringApplication.run(RedisApplication.class, args);
  }


  @Resource
  RedisService redisService;

  @RequestMapping("putcache")
  public String test() {
    redisService.getStudent("1", "barton", 22);
    return "ok";
  }

  @RequestMapping("usercache")
  public String test2() {
    System.out.println(redisService.getStudent("1", "barton", 22));
    return "success";
  }
}
