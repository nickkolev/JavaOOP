package L05Polymorphism.lab.P01MathOperation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MathOperation math = new MathOperation();

        //static method can be invoked without an instance of the class
        System.out.println(MathOperation.add(2, 2));

        //non-static methods can be invoked only on an instance of the class
        //MathOperation.add(3,3,3) -> error
        System.out.println(math.add(3, 3, 3));
        System.out.println(math.add(4, 4, 4, 4));
    }
}
