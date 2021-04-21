package schema.behavior.state.vote;

/**
 * Created by forgot on 2017/6/20.
 * 恶意投票状态
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void voteResult(String user, String voteItem, VoteManager voteManager) {
        // 恶意投票，取消用户的投票资格，并取消投票记录
//直接 remove 即可,若没有该 key 则会忽略
        voteManager.getMapVote().remove(user);
//        String str = voteManager.getMapVote().get(user);
//        if (str != null) {
//            voteManager.getMapVote().remove(user);
//        }
        System.out.println(user + "你有恶意刷屏行为，取消投票资格");
    }
}
