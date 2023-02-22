package event;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Thickness extends JSpinner implements ChangeListener{
	SpinnerNumberModel numberModel = new SpinnerNumberModel(1,1,50,1);
	static int num =1;
	
	public Thickness() {
		setModel(numberModel);
		numberModel.addChangeListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		num = (int)this.getValue();
		
	}
	
	
}
