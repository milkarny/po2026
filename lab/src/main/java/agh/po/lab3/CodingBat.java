package agh.po.lab3;

public class CodingBat {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    public boolean loneTeen(int a, int b){
        boolean aTeen=a>=13 && a<=19;
        boolean bTeen=b>=13 && b<=19;
        if(aTeen && !bTeen) {
            return true;
        }
        if(!aTeen && bTeen) {
            return true;
        }
        return false;
    }

    public int sum13(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==13) {
                continue;
            }
            if(i>0 && nums[i-1]==13) {
                continue;
            }
            sum=sum+nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        CodingBat cb=new CodingBat();
        System.out.println(cb.sleepIn(false,false));
        System.out.println(cb.sleepIn(true,false));
        System.out.println(cb.sleepIn(false,true));

        System.out.println(cb.loneTeen(13,99));
        System.out.println(cb.loneTeen(21,19));
        System.out.println(cb.loneTeen(13,13));

        System.out.println(cb.sum13(new int[]{1,2,2,1}));
        System.out.println(cb.sum13(new int[]{1,1}));
        System.out.println(cb.sum13(new int[]{1,2,2,1,13}));
    }
}
