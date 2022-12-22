package Basics;
import javax.swing.*;

public class About extends BasicAdder{
    public JPanel aboutPanel = new JPanel();
    public JLabel titleMenu = new JLabel("ABOUT",SwingConstants.CENTER);
    public JLabel paragraph1 = new JLabel("Game ini dibuat untuk melanjutkan kode battle app");
    public JLabel paragraph2 = new JLabel("milik Dosen Pemdas serta mengembangkan battle app");
    public JLabel paragraph3 = new JLabel("lebih jauh lagi. Game ini dibuat oleh Devan PTI 22");
    public JButton backMainBtn = new JButton("MENU");

    public About(){
        aboutPanel.setLayout(layout);
        setSpace(aboutPanel);


        setFont(titleMenu, 50);
        setFont(paragraph1,20);
        setFont(paragraph2,20);
        setFont(paragraph3,20);
        setBtnColor(backMainBtn);

        addComponent(0,0,5,titleMenu,aboutPanel);
        addComponent(0,1,5,paragraph1,aboutPanel);
        addComponent(0,2,5,paragraph2,aboutPanel);
        addComponent(0,3,5,paragraph3,aboutPanel);
        addComponent(0,4,5,backMainBtn,aboutPanel);

    }
}
