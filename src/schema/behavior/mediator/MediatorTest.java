package schema.behavior.mediator;

/**
 * Author: zongfulin
 * Date: 2021/3/24
 * Time: 9:52 AM
 * Description:中介者模式,中介者模式也称为调解者模式或者调停者模式。
 * 用一个中介者对象来封装一系列的对象交互。中介者使得各对象不需要显式地相互引用，从而使其松散耦合，而且可以独立地改变它们之间的交互。
 * <p>
 * 说到中介者，肯定就想到了房屋中介，下面以房屋中介为例，房东通过中介发布出售信息，中介就会把房屋信息传递给有这需求的购房者，
 * 购房者再通过中介去看房买房等等。
 *
 * 缺点:同事类越多，中介者的逻辑就越复杂，会变得越难维护。
 * 如果本来类的依赖关系不复杂，但是使用了中介者会使原来不复杂的逻辑变得复杂。因此需要根据实际情况去考虑，不要滥用中介者
 *
 * Android中的锁屏功能就用到了中介者模式，KeyguardService（锁屏服务）通过KeyguardViewMediator（锁屏中介者）来协调各种Manager的状态以达到锁屏的功能。这里KeyguardService和各种Manager等等都充当了同事的角色。
 *
 */
public class MediatorTest {
    public static void main(String[] args) {
        Lianjia houseMediator = new Lianjia();
        Purchaser purchaser = new Purchaser(houseMediator);
        Landlord landlord = new Landlord(houseMediator);
        houseMediator.setLandlord(landlord);
        houseMediator.setPurchaser(purchaser);

        landlord.send("出售一套别墅");
        System.out.println("------------------------");
        purchaser.send("求购一套学区房");
    }
}
