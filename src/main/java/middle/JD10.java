package middle;

import java.util.Scanner;

/**
 * JD10 两个子串
 * @author d3y1
 */
public class JD10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            solution1(in);
            solution2(in);
        }
    }

    /**
     * 模拟法: 滑动窗口
     * @param in
     */
    private static void solution1(Scanner in){
        String s = in.nextLine();
        int len = s.length();
        int gap = len-1;
        StringBuilder sb = new StringBuilder(s);
        while(gap >= 0){
            String first = s.substring(0,gap);
            String last = s.substring(len-gap);
            if(first.equals(last)){
                sb.append(s.substring(gap));
                break;
            }
            gap--;
        }

        System.out.println(sb);
    }

    /**
     * 模拟法: 滑动窗口
     * @param in
     */
    private static void solution2(Scanner in){
        String s = in.nextLine();
        int len = s.length();
        int gap = len-1;
        StringBuilder sb = new StringBuilder(s);
        while(gap >= 0){
            String last = s.substring(len-gap);
            if(s.startsWith(last)){
                sb.append(s.substring(gap));
                break;
            }
            gap--;
        }

        System.out.println(sb);
    }
}