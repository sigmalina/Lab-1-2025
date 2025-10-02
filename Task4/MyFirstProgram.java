class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setfirst(i);
                o.setsecond(j);
                System.out.print(o.summa());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
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

