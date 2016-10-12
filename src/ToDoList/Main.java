package ToDoList;

import java.io.IOException;

/**
 * Created by nicholashall on 10/11/16.
 */
public class Main {
    public static void main(String[] args)throws IOException{
        TheLists l1 = new TheLists();
        l1.LoadFiles();
        Menu m1 = new Menu();
        m1.Menu();


    }
}
