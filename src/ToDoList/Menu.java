package ToDoList;

/**
 * Created by nicholashall on 10/11/16.
 */
import java.util.Scanner;
public class Menu {
    public void Menu() {
        int menuChoice;
        Scanner inputMenuChoice = new Scanner(System.in);

        TheLists l1 = new TheLists();


        System.out.println("1: Add Items");
        System.out.println("2: Remove Items");
        System.out.println("3: List Items");
        System.out.println("4: Help");
        System.out.println("5: Save & Quit");

        menuChoice = inputMenuChoice.nextInt();
        if (menuChoice == 1) {
            l1.AddToList();
//        } else if(menuChoice == 2){
////            Run remove items method
//        } else if(menuChoice == 3){
////            Run List Items method
//        } else if( menuChoice == 4){
////            Run Help method then return Menu
        }
        else{
            System.out.println("do nothing");
//            Save and Quit
            }

        }
    }

