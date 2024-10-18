package magazine;

import library.Item;

public class Magazine extends Item {

  private String issn;
  private int issueNumber;


  // The class constructor:
  public Magazine( long id, String title, String author, int pages, String issn, int issueNumber) {
   super(id, title, author, pages);
    this.issn = issn;
    this.issueNumber = issueNumber;
  }

}
