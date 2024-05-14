
package view;

import controler.AudioPlayer;
import controler.Draw;
import static controler.Draw.getDraw;
import controler.level1;
import java.awt.event.KeyEvent;
import model.Clown;
import static model.Clown.getClown;
import model.HighScore;
import model.Observer;
import static model.Observer.getObserver;


public class play extends javax.swing.JFrame {
   Draw d=getDraw();
   Observer o=getObserver();
    Clown clown=getClown();
       public static String path=Draw.path;
    public play() {
        initComponents();
           this.setTitle("circus game");
               scoreNum.setText("0");
           playAgain.setVisible(false);
 highScore.setText("High Score: "+HighScore.load()); 
o.updateLevel(1);
setLevel("level 1");
        d.refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = d;
        score = new javax.swing.JLabel();
        end = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        scoreNum = new javax.swing.JLabel();
        highScore = new javax.swing.JLabel();
        playAgain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        score.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("Score");

        end.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        end.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        level.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        level.setForeground(new java.awt.Color(255, 255, 255));
        level.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        scoreNum.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        scoreNum.setForeground(new java.awt.Color(255, 255, 255));
        scoreNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        highScore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        highScore.setForeground(new java.awt.Color(255, 255, 255));
        highScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        playAgain.setBackground(new java.awt.Color(51, 255, 51));
        playAgain.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playAgain.setText("Play again");
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(highScore, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreNum, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addComponent(playAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addComponent(playAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scoreNum, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(highScore, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       int x = evt.getX();
       int y = evt.getY(); 
     if(  clown.contains(x, y))
     {
         clown.setPrevX(x);
         clown.setselected(true);
     }
     else  clown.setselected(false);
       
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getX();
         int y = evt.getY();
       if(clown.isSelected()) clown.moveTo(x);
       d.refresh();
         
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
      
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped

    }//GEN-LAST:event_jPanel1KeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT){ clown.moveTo(clown.getX()-5);}
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT) clown.moveTo(clown.getX()+5);
       d.refresh();
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
       if(evt.getKeyCode()==KeyEvent.VK_LEFT){ clown.moveTo(clown.getX()-7);}
       if(evt.getKeyCode()==KeyEvent.VK_RIGHT) clown.moveTo(clown.getX()+7);
       d.refresh();
    }//GEN-LAST:event_formKeyTyped

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
       highScore.setText("High Score: "+HighScore.load()); 
       scoreNum.setText("0");
       d.removeShapes();
       clown.removeShapes();
o.updateLevel(1);
Draw.statePlaying=true;
setLevel("level 1");
        playAgain.setVisible(false);
        AudioPlayer.main(null, path+"CircusMusic1.wav");
        end.setVisible(false);
                d.refresh();
    }//GEN-LAST:event_playAgainActionPerformed

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
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new play().setVisible(true);
            }
        });
    }

 public  static void setScore(String s){
     scoreNum.setText(s);
 }
 public  static void setLevel(String s){
     play.level.setText(s);
 }
 public  static void setEnd(){
     play.end.setText("Game over");
     playAgain.setVisible(true);
     HighScore.saveHighScore(Integer.parseInt(scoreNum.getText()));
   

     
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel end;
    public static javax.swing.JLabel highScore;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel level;
    public static javax.swing.JButton playAgain;
    public static javax.swing.JLabel score;
    public static javax.swing.JLabel scoreNum;
    // End of variables declaration//GEN-END:variables
}
