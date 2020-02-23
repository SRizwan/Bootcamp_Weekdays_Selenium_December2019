package databases;

import java.util.ArrayList;
import java.util.List;

public class SqlTable {
    public static List<String> searchElements(){
        List<String> elements=new ArrayList<String>();
        elements.add("Metallica");
        elements.add("LinkinPark");
        elements.add("Scorpions");
        return elements;
    }

    public static int[] name={1,4,5,6};


    public static void main(String[] args) throws Exception {

        System.out.println(searchElements());
        ConnectToSqlDB.insertDataFromArrayListToSqlTable(searchElements(),"Rizwan","search");
        //ConnectToSqlDB.insertDataFromArrayToSqlTable(name,"names","st");

        System.out.println(ConnectToSqlDB.readDataBase("Rizwan","search"));
    }

}
