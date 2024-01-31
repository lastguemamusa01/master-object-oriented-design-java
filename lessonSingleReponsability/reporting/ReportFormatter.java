package lessonSingleReponsability.reporting;

public class ReportFormatter {

  String formattedOut;

  public ReportFormatter(Object object, FormatType formatType) {
    switch (formatType) {
      case XML: formattedOut = convertObjectToXML(object); break;
      case CSV: formattedOut = convertObjectToCSV(object); break;
    }
  }

  private String convertObjectToXML(Object object) {
    return "XML: <title>"+ object.toString()+"</title>";
  }

  private String convertObjectToCSV(Object object) {
    return "CSV: ,,,"+ object.toString()+",,,,";
  }

  protected String getFormatterValue() {
    return formattedOut;
  }

}
