/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Pojo.*;
import Controller.*;
import Report.JRPacientes;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 * FXML Controller class
 *
 * @author JDonald
 */
public class MainController implements Initializable {

    @FXML
    private VBox vboxItemsCatalog;
    @FXML
    private VBox vboxItemsOperator;
    @FXML
    private VBox vboxItemsReport;
    @FXML
    private Button btnCatalog, btnPacient;
    @FXML
    private Button btnOperator;
    @FXML
    private Button btnReport;
    @FXML
    private TabPane tabPacient;
    @FXML
    private TableView<Paciente> tblPaciente;
    @FXML
    private TableColumn<Paciente, String> Column1;
    @FXML
    private TableColumn<Paciente, String> Column2;
    @FXML
    private TableColumn<Paciente, String> Column3;
    @FXML
    private TableColumn<Paciente, Date> Column4;
    @FXML
    private TableColumn<Paciente, String> Column5;

    private ObservableList<Paciente> data;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        vboxItemsCatalog.setVisible(false);
        vboxItemsOperator.setVisible(false);
        vboxItemsReport.setVisible(false);
        tabPacient.setVisible(false);

        ViewDataPacients();

    }

    public void ViewDataPacients() {

        Controller.PacientController pacient = new Controller.PacientController();
        Column1.setCellValueFactory(new PropertyValueFactory<>("numeroExpediente"));
        Column2.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        Column3.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        Column4.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
        Column5.setCellValueFactory(new PropertyValueFactory<>("sexo"));

        List<Object> list;

        list = pacient.getPacientRecords();

        data = FXCollections.observableArrayList();

        list.stream().map((obj) -> (Paciente) obj).forEachOrdered((p) -> {
            data.add(p);
        });

        tblPaciente.setItems(data);

//        Iterator ite = qee.iterate();
//        while (ite.hasNext()) {
//            PoJoName obj = (PoJoName) ite.next();
//
//            data.add(obj);
//        }
//        table.setItems(data);
    }

    @FXML
    private void ExitItems(MouseEvent event) {

        vboxItemsCatalog.setVisible(false);

    }

    @FXML
    private void ExitItemsOperator(MouseEvent event) {

        vboxItemsOperator.setVisible(false);

    }

    @FXML
    private void ExitItemsReport(MouseEvent event) {

        vboxItemsReport.setVisible(false);

    }

    @FXML
    private void SlideItemsCatalog(ActionEvent event) {

        vboxItemsCatalog.setVisible(true);
        vboxItemsOperator.setVisible(false);
        vboxItemsReport.setVisible(false);
    }

    @FXML
    private void SlideItemsOperator(ActionEvent event) {

        vboxItemsOperator.setVisible(true);
        vboxItemsCatalog.setVisible(false);
        vboxItemsReport.setVisible(false);

    }

    @FXML
    private void SlideItemsReport(ActionEvent event) {

        vboxItemsReport.setVisible(true);
        vboxItemsOperator.setVisible(false);
        vboxItemsCatalog.setVisible(false);

    }

    @FXML
    private void getVisiblePanePacient(ActionEvent event) {

        tabPacient.setVisible(true);

    }

    @FXML
    private void AddPacient(ActionEvent event) {

    }

    public JRPacientes DataSource = new JRPacientes();
    public PacientController pacient = new PacientController();

    @FXML
    private void OnActionVIewPacientReports(ActionEvent event) {

        DataSource.clean();

        InputStream report;
        JasperPrint jp;
        JasperViewer jv;

        report = this.getClass().getResourceAsStream("/Report/Pacientes.jasper");

        if (DataSource != null) {
            ChargeDataSourcePacientReports();
        }

        try {

            jp = JasperFillManager.fillReport(report, null, DataSource);
            jv = new JasperViewer(jp, false);
            jv.setTitle("Pacientes");
            jv.setVisible(true);

        } catch (JRException e) {
        }

    }

    public void ChargeDataSourcePacientReports() {

        pacient.getPacientReports().forEach((p) -> {
            DataSource.addPaciente(p);

            System.out.println(p.getNombre() + " " + p.getApellido());
        });
    }
}
