public class ConferenceRegistrationAssistant {

  public int getLineFor(String lastName) {
    /* If the last name is between A thru M send them to line 1
       Otherwise send them to line 2 */
    int line = 0;
    char lastNameChar = lastName.charAt(0);
    if (lastNameChar <= 'M') {
      line = 1;
    }
    else {
      line = 2;
    }

    return line;
  }

}