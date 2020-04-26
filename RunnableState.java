package zhuangtai;

public class RunnableState extends ThreadState {
	
	public RunnableState() {
		state = StateSet.RUNNABLE;
		System.out.println("就绪状态");
	}
	public void getCpu(ThreadContext sc) {
		System.out.println("获取cpu");
		if(state == StateSet.RUNNABLE) {
			sc.setThreadstate(new RunningState());
		}else {
			System.out.println("当前线程不是就绪状态");
		}
		
	}
}
