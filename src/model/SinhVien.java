/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author A715-42G
 */
public class SinhVien {
    private int MSSV;
    private String tenSV;
    private int soDT;
    private String lop;
    private String diaChi;

    public SinhVien(int MSSV, String tenSV, int soDT, String lop, String diaChi) {
        this.MSSV = MSSV;
        this.tenSV = tenSV;
        this.soDT = soDT;
        this.lop = lop;
        this.diaChi = diaChi;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MSSV=" + MSSV + ", tenSV=" + tenSV + ", soDT=" + soDT + ", lop=" + lop + ", diaChi=" + diaChi + '}';
        
        
    }
    
    
    
}
