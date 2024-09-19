
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Familia
 */
public class Tela_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Cliente
     */
    public Tela_Cliente() {
        initComponents();
        pergunta_field.setVisible(false);
        botao_pesquisar.setVisible(false);
        tabela_body.setVisible(false);
        remake_pesquisa.setVisible(false);
    }

    public class valores {
        public static String metodo_busca;
        public static String tabela = "clientes";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        linha_azul = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        text_info = new javax.swing.JLabel();
        botao_id = new javax.swing.JButton();
        botao_cpf = new javax.swing.JButton();
        pergunta_text = new javax.swing.JLabel();
        pergunta_field = new javax.swing.JTextField();
        botao_nome = new javax.swing.JButton();
        botao_pesquisar = new javax.swing.JButton();
        alerta = new javax.swing.JLabel();
        tabela_body = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        remake_pesquisa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botao_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Clientes");
        setResizable(false);
        setSize(new java.awt.Dimension(32767, 4));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linha_azul.setEditable(false);
        linha_azul.setBackground(new java.awt.Color(0, 51, 153));
        linha_azul.setForeground(new java.awt.Color(0, 102, 204));
        linha_azul.setMaximumSize(new java.awt.Dimension(2147483647, 50));
        linha_azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linha_azulActionPerformed(evt);
            }
        });
        getContentPane().add(linha_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 500, 30));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setText("Clientes");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        text_info.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        text_info.setText("Informe o tipo de pesquisa");
        getContentPane().add(text_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        botao_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_id.setText("ID");
        botao_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_idActionPerformed(evt);
            }
        });
        getContentPane().add(botao_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        botao_cpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_cpf.setText("CPF");
        botao_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_cpfActionPerformed(evt);
            }
        });
        getContentPane().add(botao_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        pergunta_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pergunta_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 290, 21));

        pergunta_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pergunta_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(pergunta_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 112, -1));

        botao_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_nome.setText("Nome");
        botao_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(botao_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 29));

        botao_pesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botao_pesquisar.setText("Pesquisar");
        botao_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));
        getContentPane().add(alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 180, 20));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF", "Nome", "Sexo", "Idade", "Endereço", "Email", "Telefone"
            }
        ));
        tabela_body.setViewportView(tabela);

        getContentPane().add(tabela_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 80));

        remake_pesquisa.setText("Refazer Busca");
        remake_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remake_pesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(remake_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        botao_voltar.setText("Voltar");
        botao_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_voltar)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botao_voltar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_cpfActionPerformed
        valores.metodo_busca = "cpf";
        pergunta_text.setText("Digite qual CPF deseja pesquisar: ");
        pergunta_text.setVisible(true);
        pergunta_field.setVisible(true);
        botao_pesquisar.setVisible(true);
    }//GEN-LAST:event_botao_cpfActionPerformed

    private void botao_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_idActionPerformed
        valores.metodo_busca = "id";
        pergunta_text.setText("Digite qual ID deseja pesquisar: ");
        pergunta_text.setVisible(true);
        pergunta_field.setVisible(true);
        botao_pesquisar.setVisible(true);
    }//GEN-LAST:event_botao_idActionPerformed

    private void botao_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_nomeActionPerformed
       valores.metodo_busca = "nome";
        pergunta_text.setText("Digite qual nome deseja pesquisar: ");
        pergunta_text.setVisible(true);
        pergunta_field.setVisible(true);
        botao_pesquisar.setVisible(true);
    }//GEN-LAST:event_botao_nomeActionPerformed

    private void botao_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_voltarActionPerformed
        Tela_adm_Cliente tela_adm_Cliente = new Tela_adm_Cliente();
        tela_adm_Cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botao_voltarActionPerformed

    private void botao_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pesquisarActionPerformed
        alerta.setText("");
        
        if(pergunta_field.getText().equals("")) {
            alerta.setText("por favor digite um valor");
        }else {
            
            Object[] resultado_pesquisa =  pesquisa_bd.pesquisar_tabela(Tela_Cliente.valores.metodo_busca, pergunta_field.getText(), Tela_Cliente.valores.tabela);

                if(Arrays.toString(resultado_pesquisa).equals("[notFound]")){
                    alerta.setText("Não achamos o usuario");
                }else {
                    pergunta_field.setVisible(false);
                    botao_pesquisar.setVisible(false);
                    text_info.setVisible(false);
                    botao_cpf.setVisible(false);
                    botao_nome.setVisible(false);
                    botao_id.setVisible(false);
                    alerta.setVisible(false);
                    pergunta_text.setVisible(false);
                    tabela.setVisible(true);
                    tabela_body.setVisible(true);
                    remake_pesquisa.setVisible(true);
                    
                    DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
                    modelo.addRow(resultado_pesquisa);
                }
            }
        
        
    }//GEN-LAST:event_botao_pesquisarActionPerformed

    private void remake_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remake_pesquisaActionPerformed
                    text_info.setVisible(true);
                    botao_cpf.setVisible(true);
                    botao_nome.setVisible(true);
                    botao_id.setVisible(true);
                    tabela.setVisible(false);
                    tabela_body.setVisible(false);
                    remake_pesquisa.setVisible(false);
                    
                    pergunta_field.setText("");
                    
                    DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
                    modelo.removeRow(0);
                    
    }//GEN-LAST:event_remake_pesquisaActionPerformed

    private void pergunta_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pergunta_fieldActionPerformed

    }//GEN-LAST:event_pergunta_fieldActionPerformed

    private void linha_azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linha_azulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_linha_azulActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerta;
    private javax.swing.JButton botao_cpf;
    private javax.swing.JButton botao_id;
    private javax.swing.JButton botao_nome;
    private javax.swing.JButton botao_pesquisar;
    private javax.swing.JButton botao_voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField linha_azul;
    private javax.swing.JTextField pergunta_field;
    private javax.swing.JLabel pergunta_text;
    private javax.swing.JButton remake_pesquisa;
    private javax.swing.JTable tabela;
    private javax.swing.JScrollPane tabela_body;
    private javax.swing.JLabel text_info;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
