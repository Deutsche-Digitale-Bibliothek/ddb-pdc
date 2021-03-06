package de.ddb.pdc.storage;

import de.ddb.pdc.core.AnsweredQuestion;
import de.ddb.pdc.core.PDCResult;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;

/**
 * Entity representing the PDC record structure in storage.
 *
 */
public class StoredPDCResult {

  /**
   * Helper method for obtaining a StoredPDCResult from a PDCResult.
   */
  public static StoredPDCResult fromPDCResult(PDCResult pdcResult) {
    return new StoredPDCResult(pdcResult.getItemId(), pdcResult.getTitle(),
        pdcResult.getSubtitle(), pdcResult.getImageUrl(),
        pdcResult.getItemCategory(), pdcResult.getInstitution(),
        pdcResult.isPublicDomain(), pdcResult.getTrace(),
        pdcResult.getCreatedDate()
    );
  }

  @Id
  private String id;

  private final String itemId;
  private final String title;
  private final String subtitle;
  private final String imageUrl;
  private final String itemCategory;
  private final String institution;
  private final Boolean publicDomain;
  private final List<AnsweredQuestion> trace;
  private final Date createdDate;

  /**
   * Constructor for storing new records.
   * Also used by Mongo DB to fetch existing records.
   */
  public StoredPDCResult(String itemId, String title, String subtitle,
        String imageUrl, String itemCategory, String institution,
        Boolean publicDomain, List<AnsweredQuestion> trace, Date createdDate) {

    this.itemId = itemId;
    this.title = title;
    this.subtitle = subtitle;
    this.imageUrl = imageUrl;
    this.itemCategory = itemCategory;
    this.institution = institution;
    this.publicDomain = publicDomain;
    this.trace = trace;
    this.createdDate = createdDate;
  }

  public String getItemId() {
    return itemId;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getSubtitle() {
    return subtitle;
  }
  
  public String getImageUrl() {
    return imageUrl;
  }

  public String getItemCategory() {
    return itemCategory;
  }

  public String getInstitution() {
    return institution;
  }

  public Boolean isPublicDomain() {
    return publicDomain;
  }

  public List<AnsweredQuestion> getTrace() {
    return trace;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

}
