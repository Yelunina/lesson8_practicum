/*
  Определение тарифа для мобильной связи (if-else-if-else)
   Оператор мобильной связи предлагает три тарифа: "Эконом", "Стандарт" и "Премиум".
  Если клиент использует менее 500 минут в месяц, ему подходит "Эконом".
  Если от 500 до 1000 минут — "Стандарт". Если больше 1000 минут — "Премиум".
  Программа должна принимать количество минут и выводить подходящий тариф.
 */
public class Task1 {
    public static void main(String[] args) {
        tariff(-100);
        tariff(0);
        tariff(3);
        tariff(1000);
        tariff(3000);

    }

    public static void tariff(int minutesPerMonth) {
        if (minutesPerMonth>0 && minutesPerMonth < 500) {
            System.out.println("Эконом");
        } else if (minutesPerMonth >= 500 && minutesPerMonth <= 1000) {
            System.out.println("Стандарт");
        } else if (minutesPerMonth > 1000) {
            System.out.println("Премиум");
        }else {
            System.out.println("Для вашего запроса нет тарифа");
        }
    }
}
