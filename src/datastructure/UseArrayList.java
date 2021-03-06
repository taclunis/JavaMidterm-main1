package datastructure;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) throws Exception {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ArrayList<String> testing = new ArrayList<String>();
        testing.add("hi");
        testing.add("my");
        testing.add("name");
        testing.add("is");
        testing.add("theo");
        System.out.println("After all these add methods"+testing.toString());

        peek(testing);

        testing.remove(2);
        System.out.println("Arraylist after removal"+testing.toString());

        Iterator<String> testing1 = testing.iterator();

        System.out.println("WHILE LOOP");
        while (testing1.hasNext()){
            System.out.println(testing1.next());
        }
        System.out.println();
        System.out.println("FOR EACH LOOP");
        for(String test : testing){
            System.out.println(test);
        }

        //CONNECT TO DATABASE
        connectToSqlDB.insertDataFromArrayListToSqlTable(testing,"array_list_testing","words");
        List<String> letters  = connectToSqlDB.readDataBase("array_list_testing", "words");
        System.out.println(letters);



    }


    public static void peek(ArrayList<String> testing){
        if (testing.size()==0){
            System.out.println("EMPTY");
        }else{
            System.out.println("The peek is "+testing.get(testing.size()-1));
        }
    }


}