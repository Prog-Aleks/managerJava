package my.app;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class App implements ContraktApp{
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat =
            new SimpleDateFormat("E [ dd.MM.yyyy ] ");
    Date date = new Date();

     String contents;
     String patch;
     String patchPaste;
     String select;
     final String CREATE_DIRS = "createFolder";
     final String CREATE_FILES = "createFile";
     final String RM_FILES = "deleteFile";
     final String HELP = "help" ;
     final String PATH = "path";
     final String COPY = "copyFile";



    @Override
    public void mkDir() {}

    @Override
    public void deleted() {}

    @Override
    public void createFiles() {}

    @Override
    public void copyFiles() {}

    @Override
    public void help() {}

    @Override
    public int readFiles(int n) {
        return 0;
    }


}
