package seven;

/**
 * Created by forgot on 2017/6/26.
 */
public class Doctor {
    boolean worksAtHospital;
    void treatPatient(){
        System.out.println("执行检查");
    }

}
class FamiltDoctor extends Doctor{
    boolean makesHouseCalls;
    void giveAdvice(){
        System.out.println("提出诊断");
    }
}

class Surgeon extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("进行手术");
    }
    void makeOperation(){
        System.out.println("做手术");
    }
}
