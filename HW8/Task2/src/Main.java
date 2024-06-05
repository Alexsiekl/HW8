import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] weightMan = new int[10];
        for (int i = 0; i < weightMan.length; i++) {
            weightMan[i] = new Random().nextInt(40, 100);
            System.out.println("Вес " + (i + 1) + "- ого человека составляет " + weightMan[i]);
        }
        int sh = 0;
        double sumWeight = 0;
        for (int j = 0; j < weightMan.length; j++) {
            sumWeight = sumWeight + weightMan[j];
            if (weightMan[j] >= 60 && weightMan[j] <= 80) {
                sh++;
            }
        }
        System.out.println("Средний вес всех людей будет равен " + sumWeight / weightMan.length + " кг.");
        System.out.println("Количество людей, у которых вес находится в промежутке от 60 до 80 кг включительно составляет " + sh + " чел.");
    }
}
