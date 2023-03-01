package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.DataBaseUtils;

import java.sql.ResultSet;

public class ViewAccountPageSy extends BasePage {

    @FindBy(id = "transactionTable_wrapper")   //ccs     #transactionTable_wrapper
    WebElement transactionHistory;


    //  //table[@id='transactionTable']//tr[@class='odd']//td[4]

    @FindBy(xpath = "//table[@id='transactionTable']//tbody/tr[1]/td[4]")
    WebElement transactionHistoryAmount;

    @FindBy(xpath = "//table[@id='transactionTable']//tbody/tr[1]/td[3]")
    WebElement transactionHistoryDescription;

    public void verifyAccountPage() {
        Assert.assertTrue("View Account Page is not displayed",transactionHistory.isDisplayed());
    }

    public void verifyTransactionHistory() {


        //String actualAmountUI = transactionHistory.getText().replace("$", "");    //----
        //String actualAmountUI = transactionHistory.getText().substring(1);

        String actualAmountUI = transactionHistoryAmount.getText();  //----
        String expectedAmountFromCode = ConfigReader.getConfigProperty("transfer.amount3");


        System.out.println("============UI Testing===============");
        System.out.println("Actual Amount from UI: "+ actualAmountUI);
        System.out.println("Exp Amount from Code: " + expectedAmountFromCode);
        Assert.assertTrue("Transaction amount mismatch",expectedAmountFromCode.equals(actualAmountUI.replace("$","")));
    }

    public void verifyDetailsIntoDataBase() {

            String descAndTRn = transactionHistoryDescription.getText();
            String TRN = descAndTRn.split("-")[0].replace(" (TRN)","");
            String decsFromUI = descAndTRn.split("-")[1].trim();


            try {
                //String query = "select * from account_transaction where transaction_number='845322163';";
                String query = "select * from account_transaction where transaction_number='" + TRN + "';";
                ResultSet rs = DataBaseUtils.executeQuery(query);
                rs.next();

                String expAmountFromCode = ConfigReader.getConfigProperty("transfer.amount3");
                String actualAmountFromDB = rs.getString("amount");
                System.out.println(expAmountFromCode);
                System.out.println(actualAmountFromDB);
                Assert.assertTrue("Amount is not updated into the DB", expAmountFromCode.equals(actualAmountFromDB));

                System.out.println("============DB Testing===============");
                System.out.println("Actual Amount from DB: " + actualAmountFromDB);
                System.out.println("Exp Amount from Code: " + expAmountFromCode);


            } catch (Exception e) {
                e.printStackTrace();
            }


    }




}
