package com.jap;

import java.util.Arrays;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg=0;
        double total=0;

        try{
            for(int i=0;i<ageRawData.length;i++)
            {
                total+=Integer.parseInt(ageRawData[i]);
            }
            avg=total/ageRawData.length;
        }catch (NumberFormatException e)
        {
            return e.toString();
        }
        return String.valueOf(avg);
    }

    public static void main(String[] args) {
        AverageAge averageAge=new AverageAge();
        System.out.println("averageAge.averageAgeCalculator(new String[]{\"33\",\"22\"}) = " + averageAge.averageAgeCalculator(new String[]{"33", "22"}));
    }

}
