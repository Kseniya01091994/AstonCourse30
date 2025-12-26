public class ArrayGenerationAndCapture  {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Длина массива: " + array.length);
        try {
            // Попытка доступа к несуществующему индексу
            System.out.println("Попытка доступа к элементу с индексом 10...");
            int element = array[10]; // Здесь возникнет исключение
            System.out.println("Элемент: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.getClass().getName());
            System.out.println("Сообщение: " + e.getMessage());
            System.out.println("Индекс " + e.getMessage() + " выходит за границы массива [0-" + (array.length-1) + "]");
        }
        System.out.println("Программа продолжает работу после обработки исключения");
    }
}
