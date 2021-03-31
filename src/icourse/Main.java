package icourse;

import java.util.Scanner;

public class Main {
    //期末考试
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        if (input == 0) {
//            System.out.println(32);
//        } else {
//            String byteStr = Integer.toBinaryString(input);
//            System.out.println(32 - byteStr.length());
//        }
//    }

    //java练习7.1
//    static StringBuilder str = new StringBuilder();
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        str.append(n).append("=");
//        getDivisor(n);
//    }
//
//    private static void getDivisor(int end) {
//        for (int i = 2; i <= end; i++) {
//            if (end % i == 0) {
//                if (i == end) {
//                    str.append(i);
//                    System.out.println(str);
//                } else {
//                    str.append(i).append("x");
//                    getDivisor(end / i);
//                    break;
//                }
//            }
//        }
//    }


    //java练习7.2
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        StringBuilder out = new StringBuilder();
//        for (int i = n; i < m; i++) {
//            if (isComplete(i)) {
//                out.append(i).append(" ");
//            }
//        }
//        String string = new String(out).trim();
//        if (string.length() > 0) {
//            System.out.println(string);
//        } else {
//            System.out.println();
//        }
//    }

//    static boolean isComplete(int num) {
//        int divisorSum = 0;
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0) {
//                divisorSum += i;
//            }
//        }
//        return divisorSum == num;
//    }

    // TODO: 2018/11/27
    //java练习6.1 测试用例无法全部通过，未知原因
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine().trim();
//        if (input.endsWith(".")) {
//            input = input.substring(0, input.length() - 1);
//        }
//        String[] strings = input.split(" ");
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < strings.length; i++) {
//            str.append(strings[i].length()).append(" ");
//        }
//        System.out.print(str.toString().trim());
//    }

//    //java练习4.2
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String input = in.nextLine();
//        StringBuilder targetStr = new StringBuilder();
//        for (int i = 0; i < input.length() - 1; i++) {
//            String iNum = input.substring(i, i + 1);
//            if (iNum.equals("-")) {
//                targetStr.append("fu").append(" ");
//            } else {
//                targetStr.append(getTarget(Integer.parseInt(iNum))).append(" ");
//            }
//        }
//        String iNum = input.substring(input.length() - 1, input.length());
//        targetStr.append(getTarget(Integer.parseInt(iNum)));
//        System.out.println(targetStr);
//    }
//
//    //注意老版本的java不支持string作为switch条件
//    private static String getTarget(int input) {
//        String output = "";
//        switch (input) {
//            case 0:
//                output = "ling";
//                break;
//            case 1:
//                output = "yi";
//                break;
//            case 2:
//                output = "er";
//                break;
//            case 3:
//                output = "san";
//                break;
//            case 4:
//                output = "si";
//                break;
//            case 5:
//                output = "wu";
//                break;
//            case 6:
//                output = "liu";
//                break;
//            case 7:
//                output = "qi";
//                break;
//            case 8:
//                output = "ba";
//                break;
//            case 9:
//                output = "jiu";
//                break;
//            default:
//                break;
//        }
//        return output;
//    }

    //java题4.1 求第n个素数到第m个素数之间的所有的素数
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int sum = 0;
//        int[] primeInt = new int[m + 1];
//        int curNum = 2;
//        int count = 0;
//        while (count < m) {
//            if (isPrime(curNum)) {
//                ++count;
//                primeInt[count] = curNum;
//            }
//            curNum++;
//        }
//
//        for (int i = n; i <= m; i++) {
//            sum = sum + primeInt[i];
//        }
//
//        System.out.println(sum);
//
//    }
//
//    static boolean isPrime(int num) {
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

//    int getNumPrime(int index) {
//        int primeIndex = 0;
//        while (primeIndex < index) {
//            if (isPrime())
//        }
//        return 0;
//    }


//    public static void main(String[] args) {
////        int a = 5;
////        double b = 5.0;
////        long c = 5L;
////        System.out.println(a == b);
////        System.out.println(a == c);
//        double a = 0.3;
//        double b = 0.1 + 0.1 + 0.1;
//        System.out.println(a == b);
//    }

    //    练习题3.2网友解法
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 1;
//        int sum = 0;
//        Scanner in = new Scanner(System.in);
//        a = in.nextInt();
//        while (a != 0) {
//            if ((a + b) % 2 == 0) {
//                sum = sum + (int) Math.pow(2, (b - 1));
//            }
//            a = a / 10;
//            b = b + 1;
//        }
//        System.out.println(sum);
//    }
}


//练习题3。2 我的渣渣解法，内存占用太多
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int input = in.nextInt();
////        String byteStr = "101010";
//
//        int num1;
//        int num2;
//        int num3;
//        int num4;
//        int num5;
//        int num6;
//
//        num6 = input / 100000;
//        num5 = input / 10000;
//        num4 = input / 1000;
//        num3 = input / 100;
//        num2 = input / 10;
//        num1 = input % 10;
//
//        int byte6 = (num6 + 6) % 2 == 0 ? 1 : 0;
//        int byte5 = (num5 + 5) % 2 == 0 ? 1 : 0;
//        int byte4 = (num4 + 4) % 2 == 0 ? 1 : 0;
//        int byte3 = (num3 + 3) % 2 == 0 ? 1 : 0;
//        int byte2 = (num2 + 2) % 2 == 0 ? 1 : 0;
//        int byte1 = (num1 + 1) % 2 == 0 ? 1 : 0;
//
//        String byteStr = byte6 + "" + byte5 + byte4 + byte3 + byte2 + byte1;
//        int finalInt = Integer.parseInt(byteStr, 2);
//        System.out.println(finalInt);
//    }

//    java练习题3.1
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int jishu = 0;
//        int oushu = 0;
//        long input = in.nextLong();
//        while (input != -1) {
//            if (input % 2 == 0) {
//                oushu++;
//            } else {
//                jishu++;
//            }
//            input = in.nextLong();
//        }
//        System.out.println(jishu + " " + oushu);
//    }

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

//}
