package application;

import java.time.LocalDate;

/*
 *  Name: Md. Saiful Islam
 *  ID: 1922071
 *  Course: CSE215L.16
 *  Instructor Name: Shaikh Shawon Arefin Shimon
 *  @date 17 Jan 2021
 */
public class YoutubeSubscriberCount {
  private String firstName;
  private String lastName;
  private String channelName;
  private LocalDate channelCreationDate;
  private long currentSubscriberCount;
  private String pathToChannelAvatar;

  public YoutubeSubscriberCount(String firstName, String lastName, String channelName, LocalDate channelCreationDate,
      long currentSubscriberCount, String pathToChannelAvatar) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.channelName = channelName;
    this.channelCreationDate = channelCreationDate;
    this.currentSubscriberCount = currentSubscriberCount;
    this.pathToChannelAvatar = pathToChannelAvatar;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  public LocalDate getChannelCreationDate() {
    return channelCreationDate;
  }

  public void setChannelCreationDate(LocalDate channelCreationDate) {
    this.channelCreationDate = channelCreationDate;
  }

  public long getCurrentSubscriberCount() {
    return currentSubscriberCount;
  }

  public void setCurrentSubscriberCount(long currentSubscriberCount) {
    this.currentSubscriberCount = currentSubscriberCount;
  }

  public String getPathToChannelAvatar() {
    return pathToChannelAvatar;
  }

  public void setPathToChannelAvatar(String pathToChannelAvatar) {
    this.pathToChannelAvatar = pathToChannelAvatar;
  }

  @Override
  public String toString() {
    return "----------------------------------------------------------------\n" + "Channel Name: " + channelName
        + "\nSub Count: " + currentSubscriberCount + "\nChannel Creation Date: " + channelCreationDate
        + "\n----------------------------------------------------------------";
  }

}
