package com.learning.sruthi.Calculator_Project;

public class Multiply implements Operate{

        public Double getResult(Double... numbers){
            Double multiply = 1.0;

            for(Double num: numbers)
            {
                multiply *= num;
            }
            return multiply;
        }
}

