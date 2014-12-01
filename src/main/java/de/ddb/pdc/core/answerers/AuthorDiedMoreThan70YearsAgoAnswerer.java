package de.ddb.pdc.core.answerers;

import java.util.Calendar;
import java.util.List;

import de.ddb.pdc.core.Answerer;
import de.ddb.pdc.core.Answer;
import de.ddb.pdc.metadata.Author;
import de.ddb.pdc.metadata.DDBItem;

/**
 * Answers the AUTHOR_DIED_MORE_THAN_70_YEARS_AGO question.
 *
 * TODO include month and day in the check.
 */
class AuthorDiedMoreThan70YearsAgoAnswerer implements Answerer {

  private String note;

  /**
   * {@inheritDoc}
   */
  @Override
  public Answer answerQuestionForItem(DDBItem metaData) {
    List<Author> authors = metaData.getAuthors();
    if (authors == null || authors.isEmpty()) {
      return Answer.UNKNOWN;
    }
    Calendar calendar = Calendar.getInstance();
    int currentYear = calendar.get(Calendar.YEAR);
    int authorDeathYear = 0;
    for (Author author : authors) {
      Calendar deathYearCalendar = author.getYearOfDeath();
      if (deathYearCalendar == null) {
        this.note = "Not all death dates known. Will assume some authors "
            + "are still living.";
        return Answer.ASSUMED_NO;
      }

      authorDeathYear = Math.max(authorDeathYear,
          deathYearCalendar.get(Calendar.YEAR));
    }
    if (currentYear - authorDeathYear > 70) {
      this.note = "All authors died before or in " + authorDeathYear;
      return Answer.YES;
    } else {
      this.note = "At least one author died in " + authorDeathYear;
      return Answer.NO;
    }
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public String getNoteForLastQuestion() {
    return this.note;
  }
}