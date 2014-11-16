package de.ddb.pdc.metadata;

import org.springframework.web.client.RestClientException;

/**
 * Interface for retrieving metadata about items in the DDB database.
 */
public interface MetaFetcher {

  /**
   * Searches the DDB for items whose metadata contains the passed substring.
   *
   * @param query                substring to search for
   * @param maxCount             maximum number of items to return
   * @return                     matching items
   * @throws RestClientException if communication with the DDB API fails
   */
  public DDBItem[] searchForItems(String query, int maxCount)
      throws RestClientException;

  /**
   * Fills the passed {@link DDBItem} with all metadata available in the
   * DDB database.
   *
   * @param ddbItem              item to fill
   * @throws RestClientException if communication with the DDB API fails
   */
  public void fetchMetadata(DDBItem ddbItem) throws RestClientException;
}