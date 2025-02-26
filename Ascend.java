import java.util.Arrays;
import java.util.Random;

public class Ascend {
    public static void main(String[] args) {
       
        // קלט של שני מספרים שלמים מהמשתמש (a ו-b)
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // יצירת מחולל מספרים אקראיים
        Random random = new Random();

        // יצירת שלושה מספרים אקראיים בתחום [a, b)
        int n1 = random.nextInt(b - a) + a;
        int n2 = random.nextInt(b - a) + a;
        int n3 = random.nextInt(b - a) + a;

        // שמירת המספרים במערך ומיונם
        int[] numbers = {n1, n2, n3};
        Arrays.sort(numbers);

        // הדפסת המספרים המסודרים
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}