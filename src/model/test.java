/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;

/**
 *
 * @author A715-42G
 */
public class test {

    public static void main(String[] args) throws SQLException {
//        SinhVien sv1 = new SinhVien(1, "A", 9024, "10", "99 LBT");
//        DanhSachSinhVien.insert(sv1);
//        SinhVien sv2 = new SinhVien(1, "O", 9024, "10", "99 LBT");
//        DanhSachSinhVien.update(sv2);
        SinhVien sv3 = new SinhVien(1,"O",9024,"10","99 LBT");
        DanhSachSinhVien.delete(sv3);
    }
}
