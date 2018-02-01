
package com.starzplay.assignment.model;

import java.util.HashMap;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
        return new ToStringBuilder(this).append("pid", pid).append("url", url).append("restrictionId", restrictionId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(pid).append(restrictionId).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Release) == false) {
            return false;
        }
        Release rhs = ((Release) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(pid, rhs.pid).append(restrictionId, rhs.restrictionId).append(url, rhs.url).isEquals();
    }

}
