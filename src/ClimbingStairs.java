import java.util.HashMap;

public class ClimbingStairs {
    public int climbStairs(int n) {
        /* Есть лестница из n ступенек, за раз можно подняться на 1 или 2 ступеньки.
        Нужно найти всемозжные способы для поднятия на n ступенек.
         */
        if (n == 1) {
            return 1;
        }
        int[] result = new int[n + 1]; // Массив для хранения комбинаций
        result[1] = 1; // Базовые случаи
        result[2] = 2;

        for (int i = 3; i <= n; i++) { // Начинаем с 3 ступенек, т.к 1 и 2 уже вычислены
            result[i] = result[i - 1] + result[i - 2]; // Сама формула для вычилсения количества способов
        }
        return result[n]; // Вернуть количество комбинаций
    }
    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(10));
        System.out.println(new ClimbingStairs().climbStairs(45));
        System.out.println(new ClimbingStairs().climbStairs(7));
    }
}
