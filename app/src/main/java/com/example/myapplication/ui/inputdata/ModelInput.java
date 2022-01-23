package com.example.myapplication.ui.inputdata;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;



@Entity(tableName = "minat_table")
public class ModelInput {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Nim")
    private String Nim;

    @ColumnInfo(name = "nama")
    private String nama;

    @ColumnInfo(name = "ttl")
    private String ttl;

    @ColumnInfo(name = "tgldaftar")
    private String tgldaftar;

    @ColumnInfo(name = "Jurusan")
    public String Jurusan;

    @ColumnInfo(name = "MinatBakat")
    public String MinatBakat;

    @ColumnInfo(name = "image", typeAffinity = ColumnInfo.BLOB)
    private byte[] image;

    public ModelInput(String Nim, String nama, String ttl, String tgldaftar, String Jurusan,String MinatBakat,  byte[] image) {
        this.Nim = Nim;
        this.nama = nama;
        this.ttl = ttl;
        this.tgldaftar = tgldaftar;
        this.Jurusan = Jurusan;
        this.MinatBakat = MinatBakat;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getTgldaftar() {
        return tgldaftar;
    }

    public void setTgldaftar(String tgldaftar) {
        this.tgldaftar = tgldaftar;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        this.Jurusan = jurusan;
    }

    public String getMinatBakat() {
        return MinatBakat;
    }

    public void setMinatBakat(String minatbakat) {
        this.MinatBakat = minatbakat;
    }

    public byte[] getImage() { return image; }

    public void setImage(byte[] image) {
        this.image = image;
    }


}
