package schema.behavior.state.vote;

/**
 * Created by forgot on 2017/6/20.
 * 黑名单状态
 */
public class BlackVoteState implements VoteState {
    @Override
    public void voteResult(String user, String voteItem, VoteManager voteManager) {
        //记录黑名单中，禁止登录系统
        System.out.println("你已被拉入黑名单，将禁止登录和使用本系统");
        System.out.println("当前投票池:" + voteManager.getMapVote().toString());
    }
}
