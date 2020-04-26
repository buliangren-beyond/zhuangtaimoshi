package zhuangtai;

public class StockedState extends ThreadState {
	public StockedState() {
		state = StateSet.STOCKED;
		System.out.println("����״̬");
	}
	public void resume(ThreadContext sc) {
		System.out.println("����resume����");
		if(state == StateSet.RUNNING) {
			sc.setThreadstate(new RunnableState());
		}else {
			System.out.println("��ǰ�̲߳�������״̬");
		}
	}
}
