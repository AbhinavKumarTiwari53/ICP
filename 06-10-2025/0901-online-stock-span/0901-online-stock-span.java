class StockSpanner {
    private int[] prices, spans;
    private int top;

    public StockSpanner() {
        prices = new int[10000];
        spans = new int[10000];
        top = -1;
    }

    public int next(int price) {
        int span = 1;
        while (top >= 0 && prices[top] <= price) {
            span += spans[top];
            top--;
        }
        top++;
        prices[top] = price;
        spans[top] = span;
        return span;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */