import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.Group;

public class BeanPlay extends Application{
	public void start(Stage primaryStage){
		Group group = new Group();
		
		Button btn = new Button("開始遊戲");
		btn.setMinSize(25, 25);
		btn.setTranslateX(235);
		btn.setTranslateY(0);
		group.getChildren().add(btn);
		
		Line a1 = new Line(15, 360, 300, 390);
		group.getChildren().add(a1);
		
		Line a2 = new Line(265, 70, 265, 350);
		group.getChildren().add(a2);
		
		Line a3 = new Line(15, 70, 80, 45);
		group.getChildren().add(a3);
		
		Line a4 = new Line(200, 45, 265, 70);
		group.getChildren().add(a4);
		
		Line a5 = new Line(15, 70, 15, 360);
		group.getChildren().add(a5);
		
		Line a6 = new Line(50, 250, 50, 330);
		group.getChildren().add(a6);
		
		Line a7 = new Line(85, 250, 85, 330);
		group.getChildren().add(a7);
		
		Line a8 = new Line(120, 250, 120, 330);
		group.getChildren().add(a8);
		
		Line a9 = new Line(155, 250, 155, 330);
		group.getChildren().add(a9);
		
		Line a10 = new Line(190, 250, 190, 330);
		group.getChildren().add(a10);
		
		Line a11 = new Line(225, 250, 225, 330);
		group.getChildren().add(a11);
		
		Circle c51 = new Circle(50, 235, 6);
		group.getChildren().add(c51);
		
		Circle c52 = new Circle(85, 235, 6);
		group.getChildren().add(c52);
		
		Circle c53 = new Circle(120, 235, 6);
		group.getChildren().add(c53);
		
		Circle c54 = new Circle(155, 235, 6);
		group.getChildren().add(c54);
		
		Circle c55 = new Circle(190, 235, 6);
		group.getChildren().add(c55);
		
		Circle c56 = new Circle(225, 235, 6);
		group.getChildren().add(c56);
		
		Circle c41 = new Circle(35, 200, 4);
		group.getChildren().add(c41);
		
		Circle c42 = new Circle(70, 200, 4);
		group.getChildren().add(c42);
		
		Circle c43 = new Circle(105, 200, 4);
		group.getChildren().add(c43);
		
		Circle c44 = new Circle(140, 200, 4);
		group.getChildren().add(c44);
		
		Circle c45 = new Circle(175, 200, 4);
		group.getChildren().add(c45);
		
		Circle c46 = new Circle(210, 200, 4);
		group.getChildren().add(c46);
		
		Circle c47 = new Circle(245, 200, 4);
		group.getChildren().add(c47);
		
		Circle c31 = new Circle(50, 165, 4);
		group.getChildren().add(c31);
		
		Circle c32 = new Circle(85, 165, 4);
		group.getChildren().add(c32);
		
		Circle c33 = new Circle(120, 165, 4);
		group.getChildren().add(c33);
		
		Circle c34 = new Circle(155, 165, 4);
		group.getChildren().add(c34);
		
		Circle c35 = new Circle(190, 165, 4);
		group.getChildren().add(c35);
		
		Circle c36 = new Circle(225, 165, 4);
		group.getChildren().add(c36);
		
		Circle c21 = new Circle(35, 130, 4);
		group.getChildren().add(c21);
		
		Circle c22 = new Circle(70, 130, 4);
		group.getChildren().add(c22);
		
		Circle c23 = new Circle(105, 130, 4);
		group.getChildren().add(c23);
		
		Circle c24 = new Circle(140, 130, 4);
		group.getChildren().add(c24);
		
		Circle c25 = new Circle(175, 130, 4);
		group.getChildren().add(c25);
		
		Circle c26 = new Circle(210, 130, 4);
		group.getChildren().add(c26);
		
		Circle c27 = new Circle(245, 130, 4);
		group.getChildren().add(c27);
		
		Circle c11 = new Circle(50, 95, 5);
		group.getChildren().add(c11);
		
		Circle c12 = new Circle(85, 95, 5);
		group.getChildren().add(c12);
		
		Circle c13 = new Circle(120, 95, 5);
		group.getChildren().add(c13);
		
		Circle c14 = new Circle(155, 95, 5);
		group.getChildren().add(c14);
		
		Circle c15 = new Circle(190, 95, 5);
		group.getChildren().add(c15);
		
		Circle c16 = new Circle(225, 95, 5);
		group.getChildren().add(c16);
		
		
		
		Scene scene = new Scene(group, 300, 400);
		primaryStage.setTitle("打彈珠");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}
