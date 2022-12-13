// Priyanshu Shekhar
// Professor Sun 
// CS 3560 
// 13 December 2022

public class LastUpdated implements Visitor {

  private User lastUpdatedUser;

  @Override
  public void visit(User node) {
    if(node instanceof IndividualUser) {
      if(lastUpdatedUser == null) {
        lastUpdatedUser = node;
      } else {
        if(lastUpdatedUser.getLastUpdateTime() < node.getLastUpdateTime()) {
          lastUpdatedUser = node;
        }
      }
    }
  }

  public User getLastUpdatedUser() {
    return lastUpdatedUser;
  }
}
