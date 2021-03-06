package book.headfirstjava;

/**
 * Created by forgot on 2017/6/26.
 * 关于继承，基类和派生类
 */
public class Doctor {
    boolean worksAtHospital;

    void treatPatient() {
        System.out.println("执行检查");
    }
}

 class FamilyDoctor extends Doctor {
    boolean makesHouseCalls;

    void giveAdvice() {
        System.out.println("提出诊断");
    }
}

//外科医生
class Surgeon extends Doctor {
    @Override
    void treatPatient() {
        System.out.println("治疗病人");
    }

    void makeOperation() {
        System.out.println("做手术");
    }
}
