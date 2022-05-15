
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MainSceneController implements Initializable {

    @FXML
    private Button backbtn;

    @FXML
    private ComboBox<String> cbop;

    @FXML
    private ComboBox<String> cbtype;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Label l4;

    @FXML
    private Label l5;

    @FXML
    private Label l6;

    @FXML
    private Button nextbtn;

    @FXML
    private TextField result;

    @FXML
    private Button subbtn;

    @FXML
    private TextField var1;

    @FXML
    private TextField var2;

    @FXML
    private TextField var3;

    @FXML
    private TextField var4;

    @FXML
    private TextField vardata;

    String types[] =
                   { "statistics", "arithmetic" };
    String statistics[] =
                   { "mean", "median","mode","range","minimum value","maximum value","Quartiles","Interquartile Range","outliers"};
    String arithmetic[] =
                   { "addition", "subtraction","multiplication","division","x to the power of y","factorial","log x to the base of y ","sigma from i to n c(i) to the power of p","sigma from i to n c(x) to the power of p"};

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cbtype.getItems().removeAll(cbtype.getItems());
        cbtype.getItems().addAll(types);
        l6.setText("choose the type of problem you need help with");
        backbtn.setVisible(false);
        subbtn.setVisible(false);
        var1.setVisible(false);
        var2.setVisible(false);
        var3.setVisible(false);
        var4.setVisible(false);
        vardata.setVisible(false);
        result.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        cbop.setVisible(false);





        
    }
    
    @FXML
    void btnbackclicked(ActionEvent event) {
      cbop.getItems().removeAll(cbop.getItems());
      l6.setText("choose the type of problem you need help with");
      backbtn.setVisible(false);
      nextbtn.setVisible(true);
      subbtn.setVisible(false);
      var1.setVisible(false);
      var2.setVisible(false);
      var3.setVisible(false);
      var4.setVisible(false);
      vardata.setVisible(false);
      result.setVisible(false);
      l1.setVisible(false);
      l2.setVisible(false);
      l3.setVisible(false);
      l4.setVisible(false);
      l5.setVisible(false);
      cbop.setVisible(false);
      cbtype.setVisible(true);
    }

    




    @FXML
    void btnnextclicked(ActionEvent event) {
        String tb = cbtype.getValue();
        if(tb == "statistics"){
            cbop.getItems().removeAll(cbop.getItems());
            cbop.getItems().addAll(statistics);
            l6.setText("choose the operation");
            backbtn.setVisible(true);
            cbop.setPromptText("operation");
            cbtype.setVisible(false);
            cbop.setVisible(true);
            nextbtn.setVisible(false);
        }
        else if(tb == "arithmetic") {
            cbop.getItems().removeAll(cbop.getItems());
            cbop.getItems().addAll(arithmetic);
            l6.setText("choose the operation");
            cbop.setPromptText("operation");
            backbtn.setVisible(true);
            cbtype.setVisible(false);
            cbop.setVisible(true);
            nextbtn.setVisible(false);        }
            
        
    }

    @FXML
    void btnsubmitclicked(ActionEvent event) {
        String tb = cbop.getValue();
        int x ;
        int y ;
        int c ;
        int p ;
        long ii ;
        statistics_operation s = new statistics_operation();
        arithmetic_operation a = new arithmetic_operation();
        String[] words ;
        int [] data ;
        List<Integer> re ;

        switch(tb) {
            case "mean" :
              // code block
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              result.setText(Double.toString(s.getMean(data)));  
              break;
            case "median":
              // code block
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              result.setText(Double.toString(s.getMedian(data)));  

              break;
              case "mode" :
              // code block
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              re = s.getMode(data);  
              result.setText(s.list_to_string(re));

              break;
            case "range":
              // code block
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              re = s.getRange(data);  
              result.setText(s.list_to_string(re));

              break;
              case "minimum value" :
              // code block
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              result.setText(Double.toString(s.getMin(data)));  

              break;
            case "maximum value":
              // code block
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              result.setText(Double.toString(s.getMax(data)));  


              break;
              case "Quartiles" :
              // code block
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              re = s.getQuartiles(data);  
              result.setText(s.list_to_string(re));


              break;
            case "Interquartile Range":
              // code block
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              result.setText(Double.toString(s.getInterquartileRange(data)));  


              break;
              case "outliers" :
              // code block
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              re = s.getOutliers(data);
              if (re.isEmpty()){
                result.setText("None");
              }  
              else{
                result.setText(s.list_to_string(re));
              }

              break;
            case "addition":
              // code block
              x = Integer.parseInt(var1.getText());
              y = Integer.parseInt(var2.getText());
              result.setText(Double.toString(a.addition(x,y)));  

              break;
              case "subtraction" :
              x = Integer.parseInt(var1.getText());
              y = Integer.parseInt(var2.getText());
              result.setText(Double.toString(a.subtraction(x,y)));  

              // code block
              break;
            case "multiplication":
              // code block
              x = Integer.parseInt(var1.getText());
              y = Integer.parseInt(var2.getText());
              result.setText(Double.toString(a.multiplication(x,y)));  

              break;
              case "division" :
              x = Integer.parseInt(var1.getText());
              y = Integer.parseInt(var2.getText());
              if(y==0){
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText(null);
                alert.setContentText("the denominator cannot be zero!\nignor the result shown and try again!. ");

                alert.showAndWait();  
              }
              result.setText(Double.toString(a.division(x,y)));  

              // code block
              break;
            case "x to the power of y":
              // code block
              x = Integer.parseInt(var1.getText());
              y = Integer.parseInt(var2.getText());
              ii = a.bigpower(x,y);
              if(ii == 0 && x!=0 ){
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText(null);
                alert.setContentText("the result is too big!\ncannot solve. ");

                alert.showAndWait();  
              }
              else{
               result.setText(Long.toString(a.bigpower(x,y)));  

              }

              break;
              case "factorial" :
              // code block
              x = Integer.parseInt(var1.getText());
              ii = a.factorial(x);
              if(ii==-1){
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText(null);
                alert.setContentText("There is no Factorial for negative numbers!");

                alert.showAndWait();  
              }
              else if(ii == 0){
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Dialog");
                alert.setHeaderText(null);
                alert.setContentText("the result is too big!\ncannot solve. ");
                alert.showAndWait();  
              }
              else{

                result.setText(Long.toString(ii));  

              }

              break;
            case "log x to the base of y":
              // code block
              x = Integer.parseInt(var1.getText());
              y = Integer.parseInt(var2.getText());
              result.setText(Double.toString(a.logarthim(x,y)));  

              break;
              case "sigma from i to n c(i) to the power of p" :
              // code block
              x = Integer.parseInt(var1.getText());
              y = Integer.parseInt(var2.getText());
              c = Integer.parseInt(var3.getText());
              p = Integer.parseInt(var4.getText());
              result.setText(Double.toString(a.sigma_ci_pwr_p(x,y,c,p)));  

              break;
            case "sigma from i to n c(x) to the power of p":
              // code block
              x = Integer.parseInt(var1.getText());
              y = Integer.parseInt(var2.getText());
              c = Integer.parseInt(var3.getText());
              p = Integer.parseInt(var4.getText());
              words = vardata.getText().split(" ");
              data = new int [words.length];
              for(int i = 0;i < words.length;i++)
              {
                  data[i] = Integer.parseInt(words[i]);

              }
              result.setText(Double.toString(a.sigma_cx_pwr_p(x,y,c,data,p)));  

              break;
            default:
              // code block
          }
        }

      @FXML
      void itemchangedop(ActionEvent event) {

        String tb = cbop.getValue();
        switch(tb) {
                case "mean" :
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(false);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(false);
                  l2.setVisible(false);
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                case "median":
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(false);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(false);
                  l2.setVisible(false);
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                  case "mode" :
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(false);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(false);
                  l2.setVisible(false);
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                case "range":
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(false);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(false);
                  l2.setVisible(false);
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                  case "minimum value" :
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(false);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(false);
                  l2.setVisible(false);
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                case "maximum value":
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(false);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(false);
                  l2.setVisible(false);
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                  case "Quartiles" :
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(false);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(false);
                  l2.setVisible(false);
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                case "Interquartile Range":
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(false);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(false);
                  l2.setVisible(false);
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                  case "outliers" :
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(false);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(false);
                  l2.setVisible(false);
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                case "addition":
                  // code block
                  vardata.setVisible(false);
                  result.setVisible(true);
                  l5.setVisible(false);
                  subbtn.setVisible(true);
                  var1.setVisible(true);
                  var2.setVisible(true);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(true);
                  l2.setVisible(true);
                  l1.setText("a");
                  l2.setText("b");
                  l3.setVisible(false);
                  l4.setVisible(false);

                  break;
                  case "subtraction" :
                  // code block
                  vardata.setVisible(false);
                  result.setVisible(true);
                  l5.setVisible(false);
                  subbtn.setVisible(true);
                  var1.setVisible(true);
                  var2.setVisible(true);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(true);
                  l2.setVisible(true);
                  l1.setText("a");
                  l2.setText("b");
                  l3.setVisible(false);
                  l4.setVisible(false);
                  break;
                case "multiplication":
                  // code block
                  vardata.setVisible(false);
                  result.setVisible(true);
                  l5.setVisible(false);
                  subbtn.setVisible(true);
                  var1.setVisible(true);
                  var2.setVisible(true);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(true);
                  l2.setVisible(true);
                  l1.setText("a");
                  l2.setText("b");
                  l3.setVisible(false);
                  l4.setVisible(false);
                  break;
                  case "division" :
                  // code block
                  vardata.setVisible(false);
                  result.setVisible(true);
                  l5.setVisible(false);
                  subbtn.setVisible(true);
                  var1.setVisible(true);
                  var2.setVisible(true);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(true);
                  l2.setVisible(true);
                  l1.setText("a");
                  l2.setText("b");
                  l3.setVisible(false);
                  l4.setVisible(false);
                  break;
                case "log x to the base of y ":
                  // code block
                  vardata.setVisible(false);
                  result.setVisible(true);
                  l5.setVisible(false);
                  subbtn.setVisible(true);
                  var1.setVisible(true);
                  var2.setVisible(true);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(true);
                  l2.setVisible(true);
                  l1.setText("x");
                  l2.setText("y");
                  l3.setVisible(false);
                  l4.setVisible(false);
                  break;
                  case "factorial" :
                  // code block
                  vardata.setVisible(false);
                  result.setVisible(true);
                  l5.setVisible(false);
                  subbtn.setVisible(true);
                  var1.setVisible(true);
                  var2.setVisible(false);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(true);
                  l2.setVisible(false);
                  l1.setText("x");
                  l3.setVisible(false);
                  l4.setVisible(false);
                  break;
                case "log x to the base of y":
                  // code block
                  vardata.setVisible(false);
                  result.setVisible(true);
                  l5.setVisible(false);
                  subbtn.setVisible(true);
                  var1.setVisible(true);
                  var2.setVisible(true);
                  var3.setVisible(false);
                  var4.setVisible(false);
                  l1.setVisible(true);
                  l2.setVisible(true);
                  l1.setText("x");
                  l2.setText("y");
                  l3.setVisible(false);
                  l4.setVisible(false);
                  break;
                  case "sigma from i to n c(i) to the power of p" :
                  // code block
                  vardata.setVisible(false);
                  result.setVisible(true);
                  l5.setVisible(false);
                  subbtn.setVisible(true);
                  var1.setVisible(true);
                  var2.setVisible(true);
                  var3.setVisible(true);
                  var4.setVisible(true);
                  l1.setVisible(true);
                  l2.setVisible(true);
                  l1.setText("i");
                  l2.setText("n");
                  l3.setVisible(true);
                  l4.setVisible(true);
                  l3.setText("c");
                  l4.setText("p");
                  break;
                case "sigma from i to n c(x) to the power of p":
                  // code block
                  vardata.setVisible(true);
                  result.setVisible(true);
                  l5.setVisible(true);
                  subbtn.setVisible(true);
                  var1.setVisible(true);
                  var2.setVisible(true);
                  var3.setVisible(true);
                  var4.setVisible(true);
                  l1.setVisible(true);
                  l2.setVisible(true);
                  l1.setText("i");
                  l2.setText("n");
                  l3.setVisible(true);
                  l4.setVisible(true);
                  l3.setText("c");
                  l4.setText("p");
                  break;
                default:
                  // code block
              }
      }

}
