public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
int[] arr = {2, 6, 9, 10, 1, 19, 5, 3, 11, 7};
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        int[] arrer = new int[10];
for (int i = 0; i < arr.length; i++) {
    arrer[i] = arr[(arr.length - 1) - i];

}
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for (int i = 9; i >= 0; i--) {
            System.out.println((i+1) + " число массива = " + arr[i]);
        }
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        for(int j = 0; j < arrer.length; j++) {
            System.out.println((j+1) + " обратное число массива " + arrer[j]);
        }
    }
}
