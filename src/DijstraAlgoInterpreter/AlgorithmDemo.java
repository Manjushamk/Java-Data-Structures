package DijstraAlgoInterpreter;

public class AlgorithmDemo {
    public static void main(String[] args) {
        Algorithm a = new Algorithm();
        System.out.println(a.interpreter("( ( 1 + 2 ) * 10 )"));
    }
}
