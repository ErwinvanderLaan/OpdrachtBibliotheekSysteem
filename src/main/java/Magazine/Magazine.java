package magazine;

import java.time.LocalDate;
import library.Item;

public class Magazine extends Item {
  private String publisher;
  private String copyEditor;
  private String issn;
  private int issueNumber;




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
        " Title: " + getTitle() + " Issue Number: " + getIssueNumber() );
  }

  public String getIssn() {
    return issn;
  }

  public int getIssueNumber() {
    return issueNumber;
  }
}