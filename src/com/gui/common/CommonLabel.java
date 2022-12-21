package com.gui.common;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class CommonLabel extends JLabel {
    public final static String FOREGROUND = "0x000000";
    public final static int BIG_FONT_SIZE = 32;
    public final static int SMALL_FONT_SIZE = 18;

    public CommonLabel() {
        // TODO: small font is default
        this.setSmallFont();
        this.setForeground(Color.decode(CommonLabel.FOREGROUND));
    }

    public void setSmallFont() {
        this.setFont(new Font("segoe ui", Font.PLAIN, CommonLabel.SMALL_FONT_SIZE));
    }

    public void setBigFont() {
        this.setFont(new Font("segoe ui", Font.PLAIN, CommonLabel.BIG_FONT_SIZE));
    }

    public void resetFont() {
        int font_size = this.getFont().getSize();
        this.setFont(new Font("segoe ui", Font.PLAIN, font_size));
    }
}
