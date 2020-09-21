package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BarChart<?, ?> diagramma;

    @FXML
    private CategoryAxis ossx;

    @FXML
    private NumberAxis ossy;


    @FXML
    void initialize() {
        XYChart.Series set1=new XYChart.Series<>();
        XYChart.Series set2=new XYChart.Series<>();
        XYChart.Series set3=new XYChart.Series<>();
        XYChart.Series set4=new XYChart.Series<>();
        XYChart.Series set5=new XYChart.Series<>();

        set1.getData().add(new XYChart.Data("Смена ТП",Constanta.SMENATP));
        set2.getData().add(new XYChart.Data("Услуги",15));
        set3.getData().add(new XYChart.Data("СИМ",56));
        set4.getData().add(new XYChart.Data("Продажа ПО",11));
        set5.getData().add(new XYChart.Data("Документы",80));

        diagramma.getData().addAll(set1,set2,set3,set4,set5);


    }
}
