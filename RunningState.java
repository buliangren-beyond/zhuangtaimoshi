package zhuangtai;

public class RunningState extends ThreadState {
	public RunningState() {
		state = StateSet.RUNNING;
		System.out.println("运行状态");
	}
	public void suspect(ThreadContext sc) {
		System.out.println("调用suspect方法");
		if(state == StateSet.RUNNING) {
			sc.setThreadstate(new StockedState());
		}else {
			System.out.println("当前线程不是运行状态");
		}
	}
	public void stop(ThreadContext sc) {
		System.out.println("调用stop方法");
		if(state == StateSet.RUNNING) {
			sc.setThreadstate(new DeadState());
		}else {
			System.out.println("当前线程不是运行状态");
		}
	}
}
