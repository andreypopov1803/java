package lesson2;

import java.util.Scanner;

public class task9 {
    public static void main (String[] args){
        nine();
    }
    private static void nine(){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("Введите строку: ");
        String s = in.nextLine();
        System.out.println(s);
        Integer count = 1;
        for (int i = 1; i < s.length(); i++) 
        {
            if(s.charAt(i-1) == s.charAt(i))
            {
                count++;
            }
            else
            {
                if (count > 1) {
                sb.append(count);
                }
                sb.append(s.charAt(i-1));
                count = 1;
            }
            if (i == s.length() - 1)
            {
                if (count > 1) 
                {
                    sb.append(count);
                }
                sb.append(s.charAt(i));
            }
        }
        in.close();
        System.out.println(sb);
    }
}
