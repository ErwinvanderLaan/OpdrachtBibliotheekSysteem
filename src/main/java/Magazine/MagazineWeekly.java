package magazine;

import java.time.LocalDate;

public class MagazineWeekly extends Magazine{
  private int weekNumber;

  public MagazineWeekly(long id, String title, String publisher, String copyEditor, int pages,
      String issn, int issueNumber, LocalDate publicationDate, int weekNumber) {
    super(id, title, publisher, copyEditor, pages, issn, issueNumber, publicationDate);

    this.weekNumber = weekNumber;
  }

  @Override
  public void getOverviewText(){
    System.out.println("Issn: " + getIssn() +
        " Title: " + getTitle() + "Week number: " + getWeekNumber());
  }
  public int getWeekNumber() {
    return weekNumber;
  }


}
