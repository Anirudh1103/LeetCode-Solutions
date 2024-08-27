//This is not the best solution, There are better solution out there but I have used this solution which is little complex
class Solution {
    public String intToRoman(int num) {
        int multiple = 1;
        String[] symbols = {"I","V","X","L","C","D","M"};
        String roman = "";
        while(num!=0)
        {
            if(num%10* multiple == 1) roman +="I";
            if(num%10 * multiple== 4) roman += "VI";
            if(num%10 * multiple== 5) roman +="V";
            if(num%10 * multiple== 9) roman += "XI";
            if(num%10 * multiple== 10) roman +="X";
            if(num%10 * multiple== 40) roman +="LX";
            if(num%10 * multiple== 50) roman +="L";
            if(num%10 * multiple== 90) roman +="CX";
            if(num%10 * multiple== 100) roman +="C";
            if(num%10 * multiple ==400) roman +="DC";
            if(num%10 * multiple== 500) roman +="D";
            if(num%10 * multiple == 900) roman += "MC";
            if(num%10 * multiple== 1000) roman += "M";

            if(num%10 * multiple >1 && num%10 * multiple<4)
                for(int i=0;i<(num%10 * multiple);i++)
                    roman +='I';
            if(num%10 * multiple >5 && num%10 * multiple<9)
            {
                for (int i = 5; i < (num % 10 * multiple); i++)
                    roman += 'I';
                roman += 'V';
            }
            if(num%10 * multiple >10 && num%10 * multiple<40)
            {
                for (int i = 0; i < (num % 10 * multiple)/10; i++)
                    roman += 'X';
            }
            if(num%10 * multiple >50 && num%10 * multiple<90)
            {
                for (int i = 5; i < (num % 10 * multiple)/10; i++)
                    roman += 'X';
                roman += 'L';
            }
            if(num%10 * multiple >100 && num%10 * multiple<400)
            {
                for (int i = 0; i < (num % 10 * multiple)/100; i++)
                    roman += 'C';
            }
            if(num%10 * multiple >500 && num%10 * multiple<900)
            {
                for (int i = 5; i < (num % 10 * multiple)/100; i++)
                    roman += 'C';
                roman+="D";
            }
            if(num%10 * multiple >1000 )
            {
                for (int i = 0; i < (num % 10 * multiple)/1000; i++)
                    roman += 'M';
            }
            num /= 10;
            multiple *= 10;

        }
        String final_roman = "";
        for(int i=roman.length()-1;i>=0;i--)
            final_roman += roman.charAt(i);
        return final_roman;
        }
}