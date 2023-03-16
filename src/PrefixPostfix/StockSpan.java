package PrefixPostfix;

import java.util.*;


public class StockSpan {
    public static int[] stockSpan(int[] stock) {
        int[] arr = new int[stock.length];
        for (int i = 0; i < stock.length; i++) {
            int curr = stock[i];
            int j = i;
            int count = 0;
            while (j >= 0 && stock[j] <= curr) {
                count++;
                j--;
            }
            arr[i] = count;
        }
        return arr;
    }

    public static int[] stockSpanStack(int[] stock) {
        int[] span = new int[stock.length];
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < stock.length; i++) {
            while (true) {
                if (stack.isEmpty()) {
                    span[i] = i + 1;
                    break;
                }
                int j = stack.peek();
                int curr = stock[i];
                if (stock[j] <= curr) {
                    stack.pop();

                } else {
                    span[i] = i - j;
                    break;
                }
            }
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] stock = {0, 100, 2, 3, 45, 25, 78};
        System.out.println(Arrays.toString(stockSpanStack(stock)));
    }
}
