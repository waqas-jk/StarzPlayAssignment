
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
    "id",
    "title",
    "guid",
    "ownerId",
    "availableDate",
    "expirationDate",
    "ratings",
    "content",
    "restrictionId",
    "availabilityState"
})
public class Medium {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("guid")
    private String guid;
    @JsonProperty("ownerId")
    private String ownerId;
    @JsonProperty("availableDate")
    private Long availableDate;
    @JsonProperty("expirationDate")
    private Long expirationDate;
    @JsonProperty("ratings")
    private List<Object> ratings = null;
    @JsonProperty("content")
    private List<Content> content = null;
    @JsonProperty("restrictionId")
    private String restrictionId;
    @JsonProperty("availabilityState")
    private String availabilityState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @JsonProperty("ownerId")
    public String getOwnerId() {
        return ownerId;
    }

    @JsonProperty("ownerId")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("availableDate")
    public Long getAvailableDate() {
        return availableDate;
    }

    @JsonProperty("availableDate")
    public void setAvailableDate(Long availableDate) {
        this.availableDate = availableDate;
    }

    @JsonProperty("expirationDate")
    public Long getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expirationDate")
    public void setExpirationDate(Long expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("ratings")
    public List<Object> getRatings() {
        return ratings;
    }

    @JsonProperty("ratings")
    public void setRatings(List<Object> ratings) {
        this.ratings = ratings;
    }

    @JsonProperty("content")
    public List<Content> getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(List<Content> content) {
        this.content = content;
    }

    @JsonProperty("restrictionId")
    public String getRestrictionId() {
        return restrictionId;
    }

    @JsonProperty("restrictionId")
    public void setRestrictionId(String restrictionId) {
        this.restrictionId = restrictionId;
    }

    @JsonProperty("availabilityState")
    public String getAvailabilityState() {
        return availabilityState;
    }

    @JsonProperty("availabilityState")
    public void setAvailabilityState(String availabilityState) {
        this.availabilityState = availabilityState;
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
        return new ToStringBuilder(this).append("id", id).append("title", title).append("guid", guid).append("ownerId", ownerId).append("availableDate", availableDate).append("expirationDate", expirationDate).append("ratings", ratings).append("content", content).append("restrictionId", restrictionId).append("availabilityState", availabilityState).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(content).append(guid).append(id).append(availableDate).append(title).append(expirationDate).append(additionalProperties).append(ownerId).append(restrictionId).append(ratings).append(availabilityState).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Medium) == false) {
            return false;
        }
        Medium rhs = ((Medium) other);
        return new EqualsBuilder().append(content, rhs.content).append(guid, rhs.guid).append(id, rhs.id).append(availableDate, rhs.availableDate).append(title, rhs.title).append(expirationDate, rhs.expirationDate).append(additionalProperties, rhs.additionalProperties).append(ownerId, rhs.ownerId).append(restrictionId, rhs.restrictionId).append(ratings, rhs.ratings).append(availabilityState, rhs.availabilityState).isEquals();
    }

}
