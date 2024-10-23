package magazine;

import java.time.LocalDate;

public class MagazineMonthly extends Magazine
{
  private int monthNumber;

  public MagazineMonthly(long id, String title, String publisher, String copyEditor, int pages,
      String issn, int issueNumber, LocalDate publicationDate, int monthNumber) {
    super(id, title, publisher, copyEditor, pages, issn, issueNumber, publicationDate);

    this.monthNumber = monthNumber;
  }

  @Override
  public void getOverviewText(){
    System.out.println("Issn: " + getIssn() +
        " Title: " + getTitle() + " Month number: " + getMonthNumber()) ;
  }

  public int getMonthNumber() {
    return monthNumber;
  }
}
