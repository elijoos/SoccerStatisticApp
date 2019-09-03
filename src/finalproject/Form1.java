/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;
/**
 *
 * @author elijah joos
 */



public class Form1 extends javax.swing.JFrame {

    //variables
    JOptionPane jop = new JOptionPane();
    JFrame mFrame = new JFrame("Message Examples");
    Team team1 = new Team();
    Team team2 = new Team();
    ArrayList team1Players = new ArrayList();
    String jerseyNumber = "";
    boolean properResponse = false;
    static int ProgValue;
    Timer myTimer;
    Timer clockTimer;
    int totalPossessionInt = 0;
    int currentSecond = 0;
    int currentMinute = 0;
    boolean secondHalfStart = false;
    DecimalFormat df = new DecimalFormat("#.##");

    
    public Form1() {
        initComponents();
        
        //setup
        this.setLocationRelativeTo(null);
        mFrame.setAlwaysOnTop(true);
        
        //team setup
        initializeGame();
        
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonPossesion1 = new javax.swing.JButton();
        jBtnGoal1 = new javax.swing.JButton();
        jBtnShot1 = new javax.swing.JButton();
        jBtnShotOnFrame1 = new javax.swing.JButton();
        jBtnCorner1 = new javax.swing.JButton();
        jBtnFoul1 = new javax.swing.JButton();
        jBtnOffside1 = new javax.swing.JButton();
        jBtnYellowCard1 = new javax.swing.JButton();
        jBtnRedCard1 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jBtnPosession2 = new javax.swing.JButton();
        jBtnGoal2 = new javax.swing.JButton();
        jBtnShot2 = new javax.swing.JButton();
        jBtnShotOnFrame2 = new javax.swing.JButton();
        jBtnCorner2 = new javax.swing.JButton();
        jBtnFoul2 = new javax.swing.JButton();
        jBtnOffside2 = new javax.swing.JButton();
        jBtnYellowCard2 = new javax.swing.JButton();
        jBtnRedCard2 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButtonFileSave = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTeamName1 = new javax.swing.JLabel();
        jTeamName2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel29 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel30 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        jLabel31 = new javax.swing.JLabel();
        jProgressBar5 = new javax.swing.JProgressBar();
        jLabel32 = new javax.swing.JLabel();
        jProgressBar7 = new javax.swing.JProgressBar();
        jLabel33 = new javax.swing.JLabel();
        jProgressBar6 = new javax.swing.JProgressBar();
        jLabel34 = new javax.swing.JLabel();
        jProgressBar8 = new javax.swing.JProgressBar();
        jLabel35 = new javax.swing.JLabel();
        jProgressBar9 = new javax.swing.JProgressBar();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jComboBoxTeam1 = new javax.swing.JComboBox<>();
        jButtonAddPlayerHome = new javax.swing.JButton();
        jTextFieldLastName = new javax.swing.JTextField();
        jButtonAddPlayerAway = new javax.swing.JButton();
        jComboBoxTeam2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelPlayerGoals = new javax.swing.JLabel();
        jLabelPlayerSOG = new javax.swing.JLabel();
        jLabelPlayerOffsides = new javax.swing.JLabel();
        jLabelPlayerAssists = new javax.swing.JLabel();
        jLabelPlayerYC = new javax.swing.JLabel();
        jLabelPlayerRC = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelPlayerJerseyNumber = new javax.swing.JLabel();
        jTextFieldJerseyNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabelPlayerFouls = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane2MousePressed(evt);
            }
        });
        jTabbedPane2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabbedPane2KeyPressed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(153, 201, 236));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setForeground(new java.awt.Color(241, 152, 152));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Team 1 Name");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonPossesion1.setText("Possession");
        jButtonPossesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPossesion1ActionPerformed(evt);
            }
        });

        jBtnGoal1.setText("Goal");
        jBtnGoal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGoal1ActionPerformed(evt);
            }
        });

        jBtnShot1.setText("Shot");
        jBtnShot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnShot1ActionPerformed(evt);
            }
        });

        jBtnShotOnFrame1.setText("Shot on Frame");
        jBtnShotOnFrame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnShotOnFrame1ActionPerformed(evt);
            }
        });

        jBtnCorner1.setText("Corner");
        jBtnCorner1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCorner1ActionPerformed(evt);
            }
        });

        jBtnFoul1.setText("Foul");
        jBtnFoul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFoul1ActionPerformed(evt);
            }
        });

        jBtnOffside1.setText("Offside");
        jBtnOffside1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOffside1ActionPerformed(evt);
            }
        });

        jBtnYellowCard1.setText("Yellow Card");
        jBtnYellowCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnYellowCard1ActionPerformed(evt);
            }
        });

        jBtnRedCard1.setText("Red Card");
        jBtnRedCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRedCard1ActionPerformed(evt);
            }
        });

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("0");

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("0");

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("0");

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("0");

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("0");

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("0");

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("0");

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("0");

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonPossesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnRedCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnYellowCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnOffside1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnFoul1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCorner1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnShotOnFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnShot1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGoal1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel43)
                        .addComponent(jLabel44)
                        .addComponent(jLabel45)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47)
                        .addComponent(jLabel48)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42))
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPossesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnGoal1)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jBtnShot1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnShotOnFrame1)
                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnCorner1)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jBtnFoul1)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnOffside1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnYellowCard1)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnRedCard1)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel9.setBackground(new java.awt.Color(241, 158, 158));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setForeground(new java.awt.Color(68, 85, 90));
        jPanel9.setPreferredSize(new java.awt.Dimension(420, 540));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Team 1 Name");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBtnPosession2.setText("Posession");
        jBtnPosession2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPosession2ActionPerformed(evt);
            }
        });

        jBtnGoal2.setText("Goal");
        jBtnGoal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGoal2ActionPerformed(evt);
            }
        });

        jBtnShot2.setText("Shot");
        jBtnShot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnShot2ActionPerformed(evt);
            }
        });

        jBtnShotOnFrame2.setText("Shot on Frame");
        jBtnShotOnFrame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnShotOnFrame2ActionPerformed(evt);
            }
        });

        jBtnCorner2.setText("Corner");
        jBtnCorner2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCorner2ActionPerformed(evt);
            }
        });

        jBtnFoul2.setText("Foul");
        jBtnFoul2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFoul2ActionPerformed(evt);
            }
        });

        jBtnOffside2.setText("Offside");
        jBtnOffside2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOffside2ActionPerformed(evt);
            }
        });

        jBtnYellowCard2.setText("Yellow Card");
        jBtnYellowCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnYellowCard2ActionPerformed(evt);
            }
        });

        jBtnRedCard2.setText("Red Card");
        jBtnRedCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRedCard2ActionPerformed(evt);
            }
        });

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("0");

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("0");

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("0");

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("0");

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("0");

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("0");

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("0");

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnRedCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnYellowCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnOffside2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnShotOnFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnShot2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnGoal2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnFoul2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCorner2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jLabel53)
                    .addComponent(jLabel52)
                    .addComponent(jLabel54)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56)
                    .addComponent(jLabel59))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jBtnPosession2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnPosession2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGoal2)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnShot2)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jBtnShotOnFrame2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCorner2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnFoul2)
                            .addComponent(jLabel55))))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jBtnOffside2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnYellowCard2)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRedCard2)
                    .addComponent(jLabel59))
                .addGap(52, 52, 52))
        );

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("0   :     ");

        jButton10.setText("Start Half");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("00");

        jButtonFileSave.setText("Save Stats to txt File (search \"gameresults.txt\") ");
        jButtonFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButtonFileSave, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268)
                        .addComponent(jButton10))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFileSave))
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setText("jLabel21");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(586, 586, 586))
        );

        jTabbedPane2.addTab("Home", jPanel3);

        jTeamName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTeamName1.setText("jTeamName1");

        jTeamName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTeamName2.setText("jTeamName2");

        jPanel1.setBackground(new java.awt.Color(153, 201, 236));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("0");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("0");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("0");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("0%");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("0");

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("0");

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("0");

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("0");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jPanel5.setBackground(new java.awt.Color(241, 158, 158));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("0");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("0");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("0%");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("0");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("0");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("0");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Shots");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Goals");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Shots On Frame");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Possession");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Corners");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Fouls");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Offsides");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Yellow Cards");

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Red Cards");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(jLabel28)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTeamName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTeamName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeamName1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTeamName2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jTabbedPane2.addTab("Stats Summary", jPanel4);

        jTextFieldFirstName.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldFirstName.setText("First Name");

        jComboBoxTeam1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home Team" }));
        jComboBoxTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTeam1ActionPerformed(evt);
            }
        });

        jButtonAddPlayerHome.setText("Add Player Home Team");
        jButtonAddPlayerHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPlayerHomeActionPerformed(evt);
            }
        });

        jTextFieldLastName.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldLastName.setText("Last Name");

        jButtonAddPlayerAway.setText("Add Player Away Team");
        jButtonAddPlayerAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPlayerAwayActionPerformed(evt);
            }
        });

        jComboBoxTeam2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Away Team" }));
        jComboBoxTeam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTeam2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Goals");

        jLabel3.setText("Shots On Goal");

        jLabel4.setText("Offsides");

        jLabel5.setText("Assists");

        jLabel6.setText("Yellow Cards");

        jLabel7.setText("Red Cards");

        jLabelPlayerGoals.setText(" ");

        jLabelPlayerSOG.setText(" ");

        jLabelPlayerOffsides.setText(" ");

        jLabelPlayerAssists.setText(" ");

        jLabelPlayerYC.setText(" ");

        jLabelPlayerRC.setText(" ");

        jLabel8.setText("Jersey Number");

        jLabelPlayerJerseyNumber.setText(" ");

        jTextFieldJerseyNumber.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldJerseyNumber.setText("Jersey Number");

        jLabel9.setText("Fouls");

        jLabelPlayerFouls.setText(" ");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Player Statistics");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPlayerAssists, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPlayerOffsides, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPlayerRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPlayerYC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jComboBoxTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldJerseyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAddPlayerHome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAddPlayerAway))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPlayerFouls, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                                    .addComponent(jLabelPlayerGoals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPlayerJerseyNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPlayerSOG, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))))
                        .addGap(180, 180, 180))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddPlayerHome)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddPlayerAway)
                    .addComponent(jTextFieldJerseyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelPlayerJerseyNumber))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelPlayerGoals))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelPlayerSOG))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelPlayerFouls))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelPlayerOffsides))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelPlayerAssists))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelPlayerYC))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelPlayerRC))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Players", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Home and Away Names
    private void initializeGame() {
        //home team name
        String homeTeamName = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter Home Team Name", 
                    "Home Team", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        //awway team name
        String awayTeamName = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter Away Team Name", 
                    "Away Team", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        
        //set labels for team names
        jLabel1.setText(homeTeamName);
        jTeamName1.setText(homeTeamName);
        jLabel41.setText(awayTeamName);
        jTeamName2.setText(awayTeamName);
    }
    
    private void jBtnGoal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGoal1ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar1.setString(""); 
        jProgressBar2.setString("");
        jProgressBar3.setString(""); 

        team1.goals += 1;
        team1.shotsOnFrame += 1;
        team1.shots += 1;
        
        //goal response
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter jersey number", 
                    "Goal Scored", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        
        for(int i = 0; i < team1.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team1.players.get(i);
            
            if (team1.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.goals += 1;
                currentPlayer.shotsOnGoal += 1;
                properResponse = true;
            } 
            
            jLabel42.setText("" + team1.goals);
            jLabel43.setText("" + team1.shots);
            jLabel44.setText("" + team1.shotsOnFrame);
            
        }

        //assist response
        String choice2 = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter jersey number (leave empty if no assist)", 
                    "Assist Made", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        
        for(int i = 0; i < team1.players.size(); i++) {
            
            jerseyNumber = choice2;
            Player currentPlayer = team1.players.get(i);
            
            if (team1.players.get(i).getJerseyNumber().equals(choice2)) {
               
                currentPlayer.assists += 1;
                properResponse = true;
            } 
            
        }
        
    }//GEN-LAST:event_jBtnGoal1ActionPerformed

    private void jBtnShotOnFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnShotOnFrame1ActionPerformed
        //set jProgressBar text to empty string
        jProgressBar3.setString("");         
        team1.shotsOnFrame += 1;
        team1.shots += 1;
        
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter shooter jersey number", 
                    "Shot on Frame", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team1.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team1.players.get(i);
            
            if (team1.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.shotsOnGoal += 1;
                
            }
            
            jLabel44.setText("" + team1.shotsOnFrame);
            jLabel43.setText("" + team1.shots);
            
        }
    }//GEN-LAST:event_jBtnShotOnFrame1ActionPerformed

    private void jBtnFoul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFoul1ActionPerformed
        //set jProgressBar text to empty string
        jProgressBar7.setString(""); 

        team1.fouls += 1;
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter player jersey number", 
                    "Foul", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team1.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team1.players.get(i);
            
            if (team1.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.fouls += 1;
                
            }
            
            jLabel46.setText("" + team1.fouls);
        
        }
    }//GEN-LAST:event_jBtnFoul1ActionPerformed

    private void jBtnYellowCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnYellowCard1ActionPerformed
       //set jProgressBar text to empty string
        jProgressBar8.setString(""); 

        team1.yellowCards += 1;
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter player jersey number", 
                    "Yellow Card", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team1.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team1.players.get(i);
            
            if (team1.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.yellowCards += 1;
                
            }
            
            jLabel48.setText("" + team1.yellowCards);
        
        }
    }//GEN-LAST:event_jBtnYellowCard1ActionPerformed

    private void jBtnGoal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGoal2ActionPerformed

        //set jProgressBar text to empty string
        jProgressBar1.setString(""); 
        jProgressBar2.setString("");
        jProgressBar3.setString(""); 
        
        team2.goals += 1;
        team2.shotsOnFrame += 1;
        team2.shots += 1;
        
        //goal response
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter jersey number", 
                    "Goal Scored", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team2.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team2.players.get(i);
            
            if (team2.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.goals += 1;
                currentPlayer.shotsOnGoal += 1;
                properResponse = true;
            } 
            
            jLabel51.setText("" + team2.goals);
            jLabel52.setText("" + team2.shots);
            jLabel53.setText("" + team2.shotsOnFrame);
            
        }
        
        //assist pane show because of goal
        String choice2 = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter jersey number (leave empty if no assist)", 
                    "Assist Made", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team2.players.size(); i++) {
            
            jerseyNumber = choice2;
            Player currentPlayer = team2.players.get(i);
            
            if (team2.players.get(i).getJerseyNumber().equals(choice2)) {
               
                currentPlayer.assists += 1;
                properResponse = true;
            } 
            
        }
    }//GEN-LAST:event_jBtnGoal2ActionPerformed

    private void jBtnShotOnFrame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnShotOnFrame2ActionPerformed
        //set jProgressBar text to empty string
        jProgressBar3.setString(""); 
        jProgressBar2.setString(""); 

        team2.shotsOnFrame += 1;
        team2.shots += 1;
        
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter shooter jersey number", 
                    "Shot on Frame", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team2.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team2.players.get(i);
            
            if (team2.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.shotsOnGoal += 1;
                
            }
            
            jLabel52.setText("" + team2.shotsOnFrame);
            jLabel53.setText("" + team2.shots);
            
        }
    }//GEN-LAST:event_jBtnShotOnFrame2ActionPerformed

    private void jBtnFoul2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFoul2ActionPerformed
        //set jProgressBar text to empty string
        jProgressBar7.setString(""); 

        team2.fouls += 1;
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter player jersey number", 
                    "Foul", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team2.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team2.players.get(i);
            
            if (team2.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.fouls += 1;
                
            }
            
            jLabel55.setText("" + team2.fouls);
        
        }
    }//GEN-LAST:event_jBtnFoul2ActionPerformed

    private void jBtnYellowCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnYellowCard2ActionPerformed
        //set jProgressBar text to empty string
        jProgressBar8.setString(""); 

        team2.yellowCards += 1;
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter player jersey number", 
                    "Yellow Card", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team2.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team2.players.get(i);
            
            if (team2.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.yellowCards += 1;
                
            }
            
            jLabel57.setText("" + team2.yellowCards);
        
        }
    }//GEN-LAST:event_jBtnYellowCard2ActionPerformed

    private void jComboBoxTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTeam1ActionPerformed
       
        //get the player with the same name as what the combo box selected
        
        String playerFullName = "";
        Player selectedPlayer;
        
        //sort through all players and set their stats
        for(int i = 0; i < team1.players.size(); i++) {
            
            playerFullName = team1.players.get(i).getFullName();
            
            if (jComboBoxTeam1.getSelectedItem().equals(playerFullName)) {
                
                selectedPlayer = team1.players.get(i);
                
                //set all the labels to the player's statsselectedPlayer.getGoals()
                jLabelPlayerJerseyNumber.setText("" + selectedPlayer.getJerseyNumber());
                jLabelPlayerGoals.setText("" + selectedPlayer.getGoals());
                jLabelPlayerSOG.setText("" + selectedPlayer.getShotsOnGoal());
                jLabelPlayerFouls.setText("" + selectedPlayer.getFouls());
                jLabelPlayerOffsides.setText("" + selectedPlayer.getOffsides());
                jLabelPlayerAssists.setText("" + selectedPlayer.getAssists());
                jLabelPlayerYC.setText("" + selectedPlayer.getYellowCards());
                jLabelPlayerRC.setText("" + selectedPlayer.getRedCards());
            }
         }
    }//GEN-LAST:event_jComboBoxTeam1ActionPerformed

    
    private void jButtonAddPlayerHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPlayerHomeActionPerformed

        String fName = "";
        String lName = "";
        String jerseyNumber = "";
        String fullName = "";
        Player newPlayer = new Player();
        ArrayList playerNameString = new ArrayList();
        
        //put all existing names in the team into the arraylist
        for (int i = 0; i < team1.players.size(); i ++) {
            
            fullName = team1.players.get(i).getFullName();
            
            playerNameString.add(fullName);
           
        }
        
        if (jTextFieldFirstName.getText() != "" && jTextFieldLastName.getText() != "" && jTextFieldJerseyNumber.getText() != "") {
            
            fName = jTextFieldFirstName.getText();
            lName = jTextFieldLastName.getText();
            jerseyNumber = jTextFieldJerseyNumber.getText();
        }
        
        newPlayer.setPlayerStats(fName, lName, jerseyNumber, 0, 0, 0, 0, 0, 0, 0);
        
        //add the new player to the team ArrayList as well as Combo Box
        team1.players.add(newPlayer);
        
        fullName = newPlayer.getFullName();
        
        if (playerNameString.contains(fullName) == false) {
            
           jComboBoxTeam1.addItem(fullName);
        }
        
        jTextFieldFirstName.setText("First Name");
        jTextFieldLastName.setText("Last Name");
        jTextFieldJerseyNumber.setText("Jersey Number");
        
    }//GEN-LAST:event_jButtonAddPlayerHomeActionPerformed

    private void jButtonPossesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPossesion1ActionPerformed
        //set jProgressBar text to empty string
        jProgressBar4.setString("");

