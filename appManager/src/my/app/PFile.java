package my.app;
import java.io.File;
import java.util.Objects;

public class PFile extends App{

    public int readFiles(int n) {
        System.out.println("Enter patch: ");
        patchPaste = sc.nextLine();
        if(patchPaste.equals("exit")) {
            System.out.println(" You EXIT Bay !");
            System.exit(0);
        }

        File dir = new File(patchPaste);


        if(dir.isDirectory()){
            for(File item : Objects.requireNonNull(dir.listFiles())){
                if(item.isDirectory()){
                    System.out.println(item.getName()+" <-------> FOLDER");
                }
                else{
                    System.out.println(item.getName()+ " <--------> FILES");
                }
            }
        }
        if(n == 1){
            return 1;
        }
        return readFiles(n - 1) * n;

    }

}
