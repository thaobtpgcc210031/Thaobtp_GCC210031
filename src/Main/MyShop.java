/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Lib.XDate;
import Lib.XFile;
import Model.ShopD;
import java.awt.Component;

import java.util.ArrayList;

import java.util.Date;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 
import java.util.Random; 
import java.util.function.Consumer; 
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ASUS
 */
public class MyShop extends javax.swing.JFrame {

     DefaultTableModel tbModel;
    DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
    String filePath= "";
    ArrayList<ShopD> canList;
    int currentRow = -1;
//    chua chon gif, nam ngoai bien
    /**
     * Creates new form CandApp
     */
    public MyShop() {
        initComponents();
    }
     JFrame frontScreen;
     public MyShop(String name, Login aThis){
        initComponents();
        initTable();
        loadCb();
        tbCan.setDefaultEditor(Object.class, null); //cho chon nhung ko dc sua
         frontScreen = aThis;
        this.setLocationRelativeTo(null);
        
        filePath = "./src/lib/PTShopMGM.dat";
        canList = new ArrayList<>();
        boolean file = loadFile();
        if(file){
        fillToTable();
        }else{
            showMess("Nothing to show");
        }
        
        this.setTitle("Design preview[CandApp]");
        this.setLocationRelativeTo(null);
      
        
    }
    private void fillToTable(){
        tbModel.setRowCount(0);//delete->start
        for(ShopD c: canList){
            Object[] row = new Object[]{c.getID(), c.getName(), c.getNameP(), c.getGender(), c.getAdress(), c.getType(), c.getDate()};
            tbModel.addRow(row);
        }
    }
    
    private void showMess(String mess) {
        JOptionPane.showMessageDialog(this, mess);
    }


   private boolean  loadFile(){
       if(XFile.readObject(filePath)==null){
           return false;
       
   }
       canList = (ArrayList<ShopD>) XFile.readObject(filePath);
       return true;
   }
    
    private void loadCb(){
        String[] majorLst ={"Choose type, please","Short","T-Shirt","Shorts"};
        for(String string : majorLst){
            cbModel.addElement(string);
        }
        cbtype.setModel(cbModel);
    }
    private void initTable(){
        String[] columNames = {"ID","Name", "Name product","Gender","Adress","Type","Date"};
        tbModel = new DefaultTableModel(columNames,0);
        tbCan.setModel(tbModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbAdress = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtNameP = new javax.swing.JTextField();
        cbtype = new javax.swing.JComboBox<>();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        btnSort = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setText("ID");

        jLabel4.setText("Full name");

        lbAdress.setText("Adress");

        jLabel6.setText("Gender");

        jLabel7.setText("Type");

        grGender.add(rdMale);
        rdMale.setText("Male");
        rdMale.setActionCommand("false");
        rdMale.setBorderPainted(true);

        grGender.add(rdFemale);
        rdFemale.setText("Female");
        rdFemale.setActionCommand("true");

        txtDate.setDateFormatString("d/MM/y");

        jLabel3.setText("Date");

        jLabel9.setText("Name Product");

        btnSort.setText("Sort Can By ID");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNameP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbtype, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(32, 32, 32))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(2, 2, 2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(rdMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(rdFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(3, 3, 3)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btnSort)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdress))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdMale)
                    .addComponent(rdFemale))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSort)
                .addGap(40, 40, 40))
        );

        jPanel7.setBackground(new java.awt.Color(255, 153, 153));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(51, 51, 255));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(btnLogOut)
                    .addComponent(btnUpdate))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(55, 55, 55)
                .addComponent(btnUpdate)
                .addGap(55, 55, 55)
                .addComponent(jButton4)
                .addGap(56, 56, 56)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(38, 38, 38))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/download (1).png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel5.setFont(new java.awt.Font("STCaiyun", 2, 18)); // NOI18N
        jLabel5.setText("PT SHOP");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel1.setText("PT SHOP MANAGEMENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(439, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        tbCan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbCanMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbCan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        addCan();
        fillToTable();
        saveFile();
        //if dua save len dau tat mo lai ko co
        
    }//GEN-LAST:event_jButton2ActionPerformed

//
//public class RandomStringExmple { 
//    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z     
//    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z     
//    private static final String digits = "0123456789"; // 0-9    
//    private static final String specials = "~=+%^*/()[]{}/!@#$?|";    
//    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;     
//    private static final String ALL = alpha + alphaUpperCase + digits + specials;    
//    private static Random id = new Random();
//     /**      * Random string with a-zA-Z0-9, not included special characters      */     
//            public String randomAlphaNumeric(int numberOfCharactor) {        
//                StringBuilder sb = new StringBuilder();        
//                for (int i = 0; i < numberOfCharactor; i++) {            
//                    int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);     
//                    char ch = ALPHA_NUMERIC.charAt(number);            
//                    sb.append(ch);         }         return sb.toString();   
//            }     /**      * Random string password with at least 1 digit and 1 special character      */    
//            public String randomPassword(int numberOfCharactor) {         
//                List<String> result = new ArrayList<>();        
//                Consumer<String> appendChar = s -> {          
//                    int number = randomNumber(0, s.length() - 1);          
//                    result.add("" + s.charAt(number));         };      
//                appendChar.accept(digits);        
//                appendChar.accept(specials);     
//                while (result.size() < numberOfCharactor) {            
//                    appendChar.accept(ALL);         }         
//                Collections.shuffle(result, id);       
//                return String.join("", result);     }    
//            public static int randomNumber(int min, int max) {        
//                return id.nextInt((max - min) + 1) + min;     }    
//            
//              }
    private void tbCanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCanMousePressed
        // TODO add your handling code here:
        currentRow = tbCan.getSelectedRow();
        showDetail(currentRow);
    }
    
    private void showDetail(int r){
        String id = (String) tbCan.getValueAt(r, 0);
        txtId.setText(id);

        String name = (String) tbCan.getValueAt(r, 1);
        txtName1.setText(name);
        String nameP = (String) tbCan.getValueAt(r, 2);
      txtNameP.setText(name);
        String Adress = (String) tbCan.getValueAt(r, 4);
        txtAdress.setText(Adress.toString());
        String type = (String) tbCan.getValueAt(r, 5);
        cbtype.setSelectedItem(type);
        Date date = txtDate.getDate();
        String dateD = XDate.DateToString(date);
        ShopD c = canList.get(r);
        
        
        Boolean gender = (Boolean) tbCan.getValueAt(r, 3);
        setBtnGroup(gender.toString());
        
    }//GEN-LAST:event_tbCanMousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(this,
                "Do you wanna exit?",
                "Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);

        } else {
            showMess("OK");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        deleteCan();
         fillToTable();
        saveFile();
        
    }
