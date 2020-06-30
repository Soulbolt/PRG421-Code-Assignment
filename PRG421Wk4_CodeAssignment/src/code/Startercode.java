/**********************************************************************
 *	Program:	Startercode
 * 	Purpose: 	Class assignment:
 *                       Students - Given starter code, students write code that uses the
 *                       Locale object (language, country, etc.) *
 *		        The questions marks (?) in the code are to be completed by the students.
 *		        Add comments/documentation to the code lines
 *	Programmer:	Cesar Cervantes
 *	Class:		PRG/421r13, Java Programming II
 *	Instructor:	Jeff Lee
 *	Creation Date:	6/30/2019
 *
 *	Comments:
 *		For additional information,  refer to:
 *		OCA/OCP Java SE7, Programmer I & II Study Guide
 *		Chapter 8: String Processing, Data Formatting, Resource Bundles
 *		Section: Working with Dates, Numbers, and Currencies
 *
 ***********************************************************************/

package code;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale; //Locale library to define Locale information for respective localization.

public class Startercode {
    public static void main(String[] args) {
        long number = 5000000L;

        NumberFormat numberFormatDefault = NumberFormat.getInstance();
        System.out.println("Number Format using Default Locale: "+numberFormatDefault.format(number));

        NumberFormat numberFormatLocale = NumberFormat.getInstance(Locale.JAPAN); //Using Japan to display number format that is utilized in Japan.
        System.out.println("Number Format using JAPAN Locale: "+numberFormatLocale.format(number)); //Fill in blank with respective Locale name being used.

        NumberFormat numberFormatDefaultCurrency = NumberFormat.getCurrencyInstance();
        System.out.println("Currency Format using Default Locale: " + numberFormatDefaultCurrency.format(number)); //Fill in blank with Locale as code is set to display currency by machines default Locale.

        NumberFormat numberFormatLocaleCurrency = NumberFormat.getCurrencyInstance(Locale.UK); //Using UK(United Kingdom) locale to display different respective currency format.
        System.out.println("Currency Format using UK(United Kingdom) Locale: "+numberFormatLocaleCurrency.format(number)); //Filling blank to reflect locale being used.

        Currency currency = Currency.getInstance(Locale.KOREA); //Using Locale.KOREA to display the respective currency name.
        System.out.println(currency.getDisplayName()+" ("+currency.getCurrencyCode()+") "+currency.getDisplayName());

        Date currentDate = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE); //Using Locale.FRANCE to pull respective date format.
        System.out.println("Date Format in FRANCE Locale: "+dateFormat.format(currentDate)); //Fill in blank with FRANCE to reflect locale being used.

    }


}
