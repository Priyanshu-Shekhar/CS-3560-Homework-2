// Priyanshu Shekhar
// Professor Sun 
// CS 3560 
// 13 December 2022

public interface IndividualPanel {

  boolean alreadyFollowingUser(User user);

  boolean followingSelf(User user);

  void follow(IndividualUser user);

  void tweet(String message);
}
