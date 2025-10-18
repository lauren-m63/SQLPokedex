package com.example.pokedex;

import java.util.LinkedList;

public class Pokedex {

         int number;
         String name;
         String species;
         String gender;
         double height;
         double weight;
         LinkedList<Integer> level;
         int hp;
         int attack;
         int defense;


    public Pokedex(int number, String name, String species,
                   String gender, double height, double weight,
                   LinkedList<Integer> level, int hp, int attack, int defense) {
        this.number = number;
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.level = level;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;


} // end constructor

    public Pokedex (){
         number = 896;
         name = "Glastrier";
         species = "Wild Horse Pokemon";
         gender = "Other";
         height = 2.2;
         weight = 800.0;
         level = null;
         hp = 0;
         attack= 0;
         defense= 0;

    } // end default constructor


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public LinkedList<Integer> getLevel() {
        return level;
    }

    public void setLevel(LinkedList<Integer> level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }



    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }



    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }



} // final bracket
