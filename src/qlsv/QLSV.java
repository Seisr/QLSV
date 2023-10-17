/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsv;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.JDBC;

/**
 *
 * @author A715-42G
 */
public class QLSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                JDBC dbCon = new JDBC();
         try {
             String query = "SELECT * FROM dbo.SINHVIEN";
             ResultSet rs = dbCon.executeQuery(query);
             while(rs.next()){
                 String msSV = rs.getString("MSSV");
                 String tenSV = rs.getString("TENSV");
                 String soDT = rs.getString("SODT");
                 String lop = rs.getString("LOP");
                 String diaChi = rs.getString("DIACHI");
                 System.out.println(msSV);
                 System.out.println(tenSV);
                 System.out.println(soDT);
                 System.out.println(lop);
                 System.out.println(diaChi);
                  System.out.println("");
             }
         }
         catch(SQLException e){
         }
    }
    
}
