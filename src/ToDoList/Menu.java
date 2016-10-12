package ToDoList;

/**
 * Created by nicholashall on 10/11/16.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
     void Menu() throws IOException {
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
        } else if(menuChoice == 2){
            l1.Remove();
        } else if(menuChoice == 3){
            l1.PrintList();
        } else if( menuChoice == 4){
            System.out.println("Choice 1 allows the ability to add items to one of your lists");
            System.out.println("Choice 2 allows the ability to remove items from the selected list");
            System.out.println("Choice 3 allows the ability to go look over your lists");
            System.out.println("You must hit choice 5 when exiting your program if you wish to save the progress for further use.");
            Menu();
        }
        else{
            System.out.println("do nothing");
            l1.save();
            }

        }
    }

