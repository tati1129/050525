package prof.homeworks._06_30_Lesson6.hashMap.task4;
/*
Отслеживание оценок студентов:
Создайте HashMap, где ключом является имя студента, а значением - его средний балл.
Добавьте данные пяти студентов.
Найдите и выведите имя студента с наивысшим средним баллом.
Измените средний балл одного из студентов и выведите обновленные данные.
 */

import java.util.HashMap;
import java.util.Map;

public class StudentApp {
    public static void main(String[] args) {
        Map<String, Double> students = new HashMap<>();

        students.put("Ann", 3.2);
        students.put("Steve", 5.6);
        students.put("Mariam", 7.1);
        students.put("Tom", 6.0);
        students.put("Joan", 8.5);
        students.put("Kate", 2.2);
        students.put("John", 8.5);


        System.out.println(students);

        System.out.println(findBigAvg(students));

        students.replace("John", 9.1);

        System.out.println(students);
        System.out.println(findBigAvg(students));
    }

    public static Map<String,Double> findBigAvg(Map<String,Double> persons){
      Map<String, Double> result = new HashMap<>();
      Double avgMax = Double.MIN_VALUE;
      for (Double avg : persons.values()){
          if (avg>avgMax){
              avgMax = avg;
          }
      }

      for (Map.Entry<String,Double> entry : persons.entrySet()){
          if (entry.getValue().equals(avgMax)){
              result.put(entry.getKey(), entry.getValue());

          }
      }
      return result;

//        Double avgMax = (double) 0;
//        String name = "";
//        for (Map.Entry<String,Double> entry : persons.entrySet() ){
//            String key = entry.getKey();
//            Double avg = entry.getValue();
//            if (avg > avgMax){
//                avgMax = avg;
//            }
//        }
//        result.put(name,avgMax);
//        return result;
    }
}
