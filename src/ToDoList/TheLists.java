package ToDoList;

/**
 * Created by nicholashall on 10/11/16.
 */
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class TheLists {
    ArrayList<String> grocery = new ArrayList<>();
    ArrayList<String> activity = new ArrayList<>();
    ArrayList<String> shoes = new ArrayList<>();


    public void AddToList(){
        String whichList = "no";
        Scanner inputYesNo = new Scanner(System.in);
        int yesNo;
        String note ="";
        Scanner inputNote = new Scanner(System.in);

        System.out.println("Which List would you like too add too? grocery , activity, shoes");
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
                        break;
                    case 2:
                        while(!Objects.equals(note, "StopNow")) {
                            System.out.println("Please enter the note you would like to add to the List");
                            note = inputNote.nextLine();
                            grocery.add(note);
                        }
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
                            System.out.println("Please enter the note you would like to add to the List");
                            note = inputNote.nextLine();
                            activity.add(0, note);
                        }
                        break;
                    case 2:
                        while(!Objects.equals(note, "StopNow")) {
                            System.out.println("Please enter the note you would like to add to the List");
                            note = inputNote.nextLine();
                            activity.add(note);
                        }
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
                            System.out.println("Please enter the note you would like to add to the List");
                            note = inputNote.nextLine();
                            shoes.add(0, note);
                        }
                        break;
                    case 2:
                        while(!Objects.equals(note, "StopNow")) {
                            System.out.println("Please enter the note you would like to add to the List");
                            note = inputNote.nextLine();
                            shoes.add(note);
                        }
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

    public void PrintList(){
        int whichList;
        Scanner inputWhichList = new Scanner(System.in);

        System.out.println("Which List would you like to print select the number.");
        System.out.println("1  Grocery");
        System.out.println("2  Activity");
        System.out.println("3  Shoes");
        whichList = inputWhichList.nextInt();
        switch (whichList){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Please just stop with messing with my program.");
                Menu m1 = new Menu();
                m1.Menu();
                break;
        }
    }







}
