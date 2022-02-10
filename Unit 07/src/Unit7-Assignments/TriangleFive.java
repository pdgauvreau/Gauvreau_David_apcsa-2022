//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

    public Triangle()
    {
        setLetter('a');
        setAmount(0);
    }
    public Triangle(char c, int amt)
    {
        setLetter(c);
        setAmount(amt);
    }
    public void setLetter(char c)
    {
        letter = c;
    }
    public void setAmount(int amt)
    {
        amount = amt;
    }
    public String drawTriangle() {
        int num = 0;
        int count2 = amount;
        int count = 0;
        int count3 = amount;
        int count4 = amount;
        int num2 = amount;
        while (count2 > 0) {
            count += count2;
            count2--;
        }
        for (int d = 0; d < amount; d++) {
        for (int i = 0; i < count3; i++) {
            for (int j = 1; j <= count4;j++) {
                if (num2 > num)
                    out.print((char)(letter + num));
                if (j == count4 &&count4 != 0) {
                    num++;
                    count4--;
                    out.print(" ");
                }
            }
        count--;
        }
        num2--;
        count4 = amount;
        num = 0;
        out.println();
        }
        String output = "";
        return output;
    }
    public String toString()
    {
        return drawTriangle();
    }
}