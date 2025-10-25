package com.example.pokedex;

import android.content.Context;
import java.util.LinkedList;

public class Pokedex {

    int nationalNumber;
    String name;
    String species;
    String gender;
    double height;
    double weight;
    LinkedList<Integer> levelList;
    int level;
    int hp;
    int attack;
    int defense;
    private Context context;

    public Pokedex(int nationalNumber, String name, String species,
                   String gender, double height, double weight,
                   int level, int hp, int attack, int defense, Context context) {
        this.nationalNumber = nationalNumber;
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.level = level;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.context = context;
    }

    public Pokedex(Context context){
        this.context = context;
    }

    public Pokedex() {
        nationalNumber = 896;
        name = "Glastrier";
        species = "Wild Horse Pokemon";
        gender = "Other";
        height = 2.2;
        weight = 800.0;
        level = 1;
        hp = 0;
        attack = 0;
        defense = 0;
    }

    public int getNumber() { return nationalNumber; }
    public boolean setNumber(int number) {
        if (number > 0 && number < 1010) {
            this.nationalNumber = number;
            return true;
        }
        return false;
    }

    public String getName() { return name; }
    public boolean setName(String name) {
        if (name.matches("[A-Za-z .]{3,12}")) {
            this.name = name;
            return true;
        }
        return false;
    }

    public String getSpecies() { return species; }
    public boolean setSpecies(String species) {
        if (species.matches("[A-Za-z ]+")) {
            this.species = species;
            return true;
        }
        return false;
    }

    public String getGender() { return gender; }
    public boolean setGender(String gender) {
        if (gender.equals("Male") || gender.equals("Female")) {
            this.gender = gender;
            return true;
        }
        return false;
    }

    public double getHeight() { return height; }
    public boolean setHeight(double height) {
        if (height >= 0.2 && height <= 169.99) {
            this.height = height;
            return true;
        }
        return false;
    }

    public double getWeight() { return weight; }
    public boolean setWeight(double weight) {
        if (weight >= 0.1 && weight <= 992.7) {
            this.weight = weight;
            return true;
        }
        return false;
    }

    public int getLevel() { return level; }
    public boolean setLevel(int level) {
        if (level >= 1 && level <= 50) {
            this.level = level;
            return true;
        }
        return false;
    }

    public int getHp() { return hp; }
    public boolean setHp(int hp) {
        if (hp >= 1 && hp <= 362) {
            this.hp = hp;
            return true;
        }
        return false;
    }

    public int getAttack() { return attack; }
    public boolean setAttack(int attack) {
        if (attack >= 0 && attack <= 526) {
            this.attack = attack;
            return true;
        }
        return false;
    }

    public int getDefense() { return defense; }
    public boolean setDefense(int defense) {
        if (defense >= 10 && defense <= 614) {
            this.defense = defense;
            return true;
        }
        return false;
    }
}
