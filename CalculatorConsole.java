package calculator;

public class CalculatorConsole {
	public static void main(String[] args) {
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);

		controller.run(); // プログラムの実行																									
	}
}
