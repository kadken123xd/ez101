import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class bank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อนน้ำหนัก (kg)");
        double weight=sc.nextDouble();
        System.out.print("ป้อนส่วนสูง (cm)");
        double height=sc.nextDouble();
        height/=100;

        double bmi=weight/(height*height);

        System.out.println("น้ำหนัก (kg)"+weight);
        System.out.println("ส่วนสูง (cm)"+height);
        System.out.println("ค่าดัชนีมวลกาย  (bmi)"+bmi);
        String predict="";

        if(bmi<18){
            predict="ต่ำกว่าเกณฑ์";
        }
        else if(bmi<18.25 &&bmi<22.90){
            predict="ปกติ";
        }
        else if(bmi<23 && bmi<24.90){
            predict="ท้วม / โรคอ้วนระดับ 1";
        }
        else if (bmi<25 && bmi<29.90){
            predict="อ้วน / โรคอ้วนระดับ 2";
        }
        else{
            predict="อ้วนมาก / โรคอ้วนระดับ 3";
        }
        System.out.println("ทำนายผล ="+predict);
    }
}