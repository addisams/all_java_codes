package object_oriented_programing.package_and_static;

public class OuterInner {
    public static class Inner{
        String name;

        public Inner(String name) {
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Inner a=new Inner("adarsh");
        System.out.println(a.name);
    }
}
