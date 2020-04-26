package zhuangtai;

public class StockedState extends ThreadState {
	public StockedState() {
		state = StateSet.STOCKED;
		System.out.println("阻塞状态");
	}
	public void resume(ThreadContext sc) {
		System.out.println("调用resume方法");
		if(state == StateSet.RUNNING) {
			sc.setThreadstate(new RunnableState());
		}else {
			System.out.println("当前线程不是阻塞状态");
		}
	}
}
