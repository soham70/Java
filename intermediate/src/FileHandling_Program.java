import java.io.File; //Import Java File Class
import java.io.FileNotFoundException;
import java.io.IOException; //Handling Exception
import java.io.FileWriter; //Writing to a file
import java.util.Scanner;


public class FileHandling_Program {

    public static void main(String[] args)
    {
        //Creating a File
//
//        try{
//            File obj =new File("myfile.txt");
//            if(obj.createNewFile())
//            {
//                System.out.println("File created with name: " + obj.getName());
//            }
//            else{
//                System.out.println("File Already Exists");
//            }
//        }
//        catch (IOException e){
//            System.out.println("Error Occurred!!");
//            e.printStackTrace();
//        }

        //Writing to a File
//        try{
//            FileWriter fw = new FileWriter("myfile.txt");
//            fw.write("Adding text in Java File is easy");
//            fw.close();
//            System.out.println("Successfully written in File");
//
//        }
//        catch (IOException e){
//            System.out.println("Error Occurred!!");
//            e.printStackTrace();
//        }

        //Reading from a File.
//
//        try {
//            File read = new File("myfile.txt");
//            Scanner sc =new Scanner(read);
//            while (sc.hasNext())
//            {
//                String data = sc.nextLine();
//                System.out.println(data);
//                System.out.println("Success reading File...");
//            }
//            sc.close();;
//        }
//        catch (FileNotFoundException f)
//        {
//            System.out.println("Error Raised!!!");
//            f.printStackTrace();
//        }

        //Getting Information about a file
//
//        File getInfo = new File("myfile.txt");
//        if(getInfo.exists())
//        {
//            System.out.println("File Name: " + getInfo.getName());
//            System.out.println("Absolute Path: " + getInfo.getAbsolutePath());
//            System.out.println("Writeable: " + getInfo.canWrite());
//            System.out.println("Readable: " + getInfo.canRead());
//        }
//        else{
//            System.out.println("File Does not Exist.....");
//        }

        //Deleting a File

        File getInfo = new File("myfile.txt");
        if(getInfo.delete())
        {
            System.out.println(getInfo.getName() + " file deleted successfully");
        }
        else{
            System.out.println("File Not Deleted");
        }




    }


}
