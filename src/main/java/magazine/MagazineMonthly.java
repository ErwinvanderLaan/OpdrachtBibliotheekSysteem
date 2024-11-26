package magazine;

import java.time.LocalDate;

/**
 * Goal of this class: A child class of 'Magazine.' It adds the 'monthNumber' parameter to Magazine.
 * It contains: 1. The MagazineMonthly class + constructor + 'get-methods' needed for other methods
 * 2. The 'getOverview method' which displays the ISSN, Title, Issue number and month number. 3. The
 * 'maximumBorrowTime method' which displays the maximum borrow time.
 */
public class MagazineMonthly extends Magazine {

  /**
   * Adds the month Number field to the magazine class.
   */
  private final int monthNumber;

  /**
   * Magazine monthly constructor.
   */
  public MagazineMonthly(long id, String title, String publisher, String copyEditor, int pages,
      String issn, int issueNumber, LocalDate publicationDate, int monthNumber) {
    super(id, title, publisher, copyEditor, pages, issn, issueNumber, publicationDate);

    this.monthNumber = monthNumber;
  }

  @Override
  public void getOverviewText() {
    System.out.println(
        "Issn: "
            + getIssn()
            + " Title: "
            + getTitle()
            + " Month number: "
            + getMonthNumber()
            + maximumBorrowTime());
  }

  @Override
  public String maximumBorrowTime() {
    return "Maximum borrow time for a monthly magazine is 7 days";
  }

  /**
   * Get the month number.
   */
  public int getMonthNumber() {
    return monthNumber;
  }
}





