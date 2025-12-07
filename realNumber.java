public class realNumber {
    int top;
    int bottom;

    public realNumber(int top, int bottom) {
        if (bottom == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {return top;}
    public int getBottom() {return bottom;}
    public double decimal() {return (top+0.0)/bottom;}

    public void multiply(int scalar) {
        top *= scalar;
    }

    // make a reduce function
    public void reduce() {
        for (int i = 2; i <= Math.min(bottom, top); i++) {
            if (top % i == 0 && bottom % i == 0) {
                top /= i;
                bottom /= i;
                reduce();
                return;
            }
        }
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}
