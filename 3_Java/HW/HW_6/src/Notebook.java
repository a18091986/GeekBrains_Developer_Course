package src;

import java.util.HashMap;
import java.util.Objects;

public class Notebook {
    private int id;
    private int RAM;
    private int SSD;
    private double ScreenSize;
    private String os;
    private String color;

    public Notebook(int id, int RAM, int SSD, double ScreenSize, String os, String color) {
        this.id = id;
        this.RAM = RAM;
        this.SSD = SSD;
        this.ScreenSize = ScreenSize;
        this.os = os;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double ScreenSize) {
        this.ScreenSize = ScreenSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return id == notebook.id && RAM == notebook.RAM && SSD == notebook.SSD && Objects.equals(ScreenSize, notebook.ScreenSize) && Objects.equals(os, notebook.os) && Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, RAM, SSD, ScreenSize, os, color);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", RAM=" + RAM +
                ", SSD=" + SSD +
                ", ScreenSize='" + ScreenSize + '\'' +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public HashMap<String, String> nout_params() {
        HashMap<String, String> nout_params_hash = new HashMap<>();
        nout_params_hash.put("id", Integer.toString(this.id));
        nout_params_hash.put("RAM", Integer.toString(this.RAM));
        nout_params_hash.put("SSD", Integer.toString(this.SSD));
        nout_params_hash.put("ScreenSize", Double.toString(this.ScreenSize));
        nout_params_hash.put("os", this.os);
        nout_params_hash.put("color", this.color);
        return nout_params_hash;
    }
}