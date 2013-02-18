/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sscproj;

/**
 *
 * @author Harsha
 */
public class SortOrder extends Order {
    private String sortType;
    private String sortDataFileName;
    private String sortKey;

    /**
     * @return the sortType
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * @param sortType the sortType to set
     */
    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    /**
     * @return the sortDataFileName
     */
    public String getSortDataFileName() {
        return sortDataFileName;
    }

    /**
     * @param sortDataFileName the sortDataFileName to set
     */
    public void setSortDataFileName(String sortDataFileName) {
        this.sortDataFileName = sortDataFileName;
    }

    /**
     * @return the sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    /**
     * @param sortKey the sortKey to set
     */
    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }
}
