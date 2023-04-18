import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2009, 9, 28);

        System.out.println("Найти какой это день недели: " + localDate.getDayOfWeek().toString());

        System.out.println("Найти какой это по счету день в году: " + localDate.getDayOfYear());

        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int numberOfTheWeekInTheMonth = localDate.get(weekFields.weekOfMonth());
        System.out.println("Найти номер недели в месяце: " + numberOfTheWeekInTheMonth);

        int dayOfWeek = localDate.get(ChronoField.DAY_OF_WEEK);
        System.out.println("Найти день недели: " + dayOfWeek);

        System.out.println("Вывести номер месяца года: " + localDate.getMonthValue());
    }
}
