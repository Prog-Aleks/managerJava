package my.app;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFiles extends App{
    Scanner sc = new Scanner(System.in);

    @Override
    public void createFiles() {
try{
    System.out.println("add text:  ");
    contents = sc.nextLine();
    System.out.println("Where to save file name, plese input:  ");
    patch = sc.nextLine();

    File myFile = new File(patch);
    BufferedWriter writer = new BufferedWriter( new FileWriter(myFile, true));
    writer.write(contents+"\n");// строка записи
    writer.flush();
    System.out.println("\n Ok new create in Files!\n Save on: "+ patch+"\n");
    writer.close();
       }catch (IOException ex){
            System.out.println("Что-то не так пошло ! ");
       }
    }
}
