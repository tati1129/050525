package prof.homeworks._07_31_Lesson14.task10;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BooksRepository {
    List<Book> books = new ArrayList<>();

    public void loadFromFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                String author = parts[2];
                List<String> tags = new ArrayList<>();
                for (int i = 3; i < parts.length; i++) {
                   tags.add(parts[i].replace("«","").replace("»", ""));
                }
                books.add(new Book(id,title,author,tags));
            }
        }catch (IOException e){
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public List<Book> findAll(){
        return new ArrayList<>(books);
    }
}
