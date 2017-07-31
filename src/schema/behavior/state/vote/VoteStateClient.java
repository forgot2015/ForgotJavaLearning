package schema.behavior.state.vote;

/**
 * Created by forgot on 2017/6/20.
 */
public class VoteStateClient {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}
