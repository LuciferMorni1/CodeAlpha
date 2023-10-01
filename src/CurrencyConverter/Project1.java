package CurrencyConverter;
//--CURRENCY CONVERTER--//
//Update the currency conversion by implimenting latest value of currency from web.

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/CurrencyConverterServlet")
public class Project1 extends HttpServlet {
    private CurrencyConverter converter;

    public void init() throws ServletException {
        converter = new CurrencyConverter();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double amount = Double.parseDouble(request.getParameter("amount"));
        String fromCurrency = request.getParameter("fromCurrency");
        String toCurrency = request.getParameter("toCurrency");

        double convertedAmount = converter.convertCurrency(amount, fromCurrency, toCurrency);

        PrintWriter out = response.getWriter();
        out.println("Converted amount: " + convertedAmount + " " + toCurrency);
    }
}