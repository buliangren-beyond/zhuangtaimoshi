package zhuangtai;

public class NewState extends ThreadState {
	public NewState() {
		state = StateSet.NEW;
		System.out.println("创建线程");
	}
	public void start(ThreadContext sc) {
		System.out.println("开始调用start方法");
		if(state == StateSet.NEW) {
			sc.setThreadstate(new RunnableState());
		}else {
			System.out.println("当前线程不是新建状态");
		}
	}
	
}
