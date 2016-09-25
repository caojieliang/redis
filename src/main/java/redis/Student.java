package redis;

/**
 * 描述: TODO:
 * 包名: redis.
 * 作者: barton.
 * 日期: 16-9-24.
 * 项目名称: redis
 * 版本: 1.0
 * JDK: since 1.8
 */
public class Student {
  public Student() {
  }

  public Student(String id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  private String id;
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
