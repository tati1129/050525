package prof.homeworks._07_31_Lesson14.task8.repository;

import prof.homeworks._07_31_Lesson14.task8.entity.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonsRepository {
    List<Person> persons = new ArrayList<>();


    public void loadFromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                String gender = parts[3].toUpperCase();
                double salary = Double.parseDouble(parts[4]);

                persons.add(new Person(id, name, age, gender, salary));
                System.out.println("Добавлен человек: " + name);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public List<Person> findAll() {
        return new ArrayList<>(persons);
    }

}
