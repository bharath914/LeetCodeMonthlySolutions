public class Day15_L860Lemonade {
    public static void main(String[] args) {

    }
}
class L860Sol{
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for(int ele : bills){

            if(ele==5)fives++;
            else if(ele ==10){
                tens++;
                if(fives==0)return false;
                fives--;
            }
            else {
                if(fives==0)return false;
                if(tens==0){
                    if(fives<3)return false;
                    fives-=3;
                }else{tens--;fives--;
                }
            }
        }


        return true;
    }
}