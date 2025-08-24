package prof.homeworks._07_31_Lesson14.task9;

import java.util.Map;

/*
Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
   Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.
 */
public class Main {
    public static void main(String[] args) {

        Service service = new Service();

printResult(service.groupByMonths());
    }
    public static  <K, V> void  printResult(Map<K, V> result){
        for (Map.Entry<K,V> m : result.entrySet()){
            System.out.println("month : " + m.getKey() + " ->  summ : " + m.getValue() );
        }
    }
}
