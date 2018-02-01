
package com.starzplay.assignment.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pid",
    "url",
    "restrictionId"
})
public class Release {

    @JsonProperty("pid")
    private String pid;
    @JsonProperty("url")
    private String url;
    @JsonProperty("restrictionId")
    private String restrictionId;

    @JsonProperty("pid")
    public String getPid() {
        return pid;
    }

    @JsonProperty("pid")
    public void setPid(String pid) {
        this.pid = pid;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("restrictionId")
    public String getRestrictionId() {
        return restrictionId;
    }

    @JsonProperty("restrictionId")
    public void setRestrictionId(String restrictionId) {
        this.restrictionId = restrictionId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pid", pid).append("url", url).append("restrictionId", restrictionId).toString();
    }

}
