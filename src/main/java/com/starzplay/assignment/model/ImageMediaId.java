
package com.starzplay.assignment.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mediaId", mediaId).append("isPrimary", isPrimary).append("imageType", imageType).toString();
    }

}
