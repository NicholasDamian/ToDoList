package ToDoList;

/**
 * Created by nicholashall on 10/11/16.
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.io.PrintWriter;
public class TheLists {
    public static ArrayList<String> grocery = new ArrayList<>();
    public static ArrayList<String> activity = new ArrayList<>();
    public static ArrayList<String> shoes = new ArrayList<>();
    String fileGrocery = "Grocery.txt";
    String fileActivity = "Activity.txt";
    String fileShoes = "Shoes.txt";

    Menu m1 = new Menu();

    void AddToList() throws IOException {
        String whichList = "no";
        Scanner inputYesNo = new Scanner(System.in);
        int yesNo;
        String note ="";
        Scanner inputNote = new Scanner(System.in);

        System.out.println("Which List would you like too add too? grocery, activity, shoes");
        whichList = inputYesNo.nextLine();
        switch (whichList) {


            case "grocery":
                System.out.println("Is this Item important? 1 = yes 2 = no");
                yesNo = inputYesNo.nextInt();
                switch (yesNo) {
                    case 1:
                        while(!Objects.equals(note, "StopNow")) {
                            System.out.println("Please enter the note you would like to add to the List? If you wish to Stop enter StopNow");
                            note = inputNote.nextLine();
                            grocery.add(0, note);
                        }
                        grocery.remove(0);
                        break;
                    case 2:
                        while(!Objects.equals(note, "StopNow")) {
                            System.out.println("Please enter the note you would like to add to the List? If you wish to Stop enter StopNow");
                            note = inputNote.nextLine();
                            grocery.add(note);
                        }
                        grocery.remove((grocery.size() )-1);
                        break;
                    default:
                        System.out.println("Don't be rude put a real value in.");
                        AddToList();
                        break;
                } break;


            case "activity":
                System.out.println("Is this Item important? 1 = yes 2 = no");
                yesNo = inputYesNo.nextInt();
                switch (yesNo) {
                    case 1:
                        while(!Objects.equals(note, "StopNow")) {
                            System.out.println("Please enter the note you would like to add to the List? If you wish to Stop enter StopNow");
                            note = inputNote.nextLine();
                            activity.add(0, note);
                        }
                        activity.remove(0);
                        break;
                    case 2:
                        while(!Objects.equals(note, "StopNow")) {
                            System.out.println("Please enter the note you would like to add to the List? If you wish to Stop enter StopNow");
                            note = inputNote.nextLine();
                            activity.add(note);
                        }
                        activity.remove((activity.size() )-1);
                        break;
                    default:
                        System.out.println("Don't be rude put a real value in.");
                        AddToList();
                        break;
                } break;


            case "shoes":
                System.out.println("Is this Item important? 1 = yes 2 = no");
                yesNo = inputYesNo.nextInt();
                switch (yesNo) {
                    case 1:
                        while(!Objects.equals(note, "StopNow")) {
                            System.out.println("Please enter the note you would like to add to the List? If you wish to Stop enter StopNow");
                            note = inputNote.nextLine();
                            shoes.add(0, note);
                        }
                        shoes.remove(0);
                        break;
                    case 2:
                        while(!Objects.equals(note, "StopNow")) {
                            System.out.println("Please enter the note you would like to add to the List? If you wish to Stop enter StopNow");
                            note = inputNote.nextLine();
                            shoes.add(note);
                        }
                        shoes.remove((shoes.size() )-1);
                        break;
                    default:
                        System.out.println("Don't be rude put a real value in.");
                        AddToList();
                        break;
                } break;


            default:
                System.out.println("Please enter a real value.");
                AddToList();
                break;
        }

        Menu m1 = new Menu();
        m1.Menu();
    }

    void PrintList() throws IOException{
        int anotherList;
        int whichList;
        Scanner inputWhichList = new Scanner(System.in);
        Scanner inputAnotherList = new Scanner(System.in);

        System.out.println("Which List would you like to print select the number.");
        System.out.println("1  Grocery");
        System.out.println("2  Activity");
        System.out.println("3  Shoes");
        whichList = inputWhichList.nextInt();
        switch (whichList){
            case 1:
                for (int i = 0; i < grocery.size();++i){
                    System.out.println(i +" "+ grocery.get(i));
                }
                break;
            case 2:
                for (int i = 0; i < activity.size();++i){
                    System.out.println(i +" "+ activity.get(i));
                }
                break;
            case 3:
                for (int i = 0; i < shoes.size();++i){
                    System.out.println(i +" "+ shoes.get(i));
                }
                break;
            default:
                System.out.println("Please just stop with messing with my program.");
                m1.Menu();
                break;
        }
        System.out.println("Would you like to look at another list? Select the number");
        System.out.println("1  Yes");
        System.out.println("2  No");
        anotherList = inputAnotherList.nextInt();
        switch (anotherList){
            case 1:
                PrintList();
                break;
            case 2:
                m1.Menu();
                break;
            default:
                System.out.println("Sorry I decided that this error will take you back to the main Menu");
                m1.Menu();
                break;
        }

    }

    public void Remove() throws IOException{
        int anotherList;
        int whichList;
        int delete;
        Scanner inputWhichList = new Scanner(System.in);
        Scanner inputAnotherList = new Scanner(System.in);

        System.out.println("Which List would you like to delete an Item from?");
        System.out.println("1  Grocery");
        System.out.println("2  Activity");
        System.out.println("3  Shoes");
        whichList = inputWhichList.nextInt();
        switch (whichList){
            case 1:
                for (int i = 0; i < grocery.size();++i){
                    System.out.println(i +" "+ grocery.get(i));
                }
                System.out.println("Please enter the number to the left of the note you would like too remove.");
                delete = inputAnotherList.nextInt();
                grocery.remove(delete);
                break;
            case 2:
                for (int i = 0; i < activity.size();++i){
                    System.out.println(i +" "+ activity.get(i));
                }
                System.out.println("Please enter the number to the left of the note you would like too remove.");
                delete = inputAnotherList.nextInt();
                activity.remove(delete);
                break;
            case 3:
                for (int i = 0; i < shoes.size();++i){
                    System.out.println(i +" "+ shoes.get(i));
                }
                System.out.println("Please enter the number to the left of the note you would like too remove.");
                delete = inputAnotherList.nextInt();
                shoes.remove(delete);
                break;
            default:
                System.out.println("Please just stop with messing with my program.");
                m1.Menu();
                break;
        }
        System.out.println("Would you like to delete a item from another list? Select the number");
        System.out.println("1  Yes");
        System.out.println("2  No");
        anotherList = inputAnotherList.nextInt();
        switch (anotherList){
            case 1:
                PrintList();
                break;
            case 2:
                m1.Menu();
                break;
            default:
                System.out.println("Sorry I decided that this error will take you back to the main Menu");
                m1.Menu();
                break;
        }

    }

    public void LoadFiles() throws IOException{





//        PrintWriter outFileGrocery = new PrintWriter(new FileWriter(fileGrocery));
//        PrintWriter outFileActivity = new PrintWriter(new FileWriter(fileActivity));
//        PrintWriter outFileShoes = new PrintWriter(new FileWriter(fileShoes));
//
//        for(int i = 0; i < grocery.size(); ++i){
//            outFileGrocery.println(i);
//        }
//        for(int i = 0; i < activity.size(); ++i){
//            outFileActivity.println(i);
//        }
//        for(int i = 0; i < shoes.size(); ++i){
//            outFileShoes.println(i);
//        }

//        FileWriter makeGrocery;
//        FileWriter makeActivity;
//        FileWriter makeShoes;
//
//
//        makeGrocery = new FileWriter(fileGrocery, true);
//        makeActivity = new FileWriter(fileActivity, true);
//        makeShoes = new FileWriter(fileShoes, true);

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

    public void save() throws IOException{

        FileWriter makeGrocery;
        FileWriter makeActivity;
        FileWriter makeShoes;


        makeGrocery = new FileWriter(fileGrocery);
        makeActivity = new FileWriter(fileActivity);
        makeShoes = new FileWriter(fileShoes);

        PrintWriter outFileGrocery = new PrintWriter(new FileWriter(fileGrocery));
        PrintWriter outFileActivity = new PrintWriter(new FileWriter(fileActivity));
        PrintWriter outFileShoes = new PrintWriter(new FileWriter(fileShoes));

        for(int i = 0; i < grocery.size(); ++i){
            outFileGrocery.println(grocery.get(i));
        }
        for(int i = 0; i < activity.size(); ++i){
            outFileActivity.println(activity.get(i));
        }
        for(int i = 0; i < shoes.size(); ++i){
            outFileShoes.println(shoes.get(i));
        }
        outFileActivity.close();
        outFileGrocery.close();
        outFileShoes.close();
    }

}