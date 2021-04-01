package my.app;
import java.io.File;
import java.util.Scanner;

public class MkDir extends App{

    Scanner sc = new Scanner(System.in);

    @Override
    public void mkDir() {
        System.out.println("Create new folder ? Enter name:  ");
        patch = sc.nextLine();
        File mkdir = new File(patch);
        if(!mkdir.exists()){
            if(mkdir.mkdirs()){
                System.out.println("\n You create folder ok. ("+patch+")\n time create -> " +
                        simpleDateFormat.format(date)+"\n");
            }else{
                System.out.println(" folder no created ! ");
            }
        }
    }

}
