package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.*;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {
        // creating a queue
        Queue<Integer> queue = new PriorityQueue<>();
        // adding values to a queue
        queue.offer(2);
        queue.offer(4);
        queue.offer(52);
        queue.offer(12);
        queue.offer(63);
        queue.offer(6);

        // peek at the first element out
        System.out.println(queue.peek());

        // remove an element
        System.out.println(queue.poll());
        // iterate using for each
        System.out.println("*************");
        for (int num: queue
             ) {
            System.out.println(num);
        }

        // Iterate using Iterator

        Iterator it = queue.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
        //copy queue data into an arrayList
        List list = new ArrayList<>(queue);


        // Connecting to DB
        SharedStepsDatabase sql = new SharedStepsDatabase();
        // creating a new table and store data in db
        String tableName = "queueDB";
        String colName = "queueValues";
        sql.insertList(tableName,colName,list);

        // retrieving data from DB
        try {
            List l = sql.executeQueryReadAll("select * from " + tableName);
            System.out.println(l);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
