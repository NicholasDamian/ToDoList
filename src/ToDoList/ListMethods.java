package ToDoList;

/**
 * Created by nicholashall on 10/11/16.
 */
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class ListMethods {

    ArrayList<String> grocery = new ArrayList<>();
    ArrayList<String> activity = new ArrayList<>();
    ArrayList<String> shoes = new ArrayList<>();


    String fileGrocery = "Grocery.txt";
    FileWriter makeGrocery;

    String fileActivity = "Activity.txt";
    FileWriter makeActivity;

    String fileShoes = "Shoes.txt";
    FileWriter makeShoes;

//try
//
//    {
//        makeGrocery = new FileWriter(fileGrocery, true);
//        makeActivity = new FileWriter(fileActivity, true);
//        makeShoes = new FileWriter(fileShoes, true);
//
//        Scanner inFileGrocery = new Scanner(new FileReader(fileGrocery));
//        Scanner inFileActivity = new Scanner(new FileReader(fileActivity));
//        Scanner inFileShoes = new Scanner(new FileReader(fileShoes));
//    } catch(IOException e ){
//        System.out.println("You broke it");
//    }


    public void loadFiles()throws IOException {
        makeGrocery = new FileWriter(fileGrocery, true);
        makeActivity = new FileWriter(fileActivity, true);
        makeShoes = new FileWriter(fileShoes, true);

        Scanner inFileGrocery = new Scanner(new FileReader(fileGrocery));
        Scanner inFileActivity = new Scanner(new FileReader(fileActivity));
        Scanner inFileShoes = new Scanner(new FileReader(fileShoes));

        while (inFileGrocery.hasNextLine()) {
            grocery.add(inFileGrocery.nextLine());
        }

        while (inFileActivity.hasNextLine()) {
            activity.add(inFileActivity.nextLine());
        }

        while (inFileShoes.hasNextLine()) {
            shoes.add(inFileShoes.nextLine());
        }
    }

//    FileWriter makeGrocery = new FileWriter(fileGrocery);
}
