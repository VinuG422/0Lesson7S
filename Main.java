import javax.swing.JFrame;

import view.GameBoard;

public class Main {
	
		
			public static void main(String[] args){
				JFrame window = new JFrame();
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setTitle("Space Invader");
				window.setLocation(500, 100);
		
				var menu = new GameBoard(window);
				menu.init();
				
				window.setResizable(false);
				window.pack();
				window.setVisible(true);
		




	}
}