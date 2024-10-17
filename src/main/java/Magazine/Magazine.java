package Magazine;

import java.time.LocalDate;
import library.Item;

class Magazine extends Item {

  private String issn;
  private int issueNumber;


  // The class constructor:
  public Magazine( long id, String title, String author, int pages, String issn, int issueNumber) {
   super(id, title, author, pages);
    this.issn = issn;
    this.issueNumber = issueNumber;
  }

  // Getters & Setters
  public String getIssn() {
    return issn;
  }

  public int getIssueNumber() {
    return issueNumber;
  }

  public void setIssn(String issn) {
    this.issn = issn;
  }

  public void setIssueNumber(int issueNumber) {
    this.issueNumber = issueNumber;
  }

}
