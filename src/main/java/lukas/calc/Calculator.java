package lukas.calc;

public class Calculator {
    public int sum(int a, int b){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a+b;
    }
    public int div(int a, int b){
        if(a == 0){
            throw  new NullPointerException();
        }
        return a-b;
    }

    public boolean testEx(int a){
        if(a == 0){
            return true;
        }
        return false;

    }
}
