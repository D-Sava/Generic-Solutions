public class Program {
    public static void main(String[] args) {
        //Type: STRING
        Stek<String> stekStringova = new Stek<>();

        stekStringova.push("First Element");
        stekStringova.push("Second Element");
        stekStringova.push("Third Element");

        stekStringova.pop();
        stekStringova.pop();

        System.out.println(stekStringova.isEmpty());

        //Type: INT
        Stek<Integer> stekIntegera = new Stek<>();

        stekIntegera.push(1);
        stekIntegera.push(2);
        stekIntegera.push(3);

        stekIntegera.pop();
        stekIntegera.pop();

        System.out.println(stekIntegera.isEmpty());

    }
}
