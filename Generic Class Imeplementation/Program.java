public class Program {
    public static void main(String[] args) {

        GenericClass<String> stringGenericClassnerics = new GenericClass<String>("First Element", "Second Element");

        System.out.println(stringGenericClassnerics.getFirstElement());
        System.out.println(stringGenericClassnerics.getSecondElement());

        System.out.println(stringGenericClassnerics);
    }
}
