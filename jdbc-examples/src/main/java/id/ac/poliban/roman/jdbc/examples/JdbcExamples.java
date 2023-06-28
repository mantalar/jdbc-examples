/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package id.ac.poliban.roman.jdbc.examples;

/**
 *
 * @author roman
 */
public class JdbcExamples {

    public static void main(String[] args) {
        
        //example to insert a object Friend to friend table
        //Friend f = new Friend("Anita", LocalDate.parse("1990-02-15"), "Yogyakarta", "+622745656889361");
        //new FriendServiceViaPreparedStatement().insert(f);
        
        //example to update a record in friend table
        //Friend f = new Friend(5, "Samsyuddin", LocalDate.parse("1990-02-15"), "Yogyakarta", "+622745656889361");
        //new FriendServiceViaPreparedStatement().update(f);
        
        //example to delete a record in friend table
        //new FriendServiceViaPreparedStatement().delete(5);
        
        //example to get an object friend from friend table
        //System.out.println(new FriendServiceViaPreparedStatement().getAFriendById(1));
        
        //example to get all object friend from friend table
        //new FriendServiceViaPreparedStatement().getAllFriends().forEach(System.out::println);
        
        
        //example convert all object friend to json
        //Gson g = new GsonBuilder()
        //        .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
        //        .setPrettyPrinting().create();
        //new FriendServiceViaPreparedStatement().getAllFriends().forEach(o->System.out.println(g.toJson(o)));
        
    }
    
    
}
