public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        
        
        System.out.println(c.add(11, 13));
        System.out.println(c.sub(19, 7));
    
    }
    
}

