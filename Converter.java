import java.awt.event.*;
import javax.swing.*;
public class Converter extends javax.swing.JFrame implements ActionListener{
    Calculation calculate;
    public Converter() {
        initComponents();
        
    }
    private void initComponents() {
        try{
        setVisible(true);
        setResizable(false);
        calculate=new Calculation();
        pnlHead = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        txtOutput = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        conversionType = new javax.swing.JComboBox<>();
        btnConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlHead.setBackground(new java.awt.Color(252, 248, 8));
        pnlHead.setForeground(new java.awt.Color(249, 239, 239));

        jLabel4.setFont(new java.awt.Font("Abyssinica SIL", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 5, 5));
        jLabel4.setText("ConversionHub");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo.png"))); // NOI18N

        txtInput.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        txtInput.setName("txtInput"); // NOI18N

        txtOutput.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        txtOutput.setForeground(new java.awt.Color(27, 8, 8));
        txtOutput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Input Number");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Output Number");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Convert To");

        conversionType.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        conversionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Select----", "Binary to Decimal", "Binary to Octal", "Binary to Hexadecimal", "Decimal to Binary", "Decimal to Octal", "Decimal to Hexadecimal", "Octal to Decimal", "Octal to Binary", "Octal to Hexadecimal", "Hexadecimal to Binary", "Hexadecimal to Decimal", "Hexadecimal to Octal" }));

        btnConvert.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        btnConvert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/btn.png"))); // NOI18N
        btnConvert.setText("Convert");

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(txtInput)
                            .addComponent(txtOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conversionType, 0, 344, Short.MAX_VALUE)))
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conversionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadLayout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(194, 194, 194))
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeadLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(pnlHeadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        btnConvert.addActionListener(this);
    }catch(Exception e)
    {
        System.out.println("Exception is: "+e);
    }
    }

         public void actionPerformed(ActionEvent evt)
         {
            Object clicked=evt.getSource();
            if(txtInput.getText().equals(""))
            {
                 JOptionPane.showMessageDialog(null,"Input field is empty...","Empty Field",1);
            }
            else
            {
                strInput=txtInput.getText().toString();
                txtOutput.setText("");
            
                //buttons*****************
                if(clicked==btnConvert)
                {
                    choice=(conversionType.getSelectedItem()).toString();

                switch(choice)
                {
                    case "Binary to Decimal":
                    {
                        txtOutput.setText("");
                        strOutput=calculate.convertBinaryToDecimal(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case  "Binary to Octal":
                    {
                        txtOutput.setText("");
                        strOutput=calculate.convertBinaryToOctal(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case  "Binary to Hexadecimal":
                    {
                        txtOutput.setText("");
                        strOutput=calculate.convertBinaryToHexa(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case "Decimal to Binary":
                    {
                        strOutput=calculate.convertDecimalToBinary(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case  "Decimal to Octal":
                    {
                        strOutput=calculate.convertDecimalToOctal(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case "Decimal to Hexadecimal" :
                    {
                        strOutput=calculate.convertDecimalToHexa(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case "Octal to Decimal":
                    {
                        strOutput=calculate.convertOctalToDecimal(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case "Octal to Binary":
                    {
                        strOutput=calculate.convertOctalToBinary(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case "Octal to Hexadecimal":
                    {
                        strOutput=calculate.convertOctalToHexa(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case "Hexadecimal to Binary":
                    {
                        strOutput=calculate.convertHexaToBinary(strInput);
                        txtOutput.setText(strOutput);
                        break;
                    }
                    case "Hexadecimal to Decimal":
                    {

                        break;
                    }
                    
                    case "Hexadecimal to Octal":
                    {

                        break;
                    }
                    default:
                    {
                        JOptionPane.showMessageDialog(null,"Select a conversion...","Invalid Conversion Choice",1);
                        break;
                    }
                }//end of switch case
                }
        }//end of else
    }//end of actionPerformed()


   public static void main(String args[]) 
    {     
                new Converter();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    
    private String strInput,strOutput,choice;
    private javax.swing.JButton btnConvert;
    private javax.swing.JComboBox<String> conversionType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JTextField txtInput;
    private javax.swing.JLabel txtOutput;
    // End of variables declaration//GEN-END:variables
}