import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class StudentData{
	public static void main (String[] args) 
    { 
        try
        { 
        	Class.forName("com.mysql.jdbc.Driver"); 
            Connection connection = DriverManager.getConnection(  
                    "jdbc:mysql://localhost/StudentInfo", "root", "");
            
           Scanner scan = new Scanner(System.in);
           
           System.out.println("Press 1 for insert, Press 2 for view all data, press 3 for update, press 4 for delete");
           Statement st = connection.createStatement();
           int number = scan.nextInt();
           int i=1;
           while(i==number)
        // here we are tasting the github updates
           {
        	   Scanner scanner = new Scanner(System.in);
        	System.out.print("Write Student name: ");
           String student = scanner.nextLine();
           System.out.println(" ");
           System.out.print("Write Student id: ");
           int id = scanner.nextInt();
           System.out.println(" ");
           System.out.print("Write student year: ");
           int year = scanner.nextInt();
           
           String SQL = String.format("INSERT INTO studentBio VALUES ('%s', '%s','%s' )", student, id, year);
           st.executeUpdate(SQL);
           break;
           }
         
           int j=2;
           while(j==number)
        
           {
        	   
        	   String query = "select * from studentBio ;";
           
           ResultSet rs = st.executeQuery(query);
           while (rs.next()) {
               String student1 = rs.getObject(1).toString();
               String id1 = rs.getObject(2).toString();
               String year1 = rs.getObject(3).toString();
               System.out.println("Name of the student is " + student1 + " and his id is " + id1 + " and year " + year1);
           }
           break;
           }
            
            
            
           int k= 3;
           while(k==number)
           {
        	   Scanner scanner = new Scanner(System.in);
        	   System.out.print("Write Student id: ");
               String idUpdate = scanner.nextLine();
               System.out.println(" ");
               System.out.print("Write Student name: ");
               String name12 = scanner.nextLine();
               System.out.println(" ");
               System.out.print("Write student year: ");
               String year12 = scanner.nextLine();
               
                
               String sq = "UPDATE studentBio SET student='"+name12+"', year='"+year12+"' WHERE id='"+idUpdate+"'";
              
               
               st.executeUpdate(sq);
               int rowsUpdated = st.executeUpdate(sq);
               System.out.println("Its updated");
               break;
           }
            
            
            
            
           int l= 4;
           while(l==number)
           {
        	   Scanner scanner = new Scanner(System.in);
        	   System.out.print("Write Student name: ");
               String studentDel = scanner.nextLine();
               String sql1 = "DELETE FROM studentBio WHERE student = '"+studentDel +"'";
               st.executeUpdate(sql1);
                
               int rowsDeleted = st.executeUpdate(sql1);
               
                   System.out.println("A student name was deleted successfully!");
                
               break;
           }
            
         }catch (Exception e) { 
            System.out.println(e.toString());
        } 
    }

}
