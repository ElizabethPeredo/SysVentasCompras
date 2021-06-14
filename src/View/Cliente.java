
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Elizabeth
 */
public class Cliente extends javax.swing.JFrame {

    
    public Cliente() {
        initComponents();
        
        Color boton_f=new Color(41,86,154);
        Color boton_b=new Color(0,204,153);
        Color encabezado=new Color(0,204,153);
        Color fondos=new Color(255,255,255);
        Color borde=new Color(0,204,153);
        
        ImageIcon icono_nuevo=new ImageIcon(getClass().getResource("/Iconos/Agregar.png"));
        ImageIcon icono_guardar=new ImageIcon(getClass().getResource("/Iconos/guardar.png"));
        ImageIcon icono_modificar=new ImageIcon(getClass().getResource("/Iconos/editar.png"));
        ImageIcon icono_eliminar=new ImageIcon(getClass().getResource("/Iconos/eliminar.png"));
        ImageIcon icono_cancelar=new ImageIcon(getClass().getResource("/Iconos/cerrar.png"));
        ImageIcon icono_salir=new ImageIcon(getClass().getResource("/Iconos/login.png"));
        ImageIcon icono_buscar=new ImageIcon(getClass().getResource("/Iconos/buscar.png"));
        
        String B1="Nuevo";
        String B2="Guardar";
        String B3="Modificar";
        String B4="Eliminar";
        String B5="Cancelar";
        String B6="Salir";
        
        //PANEL
        jpFondo1.setBackground(fondos);
        jpFondo2.setBackground(encabezado);
        jpFondo3.setBackground(fondos);
        jpFondo4.setBackground(fondos);
        jpFondo5.setBackground(fondos);
        jpRegistro.setBackground(encabezado);
        jpListado.setBackground(encabezado);
        jpFondo3.setBorder(BorderFactory.createLineBorder(borde,3));
        jpFondo4.setBorder(BorderFactory.createLineBorder(borde,3));
        jpFondo5.setBorder(BorderFactory.createLineBorder(borde,3));

       
        
        //BOTONES
        btnNuevo.setBackground(boton_b);
        btnNuevo.setIcon(icono_nuevo);
        btnNuevo.setBorder(BorderFactory.createTitledBorder(null, B1, TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM, 
                new Font("Arial Black", 1, 12), boton_f));
        
        btnGuardar.setBackground(boton_b);
        btnGuardar.setIcon(icono_guardar);
        btnGuardar.setBorder(BorderFactory.createTitledBorder(null, B2, TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM, 
                new Font("Arial Black", 1, 12), boton_f));
        
        btnModificar.setBackground(boton_b);
        btnModificar.setIcon(icono_modificar);
        btnModificar.setBorder(BorderFactory.createTitledBorder(null, B3, TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM, 
                new Font("Arial Black", 1, 12), boton_f));
        
        btnEliminar.setBackground(boton_b);
        btnEliminar.setIcon(icono_eliminar);
        btnEliminar.setBorder(BorderFactory.createTitledBorder(null, B4, TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM, 
                new Font("Arial Black", 1, 12), boton_f));
        
        btnCancelar.setBackground(boton_b);
        btnCancelar.setIcon(icono_cancelar);
        btnCancelar.setBorder(BorderFactory.createTitledBorder(null, B5, TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM, 
                new Font("Arial Black", 1, 12), boton_f));
        
        btnsalir.setBackground(boton_b);
        btnsalir.setIcon(icono_salir);
        btnsalir.setBorder(BorderFactory.createTitledBorder(null, B6, TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM, 
                new Font("Arial Black", 1, 12), boton_f));
        
        btnbuscar.setBackground(boton_b);
        btnbuscar.setIcon(icono_buscar);
 
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo1 = new javax.swing.JPanel();
        jpFondo2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpFondo3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lbTotalRegistros = new javax.swing.JLabel();
        jpFondo4 = new javax.swing.JPanel();
        txtNroDocumento = new javax.swing.JTextField();
        txtidCliente = new javax.swing.JTextField();
        dcFechaNac = new com.toedter.calendar.JDateChooser();
        cboGenero = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        cboTipoDocumento = new javax.swing.JComboBox();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jpRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpListado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpFondo5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo1.setBackground(new java.awt.Color(255, 255, 255));

        jpFondo2.setBackground(new java.awt.Color(0, 204, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CLIENTE");

        javax.swing.GroupLayout jpFondo2Layout = new javax.swing.GroupLayout(jpFondo2);
        jpFondo2.setLayout(jpFondo2Layout);
        jpFondo2Layout.setHorizontalGroup(
            jpFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpFondo2Layout.setVerticalGroup(
            jpFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap())
        );

        btnNuevo.setBackground(new java.awt.Color(0, 0, 51));
        btnNuevo.setForeground(new java.awt.Color(102, 153, 255));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 0, 51));
        btnGuardar.setForeground(new java.awt.Color(102, 153, 255));
        btnGuardar.setIcon(null);
        btnGuardar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guardar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial Black", 1, 12), new java.awt.Color(102, 153, 255)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial Black", 1, 12), new java.awt.Color(102, 153, 255)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial Black", 1, 12), new java.awt.Color(102, 153, 255)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lbTotalRegistros.setBackground(new java.awt.Color(0, 0, 51));
        lbTotalRegistros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTotalRegistros.setForeground(new java.awt.Color(41, 86, 154));
        lbTotalRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTotalRegistros.setText("0");
        lbTotalRegistros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial Black", 1, 12), new java.awt.Color(102, 153, 255))); // NOI18N
        lbTotalRegistros.setOpaque(true);

