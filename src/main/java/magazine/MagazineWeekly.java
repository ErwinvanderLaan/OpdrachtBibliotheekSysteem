package magazine;

import java.time.LocalDate;

/**
 * Goal of this class: A child class of 'Magazine.' It adds the 'weekNumber' parameter to Magazine.
 * It contains: *  1. The MagazineWeekly class + constructor + 'get-methods' needed for other
 * methods 2. the 'getOverview method' which displays the ISSN, Title, Issue number and week number.
 * 3. The 'maximumBorrowTime method' which displays the maximum borrow time.
 */
public class MagazineWeekly extends Magazine {

  /**
   * Adds the WeekNumber field to the magazine class.
   */
  private final int weekNumber;

  /**
   * The weeklyMagazine constructor class.
   */
  public MagazineWeekly(long id, String title, String publisher, String copyEditor, int pages,
      String issn, int issueNumber, LocalDate publicationDate, int weekNumber) {
    super(id, title, publisher, copyEditor, pages, issn, issueNumber, publicationDate);

    this.weekNumber = weekNumber;
  }

  @Override
  public void getOverviewText() {
    System.out.println(
        "Issn: "
            + getIssn()
            + " Title: "
            + getTitle()
            + "Week number: "
            + getWeekNumber()
            + maximumBorrowTime());
  }

  @Override
  public String maximumBorrowTime() {
    return "Maximum borrow time for a weekly magazine is 5 days";
  }

  /**
   * Gets the week number.
   */
  public int getWeekNumber() {
    return weekNumber;
  }


}






