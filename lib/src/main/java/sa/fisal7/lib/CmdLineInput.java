package sa.fisal7.lib;

public class CmdLineInput {
    public static void main(String[ ] args) {
int a = 0;
int b = 3;
        a = --b;
        System.out.println(b);
        System.out.println(a);

        String[ ][ ] firstName;
        firstName = new String[14][ ];

        int i = 0;
        do {
            if (args.length == 0) {
                System.out.println("No input");
                break;
            }
            System.out.print(args[i] + " ");
            i++;
        } while (i < args.length);
        System.out.print("Finished");
    }
}
