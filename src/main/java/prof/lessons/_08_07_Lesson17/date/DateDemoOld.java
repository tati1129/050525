package prof.lessons._08_07_Lesson17.date;

import java.util.Date;

public class DateDemoOld {
    public static void main(String[] args) {
        Date nowDate1 = new Date();
        Date nowDate2 = new Date();

//        System.out.println("Date is now : " + nowDate1);
      System.out.println("Date is now : " + nowDate1.getTime());
      System.out.println("Date is now : " + nowDate2.getTime());
    }
}
