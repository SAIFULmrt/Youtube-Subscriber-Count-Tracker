package application;

import java.time.LocalDate;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 17 Jan 2021
 */
public class Validation {
  public static boolean isValidData(String firstName, String lastName, String channelName,
      LocalDate channelCreationDate, String currentSubscriberCount, String pathToChannelAvatar)
      throws InvalidNameException, InvalidDateException {

    if (!nameIsValid(firstName)) {
      throw new InvalidNameException("First name is not valid");
    }
    if (!nameIsValid(lastName)) {
      throw new InvalidNameException("Last name is not valid");
    }
    if (!channelNameIsValid(channelName)) {
      throw new InvalidNameException("Channel name is not valid");
    }
    if (!dateIsValid(channelCreationDate)) {
      throw new InvalidDateException("Date is not valid");
    }
//    if(!nameIsValid(lastNamInvalidDateExceptione)) {
//      throw new currentSubscriberCountException("Last name is not valid");
//    }
    if (!pathIsValid(pathToChannelAvatar)) {
      throw new InvalidNameException("Last name is not valid");
    }
    return true;
  }

  public static boolean nameIsValid(String name) {
    return name != null && name.length() >= 5;
  }

  public static boolean channelNameIsValid(String name) {
    return name != null && name.length() >= 10;
  }

//  public static boolean currentSubIsValid(String sub) {
//    return sub > 0;
//  }

  public static boolean dateIsValid(LocalDate date) {
    return date != null;
  }

  public static boolean pathIsValid(String path) {
    return path != null;
  }
}
