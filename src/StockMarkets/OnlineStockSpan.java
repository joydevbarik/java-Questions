import java.util.Stack;

class StockSpanner {

    Stack<int[]> stack = new Stack<>();

    public int next(int price) {

        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {

            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});

        return span;
    }
}

public class OnlineStockSpan {

    public static void main(String[] args) {

        StockSpanner sp = new StockSpanner();

        System.out.println(sp.next(100));
        System.out.println(sp.next(80));
        System.out.println(sp.next(60));
        System.out.println(sp.next(70));
        System.out.println(sp.next(60));
        System.out.println(sp.next(75));
        System.out.println(sp.next(85));
    }
}