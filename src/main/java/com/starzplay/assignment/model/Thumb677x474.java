
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
    "url",
    "width",
    "height",
    "title",
    "assetTypes"
})
public class Thumb677x474 {

    @JsonProperty("url")
    private String url;
    @JsonProperty("width")
    private Long width;
    @JsonProperty("height")
    private Long height;
    @JsonProperty("title")
    private String title;
    @JsonProperty("assetTypes")
    private List<String> assetTypes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("width")
    public Long getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Long width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Long getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Long height) {
        this.height = height;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("assetTypes")
    public List<String> getAssetTypes() {
        return assetTypes;
    }

    @JsonProperty("assetTypes")
    public void setAssetTypes(List<String> assetTypes) {
        this.assetTypes = assetTypes;
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
        return new ToStringBuilder(this).append("url", url).append("width", width).append("height", height).append("title", title).append("assetTypes", assetTypes).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(title).append(assetTypes).append(height).append(additionalProperties).append(width).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thumb677x474) == false) {
            return false;
        }
        Thumb677x474 rhs = ((Thumb677x474) other);
        return new EqualsBuilder().append(title, rhs.title).append(assetTypes, rhs.assetTypes).append(height, rhs.height).append(additionalProperties, rhs.additionalProperties).append(width, rhs.width).append(url, rhs.url).isEquals();
    }

}
