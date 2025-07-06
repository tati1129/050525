package prof.homeworks._06_19_Lesson2.task3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task {

    public static class PrintHello implements Command {

        @Override
        public void execute() {
            System.out.println("Hello!");
        }
    }

    public static class PrintDate implements Command {

        @Override
        public void execute() {
            System.out.println("Today's date: " + LocalDate.now());
            System.out.println("Today's date: " + LocalTime.now());
            //System.out.println(LocalDateTime.now());
        }
    }

    public static class PrintBye implements Command {

        @Override
        public void execute() {
            System.out.println("Buy!");
        }
    }


    public static void main(String[] args) {
        PrintHello printHello = new PrintHello();
        PrintDate printDate = new PrintDate();
        PrintBye printBye = new PrintBye();

        Command[] commands = {printHello, printDate, printBye};

        for (Command command : commands) {
            command.execute();
        }

    }
}
