package lab.darf.javaui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Component;

import lab.darf.javaui.components.UIScene;
import lab.darf.javaui.components.organizers.UIContainerElement;
import lab.darf.javaui.components.organizers.UIStack;
import lab.darf.javaui.properties.UIWindowProperty;

public class UIWindow {
    protected JFrame frame;

    protected String windowName;

    protected UIScene currentScene;

    protected JPanel contentPane;

    // public void add(EComponent c) {
    //     contentPane.add((Component) c);
    // }

    public UIWindow(String windowName) {
        frame = new JFrame();
        contentPane = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);

        contentPane.setLayout(null);
        contentPane.setSize(800, 600);

        frame.setContentPane(contentPane);
        this.windowName = windowName;
    }

    public UIWindow loadScene(UIScene s) {
        currentScene = s;
        s.onLoad();
        contentPane.removeAll();
        for (Component c : s.getComponents()) {
            if (c instanceof UIStack) {
                if (!((UIStack) c).usingCustomSize()) {
                    ((UIStack) c).size(frame.getWidth(), frame.getHeight());
                }
            }else if (c instanceof UIContainerElement) {
                ((UIContainerElement) c).size(frame.getWidth(), frame.getHeight());
            }

            contentPane.add(c);
        }
        contentPane.setBackground(s.getColor());

        return this;
    }

    public UIWindow loadScene(JPanel p) {
        unloadScene();
        p.setSize(frame.getWidth(), frame.getHeight());
        contentPane.add(p);
        return this;
    }

    public UIScene getCurrentScene() {
        return currentScene;
    }

    public UIWindow unloadScene() {
        if (currentScene != null) {
            currentScene.onUnload();    
        }
        contentPane.setBackground(null);
        contentPane.removeAll();
        currentScene = null;
        return this;
    }

    public String getName() {
        return windowName;
    }

    public UIWindow show() {
        frame.setVisible(true);
        return this;
    }

    public UIWindow hide() {
        frame.setVisible(false);
        return this;
    }
    
    public UIWindow setVisible(boolean visible) {
        frame.setVisible(visible);
        return this;
    }

    public UIWindow setProperty(UIWindowProperty property) {
        return UIWindowManager.updateProperty(this, property);
    }
}
