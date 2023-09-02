import java.util.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Integer> arrayList = new ArrayList();
        List list = new LinkedList(); // Создав переменную родителя, ей можно присвоить объект любого потомка

        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(7);

        System.out.println(arrayList);
        Collections.sort(arrayList);

        System.out.println(arrayList);

        ArrayList<Car> cars = new ArrayList<>();

        Comparator<Car> speedComparator = new Comparator<Car>() { // Анонимный класс - позволяет создать объект интерфейса или абстрактного класса
            @Override                                             // Идея - поскольку абстрактные методы не имеют реализации, то в точке создания объекта создается класс, который реализует все абстрактные методы
            public int compare(Car o1, Car o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        };

        cars.add(new Car(180, 10000, "BMW"));
        cars.add(new Car(170, 11000, "Lamborginy"));
        cars.add(new Car(200, 9000, "Ford"));
        System.out.println(cars);

        Collections.sort(cars, speedComparator);  // Сортируем автомобили по скорости
        System.out.println(cars);

        Comparator<Car> priceComparator = new Comparator<Car>() { // Анонимный класс - позволяет создать объект интерфейса или абстрактного класса
            @Override                                             // Идея - поскольку абстрактные методы не имеют реализации, то в точке создания объекта создается класс, который реализует все абстрактные методы
            public int compare(Car o1, Car o2) {
                return (int)o1.getPrice() - (int)o2.getPrice();   // TODO Рассмотреть проблему потери дробной части при приведении к int
            }
        };

        Collections.sort(cars, priceComparator);  // Сортируем по цене
        System.out.println(cars);

        // TODO Сделать сортировку по бренду

     /*
     Работа со своей реализацией HashMap
       HashMap hashMap = new HashMap();
        hashMap.add("Hello", "Привет");
        hashMap.out();
        hashMap.add("Bye", "Пока");
        hashMap.out();
        System.out.println(hashMap.find("Hello"));

      */
        //  Работа с HashMap из коллекций
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello", "Привет");
        dictionary.put("Bye", "Пока");
        System.out.println(dictionary.get("Hello"));

    }
}
