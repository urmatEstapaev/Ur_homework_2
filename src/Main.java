import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(33, 15));
        System.out.println(permission(10,29));
        System.out.println(permission(69, -40));
        System.out.println(permission(2, 56));
        System.out.println(permission(18, 23));
        System.out.println(permission(generateRandomAge(), 10));
    }

    private static String permission(int age, int temp) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять1";
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять2";
        } else if (age > 45 && temp >= 10 && temp <= 25) {
            return "Можно идти гулять3";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(88) + 1;
        System.out.println("Age is:" + age);
        return age;
    }
}
