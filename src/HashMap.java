/**
 * Класс для работы со словарем.
 * @date 02.09.2023
 * @version 1
 * @author group 43-45
 */
public class HashMap {
    //TODO Рассмотреть алгоритмы борьбы с коллизиями

    // Массив, в котором хранятся элементы
    private String[] arr = new String[11];

    /**
     * Вспомогательный метод для расчета индекса массива по ключу
     * @param str ключ
     * @return индекс
     */
    public int hash(String str){
        System.out.println("Hash: " + str.hashCode());
        System.out.println("index: " + Math.abs(str.hashCode()%arr.length));
        return Math.abs(str.hashCode()%arr.length);
    }

    /**
     * Метод для добавления значение в массив
     * @param key ключ
     * @param value значение
     */
    public void add(String key, String value){
        int index = hash(key);
        arr[index] = value;
    }

    /**
     * Метод для поиска элемента по ключу
     * @param key ключ
     * @return элемент
     */
    public String find(String key){
        int index = hash(key);
        return arr[index];
    }

    /**
     * Метод для вывода всего массива
     */
    public void out(){
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
