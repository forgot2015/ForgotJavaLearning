package schema.behavior.state.vote;

/**
 * Created by forgot on 2017/6/20.
 * 重复投票状态
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void voteResult(String user, String voteItem, VoteManager voteManager) {
        //重复投票，暂时不做处理
        System.out.println(user+"请不要重复投票");
    }
}
