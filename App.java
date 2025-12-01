import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class App extends JFrame {
    private static final int X_LOC = 100;
    private static final int Y_LOC = 100;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final String NAME = "Chocolate Factory";
    private JFrame frame;
    ChocolateFactory factory;
    private JTextArea outputArea; 


    public App() {
        createFrame();
        initializeComponents();
        redirectSystemOutToGUI(); 
        displayFrame();
    }

    public JFrame getFrame() {
        return frame;
    }

    private void createFrame() {
        frame = new JFrame();
        frame.setLocation(X_LOC, Y_LOC);
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle(NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initializeComponents() {
        initializeButtons();
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        frame.add(scrollPane, BorderLayout.CENTER);
    }   

    
    private void displayFrame() {
        frame.setVisible(true);
    }

    private void initializeButtons() {
        JPanel buttons = new JPanel();

        JButton reeseButton = new JButton("Reese's Cup");
        reeseButton.setName("reeseButton");
        reeseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                factory = new NotReeseFactory();
                System.out.println("--- Creating a Reese's Cup product ---");
                Chocolate choc = factory.createChocolate();
                Wrapper wrap = factory.createWrapper();
                choc.create();
                wrap.wrap();
                System.out.println("--- Chocolate Complete ---");
            }
        });
        buttons.add(reeseButton);

        JButton bunnyButton = new JButton("Chocolate Bunny");
        bunnyButton.setName("bunnyButton");
        bunnyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                factory = new EasterBunnyFactory();
                 System.out.println("--- Creating a Chocolate Bunny ---");
                Chocolate choc = factory.createChocolate();
                Wrapper wrap = factory.createWrapper();
                choc.create();
                wrap.wrap();
                System.out.println("--- Chocolate Complete ---");
            }
        });
        buttons.add(bunnyButton);

        frame.add(buttons, BorderLayout.PAGE_START);
    }

    private void redirectSystemOutToGUI() {
        OutputStream out = new CustomOutputStream(outputArea);
        PrintStream printStream = new PrintStream(out, true);
        System.setOut(printStream);
        System.setErr(printStream); 
    }

}

