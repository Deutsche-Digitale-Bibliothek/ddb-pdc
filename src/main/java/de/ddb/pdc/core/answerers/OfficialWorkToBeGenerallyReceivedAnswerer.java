package de.ddb.pdc.core.answerers;

import de.ddb.pdc.core.Answerer;
import de.ddb.pdc.core.Answer;
import de.ddb.pdc.metadata.DDBItem;

/**
 * Answers the OFFICIAL_WORK_INTENDED_TO_BE_GENERALLY_RECEIVED question.
 *
 * TODO hard coded answer
 */
class OfficialWorkToBeGenerallyReceivedAnswerer implements Answerer {

  /**
   * {@inheritDoc}
   */
  @Override
  public Answer answerQuestionForItem(DDBItem metaData) {
    return Answer.ASSUMED_NO;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getNoteForLastQuestion() {
    return "Es wird immer davon ausgegangen, dass die Antwort nein ist. Ein "
        + "offizielles Werk, das für die Öffentlichkeit bestimmt ist, ist "
        + "immer ohne Beschränkungen öffentlich zugänglich.";
  }

}
