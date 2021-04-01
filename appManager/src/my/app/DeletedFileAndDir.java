package my.app;
import java.io.File;
import java.util.Scanner;

public class DeletedFileAndDir extends App {

    @Override
    public void deleted() {
        Scanner sc =new Scanner(System.in);
        super.deleted();
        System.out.println("Select name files delete: ");
        patch = sc.nextLine();
        File file = new File(patch);
        if (file.delete()){
            System.out.println("file or folder deleted ok. \n time deleted -> "+ simpleDateFormat.format(date));
        }else {
            System.out.println("no files or folder! ");
        }

    }
}
