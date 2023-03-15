package practice.list.dto;

public class Student {

  private Long studentId;

  private String name;

  private int age;

  public Student(Long studentId, String name, int age) {
    this.studentId = studentId;
    this.name = name;
    this.age = age;
  }

  public Long getStudentId() {
    return studentId;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
