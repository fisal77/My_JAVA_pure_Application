package sa.fisal7.lib;

public class CountInput {
    public static void main(String[ ] args) {
        int total = args.length;
        switch (total) {
            case 0:
            case 1:
            case 2:  System.out.println("2 or less");
                break;
            case 3:
            case 4:
            case 5:  System.out.println("5 or less");
            //ERROR HERE    continue;
            default: System.out.println("More than 5");
        }
        System.out.println("Finished");
    }
}
