package my.app;

import java.util.Scanner;

public class Select extends App {

    public int selected(int n) {

        Scanner sc = new Scanner(System.in);

        CreateFiles create_f = new CreateFiles();
        MkDir mkDir = new MkDir();
        DeletedFileAndDir del_f = new DeletedFileAndDir();
        Help help = new Help();
        CopyFiles copyFile = new CopyFiles();
        PFile pFile = new PFile();

        System.out.println("****************************** MENU ***************************************\n" +
                           "* Help                 -   help          |   Atr.program  ( Aleks.K )     *\n" +
                           "* -------------------------------------- |   program ver.0.03             *\n" +
                           "* create folder / s    -   createFolder  | ------------------------------ *\n" +
                           "* create file / s      -   createFile   "+" |    Time: "+simpleDateFormat.format(date)+"    *\n" +
                           "* delete file / folder -   deleteFile    | ------------------------------ *\n" +
                           "* patch                -   path          |                                *\n" +
                           "* copy file / s        -   copyFile      |                                *\n" +
                           "* exit program         -   exit          |                                *\n" +
                           "***************************************************************************");
        select = sc.nextLine();

        switch (select) {
            case "exit":
                System.out.println(" You EXIT Bay !");
                System.exit(0);
                break;
            case"path":
                if(select.equals(PATH)){
                    pFile.readFiles(n);
                }
                break;
            case"copyFile":
                if(select.equals(COPY)){
                    copyFile.copyFiles();
                }
                break;
            case "help":
                if (select.equals(HELP)){
                    help.help();
                }
                break;
            case "createFolder":
                if (select.equals(CREATE_DIRS)) {
                    mkDir.mkDir();
                }
                break;
            case "createFile":
                if (select.equals(CREATE_FILES)) {
                    create_f.createFiles();
                }
                break;
            case "deleteFile":
                if(select.equals(RM_FILES)){
                    del_f.deleted();
                }
                break;
            default:
                System.out.println(" you have not chosen anything! Why ??? ");
                break;
        }
        if(n == 1){
            return 1;
        }
        return selected(n - 1) * n;
    }
}
