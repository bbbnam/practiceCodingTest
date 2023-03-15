package practice.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import practice.list.dto.Student;

public class ComparisonList {

  public static void main(String[] args) {
    ArrayList<String> list_1 = new ArrayList<>();
    list_1.add("A");
    list_1.add("B");
    list_1.add("C");

    ArrayList<String> list_2 = new ArrayList<>();
    list_2.add("D");
    list_2.add("E");
    list_2.add("F");

    System.out.println("contains1? = " + list_1.containsAll(list_2));
    System.out.println("contains2? = " + Arrays.equals(list_1.toArray(), list_2.toArray()));
    // 그 외... 원소별로 for문 돌려서 확인하기

    List<Student> students1 = Arrays.asList(new Student(1L, "학생1", 18),
        new Student(2L, "학생2", 18), new Student(3L, "학생3", 18));

    List<Student> students2 = Arrays.asList(new Student(2L, "학생2", 18),
        new Student(3L, "학생3", 18), new Student(4L, "학생4", 18));

    List<Student> results = students1.stream()
        .filter(student -> students2.stream().anyMatch(student2 -> {
          return student.getStudentId().equals(student2.getStudentId());
        })).collect(Collectors.toList());

    System.out.println("중복 results = " + results.size());

    List<Student> results2 = students1.stream()
        .filter(student -> students2.stream().noneMatch(student2 -> {
          return student.getStudentId().equals(student2.getStudentId());
        })).collect(Collectors.toList());

    System.out.println("중복되지 않은 results = " + results2.size());
  }
}
