/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package serch;

/**
 *
 * @author Harsha
 */
public class SearchOrder extends Order {
    private String searchType;
    private String searchdataFileName;
    private String key;

    /**
     * @return the searchType
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * @param searchType the searchType to set
     */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    /**
     * @return the searchdataFileName
     */
    public String getSearchdataFileName() {
        return searchdataFileName;
    }

    /**
     * @param searchdataFileName the searchdataFileName to set
     */
    public void setSearchdataFileName(String searchdataFileName) {
        this.searchdataFileName = searchdataFileName;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }
}
