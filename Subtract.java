package com.learning.sruthi.Calculator_Project;

public class Subtract implements Operate{

    public Double getResult(Double... numbers){
        Double diff = numbers[0];

        for(int i = 0 ; i < numbers.length ; i++)
        {
            diff = diff - numbers[i];
        }
        return diff;
    }
}
