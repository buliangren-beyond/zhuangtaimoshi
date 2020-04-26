package zhuangtai;

public class RunningState extends ThreadState {
	public RunningState() {
		state = StateSet.RUNNING;
		System.out.println("����״̬");
	}
	public void suspect(ThreadContext sc) {
		System.out.println("����suspect����");
		if(state == StateSet.RUNNING) {
			sc.setThreadstate(new StockedState());
		}else {
			System.out.println("��ǰ�̲߳�������״̬");
		}
	}
	public void stop(ThreadContext sc) {
		System.out.println("����stop����");
		if(state == StateSet.RUNNING) {
			sc.setThreadstate(new DeadState());
		}else {
			System.out.println("��ǰ�̲߳�������״̬");
		}
	}
}