private void deleteCan(){
int result = JOptionPane.showConfirmDialog(this,
                "Do you wanna delete?",
                "Delete",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
              canList.remove(currentRow);
              resetForm(); 

        } else {
            showMess("OK");
        }
            
}
private void resetForm(){
    txtId.setText("");
    txtName1.setText("");
    txtNameP.setText("");
    txtAdress.setText("");
   cbtype.setSelectedItem(0);
rdMale.setSelected(false);
rdFemale.setSelected(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
      
        updateCan();
        fillToTable();
        saveFile();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(this,
                "Do you wanna log out?",
                "Log out",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);

        } else {
            showMess("OK");
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
        sortCanByID();
        fillToTable();
    }
    private void sortCanByID(){
        Collections.sort(canList, new Comparator<ShopD>(){
            @Override
            public int compare(ShopD o1, ShopD o2) {
               return o2.getID().compareTo(o1.getID());
            }
                
        });
    }//GEN-LAST:event_btnSortActionPerformed

    private  void updateCan(){
        ShopD c = canList.get(currentRow); //se bi sai neu currenRow laf -1, 
        c.setName(txtNameP.getText());
//        c.setAverage(Double.parseDouble(txtMark.getText()));
c.setAdress(txtAdress.getText());
        c.setGender(Boolean.parseBoolean(grGender.getSelection().getActionCommand()));
        c.setType(cbtype.getSelectedItem().toString());
    }
private void setBtnGroup(String value){
     for (Component c : jPanel1.getComponents()){
        if(c instanceof JRadioButton){
            JRadioButton btn = (JRadioButton) c;
            if(btn.getActionCommand().equals(value)){
                btn.setSelected(true);
            }
        }
    }
}

    private void addCan(){
        String id = txtId.getText();
         if(id.length() > 0){
            
        }else{
            JOptionPane.showMessageDialog(rootPane, " ID cannot null");
        }
        String name = txtName1.getText();
                 if(name.length() > 0){
            
        }else{
            JOptionPane.showMessageDialog(rootPane, " Name cannot null");
        }
        String namep = txtNameP.getText();
                 if(namep.length() > 0){
            
        }else{
            JOptionPane.showMessageDialog(rootPane, " Name Product cannot null");
        }
        String adress = txtAdress.getText();
                 if(adress.length() > 0){
            
        }else{
            JOptionPane.showMessageDialog(rootPane, " Address cannot null");
        }
        Boolean gender = Boolean.parseBoolean(grGender.getSelection().getActionCommand()) ;
                 if(grGender.getSelection()!=null){
                     
            
        }else{
            JOptionPane.showMessageDialog(rootPane, " Choose gender, please!");
        }
        String type = cbtype.getSelectedItem().toString();
                 if(cbtype.getSelectedItem()!=null){
                     
            
        }else{
            JOptionPane.showMessageDialog(rootPane, " Choose type, please!");
        }
        Date date = txtDate.getDate();
       if(txtDate.getDate()!=null){
                     
            
        }else{
            JOptionPane.showMessageDialog(rootPane, " Choose date, please!");
        }
        String dateD = XDate.DateToString(date);
//      if(txtId.getText().equals("")){
//          JOptionPane.showMessageDialog(this, "Please Enter ID!");
//          
//      }else if(txtName1.getText().equals("")){
//          JOptionPane.showMessageDialog(this, "Please Enter Name!");
//      }else if(txtNameP.getText().equals("")){
//          JOptionPane.showMessageDialog(this, "Please Enter Name Product!");
//      }else if(txtAdress.getText().equals("")){
//          JOptionPane.showMessageDialog(this, "Please Enter Address!");
//      }else if(grGender.getSelection()== null){
//          JOptionPane.showMessageDialog(this, "Please choose Gender!");
//      }else if(cbtype.getActionCommand()== null){
//          JOptionPane.showMessageDialog(this, "Please choose Type!");
//      }else if(txtDate.getDate()== null){
//          JOptionPane.showMessageDialog(this, "Please choose Date!");
//      }
//          
        
        
        ShopD c= new ShopD(id, name, namep, adress, gender, type, dateD);
        canList.add(c);
        
        
    }
     private  void saveFile(){
         XFile.writeObject(filePath, canList);
     }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbtype;
    private javax.swing.ButtonGroup grGender;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAdress;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tbCan;
    private javax.swing.JTextField txtAdress;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtNameP;
    // End of variables declaration//GEN-END:variables

    
}