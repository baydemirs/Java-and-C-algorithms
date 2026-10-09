import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("10 basamak icin yol sayisi: " + climbingStairs(10));
        System.out.println("11 tutari icin en az para: " + minCoins(new int[]{1, 2, 5}, 11));
    }

    static long climbingStairs(int stepCount) {
        if (stepCount < 0 || stepCount > 91) {
            throw new IllegalArgumentException("Basamak sayisi 0 ile 91 arasinda olmalidir.");
        }
        if (stepCount <= 1) {
            return 1;
        }
        long previous = 1;
        long current = 1;
        for (int step = 2; step <= stepCount; step++) {
            long next = Math.addExact(previous, current);
            previous = current;
            current = next;
        }
        return current;
    }

    static int minCoins(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            throw new IllegalArgumentException("En az bir para degeri gereklidir.");
        }
        if (amount < 0 || amount > 1_000_000) {
            throw new IllegalArgumentException("Tutar 0 ile 1000000 arasinda olmalidir.");
        }
        for (int coin : coins) {
            if (coin <= 0) {
                throw new IllegalArgumentException("Para degerleri pozitif olmalidir.");
            }
        }

        int unreachable = amount + 1;
        int[] best = new int[amount + 1];
        Arrays.fill(best, unreachable);
        best[0] = 0;
        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            for (int coin : coins) {
                if (coin <= currentAmount && best[currentAmount - coin] != unreachable) {
                    best[currentAmount] = Math.min(best[currentAmount], best[currentAmount - coin] + 1);
                }
            }
        }
        return best[amount] == unreachable ? -1 : best[amount];
    }
}

