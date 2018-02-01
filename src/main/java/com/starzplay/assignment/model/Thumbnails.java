
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
    "thumb-615x1536",
    "thumb-613x1536",
    "thumb-677x474",
    "thumb-614x1536"
})
public class Thumbnails {

    @JsonProperty("thumb-615x1536")
    private Thumb615x1536 thumb615x1536;
    @JsonProperty("thumb-613x1536")
    private Thumb613x1536 thumb613x1536;
    @JsonProperty("thumb-677x474")
    private Thumb677x474 thumb677x474;
    @JsonProperty("thumb-614x1536")
    private Thumb614x1536 thumb614x1536;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("thumb-615x1536")
    public Thumb615x1536 getThumb615x1536() {
        return thumb615x1536;
    }

    @JsonProperty("thumb-615x1536")
    public void setThumb615x1536(Thumb615x1536 thumb615x1536) {
        this.thumb615x1536 = thumb615x1536;
    }

    @JsonProperty("thumb-613x1536")
    public Thumb613x1536 getThumb613x1536() {
        return thumb613x1536;
    }

    @JsonProperty("thumb-613x1536")
    public void setThumb613x1536(Thumb613x1536 thumb613x1536) {
        this.thumb613x1536 = thumb613x1536;
    }

    @JsonProperty("thumb-677x474")
    public Thumb677x474 getThumb677x474() {
        return thumb677x474;
    }

    @JsonProperty("thumb-677x474")
    public void setThumb677x474(Thumb677x474 thumb677x474) {
        this.thumb677x474 = thumb677x474;
    }

    @JsonProperty("thumb-614x1536")
    public Thumb614x1536 getThumb614x1536() {
        return thumb614x1536;
    }

    @JsonProperty("thumb-614x1536")
    public void setThumb614x1536(Thumb614x1536 thumb614x1536) {
        this.thumb614x1536 = thumb614x1536;
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
        return new ToStringBuilder(this).append("thumb615x1536", thumb615x1536).append("thumb613x1536", thumb613x1536).append("thumb677x474", thumb677x474).append("thumb614x1536", thumb614x1536).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(thumb677x474).append(thumb614x1536).append(thumb615x1536).append(thumb613x1536).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thumbnails) == false) {
            return false;
        }
        Thumbnails rhs = ((Thumbnails) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(thumb677x474, rhs.thumb677x474).append(thumb614x1536, rhs.thumb614x1536).append(thumb615x1536, rhs.thumb615x1536).append(thumb613x1536, rhs.thumb613x1536).isEquals();
    }

}
