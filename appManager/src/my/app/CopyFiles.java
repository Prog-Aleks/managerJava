package my.app;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;


public class CopyFiles extends App{
    @Override
    public void copyFiles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("copy file:  ");
        patch = sc.nextLine();
        File FileCopy  = new File(patch);
        System.out.println("paste file: ");
        patchPaste = sc.nextLine();
        File pasteFile = new File(patchPaste);

        try {
            Files.copy(FileCopy.toPath(), pasteFile.toPath());
            System.out.println("file copy ok !");
        }catch (IOException ex){
            ex.printStackTrace();
            System.out.println(" no copy file ! ");
        }

    }
}
