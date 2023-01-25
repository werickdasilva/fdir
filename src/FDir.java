import java.io.File;

import static java.lang.System.out;

public class FDir {
    public static void main(String[] args) {
        boolean isValidatedArgs = args.length >= 1;
        String pathActual = "./";

        if (isValidatedArgs) {
            pathActual = args[1];
        }

         File directoryActual = new File(pathActual);

        for (File file: directoryActual.listFiles()) {


            if (file.isDirectory()) {
                out.println(TerminalColor.DIR + file.getName() + TerminalColor.RESET);
            } else {
                out.println(TerminalColor.FILE + file.getName() + TerminalColor.RESET);
            }
        }

    }
}
