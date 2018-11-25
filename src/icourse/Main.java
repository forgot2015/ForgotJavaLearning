package icourse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner (System.in);
        int utc;
        int bjt;
        utc = in.nextInt();
        if (utc>800)
        {
            bjt = utc-800;
            System.out.println(bjt);
        }
        if (utc == 800)
        {
            bjt = 0;
            System.out.println(bjt);
        }
        if (utc < 800 )
        {
            if ( utc >= 0 )
            {
                if ( utc < 10 )
                {
                    System.out.println(utc);
                }
                else
                {
                    bjt=utc-800+2400;
                    System.out.println(bjt);
                }
            }

        }
    }


    //java练习题2.2
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sign = scanner.nextInt();
//        int r = sign / 10;
//        int s = sign % 10;
//        String start = "";
//        String end = "";
//        if (s == 1) {
//            start = "Faint signals, barely perceptible";
//        } else if (s == 2) {
//            start = "Very weak signals";
//        } else if (s == 3) {
//            start = "Weak signals";
//        } else if (s == 4) {
//            start = "Fair signals";
//        } else if (s == 5) {
//            start = "Fairly good signals";
//        } else if (s == 6) {
//            start = "Good signals";
//        } else if (s == 7) {
//            start = "Moderately strong signals";
//        } else if (s == 8) {
//            start = "Strong signals";
//        } else if (s == 9) {
//            start = "Extremely strong signals";
//        }
//
//        if (r == 1) {
//            end = "unreadable";
//        } else if (r == 2) {
//            end = "barely readable, occasional words distinguishable";
//        } else if (r == 3) {
//            end = "readable with considerable difficulty";
//        } else if (r == 4) {
//            end = "readable with practically no difficulty";
//        } else if (r == 5) {
//            end = "perfectly readable";
//        }
//
//        System.out.println(start + ", " + end+".");
//    }


    //    java练习题2.1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int bjt = scanner.nextInt();
//        if (bjt >= 800) {
//            System.out.println(bjt - 800);
//        } else {
//            System.out.println(bjt + 2400 - 800);
//        }
//    }

//    java练习题2.1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String bjt = scanner.nextLine();
//        String bjtHour;
//        String utc = "";
//        int realHour;
//        if (bjt.length() == 1) {
//            utc = "160" + bjt;
//        } else if (bjt.length() == 2) {
//            utc = "16" + bjt;
//        } else if (bjt.length() == 3) {
//            bjtHour = bjt.substring(0, 1);
//            realHour = Integer.parseInt(bjtHour) - 8;
//            if (realHour < 0) {
//                realHour = realHour + 24;
//            }
//            utc = realHour + bjt.substring(1, 3);
//        } else {
//            bjtHour = bjt.substring(0, 2);
//            realHour = Integer.parseInt(bjtHour) - 8;
//            if (realHour < 0) {
//                realHour = realHour + 24;
//            }
//            utc = realHour + bjt.substring(2, 4);
//        }
//        System.out.println(utc);
//    }


    //java练习题1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int f = scanner.nextInt();
//        float c;
//        c = (f-32)*5/9;
//        System.out.println((int)c);
//    }

}
