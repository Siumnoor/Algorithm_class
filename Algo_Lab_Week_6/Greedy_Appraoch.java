public class Main {

public static int coinChangeGreedy(int[] coins, int n) {

        int result = 0;

        while (n != 0)
        {

            for (int i=coins.length - 1 ; i>=0 ; i--)
            {
                if (coins[i] <= n)
                {
                    n = n - coins[i];
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] coins = {1, 2, 5};
        int n = 11;

        coinChangeGreedy(coins, n);

    }

}