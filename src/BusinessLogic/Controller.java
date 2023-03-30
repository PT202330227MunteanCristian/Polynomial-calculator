package BusinessLogic;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataModels.Polynomial;
import GraphicalUserInterface.View;

public class Controller  {
	
	private View view;
	private Model model;
	private Polynomial pol1 = new Polynomial();
	private Polynomial pol2 = new Polynomial();
	private Polynomial result = new Polynomial();
	
	public Controller(Model model, View view) { // Model model
		this.view = view;
		this.model = model;
		view.addListener(new AddListener());
		view.subListener(new SubListener());
	}
	
	class AddListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String userInputPol1 = "";
			String userInputPol2 = "";
			try {
				userInputPol1 = view.getFirstPol();
				userInputPol2 = view.getSecondPol();
				pol1.splitPolynom(userInputPol1, pol1);
				pol2.splitPolynom(userInputPol2, pol2);
				result = Operations.addition(pol1, pol2);
				model.setResult(result.toString());
				//view.setResult(result.toString());
				view.setResult(model.getResult());
			} catch(NumberFormatException nfex) {
				view.setResult("bad input");
			}	
		}
	}
	
	class SubListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String userInputPol1 = "";
			String userInputPol2 = "";
			try {
				userInputPol1 = view.getFirstPol();
				userInputPol2 = view.getSecondPol();
				pol1.splitPolynom(userInputPol1, pol1);
				pol2.splitPolynom(userInputPol2, pol2);
				result = Operations.substract(pol1, pol2);
				view.setResult(result.toString());
			} catch(NumberFormatException nfex) {
				view.setResult("bad input");
			}	
		}
	}
}
