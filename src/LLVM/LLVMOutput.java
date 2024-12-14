package LLVM;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class LLVMOutput {

    /**
     * Compiles LLVM IR stored in a file into an executable using Clang.
     * @param irFilename The filename of the LLVM IR code.
     * @param executableName The name of the output executable.
     */
    public void compile(String irFilename, String executableName, List<String> llvmIRCode) {
        // Write the LLVM IR code to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(irFilename))) {
            for (String line : llvmIRCode) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Compile the LLVM IR code using Clang
        try {
            // Create the Clang command
            String clangCommand = "clang -o " + executableName + " " + irFilename;

            // Execute the Clang command
            Process process = Runtime.getRuntime().exec(clangCommand);

            // Capture error stream
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            // Wait for the compilation process to complete
            int exitCode = process.waitFor();

            // Print the error output
            if (exitCode != 0) {
                System.err.println("Compilation failed with exit code: " + exitCode);
                String s;
                while ((s = stdError.readLine()) != null) {
                    System.err.println(s);
                }
            } else {
                System.out.println("Compilation successful. Executable created: " + executableName);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run(String executableName) {
        try {
            // Create the command to run the executable
            String runCommand = "./" + executableName;

            // Execute the command
            Process process = Runtime.getRuntime().exec(runCommand);

            // Capture output stream
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));

            // Capture error stream
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            // Print the output
            String s;
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // Print the error output
            while ((s = stdError.readLine()) != null) {
                System.err.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