//        myTimer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//      
//        if (jBtnPosession2.isEnabled())
//                myTimer.stop();
//                
//            }
//        } );
//        myTimer.start();
    
    
        //add 1 to team1 possesion
        team1.possesion++;
        totalPossessionInt++;
        
        //set jLabel27 (team1 possesion) 
        Double d= Double.valueOf(team1.getPossesion());
        Double dd = Double.valueOf(totalPossessionInt);
        double percentOfPossesion = (d / dd) * 100;
        
        jLabel27.setText(percentOfPossesion + "%");
        System.out.println("T1 pos: " + percentOfPossesion);
        
        //set jLabel13 (team2 possesion)
        Double z= Double.valueOf(team2.getPossesion());
        Double ee = Double.valueOf(totalPossessionInt);
        double percentOfPossesion2 = (z / ee) * 100;
        
        jLabel13.setText(df.format(percentOfPossesion2) + "%");
        System.out.println("T2 pos: " + percentOfPossesion);        
    }//GEN-LAST:event_jButtonPossesion1ActionPerformed

    private void jButtonAddPlayerAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPlayerAwayActionPerformed
        
        String fName = "";
        String lName = "";
        String jerseyNumber = "";
        String fullName = "";
        Player newPlayer = new Player();
        ArrayList playerNameString = new ArrayList();
        
        //put all existing names in the team into the arraylist
        for (int i = 0; i < team2.players.size(); i ++) {
            
            fullName = team2.players.get(i).getFullName();
            
            playerNameString.add(fullName);
           
        }
        
        if (jTextFieldFirstName.getText() != "" && jTextFieldLastName.getText() != "" && jTextFieldJerseyNumber.getText() != "") {
            
            fName = jTextFieldFirstName.getText();
            lName = jTextFieldLastName.getText();
            jerseyNumber = jTextFieldJerseyNumber.getText();
        }
        
        newPlayer.setPlayerStats(fName, lName, jerseyNumber, 0, 0, 0, 0, 0, 0, 0);
        
        //add the new player to the team ArrayList as well as Combo Box
        team2.players.add(newPlayer);
        
        fullName = newPlayer.getFullName();
        
        if (playerNameString.contains(fullName) == false) {
            
           jComboBoxTeam2.addItem(fullName);
        }
        
        jTextFieldFirstName.setText("First Name");
        jTextFieldLastName.setText("Last Name");
        jTextFieldJerseyNumber.setText("Jersey Number");
        
    }//GEN-LAST:event_jButtonAddPlayerAwayActionPerformed

    private void jComboBoxTeam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTeam2ActionPerformed
        //get the player with the same name as what the combo box selected
        
        String playerFullName = "";
        Player selectedPlayer;
        
      
        for(int i = 0; i < team2.players.size(); i++) {
            
            playerFullName = team2.players.get(i).getFullName();
            
            if (jComboBoxTeam2.getSelectedItem().equals(playerFullName)) {
               
                selectedPlayer = team2.players.get(i);
                
                //set all the labels to the player's statsselectedPlayer.getGoals()
                jLabelPlayerJerseyNumber.setText("" + selectedPlayer.getJerseyNumber());
                jLabelPlayerGoals.setText("" + selectedPlayer.getGoals());
                jLabelPlayerSOG.setText("" + selectedPlayer.getShotsOnGoal());
                jLabelPlayerOffsides.setText("" + selectedPlayer.getOffsides());
                jLabelPlayerAssists.setText("" + selectedPlayer.getAssists());
                jLabelPlayerYC.setText("" + selectedPlayer.getYellowCards());
                jLabelPlayerRC.setText("" + selectedPlayer.getRedCards());
            }
         }
    }//GEN-LAST:event_jComboBoxTeam2ActionPerformed

    private void jBtnShot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnShot1ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar2.setString("");         
        
        team1.shots += 1;
        jLabel43.setText("" + team1.shots);
    }//GEN-LAST:event_jBtnShot1ActionPerformed

    private void jBtnCorner1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCorner1ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar5.setString(""); 

        team1.corners += 1;
        jLabel45.setText("" + team1.corners);
    }//GEN-LAST:event_jBtnCorner1ActionPerformed

    private void jBtnOffside1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOffside1ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar6.setString(""); 

        team1.offsides += 1;
        
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter player offside jersey number", 
                    "Offside", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team1.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team1.players.get(i);
            
            if (team1.players.get(i).getJerseyNumber().equals(choice)) {
                
                currentPlayer.offsides += 1;
                properResponse = true;
            } 
            
        jLabel47.setText("" + team1.offsides);
            
        }
    }//GEN-LAST:event_jBtnOffside1ActionPerformed

    private void jBtnRedCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRedCard1ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar9.setString(""); 

        team1.redCards += 1;
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter player jersey number", 
                    "Red Card", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team1.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team1.players.get(i);
            
            if (team1.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.redCards += 1;
                
            }
            
            jLabel49.setText("" + team1.redCards);
        
        }
    }//GEN-LAST:event_jBtnRedCard1ActionPerformed

    private void jBtnShot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnShot2ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar2.setString(""); 

        team2.shots += 1;
        jLabel52.setText("" + team2.shots);
    }//GEN-LAST:event_jBtnShot2ActionPerformed

    private void jBtnCorner2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCorner2ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar5.setString(""); 

        team2.corners += 1;
        jLabel54.setText("" + team2.corners);
    }//GEN-LAST:event_jBtnCorner2ActionPerformed

    private void jBtnOffside2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOffside2ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar6.setString(""); 

        team2.offsides += 1;
        
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter player offside jersey number", 
                    "Offside", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team2.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team2.players.get(i);
            
            if (team2.players.get(i).getJerseyNumber().equals(choice)) {
                
                currentPlayer.offsides += 1;
                properResponse = true;
            } 
            
        jLabel56.setText("" + team2.offsides);
            
        }
    }//GEN-LAST:event_jBtnOffside2ActionPerformed

    private void jBtnRedCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRedCard2ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar9.setString(""); 

        team2.redCards += 1;
        String choice = (String) JOptionPane.showInputDialog(
                    mFrame, 
                    "Enter player jersey number", 
                    "Red Card", 
                    JOptionPane.QUESTION_MESSAGE
                    );
        for(int i = 0; i < team2.players.size(); i++) {
            
            jerseyNumber = choice;
            Player currentPlayer = team2.players.get(i);
            
            if (team2.players.get(i).getJerseyNumber().equals(choice)) {
               
                currentPlayer.redCards += 1;
                
            }
            
            jLabel59.setText("" + team2.redCards);
        
        }
    }//GEN-LAST:event_jBtnRedCard2ActionPerformed

    private void jTabbedPane2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane2KeyPressed

    }//GEN-LAST:event_jTabbedPane2KeyPressed

    //update the progress bars for the second tab
    private void jTabbedPane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MousePressed
        
        //update progress bars
        
        if (team1.goals + team2.goals == 0) {
            jProgressBar1.setStringPainted(true);
            jProgressBar1.setForeground(Color.gray);
            jProgressBar1.setString("/////////////////////////////////////////////");
        }
        jProgressBar1.setMaximum(team1.getGoals() + team2.getGoals());
        jProgressBar1.setValue(team1.getGoals());
        
        if (team1.getShots() + team2.getShots() == 0) {
            jProgressBar2.setStringPainted(true);
            jProgressBar2.setForeground(Color.gray);
            jProgressBar2.setString("/////////////////////////////////////////////");
        }
        jProgressBar2.setMaximum(team1.getShots() + team2.getShots());
        jProgressBar2.setValue(team1.getShots());
        
        if (team1.getShotsOnFrame() + team2.getShotsOnFrame() == 0) {
            jProgressBar3.setStringPainted(true);
            jProgressBar3.setForeground(Color.gray);
            jProgressBar3.setString("/////////////////////////////////////////////");
        }
        
        jProgressBar3.setMaximum(team1.getShotsOnFrame() + team2.getShotsOnFrame());
        jProgressBar3.setValue(team1.getShotsOnFrame());
        
        if (team1.getPossesion() + team2.getPossesion() == 0) {
            jProgressBar4.setStringPainted(true);
            jProgressBar4.setForeground(Color.gray);
            jProgressBar4.setString("/////////////////////////////////////////////");
        }
        jProgressBar4.setMaximum(team1.getPossesion() + team2.getPossesion());
        jProgressBar4.setValue(team1.getPossesion());
        
        if (team1.getCorners() + team2.getCorners() == 0) {
            jProgressBar5.setStringPainted(true);
            jProgressBar5.setForeground(Color.gray);
            jProgressBar5.setString("/////////////////////////////////////////////");
        }
        jProgressBar5.setMaximum(team1.getCorners()+ team2.getCorners());
        jProgressBar5.setValue(team1.getCorners());
        
        if (team1.getFouls() + team2.getFouls() == 0) {
            jProgressBar7.setStringPainted(true);
            jProgressBar7.setForeground(Color.gray);
            jProgressBar7.setString("/////////////////////////////////////////////");
        }
        jProgressBar7.setMaximum(team1.getFouls() + team2.getFouls());
        jProgressBar7.setValue(team1.getFouls());
       
        if (team1.getOffsides() + team2.getOffsides() == 0) {
            jProgressBar6.setStringPainted(true);
            jProgressBar6.setForeground(Color.gray);
            jProgressBar6.setString("/////////////////////////////////////////////");
        }
        jProgressBar6.setMaximum(team1.getOffsides() + team2.getOffsides());
        jProgressBar6.setValue(team1.getOffsides());
        
        if (team1.getYellowCards()+ team2.getYellowCards() == 0) {
            jProgressBar8.setStringPainted(true);
            jProgressBar8.setForeground(Color.gray);
            jProgressBar8.setString("/////////////////////////////////////////////");
        }
        jProgressBar8.setMaximum(team1.getYellowCards() + team2.getYellowCards());
        jProgressBar8.setValue(team1.getYellowCards());
        
        if (team1.getRedCards() + team2.getRedCards() == 0) {
            jProgressBar9.setStringPainted(true);
            jProgressBar9.setForeground(Color.gray);
            jProgressBar9.setString("/////////////////////////////////////////////");
        }
        jProgressBar9.setMaximum(team1.getRedCards()+ team2.getRedCards());
        jProgressBar9.setValue(team1.getRedCards());
        
        //set labels for stat summary
        jLabel24.setText(team1.getGoals() + "");
        jLabel25.setText(team1.getShots() + "");
        jLabel26.setText(team1.getShotsOnFrame()+ "");
        jLabel27.setText(team1.getPossesion() + "");
        jLabel36.setText(team1.getCorners()+ "");
        jLabel37.setText(team1.getFouls() + "");
        jLabel38.setText(team1.getOffsides() + "");
        jLabel39.setText(team1.getYellowCards() + "");
        jLabel40.setText(team1.getRedCards() + "");
        jLabel19.setText(team2.getGoals() + "");
        jLabel11.setText(team2.getShots() + "");
        jLabel12.setText(team2.getShotsOnFrame()+ "");
        jLabel13.setText(team2.getPossesion() + "");
        jLabel15.setText(team2.getCorners()+ "");
        jLabel16.setText(team2.getFouls() + "");
        jLabel14.setText(team2.getOffsides() + "");
        jLabel17.setText(team2.getYellowCards() + "");
        jLabel18.setText(team2.getRedCards() + "");
        
    }//GEN-LAST:event_jTabbedPane2MousePressed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        if (jButton10.getText() == "Start Half") {
            jButton10.setText("End Half");
            
            clockTimer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    //add to the second hand 
                    currentSecond += 1;
                    jLabel23.setText(currentSecond + "");
                            
                    if (currentSecond == 60) {
                        currentSecond = 0;
                        currentMinute += 1;
                        jLabel22.setText(currentMinute + "       :");
                                
                    }
                }
            });
            //start for beginning of game
            clockTimer.start();
            
            //start for beginning of half
            if (secondHalfStart == true) {
                clockTimer.start();
            }
            
        //end half
        } else {
            jButton10.setText("Start Half");
            
            //start of second half
            clockTimer.stop();
            currentSecond = 0;
            currentMinute = 45;
            
            if (secondHalfStart == true) {
                currentMinute = 90;
            }
            
            secondHalfStart = true;
            jLabel23.setText(currentSecond + "");
            jLabel22.setText(currentMinute + "   :");
            
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jBtnPosession2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPosession2ActionPerformed
        //set jProgressBar text to nothing
        jProgressBar4.setString("");

//        myTimer = new Timer(1000, new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//                //For every tick in the timer it will execute this code
//                //add 1 to team1 possesion
//                
//        
//                
//        if (jButtonPossesion1.isEnabled())
//                myTimer.stop();
//               
//            }
//        } );
//    
//        myTimer.start();
//      
    
        team2.possesion++;
        totalPossessionInt++;
        
        //set jLabel27 (team1 possesion) 
        Double d= Double.valueOf(team1.getPossesion());
        Double dd = Double.valueOf(totalPossessionInt);
        double percentOfPossesion = (d / dd) * 100;
        
        jLabel27.setText(df.format(percentOfPossesion) + "%");
        System.out.println("T1 pos: " + percentOfPossesion);
        //set jLabel13 (team2 possesion)
        Double z= Double.valueOf(team2.getPossesion());
        Double ee = Double.valueOf(totalPossessionInt);
        Double percentOfPossesion2 = (z / ee) * 100;
        
        jLabel13.setText(df.format(percentOfPossesion2) + "%");
        System.out.println("T2 pos: " + percentOfPossesion);
    }//GEN-LAST:event_jBtnPosession2ActionPerformed

    //save stats to a file
    private void jButtonFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileSaveActionPerformed
        
        try {
            FileWriter fileWriter = new FileWriter("gameresults.txt", true);
            
            fileWriter.flush();
            fileWriter.write("Home goals: " + (int)team1.getGoals() + "\nAway goals: " + (int)team2.getGoals());
            fileWriter.write("\nHome shots: " + (int)team1.getShots() + "\nAway shots: " + team2.getShots());
            fileWriter.write("\nHome shots on frame: " + team1.getShotsOnFrame() + "\nAway shots on frame: " + team2.getShotsOnFrame());
            fileWriter.write("\nHome possesion: " + team1.getPossesion() + "\nAway posession: " + team2.getPossesion());
            fileWriter.write("\nHome corners: " + team1.getCorners()+ "\nAway corners: " + team2.getCorners());
            fileWriter.write("\nHome fouls: " + team1.getFouls()+ "\nAway fouls: " + team2.getFouls());
            fileWriter.write("\nHome offsides: " + team1.getOffsides()+ "\nAway offsides: " + team2.getOffsides());
            fileWriter.write("\nHomeyellow cards: " + team1.getYellowCards()+ "Away yellow cards: " + team2.getYellowCards());
            fileWriter.write("\nHome red cards: " + team1.getRedCards()+ "\nAway redcards: " + team2.getRedCards());
            fileWriter.write("\n\n\n\n");
            fileWriter.close();
            
            jButtonFileSave.setText("Success!");
        
        
        } catch (IOException ex) {
            Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonFileSaveActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnCorner1;
    private javax.swing.JButton jBtnCorner2;
    private javax.swing.JButton jBtnFoul1;
    private javax.swing.JButton jBtnFoul2;
    private javax.swing.JButton jBtnGoal1;
    private javax.swing.JButton jBtnGoal2;
    private javax.swing.JButton jBtnOffside1;
    private javax.swing.JButton jBtnOffside2;
    private javax.swing.JButton jBtnPosession2;
    private javax.swing.JButton jBtnRedCard1;
    private javax.swing.JButton jBtnRedCard2;
    private javax.swing.JButton jBtnShot1;
    private javax.swing.JButton jBtnShot2;
    private javax.swing.JButton jBtnShotOnFrame1;
    private javax.swing.JButton jBtnShotOnFrame2;
    private javax.swing.JButton jBtnYellowCard1;
    private javax.swing.JButton jBtnYellowCard2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButtonAddPlayerAway;
    private javax.swing.JButton jButtonAddPlayerHome;
    private javax.swing.JButton jButtonFileSave;
    private javax.swing.JButton jButtonPossesion1;
    private javax.swing.JComboBox<String> jComboBoxTeam1;
    private javax.swing.JComboBox<String> jComboBoxTeam2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPlayerAssists;
    private javax.swing.JLabel jLabelPlayerFouls;
    private javax.swing.JLabel jLabelPlayerGoals;
    private javax.swing.JLabel jLabelPlayerJerseyNumber;
    private javax.swing.JLabel jLabelPlayerOffsides;
    private javax.swing.JLabel jLabelPlayerRC;
    private javax.swing.JLabel jLabelPlayerSOG;
    private javax.swing.JLabel jLabelPlayerYC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JProgressBar jProgressBar9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel jTeamName1;
    private javax.swing.JLabel jTeamName2;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldJerseyNumber;
    private javax.swing.JTextField jTextFieldLastName;
    // End of variables declaration//GEN-END:variables
}

