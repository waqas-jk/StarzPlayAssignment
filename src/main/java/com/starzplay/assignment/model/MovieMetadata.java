
package com.starzplay.assignment.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$xmlns",
    "startIndex",
    "itemsPerPage",
    "entryCount",
    "title",
    "entries"
})
public class MovieMetadata {

    @JsonProperty("$xmlns")
    private com.starzplay.assignment.model.$xmlns $xmlns;
    @JsonProperty("startIndex")
    private Long startIndex;
    @JsonProperty("itemsPerPage")
    private Long itemsPerPage;
    @JsonProperty("entryCount")
    private Long entryCount;
    @JsonProperty("title")
    private String title;
    @JsonProperty("entries")
    private List<Entry> entries = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("$xmlns")
    public com.starzplay.assignment.model.$xmlns get$xmlns() {
        return $xmlns;
    }

    @JsonProperty("$xmlns")
    public void set$xmlns(com.starzplay.assignment.model.$xmlns $xmlns) {
        this.$xmlns = $xmlns;
    }

    @JsonProperty("startIndex")
    public Long getStartIndex() {
        return startIndex;
    }

    @JsonProperty("startIndex")
    public void setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
    }

    @JsonProperty("itemsPerPage")
    public Long getItemsPerPage() {
        return itemsPerPage;
    }

    @JsonProperty("itemsPerPage")
    public void setItemsPerPage(Long itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    @JsonProperty("entryCount")
    public Long getEntryCount() {
        return entryCount;
    }

    @JsonProperty("entryCount")
    public void setEntryCount(Long entryCount) {
        this.entryCount = entryCount;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("entries")
    public List<Entry> getEntries() {
        return entries;
    }

    @JsonProperty("entries")
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("$xmlns", $xmlns).append("startIndex", startIndex).append("itemsPerPage", itemsPerPage).append("entryCount", entryCount).append("title", title).append("entries", entries).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(title).append(startIndex).append($xmlns).append(additionalProperties).append(entries).append(entryCount).append(itemsPerPage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MovieMetadata) == false) {
            return false;
        }
        MovieMetadata rhs = ((MovieMetadata) other);
        return new EqualsBuilder().append(title, rhs.title).append(startIndex, rhs.startIndex).append($xmlns, rhs.$xmlns).append(additionalProperties, rhs.additionalProperties).append(entries, rhs.entries).append(entryCount, rhs.entryCount).append(itemsPerPage, rhs.itemsPerPage).isEquals();
    }

}
