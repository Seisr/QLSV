/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author A715-42G
 */
public class AdminModel {
    private ArrayList<SinhVien> ds;

    public AdminModel(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }

    public ArrayList<SinhVien> getDs() {
        return ds;
    }

    public void setDs(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }
    
}
