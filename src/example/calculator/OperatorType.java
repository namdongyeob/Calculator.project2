package example.calculator;

public enum OperatorType {
    PLUS ("+"),
    MINUS ("-"),
    MULTIPLY ("*"),
    DIVIDE ("/");

    private final String symbol;

    OperatorType (String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static OperatorType findSymBol (String symbol) {
        for (OperatorType op : values()) {
            if (op.symbol.equals(symbol)) {
                return op;
            }
        }
        throw new IllegalArgumentException("올바르지 않은 연산자 입니다 " + symbol);
    }
}
