package com.learning.sruthi.Calculator_Project;

public class Divide implements Operate{

    public Double getResult(Double... numbers){
        Double divide = numbers[0];

        for(int i = 1 ; i < numbers.length ; i++)
        {
            divide = divide / numbers[i];
        }
        return divide;
    }
}
