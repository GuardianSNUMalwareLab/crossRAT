package org.jnativehook.example;

import org.jnativehook.GlobalScreen;
import org.jnativehook.b.d;
import org.jnativehook.c;
import org.jnativehook.e;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ExecutorService;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NativeHookDemo extends JFrame implements ActionListener, ItemListener, WindowListener, org.jnativehook.a.a, org.jnativehook.b.a, d {
    private static final Logger j = Logger.getLogger(GlobalScreen.class.getPackage().getName());
    private JMenu a;
    private JMenuItem b;
    private JMenuItem c;
    private JCheckBoxMenuItem d;
    private JCheckBoxMenuItem e;
    private JCheckBoxMenuItem f;
    private JCheckBoxMenuItem g;
    private JCheckBoxMenuItem h;
    private JTextArea i;

    public NativeHookDemo() {
        this.setTitle("JNativeHook Demo");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(2);
        this.setSize(600, 300);
        this.addWindowListener(this);
        JMenuBar var1 = new JMenuBar();
        JMenu var2;
        (var2 = new JMenu("File")).setMnemonic(70);
        var1.add(var2);
        this.b = new JMenuItem("Quit", 81);
        this.b.addActionListener(this);
        this.b.setAccelerator(KeyStroke.getKeyStroke(115, 8));
        this.b.getAccessibleContext().setAccessibleDescription("Exit the program");
        var2.add(this.b);
        (var2 = new JMenu("View")).setMnemonic(86);
        var1.add(var2);
        this.c = new JMenuItem("Clear", 67);
        this.c.addActionListener(this);
        this.c.setAccelerator(KeyStroke.getKeyStroke(67, 3));
        this.c.getAccessibleContext().setAccessibleDescription("Clear the screen");
        var2.add(this.c);
        var2.addSeparator();
        this.d = new JCheckBoxMenuItem("Enable Native Hook");
        this.d.addItemListener(this);
        this.d.setMnemonic(72);
        this.d.setAccelerator(KeyStroke.getKeyStroke(72, 3));
        var2.add(this.d);
        this.a = new JMenu("Listeners");
        this.a.setMnemonic(76);
        var2.add(this.a);
        this.e = new JCheckBoxMenuItem("Keyboard Events");
        this.e.addItemListener(this);
        this.e.setMnemonic(75);
        this.e.setAccelerator(KeyStroke.getKeyStroke(75, 3));
        this.a.add(this.e);
        this.f = new JCheckBoxMenuItem("Button Events");
        this.f.addItemListener(this);
        this.f.setMnemonic(66);
        this.f.setAccelerator(KeyStroke.getKeyStroke(66, 3));
        this.a.add(this.f);
        this.g = new JCheckBoxMenuItem("Motion Events");
        this.g.addItemListener(this);
        this.g.setMnemonic(77);
        this.g.setAccelerator(KeyStroke.getKeyStroke(77, 3));
        this.a.add(this.g);
        this.h = new JCheckBoxMenuItem("Wheel Events");
        this.h.addItemListener(this);
        this.h.setMnemonic(87);
        this.h.setAccelerator(KeyStroke.getKeyStroke(87, 3));
        this.a.add(this.h);
        this.setJMenuBar(var1);
        this.i = new JTextArea();
        this.i.setEditable(false);
        this.i.setBackground(new Color(255, 255, 255));
        this.i.setForeground(new Color(0, 0, 0));
        this.i.setText("");
        JScrollPane var3;
        (var3 = new JScrollPane(this.i)).setPreferredSize(new Dimension(375, 125));
        this.add(var3, "Center");
        j.setUseParentHandlers(false);
        j.setLevel(Level.ALL);
        ConsoleHandler var4;
        (var4 = new ConsoleHandler()).setFormatter(new b(this, (byte) 0));
        var4.setLevel(Level.WARNING);
        j.addHandler(var4);
        GlobalScreen.a((ExecutorService) (new e()));
        this.setVisible(true);
    }

    public static void main(String[] var0) {
        StringBuffer var1 = (new StringBuffer("\nJNativeHook: Global keyboard and mouse hooking for Java.\n")).append("Copyright (C) 2006-2015 Alexander Barker.  All Rights Received.\nhttps://github.com/kwhat/jnativehook/\n").append("\nJNativeHook is free software: you can redistribute it and/or modify\n").append("it under the terms of the GNU Lesser General Public License as published\nby the Free Software Foundation, either version 3 of the License, or\n").append("(at your option) any later version.\n\n").append("JNativeHook is distributed in the hope that it will be useful,\nbut WITHOUT ANY WARRANTY; without even the implied warranty of\n").append("MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\nGNU General Public License for more details.\n").append("\nYou should have received a copy of the GNU Lesser General Public License\n").append("along with this program.  If not, see <http://www.gnu.org/licenses/>.\n");
        System.out.println(var1);
        SwingUtilities.invokeLater(new a());
    }

    public void actionPerformed(ActionEvent var1) {
        if (var1.getSource() == this.b) {
            this.dispose();
        } else {
            if (var1.getSource() == this.c) {
                this.i.setText("");
            }

        }
    }

    public void itemStateChanged(ItemEvent var1) {
        ItemSelectable var2;
        if ((var2 = var1.getItemSelectable()) == this.d) {
            try {
                if (var1.getStateChange() == 1) {
                    GlobalScreen.a();
                } else {
                    GlobalScreen.b();
                }
            } catch (c var3) {
                this.i.append("Error: " + var3.getMessage() + "\n");
            }

            this.d.setState(GlobalScreen.c());
            this.a.setEnabled(this.d.getState());
        } else if (var2 == this.e) {
            if (var1.getStateChange() == 1) {
                GlobalScreen.a((org.jnativehook.a.a) this);
            } else {
                GlobalScreen.b((org.jnativehook.a.a) this);
            }
        } else if (var2 == this.f) {
            if (var1.getStateChange() == 1) {
                GlobalScreen.a((org.jnativehook.b.b) this);
            } else {
                GlobalScreen.b((org.jnativehook.b.b) this);
            }
        } else if (var2 == this.g) {
            if (var1.getStateChange() == 1) {
                GlobalScreen.a((org.jnativehook.b.c) this);
            } else {
                GlobalScreen.b((org.jnativehook.b.c) this);
            }
        } else {
            if (var2 == this.h) {
                if (var1.getStateChange() == 1) {
                    GlobalScreen.a((d) this);
                    return;
                }

                GlobalScreen.b((d) this);
            }

        }
    }

    public void windowActivated(WindowEvent var1) {
    }

    public void windowClosing(WindowEvent var1) {
    }

    public void windowDeactivated(WindowEvent var1) {
    }

    public void windowDeiconified(WindowEvent var1) {
    }

    public void windowIconified(WindowEvent var1) {
    }

    public void windowOpened(WindowEvent var1) {
        this.requestFocusInWindow();
        this.d.setSelected(true);
        this.i.append("JNativeHook Version " + System.getProperty("jnativehook.lib.version"));
        this.i.append("\nAuto Repeat Rate: " + System.getProperty("jnativehook.key.repeat.rate"));
        this.i.append("\nAuto Repeat Delay: " + System.getProperty("jnativehook.key.repeat.delay"));
        this.i.append("\nDouble Click Time: " + System.getProperty("jnativehook.button.multiclick.iterval"));
        this.i.append("\nPointer Sensitivity: " + System.getProperty("jnativehook.pointer.sensitivity"));
        this.i.append("\nPointer Acceleration Multiplier: " + System.getProperty("jnativehook.pointer.acceleration.multiplier"));
        this.i.append("\nPointer Acceleration Threshold: " + System.getProperty("jnativehook.pointer.acceleration.threshold"));

        try {
            this.i.setCaretPosition(this.i.getLineStartOffset(this.i.getLineCount() - 1));
        } catch (BadLocationException var2) {
            this.i.setCaretPosition(this.i.getDocument().getLength());
        }

        this.e.setSelected(true);
        this.f.setSelected(true);
        this.g.setSelected(true);
        this.h.setSelected(true);
    }

    public void windowClosed(WindowEvent var1) {
        try {
            GlobalScreen.b();
        } catch (c var2) {
            var2.printStackTrace();
        }

        System.runFinalization();
        System.exit(0);
    }
}
