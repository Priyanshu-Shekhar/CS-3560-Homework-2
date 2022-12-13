// Priyanshu Shekhar
// Professor Sun 
// CS 3560 
// 13 December 2022

public class TotalMessages implements Visitor {

  private int count = 0;

  @Override
  public void visit(User node) {
    if(node instanceof IndividualUser) {
      count += ((IndividualUser)node).getMessages().length;
    }
  }

  public int result() {
    return count;
  }
}
