import java.awt.Color;

import lab.darf.javaui.UIWindowManager;
import lab.darf.javaui.components.UIScene;
import lab.darf.javaui.components.organizers.HorizontalStack;
import lab.darf.javaui.components.organizers.UIPanel;
import lab.darf.javaui.components.organizers.VerticalStack;
import lab.darf.javaui.components.UIImage;
import lab.darf.javaui.components.UILabel;
import lab.darf.javaui.properties.UIWindowDimension;
import lab.darf.javaui.properties.UIWindowProperty;

public class Example {

    public static void main(String[] args) throws Exception {

        UIWindowManager.newWindow(
            new UIWindowProperty()
                .name("window.helloworld")
                .title("Hello World")
                .dimension(
                    new UIWindowDimension()
                        .size(1000, 800)
                        .toCenter()
                )
        )
            .loadScene(
                new UIScene()
                    .color(Color.BLACK)
                    .components(
                        new VerticalStack()
                            .offset(10)
                            .components(
                                new UIImage()
                                    .imageFile("/Users/hoyounsong/Desktop/image.png"),

                                new UIImage()
                                    .imageFile("/Users/hoyounsong/Desktop/image.png"),

                                new HorizontalStack()
                                    .offset(5)
                                    .components(
                                        new UIImage()
                                            .imageFile("/Users/hoyounsong/Desktop/image.png"),

                                        new UIImage()
                                            .imageFile("/Users/hoyounsong/Desktop/image.png")
                                    ),

                                new UIPanel()
                                    .color(Color.BLUE)
                                    .components(
                                        new HorizontalStack()
                                            .components(
                                                new UILabel()
                                                    .text("Hello World")
                                                    .color(Color.WHITE)
                                            )
                                    )
                            )
                    )
            );
    }
}
