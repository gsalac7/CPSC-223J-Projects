import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Addition extends Applet implements ActionListener{
	Calendar c = Calendar.getInstance();
	int day = c.get(Calendar.DATE);
	int month = c.get(Calendar.MONTH);
	int year = c.get(Calendar.YEAR);
	
	
	
	String date = Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
	
	
	
	Label
		title = new Label("Practicing Addition"),
		questions = new Label("Select the number of questions: "),
		dateLbl = new Label("Today's date: " + date),
		messageLbl = new Label("A Message from the Institution"),
		reportLbl = new Label("Report");
	Button
		startBtn = new Button("Click to start"),
		nextBtn = new Button("Press for the next question");

	
	TextField
		answer = new TextField();
		
	TextArea
		message = new TextArea("", 10, 10, TextArea.SCROLLBARS_BOTH),
		report = new TextArea("", 10, 10, TextArea.SCROLLBARS_VERTICAL_ONLY);
	
	int x = (int)(Math.random() * 10);
	int y = (int)(Math.random() * 10);
	
	
	int counter = 1;
	int sum = x + y;
	
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox five = new Checkbox("5", cbg, true);
	Checkbox ten = new Checkbox("10", cbg, true);
	
	
	public void init() {
		setLayout(null);
		
		resize(700, 500);
		
		Font f = new Font("Ariel", Font.BOLD, 17);
		
		title.setFont(f);
		title.setBounds(250, 10, 200, 30);	add(title);
		
		dateLbl.setBounds(20, 100, 500, 30);	add(dateLbl);
		questions.setBounds(20, 140, 300, 30);	add(questions);
		
		startBtn.setBounds(40, 180, 100, 40);	add(startBtn);
		
		messageLbl.setFont(f);
		messageLbl.setBounds(60, 260, 400, 30);	add(messageLbl);
		
		message.setBounds(30, 300, 200, 200);	add(message);
		
		reportLbl.setFont(f);
		reportLbl.setBounds(550, 260, 100, 20);	add(reportLbl);
		
		report.setBounds(500, 300, 200, 200);	add(report);
		
		answer.setBounds(200, 220, 50, 30);	add(answer);
		
		nextBtn.setBounds(500, 200, 170, 40);	add(nextBtn);
		
		nextBtn.addActionListener(this);
		startBtn.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Label problem = problem = new Label("Question No. " + Integer.toString(counter) + "    " + Integer.toString(x) + " + " + Integer.toString(y) + " = ?");
		if (e.getSource() == startBtn) {			
			problem.setBounds(20, 230, 150, 30);	add(problem);
		}
		else if (e.getSource() == nextBtn) {
			Label temp = problem;
			problem.setVisible(false);
			System.out.println(sum);
			System.out.println(answer.getText());
			if (answer.getText().trim().equals(Integer.toString(sum))) {
				Label correct = new Label("CORRECT");
				correct.setBounds(260, 220, 100, 30);	add(correct);
			}
			else {
				Label wrong = new Label("WRONG");
				wrong.setBounds(260, 220, 100, 30);	add(wrong);
			}
		}
	}
	
	
	
}
