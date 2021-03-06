package de.ddb.pdc.core.answerers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.ddb.pdc.core.Answerer;
import de.ddb.pdc.core.Answer;
import de.ddb.pdc.metadata.DDBItem;

@SuppressWarnings({"static-method", "javadoc", "nls"})
public class CountryOfOriginTriptisAnswererTest {

  @Test
  public void test() {
    DDBItem metadata = new DDBItem("test-id");

    Answerer answerer = new CountryOfOriginTriptisAnswerer();
    Answer answer = answerer.answerQuestionForItem(metadata);

    // The country of origin is always Germany (hard coded)
    // as of request of the customer.
    assertEquals(Answer.ASSUMED_YES, answer);
  }

}
