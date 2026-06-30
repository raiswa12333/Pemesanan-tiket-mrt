/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raiswa
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection(){
        try{
            if(conn == null){
                String url = "jdbc:mysql://localhost:3306/database_mrt";
                
                String user = "root";
                String pass = "";
                
                conn = DriverManager.getConnection(url, user, pass);
                
                System.out.println("Koneksi berhasil");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
  
        }
        return conn;
     }   
   }

