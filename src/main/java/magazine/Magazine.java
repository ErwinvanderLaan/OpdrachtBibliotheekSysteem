// Goal of this class: A child class of 'Item' and a parent class for MagazineMonthly & MagazineWeekly.
// It contains:
// 1. The Magazine class + constructor + 'get-methods' needed for other methods
// 2. The 'getOverview method' which displays the ISSN, Title and Issue number of a magazine.
// 3. The 'maximumBorrowTime method' which displays the maximum time this magazine may be borrowed.

package magazine;

import java.time.LocalDate;
import library.Item;

public class Magazine extends Item {
  private final String publisher;
  private final String copyEditor;
  private final String issn;
  private final int issueNumber;


  // The class constructor:
  public Magazine( long id, String title, String publisher, String copyEditor,
      int pages, String issn, int issueNumber, LocalDate publicationDate) {
    super(id, title, pages, publicationDate);
    this.publisher = publisher;
    this.copyEditor = copyEditor;
    this.issn = issn;
    this.issueNumber = issueNumber;
  }

  @Override
  public void getOverviewText(){
    System.out.println("Issn: " + getIssn() +
        " Title: " + getTitle() + " Issue Number: " + getIssueNumber() + maximumBorrowTime() );
  }

  @Override
  public String maximumBorrowTime() {
    return "Maximum borrow time for a daily magazine is 2 days";
  }

  public String getIssn() {
    return issn;
  }

  public int getIssueNumber() {
    return issueNumber;
  }
}



