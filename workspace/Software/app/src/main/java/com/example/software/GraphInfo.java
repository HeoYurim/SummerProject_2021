package com.example.software;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class GraphInfo {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int month;
    private int weight;
    private int height;

    public GraphInfo(int month, int weight, int height) {
        this.month = month;
        this.weight = weight;
        this.height = height;
    }

    public int getMonth() {
        return month;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
