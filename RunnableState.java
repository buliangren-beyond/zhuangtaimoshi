package zhuangtai;

public class RunnableState extends ThreadState {
	
	public RunnableState() {
		state = StateSet.RUNNABLE;
		System.out.println("����״̬");
	}
	public void getCpu(ThreadContext sc) {
		System.out.println("��ȡcpu");
		if(state == StateSet.RUNNABLE) {
			sc.setThreadstate(new RunningState());
		}else {
			System.out.println("��ǰ�̲߳��Ǿ���״̬");
		}
		
	}
}