        javax.swing.GroupLayout jpFondo3Layout = new javax.swing.GroupLayout(jpFondo3);
        jpFondo3.setLayout(jpFondo3Layout);
        jpFondo3Layout.setHorizontalGroup(
            jpFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotalRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpFondo3Layout.setVerticalGroup(
            jpFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar)
                    .addComponent(btnsalir)
                    .addComponent(lbTotalRegistros))
                .addGap(10, 10, 10))
        );

        jpFondo3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnEliminar, btnGuardar, btnModificar, btnNuevo, btnsalir, lbTotalRegistros});

        jpFondo4.setBackground(new java.awt.Color(255, 255, 255));

        txtNroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDocumentoKeyTyped(evt);
            }
        });

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---SELECCIONAR---", "Masculino", "Femenino" }));
        cboGenero.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 51));
        jLabel18.setText("Genero:");

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 51));
        jLabel17.setText("Fecha Nac:");

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("Email:");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("Nro Documento:");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Apellidos:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Tipo Documento:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("ID Cliente:");

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        cboTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---SELECCIONAR---", "Dni", "Pasaporte", "Carnet de Extranjeria" }));
        cboTipoDocumento.setBorder(null);
        cboTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoDocumentoActionPerformed(evt);
            }
        });

        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jRadioButton4.setText("Natural");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Jurídico");

        javax.swing.GroupLayout jpFondo4Layout = new javax.swing.GroupLayout(jpFondo4);
        jpFondo4.setLayout(jpFondo4Layout);
        jpFondo4Layout.setHorizontalGroup(
            jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo4Layout.createSequentialGroup()
                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondo4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondo4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondo4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcFechaNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondo4Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNroDocumento))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondo4Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboGenero, 0, 166, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondo4Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cboTipoDocumento, 0, 166, Short.MAX_VALUE))))))
                    .addGroup(jpFondo4Layout.createSequentialGroup()
                        .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFondo4Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jRadioButton4)
                                .addGap(28, 28, 28)
                                .addComponent(jRadioButton5))
                            .addGroup(jpFondo4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpFondo4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpFondo4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addComponent(txtApellidoPaterno))
                    .addContainerGap()))
        );

        jpFondo4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboGenero, cboTipoDocumento, dcFechaNac, txtApellidoPaterno, txtNroDocumento, txtemail, txtidCliente, txtnombre, txttelefono});

        jpFondo4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel12, jLabel15, jLabel17, jLabel18, jLabel7, jLabel8, jLabel9});

        jpFondo4Layout.setVerticalGroup(
            jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondo4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGap(5, 5, 5)
                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNroDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFondo4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(111, 111, 111))
            .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpFondo4Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addGap(10, 10, 10)
                    .addGroup(jpFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpFondo4Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addGap(54, 54, 54)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(359, 359, 359)))
        );

        jpFondo4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboGenero, cboTipoDocumento, jLabel11, jLabel12, jLabel15, jLabel17, jLabel18, jLabel6, jLabel7, jLabel8, jLabel9, txtApellidoPaterno, txtNroDocumento, txtemail, txtidCliente, txtnombre, txttelefono});

        jpRegistro.setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE DATOS");

        javax.swing.GroupLayout jpRegistroLayout = new javax.swing.GroupLayout(jpRegistro);
        jpRegistro.setLayout(jpRegistroLayout);
        jpRegistroLayout.setHorizontalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpRegistroLayout.setVerticalGroup(
            jpRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpListado.setBackground(new java.awt.Color(0, 204, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTADO DE DATOS");

        javax.swing.GroupLayout jpListadoLayout = new javax.swing.GroupLayout(jpListado);
        jpListado.setLayout(jpListadoLayout);
        jpListadoLayout.setHorizontalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpListadoLayout.setVerticalGroup(
            jpListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Buscar:");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Nombre");

        jRadioButton2.setText("Apellido");

        jRadioButton3.setText("DNI");

        javax.swing.GroupLayout jpFondo5Layout = new javax.swing.GroupLayout(jpFondo5);
        jpFondo5.setLayout(jpFondo5Layout);
        jpFondo5Layout.setHorizontalGroup(
            jpFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo5Layout.createSequentialGroup()
                .addGroup(jpFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFondo5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpFondo5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jpFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFondo5Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3))
                            .addGroup(jpFondo5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFondo5Layout.setVerticalGroup(
            jpFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFondo5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbuscar)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpFondo5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, txtbuscar});

        javax.swing.GroupLayout jpFondo1Layout = new javax.swing.GroupLayout(jpFondo1);
        jpFondo1.setLayout(jpFondo1Layout);
        jpFondo1Layout.setHorizontalGroup(
            jpFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondo1Layout.createSequentialGroup()
                .addGroup(jpFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpFondo1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpFondo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpFondo1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpFondo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(jpFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpFondo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        jpFondo1Layout.setVerticalGroup(
            jpFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFondo1Layout.createSequentialGroup()
                .addComponent(jpFondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jpFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jpFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpFondo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpFondo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFondo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped

    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped

    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void cboTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoDocumentoActionPerformed

    }//GEN-LAST:event_cboTipoDocumentoActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed

    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtNroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDocumentoKeyTyped

    }//GEN-LAST:event_txtNroDocumentoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("System".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox cboGenero;
    private javax.swing.JComboBox cboTipoDocumento;
    private com.toedter.calendar.JDateChooser dcFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpFondo1;
    private javax.swing.JPanel jpFondo2;
    public static javax.swing.JPanel jpFondo3;
    private javax.swing.JPanel jpFondo4;
    private javax.swing.JPanel jpFondo5;
    private javax.swing.JPanel jpListado;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JLabel lbTotalRegistros;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtNroDocumento;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtidCliente;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

 
}
