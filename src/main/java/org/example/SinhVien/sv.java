package org.example.SinhVien;


public class sv {
public int id ;
public String name;
public int tuoi;
public String diaChi;

    public sv(int id, String name, int tuoi, String diaChi) {
   setId(id);
   setName(name);
   setTuoi(tuoi);
   setDiaChi(diaChi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
         if(id== getId()){
             throw new IllegalArgumentException("Trung ma");
         }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name== null){
            throw new IllegalArgumentException("Name null");
        }
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi<0){
            throw new IllegalArgumentException("Tuoi<0");
        }
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        if (diaChi==null){

            throw new IllegalArgumentException("Diachi null");
        }
        this.diaChi = diaChi;
    }
}
