public class Output {

    public static void printOs() {
        System.out.println("===수행 가능한 OS===");
        for (Operation operation : Operation.values()) {
            System.out.println(operation.getOs());
        }
        System.out.print("입력 : ");
    }
}
