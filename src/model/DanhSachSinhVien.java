/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import JDBC.JDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author A715-42G
 */
public class DanhSachSinhVien {

//    public ResultSet ;
    public static int insert(SinhVien sv) throws SQLException {

        JDBC db = new JDBC();
        String insertSQL = "INSERT INTO SINHVIEN VALUES('"
                + sv.getMSSV() + "',N'"
                + sv.getTenSV() + "','"
                + sv.getSoDT() + "','"
                + sv.getLop() + "',N'"
                + sv.getDiaChi() + "') ";
        int kq = db.executeUpdate(insertSQL);
//        db.close();
        return kq;
    }

    public static int update(SinhVien sv) throws SQLException {
        JDBC db = new JDBC();
        String updateSQL = "UPDATE SINHVIEN"
                + " SET TENSV=N'" + sv.getTenSV() + "'"
                + ",SODT='" + sv.getSoDT() + "'"
                + ",LOP=N'" + sv.getLop() + "'"
                + ",DIACHI=N'" + sv.getDiaChi() + "'"
                + "WHERE MSSV='" + sv.getMSSV() + "'";
        System.out.println(updateSQL);
        int kq = db.executeUpdate(updateSQL);
//        db.close();
        return kq;
    }

    public static int delete(int MSSV) throws SQLException {
        JDBC db = new JDBC();
        String deleteSQL = "DELETE FROM SINHVIEN"
                + " WHERE MSSV='" + MSSV + "'";
        int kq = db.executeUpdate(deleteSQL);
//        db.close();
        return kq;
    }

    public static ResultSet selectAll() throws SQLException {
        JDBC db = new JDBC();
        ResultSet rs = db.executeQuery("SELECT * FROM SINHVIEN");
//        db.close();
        return rs;
    }

    public static ResultSet selectByMSSV(int msSV) throws SQLException {
        JDBC db = new JDBC();
        ResultSet rs = db.executeQuery("SELECT * FROM SINHVIEN WHERE MSSV='"+msSV+"'");
        db.close();
        return rs;
    }
//
//    public ArrayList<SinhVien> selectAll() {
//    }
//
//    public ArrayList<SinhVien> selectByID() {
//    }

}
