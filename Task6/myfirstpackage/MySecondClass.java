package myfirstpackage;
public class MySecondClass {
    private int first;
    private int second;
    
    public int getfirst() {
        return first;
    }
    
    public int getsecond() {
        return second;
    }
    
    public void setfirst(int first) {
        this.first = first;
    }
    
    public void setsecond(int second) {
        this.second = second;
    }
    
    public MySecondClass(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
    public int summa() {
        return first + second;
    }
}
