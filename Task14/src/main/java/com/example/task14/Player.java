package com.example.task14;

public class Player {
    private String name;

    private Integer count;

    private Integer number;

    private Integer Win = 0;

    private Integer Los = 0;




    public Player(String name, Integer number) {

        this.name = name;

        this.number = number;

        count=0;

    }


    public boolean pay(Integer number) {

        if(number <= this.number) {

            this.number-=number;

            this.count++;

            return true;        }

        else return false;

    }


    public Integer getCount() {

        return count;

    }


    public Integer getNumber() {

        return number;

    }


    public void addNumber(Integer number) {

        this.number+= number;

    }

    public Integer getWin() {

        return Win;

    }


    public void addWin(Integer Win) {

        this.Win+= Win;

    }

    public Integer getLos() {

        return Los;

    }


    public void addLos(Integer Los) {

        this.Los+= Los;

    }
}
