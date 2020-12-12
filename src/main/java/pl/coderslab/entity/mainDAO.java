package pl.coderslab.entity;

public class mainDAO {
  public static void main(String[] args) {
    UserDao userDao = new UserDao();
    User user = new User();
    user.setUserName("arek");
    user.setEmail("arkadiusz.jozwiak@coderslab.pl");
    user.setPassword("pass");
    userDao.create(user);

    User read = UserDao.read(1);
    System.out.println(read);
    User readNotExist = UserDao.read(2);
    System.out.println(readNotExist);

    User userToUpdate = UserDao.read(1);
    userToUpdate.setUserName("Arkadiusz");
    userToUpdate.setEmail("arek@coderslab.pl");
    userToUpdate.setPassword("superPassword");
    UserDao.update(userToUpdate);

    User secondUser = new User();
    secondUser.setUserName("marek");
    secondUser.setEmail("marek@coderslab.pl");
    secondUser.setPassword("pass");
    UserDao.create(secondUser);
    User[] all = UserDao.findAll();
    for (User u : all) {
      System.out.println(u);
    }

    UserDao.delete(1);
    UserDao.delete(2);
  }
}
