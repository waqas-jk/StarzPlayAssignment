
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
    "mediaId",
    "isPrimary",
    "imageType"
})
public class ImageMediaId {

    @JsonProperty("mediaId")
    private String mediaId;
    @JsonProperty("isPrimary")
    private Boolean isPrimary;
    @JsonProperty("imageType")
    private String imageType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("mediaId")
    public String getMediaId() {
        return mediaId;
    }

    @JsonProperty("mediaId")
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @JsonProperty("isPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("isPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("imageType")
    public String getImageType() {
        return imageType;
    }

    @JsonProperty("imageType")
    public void setImageType(String imageType) {
        this.imageType = imageType;
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
        return new ToStringBuilder(this).append("mediaId", mediaId).append("isPrimary", isPrimary).append("imageType", imageType).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mediaId).append(isPrimary).append(imageType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImageMediaId) == false) {
            return false;
        }
        ImageMediaId rhs = ((ImageMediaId) other);
        return new EqualsBuilder().append(mediaId, rhs.mediaId).append(isPrimary, rhs.isPrimary).append(imageType, rhs.imageType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
