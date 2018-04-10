package org.jnativehook.example;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.PrintStream;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.jnativehook.GlobalScreen;
import org.jnativehook.b.d;
import org.jnativehook.c;
import org.jnativehook.e;

public class NativeHookDemo
  extends JFrame
  implements ActionListener, ItemListener, WindowListener, org.jnativehook.a.a, org.jnativehook.b.a, d
{
  private JMenu a;
  private JMenuItem b;
  private JMenuItem c;
  private JCheckBoxMenuItem d;
  private JCheckBoxMenuItem e;
  private JCheckBoxMenuItem f;
  private JCheckBoxMenuItem g;
  private JCheckBoxMenuItem h;
  private JTextArea i;
  private static final Logger j = Logger.getLogger(GlobalScreen.class.getPackage().getName());
  
  public NativeHookDemo()
  {
    setTitle("JNativeHook Demo");
    setLayout(new BorderLayout());
    setDefaultCloseOperation(2);
    setSize(600, 300);
    addWindowListener(this);
    Object localObject = new JMenuBar();
    JMenu localJMenu;
    (localJMenu = new JMenu("File")).setMnemonic(70);
    ((JMenuBar)localObject).add(localJMenu);
    this.b = new JMenuItem("Quit", 81);
    this.b.addActionListener(this);
    this.b.setAccelerator(KeyStroke.getKeyStroke(115, 8));
    this.b.getAccessibleContext().setAccessibleDescription("Exit the program");
    localJMenu.add(this.b);
    (localJMenu = new JMenu("View")).setMnemonic(86);
    ((JMenuBar)localObject).add(localJMenu);
    this.c = new JMenuItem("Clear", 67);
    this.c.addActionListener(this);
    this.c.setAccelerator(KeyStroke.getKeyStroke(67, 3));
    this.c.getAccessibleContext().setAccessibleDescription("Clear the screen");
    localJMenu.add(this.c);
    localJMenu.addSeparator();
    this.d = new JCheckBoxMenuItem("Enable Native Hook");
    this.d.addItemListener(this);
    this.d.setMnemonic(72);
    this.d.setAccelerator(KeyStroke.getKeyStroke(72, 3));
    localJMenu.add(this.d);
    this.a = new JMenu("Listeners");
    this.a.setMnemonic(76);
    localJMenu.add(this.a);
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
    setJMenuBar((JMenuBar)localObject);
    this.i = new JTextArea();
    this.i.setEditable(false);
    this.i.setBackground(new Color(255, 255, 255));
    this.i.setForeground(new Color(0, 0, 0));
    this.i.setText("");
    (localObject = new JScrollPane(this.i)).setPreferredSize(new Dimension(375, 125));
    add((Component)localObject, "Center");
    j.setUseParentHandlers(false);
    j.setLevel(Level.ALL);
    (localObject = new ConsoleHandler()).setFormatter(new b(this, (byte)0));
    ((ConsoleHandler)localObject).setLevel(Level.WARNING);
    j.addHandler((Handler)localObject);
    GlobalScreen.a(new e());
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (paramActionEvent.getSource() == this.b)
    {
      dispose();
      return;
    }
    if (paramActionEvent.getSource() == this.c) {
      this.i.setText("");
    }
  }
  
  public void itemStateChanged(ItemEvent paramItemEvent)
  {
    ItemSelectable localItemSelectable;
    if ((localItemSelectable = paramItemEvent.getItemSelectable()) == this.d)
    {
      try
      {
        if (paramItemEvent.getStateChange() == 1) {
          GlobalScreen.a();
        } else {
          GlobalScreen.b();
        }
      }
      catch (c paramItemEvent)
      {
        this.i.append("Error: " + paramItemEvent.getMessage() + "\n");
      }
      this.d.setState(GlobalScreen.c());
      this.a.setEnabled(this.d.getState());
      return;
    }
    if (localItemSelectable == this.e)
    {
      if (paramItemEvent.getStateChange() == 1)
      {
        GlobalScreen.a(this);
        return;
      }
      GlobalScreen.b(this);
      return;
    }
    if (localItemSelectable == this.f)
    {
      if (paramItemEvent.getStateChange() == 1)
      {
        GlobalScreen.a(this);
        return;
      }
      GlobalScreen.b(this);
      return;
    }
    if (localItemSelectable == this.g)
    {
      if (paramItemEvent.getStateChange() == 1)
      {
        GlobalScreen.a(this);
        return;
      }
      GlobalScreen.b(this);
      return;
    }
    if (localItemSelectable == this.h)
    {
      if (paramItemEvent.getStateChange() == 1)
      {
        GlobalScreen.a(this);
        return;
      }
      GlobalScreen.b(this);
    }
  }
  
  public void windowActivated(WindowEvent paramWindowEvent) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {}
  
  public void windowDeactivated(WindowEvent paramWindowEvent) {}
  
  public void windowDeiconified(WindowEvent paramWindowEvent) {}
  
  public void windowIconified(WindowEvent paramWindowEvent) {}
  
  public void windowOpened(WindowEvent paramWindowEvent)
  {
    requestFocusInWindow();
    this.d.setSelected(true);
    this.i.append("JNativeHook Version " + System.getProperty("jnativehook.lib.version"));
    this.i.append("\nAuto Repeat Rate: " + System.getProperty("jnativehook.key.repeat.rate"));
    this.i.append("\nAuto Repeat Delay: " + System.getProperty("jnativehook.key.repeat.delay"));
    this.i.append("\nDouble Click Time: " + System.getProperty("jnativehook.button.multiclick.iterval"));
    this.i.append("\nPointer Sensitivity: " + System.getProperty("jnativehook.pointer.sensitivity"));
    this.i.append("\nPointer Acceleration Multiplier: " + System.getProperty("jnativehook.pointer.acceleration.multiplier"));
    this.i.append("\nPointer Acceleration Threshold: " + System.getProperty("jnativehook.pointer.acceleration.threshold"));
    try
    {
      this.i.setCaretPosition(this.i.getLineStartOffset(this.i.getLineCount() - 1));
    }
    catch (BadLocationException localBadLocationException)
    {
      this.i.setCaretPosition(this.i.getDocument().getLength());
    }
    this.e.setSelected(true);
    this.f.setSelected(true);
    this.g.setSelected(true);
    this.h.setSelected(true);
  }
  
  public void windowClosed(WindowEvent paramWindowEvent)
  {
    try
    {
      
    }
    catch (c localc)
    {
      (paramWindowEvent = localc).printStackTrace();
    }
    System.runFinalization();
    System.exit(0);
  }
  
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = new StringBuffer("\nJNativeHook: Global keyboard and mouse hooking for Java.\n").append("Copyright (C) 2006-2015 Alexander Barker.  All Rights Received.\nhttps://github.com/kwhat/jnativehook/\n").append("\nJNativeHook is free software: you can redistribute it and/or modify\n").append("it under the terms of the GNU Lesser General Public License as published\nby the Free Software Foundation, either version 3 of the License, or\n").append("(at your option) any later version.\n\n").append("JNativeHook is distributed in the hope that it will be useful,\nbut WITHOUT ANY WARRANTY; without even the implied warranty of\n").append("MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\nGNU General Public License for more details.\n").append("\nYou should have received a copy of the GNU Lesser General Public License\n").append("along with this program.  If not, see <http://www.gnu.org/licenses/>.\n");
    System.out.println(paramArrayOfString);
    SwingUtilities.invokeLater(new a());
  }
}


/* Location:              C:\Users\sihadan\Desktop\CrossRAT\CrossRAT\CrossRat\hmar6.jar!\org\jnativehook\example\NativeHookDemo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */