package zhuangtai;

public class DeadState extends ThreadState {
	public DeadState() {
		state = StateSet.DEAD;
		System.out.println("ËÀÍö×´Ì¬");
	}
}
