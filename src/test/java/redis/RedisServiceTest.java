package redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 描述: TODO:
 * 包名: redis.
 * 作者: barton.
 * 日期: 16-9-24.
 * 项目名称: redis
 * 版本: 1.0
 * JDK: since 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {RedisApplication.class})
public class RedisServiceTest {

  @Autowired
  private RedisService service;

  @Test
  public void testGetStudent() {
    System.out.println("第一次:");
    System.out.println(service.getStudent("1", "barton", 22));
    System.out.println("第二次:");
    System.out.println(service.getStudent("1", "barton", 22));
  }
}