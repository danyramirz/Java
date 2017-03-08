public class SumofNumbers {
	private int inputs;
	public int getInputs() {
		return inputs;
	}
	public void setInputs(int inputs) {
		this.inputs = inputs;
	}
	public SumofNumbers(int Inputs) {
		this.inputs = Inputs;
	}
	public int loopStuff() {
		int num1 = 0;
		for (int i = 1; i <= inputs; i++) {
			num1 += i;
		}
		return num1;
	}

}