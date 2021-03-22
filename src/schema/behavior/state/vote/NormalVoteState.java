package schema.behavior.state.vote;

/**
 * Created by forgot on 2017/6/20.
 * 普通状态
 */
public class NormalVoteState implements VoteState {
    @Override
    public void voteResult(String user, String voteItem, VoteManager voteManager) {
        //正常投票，记录到投票记录中
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
        System.out.println("当前投票池:"+voteManager.getMapVote().toString());
    }
}
