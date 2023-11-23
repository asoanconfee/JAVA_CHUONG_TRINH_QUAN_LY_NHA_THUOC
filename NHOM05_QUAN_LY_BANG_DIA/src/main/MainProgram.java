package main;


import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import gui.DangNhap;

public class MainProgram {
    public static void main(String args[]) {
    	FlatAnimatedLafChange.showSnapshot();
        FlatMacLightLaf.setup();
        FlatLaf.updateUI();
        FlatAnimatedLafChange.hideSnapshotWithAnimation();
        new DangNhap();
    }
}
