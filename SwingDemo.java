import javax.swing.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        JFrame fobj = new JFrame(title);
        fobj.setSize(300,600);  // (W,H)
        fobj.setVisible(true);
    }
}

class SwingDemo
{
    public static void main(String Arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}

/*    Awt         Swing
     Frame       JFrame
     Button      JButton
     TextField   JTextField
*/