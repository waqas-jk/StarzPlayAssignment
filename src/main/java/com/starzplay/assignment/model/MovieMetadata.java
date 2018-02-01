
package com.starzplay.assignment.model;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entryCount",
    "title",
    "entries"
})
@JsonIgnoreProperties(ignoreUnknown=true)
public class MovieMetadata {

    @JsonProperty("entryCount")
    private Long entryCount;
    
    @JsonProperty("title")
    private String title;
    
    @JsonProperty("entries")
    private List<Entry> entries = null;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("entryCount", entryCount).append("title", title).append("entries", entries).toString();
    }

}
