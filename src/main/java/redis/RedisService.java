package redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 描述: TODO:
 * 包名: redis.
 * 作者: barton.
 * 日期: 16-9-24.
 * 项目名称: redis
 * 版本: 1.0
 * JDK: since 1.8
 */
@Service
public class RedisService {

  @Autowired
  private RedisTemplate<String, String> redisTemplate;

  @Cacheable(value = "studentcache", keyGenerator = "keyGenerator")
  public Student getStudent(String id, String name, int age) {
    System.out.println("如果没有缓存,则会输出这一行内容!");
    return new Student(id, name, age);
  }
}
