package chapter4.block_game;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application
{


    @Override
    public void start(Stage primaryStage) throws Exception
    {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Group root = new Group();
        primaryStage.setTitle("我的第一个方块小游戏示例");
        primaryStage.setScene(new Scene(root,600, 400));


        //Construct a rectangle object using real data
        Rectangle rec1 = new Rectangle(50, 50,150,80);

        final KeyFrame frame = new KeyFrame(Duration.millis(1000 / 60),
                event -> {
                    rec1.setY(rec1.getY() + 1);
                });

        Timeline t1 = new Timeline();
        t1.setCycleCount(Animation.INDEFINITE);
        t1.getKeyFrames().add(frame);
        t1.play();



        root.getChildren().add(rec1);
        primaryStage.show();

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
