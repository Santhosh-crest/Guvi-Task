package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet; // Correct import

public class Db {

	public static void main(String[] args)  {
		String db_url="jdbc:mysql://localhost:3306";
		String user_name="root";
		String pass="root";
		try {
			Connection conn=DriverManager.getConnection(db_url,user_name,pass);
			String Db_create="create database Db;";
			String usag="use Db;"; 
			String tabl="create table Emp(empcode int,empname varchar(25),emppage int,empsalary int);";
			String ins1="insert into Emp values(101,'Jenny',25,10000),(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'john',40,80000),(105,'Shameer',25,90000);";
			String select="select * from Emp;";
			Statement smt=conn.createStatement();
			smt.execute(Db_create);
			smt.execute(usag);
			smt.execute(tabl);
			smt.execute(ins1);
			ResultSet res=smt.executeQuery(select); 
			while(res.next()) {
				System.out.println(res.getInt("empcode")+" "+res.getString("empname")+" "+res.getInt("emppage")+" "+res.getInt("empsalary")); 
				
			}
			conn.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
