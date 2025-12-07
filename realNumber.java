public class realNumber {
    int top;
    int bottom;

    public realNumber(int top, int bottom) {
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
}
