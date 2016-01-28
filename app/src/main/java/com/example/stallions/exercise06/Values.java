package com.example.stallions.exercise06;

/**
 * Created by STALLIONS on 1/26/2016.
 */
class Values {
     int numbers;

        public Values(int number){
               this.numbers =number;



        }
        public int increment(){
                numbers++;
                return numbers;
        }

    public int Longincrement(){
        numbers= numbers+10;
        return numbers;
    }

    public int decrement(){
        numbers--;
        return numbers;
    }
    public int Longdecrement(){
        numbers=numbers-10;
        return numbers;
    }

    public int reset(){
        numbers=0;
        return numbers;
    }
}
