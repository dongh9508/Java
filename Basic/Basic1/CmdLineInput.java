public class CmdLineInput {
public static void main(String[] argv) {
int length = argv.length;
for (int counter = 0; counter < length; ++counter) {
System.out.println(argv[counter]);
}
}
}
