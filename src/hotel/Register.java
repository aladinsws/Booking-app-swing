package hotel;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sws
 */
public class Register extends javax.swing.JFrame {

    
     
      String hotel;
      String etoil;
      String prix;
        String dateDu;
       String dateAu;
      int nbLit;
      int  nbjour;
     String categorie;
      int pension;
      String IDch;
    public Register( String hotel,String etoil,String prix,String dateDu,String dateAu,int nbLit,int nbjour,String categorie,int pension,String IDch) {
        super("Register");
          initComponents();
       this.hotel=hotel;
      this.etoil=etoil;
       this.prix=prix;
        this.dateDu=dateDu;
      this.dateAu=dateAu;
     this.nbLit= nbLit;
      this.nbjour=nbjour;
     this.categorie=categorie;
      this.pension=pension;
      this.IDch=IDch;
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtPrenom = new javax.swing.JTextField();
        jcCivilite = new javax.swing.JComboBox<>();
        jtNom = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jtPortable = new javax.swing.JTextField();
        jcGovernorat = new javax.swing.JComboBox<>();
        jcVille = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jlCin = new javax.swing.JLabel();
        jtCin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 53, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Civilité");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prénom");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Portable");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gouvernorat");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ville");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Entrez vos coordonnees :");

        jtPrenom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrenomActionPerformed(evt);
            }
        });

        jcCivilite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcCivilite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Mme", "Mlle" }));
        jcCivilite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCiviliteActionPerformed(evt);
            }
        });

        jtNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jtPortable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jcGovernorat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcGovernorat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ariana  ", "Beja ", "Ben Arous", "Bizerte", "Gabes ", "Gafsa ", "Jendouba ", "Kairouan ", "Kasserine ", "Kebili", "Kef ", "Mahdia ", "Mannouba", "Mednine", "Monastir", "Nabeul ", "Sfax ", "SidiBouzid ", "Siliana ", "Sousse", "Tataouine ", "Tozeur ", "Tunis", "Zaghouane " }));
        jcGovernorat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcGovernoratItemStateChanged(evt);
            }
        });
        jcGovernorat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGovernoratActionPerformed(evt);
            }
        });

        jcVille.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcVille.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ettadhamen Mnihla ", "La Soukra ", "Ariana ", "Raoued ", "Kalaat el Andalous", "Sidi Thabet " }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Valider");
        jButton1.setMaximumSize(new java.awt.Dimension(87, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(87, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(87, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlCin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlCin.setForeground(new java.awt.Color(255, 255, 255));
        jlCin.setText("CIN");

        jtCin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtCin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jlCin))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCivilite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcGovernorat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jcVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtPortable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                .addComponent(jtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtNom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtPrenom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtCin, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcCivilite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCin)
                    .addComponent(jtCin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtPortable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcGovernorat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jcVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrenomActionPerformed

    private void jcGovernoratItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcGovernoratItemStateChanged
        // TODO add your handling code here:
      String villes[][] = {{" Ettadhamen Mnihla ", "La Soukra ", "Ariana ", "Raoued ",
        "Kalaat el Andalous ", " S i d i Thabet "}, {" Beja ", "Medjez e lBab",
        "Tes tour ", "Teboursouk ", "El Maagoula ", "Nefza ", "Amdoun",
        "Goube l lat ", "Thibar "}, {" Ezzahra ", "Hammam Chott ", "Mornag ",
        "Megrine ", "Khal idia ", "Bou Mhel e l??Bas sat ine ", "Hammam Linf ",
        "Rades ", "Ben Arous ", "El Mourouj ", "Mohamedia Fouchana "},
    {" Bi z e r t e ", "Menzel Bourguiba ", "Mateur ", "Ras Jebe l ", "Menzel Jemi l ",
        "Tinja ", "Menzel Abderrahmane ", "El Al ia ", "Me t l ine ", " Sejnane ",
        "Ghar El Melh ", "Aousja ", "Ghezala ", "Joumine ", "Utique ", "Raf Raf "},
    {"Gabes ", "El Hamma", "Ghannouch ", "Chenini Nahal ", "Mareth ", "Metouia ",
        "Oudhref ", "Nouve l l e Matmata ", "Zarat ", "Matmata ", "Menzel El Habib "},
    {"Gafsa ", "Met laoui ", "El Ksar ", "Redeyef ", "Moulares ", "El Guettar ",
        "Mdhi l la ", "Sened ", " Be lkhi r ", " S i d i Aich "}, {" Jendouba ", "Bou Salem",
        "Tabarka ", "Ghardimaou ", "Ain Draham", "Fernana ", "Oued Mel iz ", "Beni M' Ti r "}, {"Kairouan ", "Hajeb El Ayoun", "Oue s l a t i a ", "Haf fouz ",
        " Sbikha ", "Bou Haj la ", "Na s r a l l ah ", "Menzel Mehi r i ", "El Alaa ",
        "Chebika ", "Ain Dj e l oul a ", "Echrarda "}, {" Kas s e r ine ", "Fer iana ",
        " S b e i t l a ", "Thala ", "Foussana ", "Thelepte ", " Sbiba ", "Majel Bel Abbes ",
        " J ede l i enne ", "Haidra ", "El Ayoun", "Ezzouhour ", "Has s i El Fe r id "},
    {"Douz ", "Kebelli ", "Souk Lahad ", "El Golaa ",
        "Jemna ", "Faouar "}, {"Le Kef ", "Taj e rouine ", "Dahmani ", " Se r s ", " J e r i s s a ",
        "Kalaat Senan ", " Saki e t S i d i Yous sef ", "El Ksour ", "Nebeur ",
        "Kalaat Khasba ", "Toui r e f ", "Menzel Salem"}, {"Mahdia ", "Ksour Es s e f ",
        "Chebba ", "El Jem", "Re j i che ", " S i d i Alouane ", "Kerker ", "El Bradaa ",
        "Me l loul e che ", "Chorbane ", " Es s oua s s i ", "Ouled Chamekh", "Zelba ",
        " Tl e l s a ", " S i d i Zid ", "Hkaima ", "Hebi ra ", "Bou Merdes "}, {"Douar Hicher ",
        "Oued E l l i l ", "La Manouba", "Djedeida ", "Tebourba ", "Den Den",
        "Mornaguia ", "Bor j El Amri ", "El Batan "}, {" Djerba ?? Houmt Souk ",
        " Za r z i s ", "Medenine ", "Ben Gardane ", "Djerba ?? Midoun ", "Djerba ?? Ajim",
        " S i d i Makhlouf ", "Beni Khedache "}, {"Monast i r ", "Moknine ", "Jemmal ",
        "Ksar He l l a l ", "Teboulba ", "Ouerdanine ", " Sahl ine Mootmar ", "Bekal ta ",
        "Zeramdine ", "Bembla ", "Bennane??Bodheur ", "Ks ibet e l??Mediouni ",
        "Sayada ", "Menzel Hayet ", "Menzel Ennour ", "Khniss ", "Beni Hassen ",
        "Menzel Kamel ", " S i d i Ameur", "Amiret Ha j j a j ", "Touza ", "Bouhjar ",
        " Zaoui e t Kontoch ", "Amiret Touazra ", "Lamta ", "Amiret El Fhoul ",
        "El Ghnada ", "El Masdour ", " S i d i Bennour ", "Che rahi l ", "Menzel Fe r s i "},
    {"Hammamet", "Nabeul ", "Ke l ibi a ", "Dar Chaabane ", "Menzel Temime",
        "Korba ", "Sol iman ", "Grombalia ", " Takel sa ", " Beni Khiar ", "Menzel Bouz e l fa ",
        "Beni Khal led ", "Bou Argoub ", "El Haouaria ", "Tazarka ", "Hammam Ghezeze ",
        "El Maamoura", " Zaoui e t Dj edidi ", "Somaa", "Menzel Horr ", "Azmour",
        "Dar Al louch ", "El Mida ", "Korbous "}, {" Sfax ", " Saki e t Ez z i t ", "El Ain ",
        " Saki e t Eddaier ", "Gremda", "Thyna ", "Chihia ", "Mahres ", "Kerkennah ",
        " Skhi ra ", "Agareb ", "El Hencha ", " Jebiniana ", "Bi r Al i Ben Kha l i f a ",
        "Graiba ", "Menzel Chaker ", "El Amra", "Aachech ", "Ennasr ", "Hadjeb ",
        "Hazeg El louza ", "Nadhour S i d i Al i Ben Abed", "Ouabed Khazanet "},
    {" S i d i Bouzid ", "Meknassy ", "Regueb ", " S i d i Al i Ben Aoun", "Mezzouna ",
        "Menzel Bouzaiane ", "Bi r El Hafey ", " Ji lma ", "Cebbala Ouled Asker ",
        "Ouled Haf fouz ", "Es saida ", "Souk Jedid "}, {" S i l i a n a ", "Makthar ",
        "Bou Arada ", "Gaafour ", "El Krib ", "Bargou ", "Rouhia ", " S i d i Bou Rouis ",
        "El Aroussa ", "Kesra "}, {" Sous se ", "M' saken ", "Kalaa Kebira ", "Akouda ",
        "Hammam Sous se ", "Kalaa Seghi ra ", " Zaoui e t Sous se ", "Ezzouhour ",
        "Messaadine ", "Ks ibet Thrayet ", "Enf ida ", " S i d i Bou Al i ", "Bouf icha ",
        "Hergla ", "Kondar ", " S i d i El Hani "}, {" Tataouine ", "Ghomrassen ", "Remada",
        "Bi r Lahmar ", "Dehiba ", "Smar "}, {" Tozeur ", "Nef ta ", "Degache ", "Tamerza ",
        "El Hamma du J e r id ", "Hazoua "}, {" Tunis ", " S i d i Has s ine ", "La Marsa ",
        "Le Kram", "Le Bardo ", "La Goul e t t e ", "Carthage ", " S i d i Bou Said "},
    {"ElFahs ", " Zaghouan ", " Zr iba ", " Bi r Mcherga ", "Nadhour ", " Dj ebe l Oust ",
        " Saouaf "}};
        
        
jcVille.removeAllItems();
for(int i=0 ; i<villes[jcGovernorat.getSelectedIndex()].length ; i++)
jcVille.addItem(villes[jcGovernorat.getSelectedIndex()][i] ) ;
    }//GEN-LAST:event_jcGovernoratItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int cin=0;
     
                     try{
                         cin=Integer.parseInt(jtCin.getText());
                         
      if(jtCin.getText().length()!=8)
      JOptionPane.showMessageDialog(null,"Cin doit etre 8 chiffres");
      
          else  
      { getClient();
      
        new Recu(hotel,etoil,prix,dateDu,dateAu,nbLit,nbjour,categorie,pension,jtCin.getText(),jtNom.getText(),jtPrenom.getText()).setVisible(true);
        dispose();
      }  }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Cin doit etre 8 chiffres !!");
       }
      
        
                
    
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtCinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCinActionPerformed

    private void jcCiviliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCiviliteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCiviliteActionPerformed

    private void jcGovernoratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGovernoratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGovernoratActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcCivilite;
    private javax.swing.JComboBox<String> jcGovernorat;
    private javax.swing.JComboBox<String> jcVille;
    private javax.swing.JLabel jlCin;
    private javax.swing.JTextField jtCin;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNom;
    private javax.swing.JTextField jtPortable;
    private javax.swing.JTextField jtPrenom;
    // End of variables declaration//GEN-END:variables

    private void getClient() {
        
        try{
            int cin=Integer.parseInt(jtCin.getText());
           String cv=jcCivilite.getSelectedItem().toString();
           String pr=jtPrenom.getText();
           String nom=jtNom.getText();
           String email=jtEmail.getText();
           int tel=Integer.parseInt(jtPortable.getText());
           String gov=jcGovernorat.getSelectedItem().toString();
           String vil=jcVille.getSelectedItem().toString();
           
            Connection con=Connexion.ConnecrDb();
            Statement stmt = con.createStatement();
           
            String maRequete = "INSERT INTO hotel.client VALUES('"+cin + "', '" + cv + "','" + pr+ "', '" +nom+"','" + email+ "', '" + tel + "','" + gov+ "', '" + vil + "')"  ;
            String maReq="INSERT INTO hotel.reserver (id_client, id_ch, date_debut, date_fin) VALUES ('"+cin+"','"+IDch+"', '"+dateDu+"', '"+dateAu+"')";
            int nb = stmt.executeUpdate(maReq);
            
            int se=stmt.executeUpdate(maRequete);
            if((nb == 1)||(se==1))
                JOptionPane.showMessageDialog(this, "Votre reservation enregistrer avec success");
            else
                JOptionPane.showMessageDialog(this, "Pas d'insertion");
               
            stmt.close();
            con.close();
            
        }catch (SQLException sqle) {
            
        }
        
    }
}