import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lesson_First();
        Lesson_Two();
        Lesson_Three();
    }

    public static void Lesson_First() {
        HashMap<String, Double> orders = new HashMap<>();
        orders.put("Иван И.", 4345.5);
        orders.put("Ольга С.", 76564.43);
        orders.put("Александр Т.", 1234.86);
        orders.put("Александр Р.", 23432.87);
        orders.put("Екатерина О.", 1034753.6);
        orders.put("Ярослав В.", 450.0);

        double sum = 0.0;
        for (Double suma : orders.values()) {
            sum = sum + suma;
        }

        System.out.println("Всего было совершено заказов на сумму: " + sum);
    }
    public static void Lesson_Two()
    {
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        ArrayList<Integer> january = new ArrayList<Integer>();
        january.add(1);
        january.add(7);
        ArrayList<Integer> february = new ArrayList<Integer>();
        february.add(23);
        ArrayList<Integer> march = new ArrayList<Integer>();
        march.add(8);
        ArrayList<Integer> may = new ArrayList<Integer>();
        may.add(1);
        may.add(9);
        ArrayList<Integer> june = new ArrayList<Integer>();
        june.add(12);
        ArrayList<Integer> november = new ArrayList<Integer>();
        november.add(4);
        stateHolidays.put("Январь", january);
        stateHolidays.put("Февраль ", february);
        stateHolidays.put("Март ", march);
        stateHolidays.put("Май ", may);
        stateHolidays.put("Июнь ", june);
        stateHolidays.put("Ноябрь ", november);
    }

    public static void Lesson_Three()
    {
        OrdersManager ordersManager = new OrdersManager();

        ordersManager.printAllOrders();
        System.out.println("Всего заказов на сумму: " + ordersManager.getOrdersSum());

        String maxOrderCustomerName = ordersManager.getMaxOrderCustomerName();
        System.out.println("Самая большая сумма заказов у " + maxOrderCustomerName);
        ordersManager.printCustomerOrders(maxOrderCustomerName);

        ordersManager.removeUnprofitableOrders();
    }
}
