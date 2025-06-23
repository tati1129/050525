package prof.homeworks.lesson.task1;

public class Main {
    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        int[] array = service.createArrayFromUserInput();
        service.fillArrayFromUserInput(array);
        int[] arraySorted = service.sortReverse(array);
        service.printArr(arraySorted);
    }
}
